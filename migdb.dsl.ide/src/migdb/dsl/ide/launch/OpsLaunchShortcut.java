package migdb.dsl.ide.launch;

import java.util.List;

import migdb.dsl.ide.runtime.MigDbLauncher;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class OpsLaunchShortcut implements ILaunchShortcut {

	public static final String BUNDLE_ID = "migdb.dsl.ide.launch";

	// Launches a file from selection.
	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof IAdaptable) {
				// dynamic cast to IResource
				Object dynam = ((IAdaptable) object)
						.getAdapter(IResource.class);
				IFile currentFile = (IFile) dynam;
				launch(currentFile, mode);
			}
		}
	}

	// Launches a file from the Editor.
	@Override
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		IFile currentFile = (IFile) input.getAdapter(IFile.class);
		launch(currentFile, mode);
	}

	public void launch(IFile file, String mode) {
		if (file == null)
			return;

		try {
			locateLauncher(file, mode);
		} catch (final CoreException e) {
			MessageDialog.openError(null, "Problem running Operations file.",
					e.getMessage());
			return;
		}

		LaunchConfigurationInfo info = new LaunchConfigurationInfo(file);
		ILaunchConfiguration[] configs;
		ILaunchConfiguration config = null;
		try {
			// gets all configuration saved in Eclipse workspace
			configs = getLaunchManager().getLaunchConfigurations();

			// walks them and if there is already existing configuration for the
			// file, use it
			for (ILaunchConfiguration configuration : configs) {
				if (info.configEquals(configuration)) {
					config = configuration;
					break;
				}
			}

			if (config == null) { // no configuration found, create new one
				config = createConfiguration(info);
			}
			DebugUITools.launch(config, mode); // launches given configuration
			file.getProject().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			MessageDialog.openError(null, "Problem running Operations file.",
					e.getMessage());
			return;
		}
	}

	private void locateLauncher(final IResource resource, String mode)
			throws CoreException {
		 IJavaProject project = JavaCore.create(resource.getProject());
		if (!isOnClasspath(MigDbLauncher.class.getName(), project)) {
			throw new DebugException(new Status(IStatus.ERROR, BUNDLE_ID,
					"Please put bundle '" + BUNDLE_ID
							+ "' on your project's classpath."));
		}
	}

	public boolean isOnClasspath(String fullyQualifiedName, IJavaProject project) {
		if (fullyQualifiedName.indexOf('$') != -1)
			fullyQualifiedName = fullyQualifiedName.replace('$', '.');
		try {
			IType type = project.findType(fullyQualifiedName);
			return type != null && type.exists();
		} catch (JavaModelException e) {
		}
		return false;
	}

	protected ILaunchConfiguration createConfiguration(
			LaunchConfigurationInfo info) throws CoreException {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		final ILaunchConfigurationType configType = getLaunchManager()
				.getLaunchConfigurationType(
						"migdb.dsl.ide.launch.OpsLaunchConfigurationType");

		wc = configType.newInstance(null, getLaunchManager()
				.generateUniqueLaunchConfigurationNameFrom(info.name));

		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
				info.project);
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
				MigDbLauncher.class.getName());
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN,
				false);
		wc.setAttribute(
				IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
				info.opsFile);
		wc.setAttribute(RefreshTab.ATTR_REFRESH_SCOPE, "${workspace}");
		wc.setAttribute(RefreshTab.ATTR_REFRESH_RECURSIVE, true);

		config = wc.doSave();

		return config;
	}

	private ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}

	private class LaunchConfigurationInfo {
		private final String name;
		private final String project;
		private final String opsFile;

		private LaunchConfigurationInfo(final IFile file) {
			name = file.getName();
			project = file.getProject().getName();
			opsFile = file.getProjectRelativePath().toString();
		}

		private boolean configEquals(final ILaunchConfiguration a)
				throws CoreException {
			return opsFile.equals(a.getAttribute(
					IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
					"X"))
					&& MigDbLauncher.class.getName().equals(
							a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
											"X"))
					&& project
							.equals(a
									.getAttribute(
											IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
											"X"))
					&& a.getType()
							.getIdentifier()
							.equals("migdb.dsl.ide.launch.OpsLaunchConfigurationType");
		}

	}

}

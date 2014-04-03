package migdb.dsl.ide.wizard;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import migdb.dsl.ide.Activator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public abstract class AbstractNewWizardPage extends NewTypeWizardPage {

	private IResource resource;
	private final String fileExtension; //without dot
	
	public AbstractNewWizardPage(int typeKind, String pageName, String fileExtension) {
		super(typeKind, pageName);
		this.fileExtension = fileExtension;
		this.resource = null;
	}

	@Override
	protected IStatus typeNameChanged() {	
		IPackageFragment packageFragment = getPackageFragment();
		if (packageFragment != null) {
			IResource resource = packageFragment.getResource();
			if (resource instanceof IFolder) {
				IFolder folder = (IFolder) resource;
				if (folder.getFile(getTypeName() + "."+fileExtension).exists()) { //$NON-NLS-1$
					String packageName = ""; //$NON-NLS-1$
					if (!packageFragment.isDefaultPackage()) {
						packageName = packageFragment.getElementName() + "."; //$NON-NLS-1$
					}
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							IStatus.OK, Messages.FILE_EXISTS_0 + packageName
									+ getTypeName() + Messages.FILE_EXISTS_1,
							null);
				}
			}
		}
		return super.typeNameChanged();
	}

	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		validate();
	}

	private void validate() {
		updateStatus(new IStatus[] { fContainerStatus, fPackageStatus,
				fTypeNameStatus });
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			setFocus();
		}
	}
	
	public abstract String creatingError();

	//defines what newly created file contains of
	public void newFileContent(IProgressMonitor monitor, IFile file) {
		try {
			String contents = ""; // empty file
			file.create(new ByteArrayInputStream(contents.getBytes()), true,
					monitor);
			setResource(file);
		} catch (CoreException e) {
			displayError(creatingError(), e.getMessage());
		}
	}

	public void displayError(final String title, final String message) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(getShell(), title, message);
			}
		});
	}
	
	public void createType() {		
		IRunnableWithProgress op = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				try {
					if (monitor == null) {
						monitor = new NullProgressMonitor();
					}
					if(getTypeName() == null || getTypeName().length() == 0)
						return;
										
					if (!getPackageFragment().exists()) {
						try {
							getPackageFragmentRoot().createPackageFragment(
									getPackageFragment().getElementName(),
									true, monitor);
						} catch (JavaModelException e) {
							displayError(Messages.ERROR_CREATING_PACKAGE,
									e.getMessage());
						}
					}
					IResource res = getPackageFragment().getResource();
					IFile file = ((IFolder) res)
							.getFile(getTypeName() + "." + fileExtension); //$NON-NLS-1$
					newFileContent(monitor, file);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), creatingError(),
					realException.getMessage());
		}
	}

	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		this.resource = resource;
	}

	public void setSelection(IStructuredSelection selection) {
	      initContainerPage(getInitialJavaElement(selection));
	      initTypePage(getInitialJavaElement(selection));
	}

}
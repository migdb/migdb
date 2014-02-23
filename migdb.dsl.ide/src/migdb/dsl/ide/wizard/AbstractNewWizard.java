package migdb.dsl.ide.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public abstract class AbstractNewWizard extends Wizard implements INewWizard {
	private AbstractNewWizardPage page;
	private IStructuredSelection selection;
	private IWorkbench workbench;

	/**
	 * Constructor for NewWizard.
	 */
	public AbstractNewWizard(ImageDescriptor imgDesc, AbstractNewWizardPage page,
			String title) {
		super();
		this.page = page;
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(imgDesc);
		setWindowTitle(title);
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		super.addPages();
		addPage(this.page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard.
	 */
	@Override
	public boolean performFinish() {
		this.page.createType(); //tries to create new file
		final IResource resource = page.getResource(); //gets created file
		if (resource != null) {
			selectAndReveal(resource);
			final Display display = getShell().getDisplay();
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					try { //opens IResource in new Editor window
						IWorkbenchPage page = PlatformUI.getWorkbench()
								.getActiveWorkbenchWindow().getActivePage();
						IDE.openEditor(page, (IFile) resource);
					} catch (PartInitException e) {
						throw new RuntimeException(e);
					}
				}
			});
			return true;
		}
		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
		this.page.setSelection(selection); //sets implicit Source Code path
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	public void selectAndReveal(IResource newResource) {
		BasicNewResourceWizard.selectAndReveal(newResource,
				workbench.getActiveWorkbenchWindow());
	}
}

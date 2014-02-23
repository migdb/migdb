package migdb.dsl.ide.wizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class OpsNewWizardPage extends AbstractNewWizardPage {

	private static final int COLS = 4;

	public OpsNewWizardPage(String ex) {
		super(CLASS_TYPE, "wizardPage", ex);
		setTitle(OpsNewWizard.TITLE);
		setDescription(Messages.OPS_WIZARD_DESCRIPTION);
	}

	// Creates containers with source path, package selector and file name.
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
		GridLayout layout = new GridLayout();
		layout.numColumns = COLS;
		composite.setLayout(layout);
		createContainerControls(composite, COLS);
		createPackageControls(composite, COLS);
		createSeparator(composite, COLS);
		createTypeNameControls(composite, COLS);
		
		setControl(composite); //!!!
	}

	@Override
	public String creatingError() {
		return Messages.ERROR_CREATING_OPS;
	}
}
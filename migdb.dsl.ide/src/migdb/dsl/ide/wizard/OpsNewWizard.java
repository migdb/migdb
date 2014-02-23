package migdb.dsl.ide.wizard;

import org.eclipse.jface.resource.ImageDescriptor;

public class OpsNewWizard extends AbstractNewWizard {

	public static final String TITLE = "Operations";
	public static final String EXTENSION = "ops";
	public static final ImageDescriptor IMAGE = null; //@see ImageDescriptor

	public OpsNewWizard() {
		super(IMAGE, new OpsNewWizardPage(EXTENSION), TITLE);
	}
}

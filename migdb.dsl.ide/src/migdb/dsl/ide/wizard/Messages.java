package migdb.dsl.ide.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "migdb.dsl.ide.wizard.messages"; //$NON-NLS-1$
	public static String ERROR_CREATING_OPS;
	public static String OPS_WIZARD_DESCRIPTION;
	public static String FILE_EXISTS_0;
	public static String FILE_EXISTS_1;
	public static String ERROR_CREATING_PACKAGE;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

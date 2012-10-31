
package migdb.dsl.app;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AppStandaloneSetup extends AppStandaloneSetupGenerated{

	public static void doSetup() {
		new AppStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


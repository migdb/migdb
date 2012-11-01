
package migdb.dsl.ops;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OpsStandaloneSetup extends OpsStandaloneSetupGenerated{

	public static void doSetup() {
		new OpsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


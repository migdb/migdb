package migdb.run;

import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;

import com.google.inject.Injector;

// MWE2Launcher wrapper which launches MigDB MWE2 workflow
public class MigDbLauncher {

	private static final Logger logger = Logger.getLogger(MigDbLauncher.class);
	private static final String LAUNCHER = "launcher.mwe2";
	
	private static final int ARGS = 1;
	private static final String OPERATIONS_PATH = "OPS_PATH";

	public static void main(String[] args) {
			try {
				new MigDbLauncher().run(args);
			} catch (Throwable e) {
				logger.error(e.getMessage(), e);
			}
	}

	public void run(String[] args) throws Exception {
		logger.info("Running MigDb workflow...");

		if (args == null)
			throw new IllegalStateException("No input file defined!");
		if (args.length != ARGS)
			throw new IllegalArgumentException("Invalid number of parameters: " + args.length +", but expected: " + ARGS);

		logger.info("Loading Operations from '" + args[0] + "'");

		Injector injector = new Mwe2StandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);

		URI wfURI = URI.createURI(MigDbLauncher.class
                .getResource(LAUNCHER).toURI().toString());

		if (wfURI == null)
			throw new IllegalStateException("Couldn't load MWE2 workflow!");
		
		logger.info("Loading MWE2 workflow '" + wfURI + "'");

		//launches MigDb workflow with given parameters
		mweRunner.run(wfURI, params(args));
	}
	
	//parameters for MWE2 workflow
	private Map<String, String> params(String... args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(OPERATIONS_PATH, args[0]);
		return map;
	}

}

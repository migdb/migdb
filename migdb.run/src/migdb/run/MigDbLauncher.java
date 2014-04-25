package migdb.run;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;

import com.google.inject.Injector;

// MWE2Launcher wrapper which launches MigDB MWE2 workflow
public class MigDbLauncher {

	public static final String OUTPUT = "output";
	public static final String FILE = "file";
	private static final Logger logger = Logger.getLogger(MigDbLauncher.class);
	private static final String LAUNCHER = "launcher.mwe2";
	public static final String OPERATIONS_PATH = "OPS_PATH";
	public static final String OUTPUT_FILENAME = "OUT_NAME";
	private static Options options = new Options();
	static {
		options.addOption(OptionBuilder.withArgName(FILE).hasArg().isRequired()
				.withDescription("Input Operations file path").create(FILE));
		options.addOption(OptionBuilder.withArgName(OUTPUT).hasArg()
				.isRequired().withDescription("Output filename").create(OUTPUT));
	}

	public static void main(String[] args) {
		try {
			CommandLine line = new BasicParser().parse(options, args);
			if (line.hasOption(FILE) && line.hasOption(OUTPUT))
				new MigDbLauncher().run(line.getOptionValue(FILE),
						line.getOptionValue(OUTPUT));
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void run(String... args) throws Exception {
		logger.info("Running MigDb workflow... ");

		logger.info("Loading Operations from '" + args[0] + "'");

		Injector injector = new Mwe2StandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);

		URI wfURI = URI.createURI(MigDbLauncher.class.getResource(LAUNCHER)
				.toURI().toString());

		if (wfURI == null)
			throw new IllegalStateException("Couldn't load MWE2 workflow!");

		logger.info("Loading MWE2 workflow '" + wfURI + "'");

		// launches MigDb workflow with given parameters
		mweRunner.run(wfURI, params(args));
	}

	// parameters for MWE2 workflow
	private Map<String, String> params(String... args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(OPERATIONS_PATH, args[0]);
		map.put(OUTPUT_FILENAME, args[1]);
		return map;
	}

}

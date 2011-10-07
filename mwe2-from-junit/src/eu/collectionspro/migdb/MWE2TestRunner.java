package eu.collectionspro.migdb;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.junit.Test;

import com.google.inject.Injector;

public class MWE2TestRunner {

	@Test
	public void test() {
		try {
			System.out.printf("before\n");
			//new Mwe2Runner().run("src/test.mwe2", null);
			Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
			Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
			Map<String, String> empty = Collections.emptyMap();
			Mwe2Launcher.main(new String[]{"src/test.mwe2"});
			//mweRunner.run(new File("src/test.mwe2").getAbsolutePath(), empty);
			System.out.printf("after\n");
		} catch (Exception e){
			e.printStackTrace();
			System.out.printf("catch\n");
		}
		finally {
			System.out.printf("finally\n");
		}
	}

}

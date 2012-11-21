package migdb.dsl.ops.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractOpsJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.collectionspro.eu/jam/mm/app"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.collectionspro.eu/jam/mm/app-ops"));
		return result;
	}

}

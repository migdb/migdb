package migdb.dsl.ops.validation;

import migdb.dsl.ops.typing.Context;
import migdb.dsl.ops.typing.TypeChecker;
import migdb.dsl.ops.typing.TypeResult;
import mm.app.ModelRoot;
import mm.app.ops.ModelOperation;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

public class OpsJavaValidator extends AbstractOpsJavaValidator {

	private static final Logger LOG = Logger.getLogger(OpsJavaValidator.class);
	private TypeChecker checker = new TypeChecker();

	/**
	 * Type-checks given instance of ModelRoot containing operations.
	 * 
	 * @param root
	 *            An instance of the ModelRoot to be type-checked.
	 */
	@Check
	public void applyTypeCheck(ModelRoot root) {
		Context gamma = new Context();
		for (EObject obj : root.eContents()) {
			ModelOperation op = (ModelOperation) obj;
			TypeResult result = checker.check(op, gamma);
			if (result.msg != null)
				error(result.msg, obj, null, 0);
			gamma = result.context; // keep type-checking
		}
	}

//	@Check
//	public void checkNames(AddStandardClass op) {
//		if ("Top".equalsIgnoreCase(op.getName()))
//			error(Errors.reservedKey(op.getName()).toString(), OpsPackage.Literals.ADD_STANDARD_CLASS__NAME, op.getName());
//	}
}

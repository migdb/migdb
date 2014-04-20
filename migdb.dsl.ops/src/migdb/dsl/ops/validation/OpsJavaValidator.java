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
	private TextChecker text = new TextChecker();

	/**
	 * Type-checks given instance of ModelRoot containing operations.
	 * 
	 * @param root
	 *            An instance of the ModelRoot to be type-checked.
	 */
	@Check
	public void applyTypeCheck(ModelRoot root) {
		boolean textErrors = false;
		for (EObject obj : root.eContents()) {
			ModelOperation op = (ModelOperation) obj;
			String result = text.check(op);
			if (result != null) {
				textErrors = true;
				error(result, obj, null, 0);
			}
		}
		
		if(textErrors)
			return;

		Context gamma = new Context();
		for (EObject obj : root.eContents()) {
			ModelOperation op = (ModelOperation) obj;
			TypeResult result = checker.check(op, gamma);
			if (result.msg != null)
				error(result.msg, obj, null, 0);
			gamma = result.context; // keep type-checking
		}
	}
}

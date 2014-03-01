package migdb.dsl.ops.validation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mm.app.ModelRoot;
import mm.app.impl.AppFactoryImpl;
import mm.errors.Error;
import mm.errors.ErrorLog;
import mm.errors.EvolutionError;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.xtext.validation.Check;

public class OpsJavaValidator extends AbstractOpsJavaValidator {

	/**
	 * Path to migdb's QVTO transformation to transform input models.
	 */
	private static final String QVTO = "platform:/plugin/migdb.qvto/transforms/main/evolution_app_run.qvto";
	
	/**
	 * Map used to save indices of found evolution errors.
	 */
	private Map<Integer, String> errorIndex;

	/**
	 * Applies QVTO transformation on given instance of the ModelRoot and checks
	 * if the transformation was successful, otherwise it prints errors.
	 * 
	 * @param root
	 *            An instance of the ModelRoot to be transformed.
	 */
	@Check
	public void applyModelTransformation(ModelRoot root) {
		URI transformationURI = URI.createURI(QVTO);

		if (transformationURI == null) {
			error("Couldn't load input file:'" + QVTO + "'!", null);
			return;
		}

		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		
		ModelExtent inStructure = emptyStructure(); // empty structure model
		ModelExtent inOperations = makeModelExtent(root);
		ModelExtent outStructure = new BasicModelExtent();
		ModelExtent cleanStructure = new BasicModelExtent();
		ModelExtent errors = new BasicModelExtent();

		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		ExecutionDiagnostic result = executor.execute(context, inStructure,
				inOperations, outStructure, cleanStructure, errors);

		if (result.getSeverity() == Diagnostic.OK) {
			errorIndex = new HashMap<Integer, String>();
			for (Error e : getErrorList(errors)) {
				if (e instanceof EvolutionError)
					indexEvolutionError((EvolutionError) e);
				else
					error(e.getMessage(), null);
			}
			// saveOutputStructure(outStructure, path);
		} else
			error(result.getMessage(), null);
		
		reportIndexedErrors(root);
	}

	/**
	 * Creates a ModelExtent based on the instance of the ModelRoot from
	 * application metamodel.
	 * 
	 * @param inModel
	 *            An instance of the ModelRoot.
	 * @return New instance of ModelExtent which contains the ModelRoot.
	 */
	private ModelExtent makeModelExtent(ModelRoot inModel) {
		List<EObject> model = new ArrayList<EObject>();
		model.add(inModel);
		return new BasicModelExtent(model);
	}

	/**
	 * Every model must have a root. This method creates empty instance of the
	 * Structure, which is subtype of ModelRoot.
	 * 
	 * @return New instance of ModelExtent which contains the Structure.
	 */
	private ModelExtent emptyStructure() {
		ModelRoot r = AppFactoryImpl.init().createStructure();
		return makeModelExtent(r);
	}

	/**
	 * Takes ModelExtents containing the instance of the ErrorLog and returns
	 * all instances of the Error, which it contains.
	 * 
	 * @param errors An instance of the ModelExtent.
	 * @return List of errors.
	 */
	private List<Error> getErrorList(ModelExtent errors) {
		List<EObject> errorList = errors.getContents();
		if (errorList.size() > 0)
			if (errorList.get(0) instanceof ErrorLog)
				return ((ErrorLog) errorList.get(0)).getErrors();
		return new ArrayList<Error>();
	}

	/**
	 * Tries to save the ModelExtent to given path.
	 * @param struct A model to be saved.
	 * @param path The path where the model should be saved. 
	 */
	private void saveModel(ModelExtent struct, String path) {
		List<EObject> outObjects = struct.getContents();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource outResource = resourceSet.getResource(URI.createURI(path),
				true);
		outResource.getContents().addAll(outObjects);

		try {
			outResource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Indexes given evolution error.
	 * @param error EvolutionError to be indexed.
	 */
	private void indexEvolutionError(EvolutionError error) {
		errorIndex.put(error.getOperationIndex(), error.getMessage());
	}
	
	/**
	 * Walks through ModelRoot's operations and marks operations, whose
	 * index is saved in the index map, as ERROR.
	 * @param root An instance of the ModelRoot.
	 */
	private void reportIndexedErrors(ModelRoot root) {
		int counter = 1;
		for(EObject obj : root.eContents()) {
			String msg = errorIndex.get(counter++);
			if(msg != null)
				error(msg, obj, null, 0);
		}
	}
}

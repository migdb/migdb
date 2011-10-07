package eu.collectionspro.mwe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;

public class QVTOExecutor extends AbstractWorkflowComponent {

	private class ModelSlot {
		public ModelSlot(String _name, boolean _isInput, boolean _isOutput) {
			name = _name;
			isInput = _isInput;
			isOutput = _isOutput;
		}

		public String name;
		public boolean isInput;
		public boolean isOutput;
	}

	// protected String transformation;
	protected List<ModelSlot> slots; // [SlotName; isInput]
	protected URI transformation;

	public void setUri(String uri) {
		transformation = URI.createURI(uri);
	}

	public void setTransformationFile(String fileName) {
		String uri;
		try {
			uri = "file:" + new File(fileName).getCanonicalPath();
			transformation = URI.createURI(uri);
		} catch (IOException e) {
			transformation = null;
			e.printStackTrace();
		}
	}

	public void addInputSlot(String name) {
		slots.add(new ModelSlot(name, true, false));
	}

	public void addOutputSlot(String name) {
		slots.add(new ModelSlot(name, false, true));
	}

	public void addInOutSlot(String name) {
		slots.add(new ModelSlot(name, true, true));
	}

	public QVTOExecutor() {
		super();
		slots = new ArrayList<ModelSlot>();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(transformation);

		ModelExtent[] extents = new ModelExtent[slots.size()];
		int i = 0;
		for (ModelSlot slot : slots) {
			extents[i] = new BasicModelExtent();
			if (slot.isInput) {
				Object slotContent = ctx.get(slot.name);
				if (slotContent == null || !(slotContent instanceof List<?>))
					issues.addError("Input slot '" + slot.name
							+ "' is empty or contains iappropriate object!");
				else {
					if (((List<EObject>) slotContent).isEmpty())
						issues.addWarning("Model in input slot '" + slot.name
								+ "' does NOT contain any objects");
					extents[i].setContents((List<EObject>) slotContent);
				}
			}
			i += 1;
		}
		// setup the execution environment details ->
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setLog(new Log() {
			@Override
			public void log(int level, String message, Object param) {
				System.out.println(level + ": " + message);
			}

			@Override
			public void log(int level, String message) {
				log(level, message, null);
			}

			@Override
			public void log(String message, Object param) {
				log(0, message, param);
			}

			@Override
			public void log(String message) {
				log(0, message, null);
			}
		});
		// context.setConfigProperty("keepModeling", true);

		// run the transformation assigned to the executor with the given
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		ExecutionDiagnostic result = executor.execute(context, extents);

		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			// let's persist them using a resource
			i = 0;
			for (ModelSlot slot : slots) {
				if (slot.isOutput)
					ctx.set(slot.name, extents[i].getContents());
				i += 1;
			}
		} else {
			// turn the result diagnostic into status and send it to error log
			IStatus status = BasicDiagnostic.toIStatus(result);
			issues.addError(status.toString());
		}
	}

	@Override
	public String getLogMessage() {
		return "Executing QVTo transformation: '" + transformation + "'";
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (transformation == null)
			issues.addError("Transformation URI not set");
		// if(transformation != null && !new File(transformation.toFileString()).exists())
		// issues.addError("Transformation URI file does not exist");
	}

}

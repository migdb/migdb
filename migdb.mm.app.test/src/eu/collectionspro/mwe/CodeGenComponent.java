package eu.collectionspro.mwe;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class CodeGenComponent extends AbstractWorkflowComponent {

	protected ICodeGenerator generator;

	public void setGenerator(ICodeGenerator generator) {
		this.generator = generator;
	}

	protected HashMap<String, Object> arguments = new HashMap<String, Object>();

	public void addArgument(Argument entry) {
		arguments.put(entry.getKey(), entry.getValue());
	}

	protected String slot = null;

	public void setSlot(String slot) {
		this.slot = slot;
	}

	protected boolean withoutModel = false;

	public void setWithoutModel(boolean emptySlot) {
		this.withoutModel = emptySlot;
	}

	protected String outputPath;
	protected File outputPathFile = null;

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		try {

			Object slotContent = ctx.get(slot);
			EObject model = null;

			if (!withoutModel) {
				if (slotContent == null || !(slotContent instanceof List)) {
					issues.addError("slot is empty or contains bad type");
					return;
				}

				@SuppressWarnings("unchecked")
				List<Object> coll = (List<Object>) slotContent;
				if (coll.size() != 1) {
					issues.addError("slot content list does not containt !1 root object, but "
							+ coll.size());
					return;
				}
				model = (EObject) coll.get(0);
			}

			generator.generateCode(model, outputPathFile, arguments);

		} catch (Exception e) {
			issues.addError("Generator invocation failed");
			e.printStackTrace();
		}
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (withoutModel && slot != null)
			issues.addError("Model slot is mutual exclusive to withoutModel = true");

		if (!withoutModel && (slot == null || slot.isEmpty()))
			issues.addError("Model slot or withoutModel=true not specified");

		if (generator == null)
			issues.addError("Generator not defined");

		if (outputPath == null || outputPath.isEmpty())
			issues.addError("Invalid output path");

		outputPathFile = new File(outputPath);

		if (!outputPathFile.exists() || !outputPathFile.isDirectory())
			issues.addError("outputPath '" + outputPath + "'does not exists or is not a directory");
	}
}

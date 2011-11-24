package eu.collectionspro.mwe;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class MTLExecutor extends AbstractWorkflowComponent {

	protected String generatorClassName;
	protected Class<? extends AbstractAcceleoGenerator> generatorClass;

	public void setGeneratorClass(String generatorClassName) {
		this.generatorClassName = generatorClassName;
	}

	protected boolean moreRoots = false;

	public void setMoreRoots(boolean moreRoots) {
		this.moreRoots = moreRoots;
	}

	protected String slot;

	public void setSlot(String slot) {
		this.slot = slot;
	}

	protected String outputPath;

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	protected List<String> arguments = new ArrayList<String>();

	public void addArgument(String arg) {
		arguments.add(arg);
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		Constructor<? extends AbstractAcceleoGenerator> constructor = null;
		try {
			constructor = generatorClass.getConstructor(EObject.class, File.class, List.class);
		} catch (Exception e) {
			e.printStackTrace();
			issues.addError("Cannot find proper constructor for given generator class: "
					+ generatorClass.getCanonicalName());
			return;
		}
		try {
			Object slotContent = ctx.get(slot);
			File folder = new File(outputPath);

			if (slotContent == null || !(slotContent instanceof List)) {
				issues.addError("slot is empty or contains bad type");
				return;
			}

			@SuppressWarnings("unchecked")
			List<EObject> modelContent = (List<EObject>) slotContent;
			if (modelContent.size() < 1) {
				issues.addError("slot content list does not contain any object");
				return;
			}
			if (!moreRoots && modelContent.size() > 1) {
				issues.addError("slot content list containts "+ modelContent.size() + " elements, but it is not expected (use 'moreRoots')");
				return;
			}
			for(EObject model : modelContent) {
				System.out.println("Generating code...");
				if(model.eIsProxy()) {
					EcoreUtil.resolveAll(model);
				}
				AbstractAcceleoGenerator generator = constructor.newInstance(model, folder, arguments);
				generator.doGenerate(new BasicMonitor());
			}
		} catch (Exception e) {
			issues.addError("Generator invocation failed");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void checkConfiguration(Issues issues) {
		if (slot == null || slot.isEmpty() || outputPath == null || outputPath.isEmpty()
				|| generatorClassName == null || generatorClassName.isEmpty())
			issues.addError("Invalid args");
		try {
			generatorClass = (Class<AbstractAcceleoGenerator>) Class.forName(generatorClassName);
		} catch (ClassNotFoundException e) {
			issues.addError("Cannot load class: " + generatorClassName);
		}
	}
}

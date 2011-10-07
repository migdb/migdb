package eu.collectionspro.mwe;

import java.lang.reflect.Method;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class UriMTLExecutor extends AbstractWorkflowComponent {

	protected String clazz;
	protected Class<?> mltClass;

	public void setClass(String clazz) {
		this.clazz = clazz;
	}

	protected String modelURI;

	public void setModelURI(String modelURI) {
		this.modelURI = modelURI;
	}

	protected String outputPath;

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		Method mainMethod = null;
		try {
			mainMethod = mltClass.getMethod("main", new Class[] { String[].class });
		} catch (Exception e) {
			e.printStackTrace();
			issues.addError("Cannot find main()");
			return;
		}
		try {
			mainMethod.invoke(null, new Object[] { new String[] { modelURI, outputPath } });
		} catch (Exception e) {
			issues.addError("main() invocation failed");
			e.printStackTrace();
		}
	}

	public void checkConfiguration(Issues issues) {
		if (modelURI == null || outputPath == null)
			issues.addError("Invalid args");
		try {
			mltClass = Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			issues.addError("Cannot load class: " + clazz);
		}
	}
}

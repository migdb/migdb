package migdb.run.utils;

import migdb.dsl.ops.OpsStandaloneSetupGenerated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

/**
 * MWE2 Workflow component used for loading an Operations file by given path
 * and saves it to the slot in the Workflow context.
 */
public class OpsReader implements IWorkflowComponent {
	
	private String uri;
	private String outputSlot = "model";

	@Override
	public void invoke(IWorkflowContext ctx) {
		Injector injector = new OpsStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		URI fileURI = URI.createFileURI(uri); 
		Resource res = resourceSet.getResource(fileURI, true);
		
		EcoreUtil.resolveAll(res);
		
		ctx.put(getOutputSlot(), res.getContents()); //saves the resource to the context
	}
	
	/**
	 * Sets the path to the Operations file.
	 * @param uri the path to *.ops file
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	/**
	 * @return The path to *.ops file.
	 */
	public String getUri() {
		return uri;
	}
	
	/**
	 * Sets the name of the slot of the Workflow context used for
	 * saving loaded information from the Operations file.
	 * @param slot 
	 */
	public void setOutputSlot(String slot) {
		this.outputSlot = slot;
	}
	
	/**
	 * @return The name of the slot of the Workflow context.
	 */
	public String getOutputSlot() {
		return outputSlot;
	}

	@Override
	public void postInvoke() {}
	
	@Override
	public void preInvoke() {}
}

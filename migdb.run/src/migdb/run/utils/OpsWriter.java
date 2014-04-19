package migdb.run.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import migdb.dsl.ops.OpsStandaloneSetupGenerated;
import mm.app.Operations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class OpsWriter extends AbstractWorkflowComponent {

	protected static final Log LOG = LogFactory.getLog(OpsWriter.class);
	protected String slot = null;

	protected String uri;
	protected File uriPath = null;

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		try {
			Object slotContent = ctx.get(slot);
			Operations model = null;

			if (slotContent == null || !(slotContent instanceof List)) {
				issues.addError("slot is empty or contains bad type");
				return;
			}

			@SuppressWarnings("unchecked")
			List<Object> coll = (List<Object>) slotContent;
			if (coll.size() != 1) {
				issues.addError("slot content list does not contain !1 root object, but "
						+ coll.size());
				return;
			}
			if(!(coll.get(0) instanceof Operations)) {
				issues.addError("slot content does not contain Operations");
				return;
			}
			model = (Operations) coll.get(0);

			Injector injector = new OpsStandaloneSetupGenerated()
					.createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector
					.getInstance(XtextResourceSet.class);
			URI fileURI = URI.createURI(uri);
			Resource res = resourceSet.createResource(fileURI);

			res.getContents().add(model);

			res.save(SaveOptions.newBuilder().format().getOptions()
					.toOptionsMap());
		} catch (IOException e) {
			issues.addError("Ops Writer invocation failed");
			e.printStackTrace();
		}
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (slot == null || slot.isEmpty())
			issues.addError("Model slot or withoutModel=true not specified");

		if (uri == null || uri.isEmpty())
			issues.addError("Invalid output path");

		File out = new File(uri);
		if (out.exists() && out.isDirectory())
			issues.addError("'" + uri + "' exists as directory");

	}

	public void setInputSlot(String slot) {
		this.slot = slot;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}

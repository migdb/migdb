package eu.collectionspro.mwe;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class ResourceSlotModelExtractor extends ResourceSlotProcessor {

	protected boolean found = false;

	@Override
	protected void onStart(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		found = false;
	}

	@Override
	protected void onResource(Resource resource, WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		if (found) {
			issues.addError("There is more than one resource in the root collection");
			return;
		}
		ctx.set(modelSlot, resource.getContents());
		found = true;
	}

	@Override
	protected void onFinish(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		if (!found)
			issues.addError("No resource found in the slot");
	}
}

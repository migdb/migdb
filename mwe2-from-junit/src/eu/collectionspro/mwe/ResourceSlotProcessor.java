package eu.collectionspro.mwe;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public abstract class ResourceSlotProcessor extends AbstractWorkflowComponent {

	protected String resourceSlot;

	public void setResourceSlot(String resourceSlot) {
		this.resourceSlot = resourceSlot;
	}

	protected String modelSlot;

	public void setModelSlot(String modelSlot) {
		this.modelSlot = modelSlot;
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (resourceSlot == null || resourceSlot.isEmpty())
			issues.addError("resourceSlot not set");
		if (modelSlot == null || modelSlot.isEmpty())
			issues.addError("modelSlot not set");
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		try {
			onStart(ctx, monitor, issues);
			Object slotContent = ctx.get(resourceSlot);
			if (slotContent == null || !(slotContent instanceof Iterable<?>)) {
				issues.addError("slot content empty or of bad type");
				return;
			}
			for (Object obj : (Iterable<?>) slotContent) {
				if ((obj instanceof Resource)) {
					Resource res = (Resource) obj;
					onResource(res, ctx, monitor, issues);
				} else {
					issues.addError("slot content collection does not contain Resource: "
							+ obj.toString());
				}
			}
			onFinish(ctx, monitor, issues);

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	protected void onFinish(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
	}

	protected void onStart(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
	}

	abstract protected void onResource(Resource resource, WorkflowContext ctx,
			ProgressMonitor monitor, Issues issues);
}

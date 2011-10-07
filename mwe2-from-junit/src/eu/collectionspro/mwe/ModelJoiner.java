package eu.collectionspro.mwe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class ModelJoiner extends AbstractWorkflowComponent {

	protected ArrayList<String> sourceSlots = new ArrayList<String>();
	protected String targetSlot = null;

	private HashSet<Resource> processedResources = new HashSet<Resource>();
	private HashSet<Resource> notProcessedResources = new HashSet<Resource>();

	static {
		new StandaloneSetup();
	}

	public void addSourceSlot(String source) {
		this.sourceSlots.add(source);
	}

	public void setTargetSlot(String targetSlot) {
		this.targetSlot = targetSlot;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {

		for (String slot : sourceSlots) {
			Object slotContent = ctx.get(slot);
			if (!(slotContent instanceof Collection<?>)) {
				issues.addError("slot " + slot + " does not contain Collection<?>");
			} else {
				for (EObject obj : (Collection<EObject>) slotContent) {
					registerResource(getResource(obj));
				}
			}
		}
		while (!notProcessedResources.isEmpty()) {
			HashSet<Resource> local = new HashSet<Resource>(notProcessedResources);
			for (Resource res : local) {
				processResource(res);
			}
		}
		System.out.println("Processed resources: ");
		for (Resource res : processedResources) {
			System.out.println("  - " + res.getURI().toString());
		}

		ctx.set(targetSlot, modelElements);
	}

	private void registerResource(Resource res) {
		if (res == null) {
			System.out.println("  ? null resource ");
			return;
		}
		if (processedResources.contains(res))
			return;
		if (notProcessedResources.add(res))
			System.out.println("Added resource " + res.getURI().toString());
	}

	private ArrayList<Object> modelElements = new ArrayList<Object>();

	private void processResource(Resource res) {
		System.out.println("Processing resource " + res.getURI().toString());

		for (EObject obj : res.getContents()) {
			// System.out.println(obj.eResource().getURI().toString());
			TreeIterator<EObject> iterator = obj.eAllContents();
			while (iterator.hasNext()) {
				EObject inner = iterator.next();

				// System.out.println("Obj (" + inner.eCrossReferences().size()
				// + "): "
				// + inner.toString());
				for (EObject ref : inner.eCrossReferences()) {
					// ref.eContainer();
					Resource candidate = getResource(ref);

					if (candidate == null) {
						// System.out.println(" null resource");
						// System.out.println(ref.toString());
					} else if (candidate != res) {
						// System.out.println(" -> " +
						// ref.eResource().getURI().toString());
						// System.out.println(" RS: " +
						// ref.eResource().getResourceSet().toString());
						registerResource(candidate);
					} else {
						// System.out.println(" same: " + ref.toString());
					}
				}
			}
		}
		modelElements.addAll(res.getContents());

		notProcessedResources.remove(res);
		processedResources.add(res);
	}

	Resource getResource(EObject obj) {
		if (obj.eResource() != null)
			return obj.eResource();
		if (obj.eContainer() != null)
			return getResource(obj.eContainer());
		return null;
	}

	public void checkConfiguration(Issues issues) {
		if (targetSlot == null)
			issues.addError("targetSlot not set");
		if (sourceSlots.isEmpty())
			issues.addError("sourceSlot(s) not set");
	}
}

package eu.collectionspro.mwe;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class ModelInspector extends AbstractWorkflowComponent {

	protected List<String> modelSlots = new ArrayList<String>();

	static {
		new StandaloneSetup();
	}

	public void addModelSlot(String modelSlot) {
		this.modelSlots.add(modelSlot);
	}

	String reprText(EObject obj, String name) {
		if (name == null)
			name = "";
		else name = name + " ";
		return String.format("%s%s %s[0x%08x]", obj.eIsProxy() ? "proxy-to ":"",
					obj.eClass().getName(), name, obj.hashCode());
	}

	String repr(EObject obj) {
		if (obj == null)
			return "<null>";

		Method m;
		try {
			m = obj.getClass().getMethod("getQualifiedName");
			return reprText(obj, (String) m.invoke(obj));
		} catch (Exception e) {
			//do nothing, try method getName instead of getQualifiedName
		}
		try {
			m = obj.getClass().getMethod("getName");
			return reprText(obj, (String) m.invoke(obj));
		} catch (Exception e) {
			return reprText(obj, null);
		}
	}
	void traverse(EObject obj, int indent) {
		for (int i = 0; i < indent; i++)
			System.out.print("	");
		System.out.println(repr(obj) + " in " + repr(obj.eContainer()));
		for (EObject eObj : obj.eContents()) {
			traverse(eObj, indent + 1);
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		try {
			for (String modelSlot : modelSlots) {
				System.out.println("*************************************************************");
				System.out.println("** Model inspector for slot: " + modelSlot);
				Object slotContent = ctx.get(modelSlot);
				if (slotContent == null) {
					System.out.println("slotContent: <empty>");
					return;
				}
				System.out.println("slotContent: " + slotContent.getClass().getCanonicalName()
						+ " [" + slotContent.hashCode() + "]");
				if (slotContent instanceof Iterable<?>) {
					for (Object obj : (Iterable<?>) slotContent) {
						if (obj instanceof EObject) {
							EObject eObj = (EObject) obj;
							traverse(eObj, 0);
						}
						if (obj instanceof Resource) {
							Resource res = (Resource) obj;
							System.out.println("--------------------");
							System.out.println("Resource: " + res.getURI().toString());
							for (EObject eObj : res.getContents())
								traverse(eObj, 1);
						}
					}
				} else {
					traverse((EObject) slotContent, 0);
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
			issues.addError("Exception during execution");
		}
	}

	@Override
	public void checkConfiguration(Issues issues) {
		for (String modelSlot : modelSlots)
			if (modelSlot == null || modelSlot.isEmpty())
				issues.addError("modelSlot not set");
	}
}

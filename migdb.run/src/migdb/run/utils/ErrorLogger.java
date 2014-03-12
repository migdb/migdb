package migdb.run.utils;

import java.util.Collection;
import java.util.Iterator;

import mm.errors.Error;
import mm.errors.ErrorLog;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class ErrorLogger extends AbstractWorkflowComponent {

	private String inputSlot = null;

	/**
	 * Sets the name of the slot of the Workflow context.
	 * 
	 * @param slot
	 */
	public void setInputSlot(String slot) {
		this.inputSlot = slot;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		ErrorLog errorLog = getErrorLog(ctx.get(inputSlot));

		if (errorLog == null)
			return;

		boolean hasErrors = false;

		for (Error error : errorLog.getErrors()) {
			if (!hasErrors)
				hasErrors = true;
			issues.addError(error.getMessage());
		}

		if (hasErrors)
			throw new IllegalStateException("Input file contains errors!");
	}

	private ErrorLog getErrorLog(Object resource) {
		if (resource instanceof Collection) {
			Iterator<?> it = ((Collection<?>) resource).iterator();
			if (it.hasNext()) {
				Object next = it.next();
				return next instanceof ErrorLog ? (ErrorLog) next : null; 
			}
		}
		return null;
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (inputSlot == null)
			issues.addError("Input slot not defined");
	}

}

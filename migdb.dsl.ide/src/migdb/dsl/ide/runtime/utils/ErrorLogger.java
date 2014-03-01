package migdb.dsl.ide.runtime.utils;

import java.util.Collection;
import mm.errors.Error;
import mm.errors.ErrorLog;
import org.apache.log4j.Logger;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class ErrorLogger implements IWorkflowComponent {

	private static final Logger logger = Logger.getLogger(ErrorLogger.class);
	private String inputSlot = "model";

	@Override
	public void invoke(IWorkflowContext ctx) {
		Object first = getFirst(ctx.get(getInputSlot()));

		if (first instanceof ErrorLog) {
			ErrorLog errorLog = (ErrorLog) first;

			String firstMessage = null;
			for (Error error : errorLog.getErrors()) {
				if (firstMessage == null)
					firstMessage = error.getMessage();
				logger.error(error.getMessage());
			}
			
			if(firstMessage != null)
				throw new IllegalStateException("Input file contains errors!");
		}
	}

	private Object getFirst(Object resource) {
		if (resource instanceof Collection) {
			for (Object e : (Collection) resource)
				return e;
		}
		return null;
	}

	/**
	 * Sets the name of the slot of the Workflow context.
	 * 
	 * @param slot
	 */
	public void setInputSlot(String slot) {
		this.inputSlot = slot;
	}

	/**
	 * @return The name of the slot of the Workflow context.
	 */
	public String getInputSlot() {
		return inputSlot;
	}

	@Override
	public void preInvoke() {
	}

	@Override
	public void postInvoke() {
	}

}

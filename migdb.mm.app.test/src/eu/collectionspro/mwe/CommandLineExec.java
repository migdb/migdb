package eu.collectionspro.mwe;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class CommandLineExec extends AbstractWorkflowComponent {

	protected String command;

	public void setCommand(String command) {
		this.command = command;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		JavaSystemCaller.Exec.execute(command);
	}

	public void checkConfiguration(Issues issues) {
		if (command == null)
			issues.addError("Command not set");
	}
}

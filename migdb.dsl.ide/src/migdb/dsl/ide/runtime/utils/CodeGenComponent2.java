package migdb.dsl.ide.runtime.utils;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import eu.collectionspro.mwe.CodeGenComponent;

public class CodeGenComponent2 extends CodeGenComponent {
	
	private static final Log LOG = LogFactory.getLog(CodeGenComponent2.class);

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		outputPathFile = new File(outputPath);
		if (outputPathFile.mkdir())
			LOG.info("Creating output path '" + outputPath + "'");

		super.invokeInternal(ctx, monitor, issues);
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (withoutModel && slot != null)
			issues.addError("Model slot is mutual exclusive to withoutModel = true");

		if (!withoutModel && (slot == null || slot.isEmpty()))
			issues.addError("Model slot or withoutModel=true not specified");

		if (generator == null)
			issues.addError("Generator not defined");

		if (outputPath == null || outputPath.isEmpty())
			issues.addError("Invalid output path");

		File out = new File(outputPath);
		if (out.exists() && !out.isDirectory())
			issues.addError("File '" + outputPath + "' exists");
	}
}

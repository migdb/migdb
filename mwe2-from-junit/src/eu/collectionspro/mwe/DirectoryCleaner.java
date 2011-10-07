package eu.collectionspro.mwe;

import java.io.File;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCleaner extends AbstractWorkflowComponent {

	protected String directory;
	protected File file;

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		deleteRecursive(file);
	}

	public void checkConfiguration(Issues issues) {
		if(directory ==null) {
			issues.addError("'directory' must be specified");
			return;
		}
		file = new File(directory);
		if(!file.isDirectory())
			issues.addError("File '"+directory+"' does not exist or is not a directory");
	}
	
    public boolean deleteRecursive(File path) {
        if (!path.exists())
        	throw new RuntimeException ("file not found: " + path.getAbsolutePath());
        boolean ret = true;
        if (path.isDirectory()){
            for (File f : path.listFiles()){
                ret = ret && deleteRecursive(f);
            }
        }
        return ret && path.delete();
    }
}

package migdb.run.utils;

import org.eclipse.emf.common.util.URI;
import eu.collectionspro.mwe.QVTOExecutor;

public class QVTOExecutor2 extends QVTOExecutor {

	// Fixes the problem with translation of a path to canonical form.
	// issue #158: https://github.com/migdb/migdb/issues/158
	public void setTransformationFile(String fileName) {
		transformation = URI.createURI(fileName);
	}
}

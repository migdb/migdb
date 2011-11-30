package eu.collectionspro.mwe;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ICodeGenerator {

	public void generateCode(EObject model, File folder, Map<String, Object> arguments);

}

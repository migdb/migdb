package migdb.generator

import eu.collectionspro.mwe.BaseCodeGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List
import java.util.ArrayList
import mm.rdb.operations.*


class Generator extends BaseCodeGenerator {
	
	override doGenerate(EObject model) {
		var operations = new ArrayList<ModelOperation>();
		for (Object arg : model.eContents) {
			if(arg instanceof ModelOperation){
				operations.add((arg as ModelOperation))
			}
		}
		this.toplevelGenerator(operations);
	}
	
	
	def toplevelGenerator(List<ModelOperation> operations) {
		for (op : operations)
			op.generateOperationFile
	}
	
	def generateOperationFile(ModelOperation operation) {
		generateFile(operation.fileName, operation.genOperation)
	}
		
	def String getFileName(EObject operation) {
		return "some file name derived from operation"
	}
	

	def dispatch genOperation(AddColumn operation) '''
		Add Column
	'''
	
	def dispatch genOperation(AddForeignKey operation) '''
		Add ForeignKey
	'''
	
	def dispatch genOperation(AddIndex operation) '''
		Add Index
	'''
}
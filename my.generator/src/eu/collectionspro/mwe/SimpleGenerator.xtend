package eu.collectionspro.mwe

import eu.collectionspro.mwe.BaseCodeGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List

class SimpleGenerator extends BaseCodeGenerator {
	
	override doGenerate(EObject model) {
		var fileContent = '''
			Argument list:
			«FOR String arg : arguments.keySet()»
				«arg» = «arguments.get(arg).toString»:
					«arg.printArg»
			«ENDFOR»
		''';
		this.generateFile("test.txt",fileContent);
	}
	
	def printArg(String arg) '''
		some indented
			«printMoreIndented»
		text
	'''
	
	def printMoreIndented() '''
		and
		even
		more
		indented
	'''
	
	
	def toplevelGenerator(List<EObject> operations) {
		for (op : operations)
			op.generateOperationFile
	}
	
	def generateOperationFile(EObject operation) {
		generateFile(operation.fileName, operation.genOperation)
	}
		
	def String getFileName(EObject operation) {
		return "some file name derived from operation"
	}
	

	def dispatch genOperation(EObject operation) '''
		fdsfdsf gf gfsdg d
	'''
	
	def dispatch genOperation(EStructuralFeature operation) '''
		fgdfgfsd fg fg fd
	'''
}
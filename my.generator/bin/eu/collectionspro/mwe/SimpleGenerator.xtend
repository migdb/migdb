package eu.collectionspro.mwe

import eu.collectionspro.mwe.BaseCodeGenerator
import org.eclipse.emf.ecore.EObject

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
		
}
package migdb.generator

import eu.collectionspro.mwe.BaseCodeGenerator
import java.io.PrintWriter
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import mm.rdb.impl.TableImpl


class SchemaGenerator extends BaseCodeGenerator {
	
	/*****************************************************************
	 * 							ATRIBUTES    						 *
 	 *****************************************************************/
 	 
	private PrintWriter writer //file writer
	private String filename //output file name
	
	/*****************************************************************
	 * 				    	STRUCTURE METHODS				     	 *
 	 *****************************************************************/	
 	 
 	 
 	 /**
 	  * Main method for generating SQL from model
 	  * Model in param include all ops which we want to create 
 	  * and ModelGeneration
 	  * @param EObject model : model of our application
 	  */
	override doGenerate(EObject model) {
		this.createWriter
		var objectList = new ArrayList<TableImpl>();
		
		for (Object arg : model.eContents) {			
			if(arg instanceof TableImpl){
				objectList.add(arg as TableImpl);
			}
		}
		for (TableImpl arg : objectList) {
			arg.generateOperationFile
		}
		writer.close
	}	
	
		
	/**
	 * Creates writer
	 */	
	def createWriter() {
		val file = generateFile(filename, "")
		writer = new PrintWriter(file)		
	}
	
	/**
	 * Method calls the method from the superclass
	 * Superclass method need filename and SQL text
	 */
	def generateOperationFile(TableImpl arg) {
		var text = arg.genSQL;
		this.write(text);
	}
	
		/**
	 * Writes string to opened writer
	 * @param CharSequence text : string to be written
	 */
	def write(CharSequence text) {
		this.writer.print(text);
	}
	
	/**
	 * Setter for output filename
	 * @param String path : filename
	 */
	def setFilename(String path) {
		this.filename = path;
	}
	
	def genSQL(TableImpl arg)'''
		1
	'''
}
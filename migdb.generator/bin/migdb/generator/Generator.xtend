package migdb.generator

import eu.collectionspro.mwe.BaseCodeGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List
import java.util.ArrayList
import mm.rdb.operations.impl.*
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach


class Generator extends BaseCodeGenerator {
	
	override doGenerate(EObject model) {
		var operations = new ArrayList<ModelOperationImpl>();
		for (Object arg : model.eContents) {			
			if(arg instanceof ModelOperationImpl){
				operations.add(arg as ModelOperationImpl);
			}
		}
		this.toplevelGenerator(operations);
	}
	
	
	def toplevelGenerator(ArrayList<ModelOperationImpl> operations) {
		for (op : operations)
			op.generateOperationFile
	}
	
	def generateOperationFile(ModelOperationImpl operation) {
		generateFile(operation.fileName, operation.genOperation)
	}
		
	def String getFileName(ModelOperationImpl operation) {
		return "operace"+operation.^class+".sql"
	}
	
	def int generateNumber(){
		
		
		return 1
	}

	/*****************************************************************
	 * 							OPERATIONS							 *
 	 *****************************************************************/

	/**
	 * CREATE COLUMN
	 * Get name of table, name and type from addColumn operation.
	 * @param AddColumnImpl operation : operation of type AddColumnImpl
	 */
	def dispatch genOperation(AddIndexImpl operation) '''
		CREATE INDEX «operation.name»
			ON «operation.owningTableName» («FOR col : operation.columnsNames SEPARATOR ","»«col»«ENDFOR»)
	'''
	
	/**
	 * CREATE COLUMN
	 * Get name of table, name and type from addColumn operation.
	 * @param AddColumnImpl operation : operation of type AddColumnImpl
	 */
	def dispatch genOperation(AddColumnImpl operation) '''
		ALTER TABLE «operation.owningTableName»
			ADD «operation.name» «operation.type»
	'''
	
	/**
	 * CREATE TABLE
	 * Get name from addTable operation.
	 * Also create column ID
	 * @param AddTableImpl operation : operation of type AddTableImpl
	 */
	def dispatch genOperation(AddTableImpl operation) '''
		CREATE TABLE «operation.name» (
			  `id` int NOT NULL AUTO_INCREMENT,
			  PRIMARY KEY (`id`),
			  UNIQUE KEY `ID_UNIQUE` (`id`)
		);
	'''
	
	/**
	 * CREATE SCHEMA (DATABASE)
	 * Get name from addSchema operation.
	 * @param AddSchemaImpl operation : operation of type AddSchemaImpl
	 */
	def dispatch genOperation(AddSchemaImpl operation) '''
		CREATE DATABASE «operation.name»	
	'''
}
package migdb.generator

import eu.collectionspro.mwe.BaseCodeGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.List
import java.util.ArrayList
import mm.rdb.operations.impl.*
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach


class Generator extends BaseCodeGenerator {
	
	/*****************************************************************
	 * 							ATRIBUDES    						 *
 	 *****************************************************************/
 	 
	int counter // Counter for name of files
	
	/*****************************************************************
	 * 				    	STRUCTURE METHODS				     	 *
 	 *****************************************************************/	
 	 
 	 /**
 	  * Main method for generating SQL from model
 	  * Model in param include all operations which we want to create 
 	  * and ModelGeneration
 	  * @param EObject model : model of our application
 	  */
	override doGenerate(EObject model) {
		var operations = new ArrayList<ModelOperationImpl>();
		this.counter = 0; // set counter to default value
		
		for (Object arg : model.eContents) {			
			if(arg instanceof ModelOperationImpl){
				operations.add(arg as ModelOperationImpl);
			}
		}
		this.toplevelGenerator(operations);
	}
	
	/**
	 * Method for start generating SQL from each operation.
	 * @param ArrayList<ModelOperationImpl> operations : list of operations in model
	 */
	def toplevelGenerator(ArrayList<ModelOperationImpl> operations) {
		for (op : operations)
			op.generateOperationFile
	}
	
	/**
	 * Method calls the method from the superclass
	 * Superclass method need filename and SQL text
	 * @param ModelOperationImpl operation : method do not need specific type of operation
	 */
	def generateOperationFile(ModelOperationImpl operation) {
		generateFile(operation.fileName, operation.genOperation)
	}
		
	/**
	 * Method define name of file
	 * @param ModelOperationImpl operation : method do not need specific type of operation
	 */
	def String getFileName(ModelOperationImpl operation) {
		this.counter = counter + 1;
		return ""+this.counter+".sql";
	}

	/*****************************************************************
	 * 							OPERATIONS							 *
 	 *****************************************************************/

	/**
	 * CREATE FOREIGNKEY
	 * If we want to create foreign key, we mas create column first.
	 * Then we add constraint on column and define foreig key.
	 * @param AddForeignKeyImpl operation : operation of type AddForeignKeyImpl
	 */
	def dispatch genOperation(AddForeignKeyImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ADD CONSTRAINT «operation.name»
			FOREIGN KEY («operation.constrainedColumnName») REFERENCES «operation.owningSchemaName».«operation.owningTableName» ("id")
	'''		

	/**
	 * CREATE UNIQUE INDEX
	 * Unique index can use only on column with index.
	 * Get name, schema and table from addUniqueIndex operation
	 * @param AddUniqueIndexImpl operation : operation of type AddUniqueIndexImpl
	 */
	def dispatch genOperation(AddUniqueIndexImpl operation) '''
		CREATE UNIQUE INDEX «operation.name»
			ON «operation.owningSchemaName».«operation.owningTableName» («operation.underlyingIndexName»)
	'''	
	
	/**
	 * CREATE INDEX
	 * Get name of table, name and names of column from addColumn operation.
	 * @param AddIndexImpl operation : operation of type AddIndexImpl
	 */
	def dispatch genOperation(AddIndexImpl operation) '''
		CREATE INDEX «operation.name»
			ON «operation.owningSchemaName».«operation.owningTableName» («FOR col : operation.columnsNames SEPARATOR ","»"«col»"«ENDFOR»)
	'''
	
	/**
	 * CREATE COLUMN
	 * Get name of table, name and type from addColumn operation.
	 * @param AddColumnImpl operation : operation of type AddColumnImpl
	 */
	def dispatch genOperation(AddColumnImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ADD «operation.name» «operation.type»
	'''
	
	/**
	 * CREATE TABLE
	 * Get name from addTable operation.
	 * Also create column ID
	 * @param AddTableImpl operation : operation of type AddTableImpl
	 */
	def dispatch genOperation(AddTableImpl operation) '''
		CREATE TABLE «operation.owningSchemaName».«operation.name» (
			  id integer PRIMARY KEY
		)
	'''
	
	/**
	 * CREATE SCHEMA (DATABASE)
	 * Get name from addSchema operation.
	 * @param AddSchemaImpl operation : operation of type AddSchemaImpl
	 */
	def dispatch genOperation(AddSchemaImpl operation) '''
		CREATE SCHEMA «operation.name»
	'''
}
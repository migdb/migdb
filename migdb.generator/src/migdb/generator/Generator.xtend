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

	/**		CREATE OPERATIONS		**/

	/**
	 * CREATE NOT NULL CONSTRAINT
	 * To add a constraint, the table constraint syntax is used. For example:
 	 * >> ALTER TABLE products ADD CONSTRAINT some_name  NOT NULL (product_group_id); <<
 	 * To add a not-null constraint, which cannot be written as a table constraint, use this syntax:
 	 * >> ALTER TABLE products ALTER COLUMN product_no SET NOT NULL; <<
 	 * I choose version without wtiting as table constraint because NotNullConstraint is descendant of ColumnConstraint
	 * If we want to create not null constraint, we must create column first.
	 * Then we add not null constraint.
	 * @param AddNotNullConstraintImpl operation : operation of type AddNotNullConstraintImpl
	 */
	def dispatch genOperation(AddNotNullConstraintImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ALTER COLUMN «operation.owningColumnName» SET NOT NULL;
	'''	
	
	/**
	 * CREATE PRIMARY KEY
	 * To add an automatically named primary key constraint to a table, noting that a table can only ever have one primary key:
	 * >> ALTER TABLE distributors ADD PRIMARY KEY (dist_id); <<
	 * @param AddPrimaryKeyImpl operation : operation of type AddPrimaryKeyImpl
	 */
	def dispatch genOperation(AddPrimaryKeyImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ADD CONSTRAINT «operation.name»
			PRIMARY KEY («operation.columnName»);
	'''		

	/**
	 * CREATE FOREIGN KEY
	 * To add a constraint, the table constraint syntax is used. For example:
 	 * >> ALTER TABLE products ADD CONSTRAINT some_name  FOREIGN KEY (product_group_id) REFERENCES product_groups; <<
	 * If we want to create foreign key, we must create column first.
	 * Then we add constraint on column and define foreig key.
	 * @param AddForeignKeyImpl operation : operation of type AddForeignKeyImpl
	 */
	def dispatch genOperation(AddForeignKeyImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ADD CONSTRAINT «operation.name»
			FOREIGN KEY («operation.constrainedColumnName») REFERENCES «operation.owningSchemaName».«operation.owningTableName» (id);
	'''		

	/**
	 * CREATE UNIQUE INDEX
	 * To create a B-tree index on the column title in the table films:
	 * >> CREATE UNIQUE INDEX title_idx ON films (title); <<
	 * Unique index can use only on column with index.
	 * @param AddUniqueIndexImpl operation : operation of type AddUniqueIndexImpl
	 */
	def dispatch genOperation(AddUniqueIndexImpl operation) '''
		CREATE UNIQUE INDEX «operation.name»
			ON «operation.owningSchemaName».«operation.owningTableName» («operation.underlyingIndexName»);
	'''	
	
	/**
	 * CREATE INDEX
	 * To create a B-tree index on the column title in the table films:
	 * >> CREATE INDEX title_idx ON films (title); <<
	 * @param AddIndexImpl operation : operation of type AddIndexImpl
	 */
	def dispatch genOperation(AddIndexImpl operation) '''
		CREATE INDEX «operation.name»
			ON «operation.owningSchemaName».«operation.owningTableName» («FOR col : operation.columnsNames SEPARATOR ","»«col»«ENDFOR»);
	'''
	
	/**
	 * CREATE COLUMN
	 * To add a column, use a command like:
	 * >> ALTER TABLE products ADD COLUMN description text; <<
	 * @param AddColumnImpl operation : operation of type AddColumnImpl
	 */
	def dispatch genOperation(AddColumnImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName»
			ADD COLUMN «operation.name» «operation.type»;
	'''
	
	// WARNING !! We do not have rule for create ID with new table.
	/**
	 * CREATE TABLE
	 * So to create a table in the new schema, use:
	 * >> CREATE TABLE myschema.mytable (...); <<
	 * Also create column ID
	 * @param AddTableImpl operation : operation of type AddTableImpl
	 */
	def dispatch genOperation(AddTableImpl operation) '''
		CREATE TABLE «operation.owningSchemaName».«operation.name» (
			id int PRIMARY KEY
		);
	'''
	
	/**
	 * CREATE SCHEMA
	 * To create a schema, use the CREATE SCHEMA command. Give the schema a name of your choice. For example:
	 * >> CREATE SCHEMA myschema; <<
	 * Operation is mode complex. If user want to create schema which name is "public" -> operation do nothing
	 * @param AddSchemaImpl operation : operation of type AddSchemaImpl
	 */
	def dispatch genOperation(AddSchemaImpl operation){
		if(!operation.name.toLowerCase.equals("public"))
			return ''' CREATE SCHEMA «operation.name»;''';
	}
	
	/**		REMOVE OPERATIONS		**/
	
	/**
	 * REMOVE TABLE
	 * If you no longer need a table, you can remove it using the DROP TABLE command. For example:
	 * >> DROP TABLE products; <<
	 * @param RemoveTableImpl operation : operation of type RemoveTableImpl
	 */
	def dispatch genOperation(RemoveTableImpl operation) '''
		DROP TABLE «operation.owningSchemaName».«operation.name»;
	'''
	
	/**
	 * REMOVE COLUMN
	 * To remove a column, use a command like:
	 * >> ALTER TABLE products DROP COLUMN description; <<
	 * @param RemoveColumnImpl operation : operation of type RemoveColumnImpl
	 */
	def dispatch genOperation(RemoveColumnImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			DROP COLUMN «operation.name»;
	'''	
	
	// WARNING !! This operation has a lot of useless information.
	/**
	 * REMOVE INDEX
	 * This command will remove the index title_idx:
	 * >> DROP INDEX title_idx; <<
	 * @param RemoveIndexImpl operation : operation of type RemoveIndexImpl
	 */
	def dispatch genOperation(RemoveIndexImpl operation) '''
		DROP INDEX «operation.name»;
	'''		
	
	/**
	 * REMOVE TABLE CONSTRAINT
	 * To remove a constraint you need to know its name. If you gave it a name then that's easy:
	 * >> ALTER TABLE products DROP CONSTRAINT some_name; <<
	 * @param RemoveTableConstraintImpl operation : operation of type TableConstraintImpl
	 */
	def dispatch genOperation(RemoveTableConstraintImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			DROP CONSTRAINT «operation.name»;
	'''		
		
	// WARNING !! Name of this operation may be RemoveNotNullConstraint.
	/**
	 * REMOVE COLUMN CONSTRAINT
	 * This works the same for all constraint types except not-null constraints. To drop a not null constraint use:
	 * >> ALTER TABLE products ALTER COLUMN product_no DROP NOT NULL; <<
	 * @param RemoveColumnConstraintImpl operation : operation of type RemoveColumnConstraintImpl
	 */
	def dispatch genOperation(RemoveColumnConstraintImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			ALTER COLUMN «operation.owningColumnName» DROP NOT NULL;
	'''			
	
	/**		RENAME OPERATIONS		**/	
		
	/**
	 * RENAME TABLE
	 * To rename table:
	 * >> ALTER TABLE products RENAME TO items; <<
	 * @param RenameTableImpl operation : operation of type RenameTableImpl
	 */
	def dispatch genOperation(RenameTableImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.name» 
			RENAME TO «operation.newName»;
	'''				

	/**
	 * RENAME COLUMN
	 * To rename a column:
	 * >> ALTER TABLE products RENAME COLUMN product_no TO product_number; <<
	 * @param RenameColumnImpl operation : operation of type RenameColumnImpl
	 */
	def dispatch genOperation(RenameColumnImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			RENAME COLUMN «operation.name» TO «operation.newName»;
	'''	
	
	/**		NEEDED OPERATIONS		**/		
	
	// 1) Changing a Column's Data Type
	// To convert a column to a different data type, use a command like:
	// >> ALTER TABLE products ALTER COLUMN price TYPE numeric(10,2); <<
	
	// 2) Changing a Column's Default Value
	// To set a new default for a column, use a command like:
	// >> ALTER TABLE products ALTER COLUMN price SET DEFAULT 7.77; <<
	// Note that this doesn't affect any existing rows in the table, it just changes the default for future INSERT commands.

	// 3) Remove Default value
	// To remove any default value, use:
	// >> ALTER TABLE products ALTER COLUMN price DROP DEFAULT; <<
	
}
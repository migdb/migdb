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
		generateFile(operation.getFileName(".sql"), operation.genOperation)
	}
		
	/**
	 * Method define name of file
	 * @param ModelOperationImpl operation : method do not need specific type of operation
	 */
	def String getFileName(ModelOperationImpl operation, String type) {
		this.counter = counter + 1;
		return "" + this.counter + type;
	}

	/*****************************************************************
	 * 							OPERATIONS							 *
 	 *****************************************************************/

	/**		CREATE OPERATIONS		**/
	
	/**
	 * CREATE SEQUENCE
	 * Create an ascending sequence called serial, starting at 101:
	 * >> CREATE SEQUENCE serial START 101; <<
	 * @param AddSequenceImpl operation : operation of type AddSequenceImpl
	 */
	def dispatch genOperation(AddSequenceImpl operation) '''
		CREATE SEQUENCE «operation.owningSchemaName».«operation.name» START «operation.cacheSize»;
	'''		

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
	
	/**
	 * CREATE TABLE
	 * So to create a table in the new schema, use:
	 * >> CREATE TABLE myschema.mytable (...); <<
	 * @param AddTableImpl operation : operation of type AddTableImpl
	 */
	def dispatch genOperation(AddTableImpl operation) '''
		CREATE TABLE «operation.owningSchemaName».«operation.name» ();
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
		return "";
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
	
	/**
	 * REMOVE DEFAULT VALUE
	 * To remove any default value, use:
	 * >> ALTER TABLE products ALTER COLUMN price DROP DEFAULT; <<
	 * @param RemoveDefaultValueImpl operation : operation of type RemoveDefaultValueImpl
	 */
	def dispatch genOperation(RemoveDefaultValueImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			ALTER COLUMN «operation.owningColumnName» DROP DEFAULT;
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
	
	/**	    SET OPERATIONS	    	**/	

	/**
	 * SET COLUMN DEFAULT VALUE
	 * To set a new default for a column, use a command like:
	 * >> ALTER TABLE products ALTER COLUMN price SET DEFAULT 7.77; <<
	 * Note that this doesn't affect any existing rows in the table, it just changes the default for future INSERT commands.
	 * @param SetColumnDefaultValueImpl operation : operation of type SetColumnDefaultValueImpl
	 */
	def dispatch genOperation(SetColumnDefaultValueImpl operation) '''
		ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
			ALTER COLUMN «operation.owningColumnName» SET DEFAULT «operation.newDefaultValue»;
	'''	
	
	/**
	 * SET COLUMN DATA TYPE
	 * To convert a column to a different data type, use a command like:
	 * >> ALTER TABLE products ALTER COLUMN price TYPE numeric(10,2); <<
	 * For some not trivial causes of changing of data type are created functions.
	 * @param SetColumnTypeImpl operation : operation of type SetColumnTypeImpl
	 */
	def dispatch genOperation(SetColumnTypeImpl operation){
		
		return '''ALTER TABLE «operation.owningSchemaName».«operation.owningTableName» 
				  	  ALTER COLUMN «operation.owningColumnName» TYPE «operation.newType»
						«IF operation.newType == "boolean" && operation.oldType == "int"»
							USING converting_booltoint(«operation.owningColumnName»)
						«ELSEIF operation.newType == "int" && operation.oldType == "boolean"»
							USING converting_inttoboolean(«operation.owningColumnName»)
						«ELSEIF operation.newType == "char" && operation.oldType == "boolean"»
							USING converting_chartobool(«operation.owningColumnName»)
						«ELSEIF operation.newType == "char" && operation.oldType == "int"»
							USING converting_chartoint(«operation.owningColumnName»)
						«ENDIF»;''';
	}
				
	
	/**		COMPLEX OPERATIONS		**/	
	
	/**
	 * COPY DATA 
	 */
	
	
	
	
	/** 		CONVERTING 			**/
	
	/**
	 * BOOLEAN TO INTEGER
	 * Rule for converting:
	 * True -> 1
	 * False -> 0
	 */
	def convertBoolToInt() '''
		CREATE OR REPLACE FUNCTION convert_booltoint(booltoconvert boolean) RETURNS integer AS
			$BODY$
				SELECT CASE WHEN $1 = TRUE THEN 1 ELSE 0 END;
			$BODY$
			LANGUAGE 'sql' IMMUTABLE STRICT;
  	'''
  	
  	/**
	 * INTEGER TO BOOLEAN
	 * Rule for converting:
	 * x < 1 -> False
	 * x >= 1 -> True
	 */
	def convertIntToBool() '''
		CREATE OR REPLACE FUNCTION convert_inttoboolean(inttoconvert integer) RETURNS boolean AS
			$BODY$
				SELECT CASE WHEN $1 < 1 THEN FALSE ELSE TRUE END;
			$BODY$
			LANGUAGE 'sql' IMMUTABLE STRICT; 
  	'''
  	
  	/**
	 * VARCHAR TO INTEGER
	 * Rule for converting:
	 * Find number in String
	 */
	def convertCharToInt() '''
		CREATE OR REPLACE FUNCTION convert_chartoint(chartoconvert character varying) RETURNS integer AS
			$BODY$
				SELECT CASE WHEN trim($1) SIMILAR TO '[0-9]+' THEN CAST(trim($1) AS integer) ELSE NULL END;
			$BODY$
			LANGUAGE 'sql' IMMUTABLE STRICT;	
  	'''  
  	/**
	 * VARCHAR TO BOOLEAN
	 * Rule for converting:
	 * Find boolean in String
	 */
	def convertCharToBool() '''
		CREATE OR REPLACE FUNCTION convert_chartobool(chartoconvert character varying) RETURNS boolean AS
			$BODY$
				SELECT CASE 
							WHEN trim($1) LIKE 'true' THEN TRUE
							WHEN trim($1) LIKE 'false' THEN FALSE 
					   END;
			$BODY$
			LANGUAGE 'sql' IMMUTABLE STRICT;
  	''' 		
}
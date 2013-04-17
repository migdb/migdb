package migdb.generator

import eu.collectionspro.mwe.BaseCodeGenerator
import java.util.ArrayList
import mm.rdb.ops.impl.AddColumnImpl
import mm.rdb.ops.impl.AddForeignKeyImpl
import mm.rdb.ops.impl.AddIndexImpl
import mm.rdb.ops.impl.AddNotNullImpl
import mm.rdb.ops.impl.AddPrimaryKeyImpl
import mm.rdb.ops.impl.AddSchemaImpl
import mm.rdb.ops.impl.AddSequenceImpl
import mm.rdb.ops.impl.AddTableImpl
import mm.rdb.ops.impl.AddUniqueImpl
import mm.rdb.ops.impl.GenerateSequenceNumbersImpl
import mm.rdb.ops.impl.HasNoInstancesImpl
import mm.rdb.ops.impl.HasNoOwnInstancesImpl
import mm.rdb.ops.impl.ModelOperationImpl
import mm.rdb.ops.impl.RemoveColumnImpl
import mm.rdb.ops.impl.RemoveDefaultValueImpl
import mm.rdb.ops.impl.RemoveIndexImpl
import mm.rdb.ops.impl.RemoveSequenceImpl
import mm.rdb.ops.impl.RemoveConstraintImpl
import mm.rdb.ops.impl.RemoveTableImpl
import mm.rdb.ops.impl.RenameColumnImpl
import mm.rdb.ops.impl.RenameTableImpl
import mm.rdb.ops.impl.SetDefaultValueImpl
import org.eclipse.emf.ecore.EObject
import mm.rdb.ops.impl.SetColumnTypeImpl
import mm.rdb.ops.impl.UpdateRowImpl
import mm.rdb.ops.impl.InsertRowsImpl
import mm.rdb.ops.impl.InsertRowImpl
import mm.rdb.ops.impl.DeleteRowsImpl



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
 	  * Model in param include all ops which we want to create 
 	  * and ModelGeneration
 	  * @param EObject model : model of our application
 	  */
	override doGenerate(EObject model) {
		var ops = new ArrayList<ModelOperationImpl>();
		this.counter = 100; // set counter to default value
		
		for (Object arg : model.eContents) {			
			if(arg instanceof ModelOperationImpl){
				ops.add(arg as ModelOperationImpl);
			}
		}
		this.toplevelGenerator(ops);
	}
	
	/**
	 * Method for start generating SQL from each op.
	 * @param ArrayList<ModelOperationImpl> ops : list of ops in model
	 */
	def toplevelGenerator(ArrayList<ModelOperationImpl> ops) {
		for (op : ops)
			op.generateOperationFile
	}
	
	/**
	 * Method calls the method from the superclass
	 * Superclass method need filename and SQL text
	 * @param ModelOperationImpl op : method do not need specific type of op
	 */
	def generateOperationFile(ModelOperationImpl op) {
		var text = op.genOperation;
		generateFile(op.getFileName(".sql"), text);
	}
		
	/**
	 * Method define name of file
	 * @param ModelOperationImpl op : method do not need specific type of op
	 */
	def String getFileName(ModelOperationImpl op, String type) {
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
	 * @param AddSequenceImpl op : op of type AddSequenceImpl
	 */
	def dispatch genOperation(AddSequenceImpl op) '''
		CREATE SEQUENCE «op.owningSchemaName».«op.name» START «op.startValue»;
	'''		

	/**
	 * CREATE NOT NULL
	 * To add a constraint, the table constraint syntax is used. For example:
 	 * >> ALTER TABLE products ADD CONSTRAINT some_name  NOT NULL (product_group_id); <<
 	 * To add a not-null constraint, which cannot be written as a table constraint, use this syntax:
 	 * >> ALTER TABLE products ALTER COLUMN product_no SET NOT NULL; <<
 	 * I choose version without wtiting as table constraint because NotNullConstraint is descendant of ColumnConstraint
	 * If we want to create not null constraint, we must create column first.
	 * Then we add not null constraint.
	 * @param AddNotNullConstraintImpl op : op of type AddNotNullConstraintImpl
	 */
	def dispatch genOperation(AddNotNullImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ALTER COLUMN «op.constrainedColumnName» SET NOT NULL;
	'''	
	
	/**
	 * CREATE PRIMARY KEY
	 * To add an automatically named primary key constraint to a table, noting that a table can only ever have one primary key:
	 * >> ALTER TABLE distributors ADD PRIMARY KEY (dist_id); <<
	 * @param AddPrimaryKeyImpl op : op of type AddPrimaryKeyImpl
	 */
	def dispatch genOperation(AddPrimaryKeyImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ADD CONSTRAINT «op.name»
			PRIMARY KEY («op.constrainedColumnName»);
	'''		

	/**
	 * CREATE FOREIGN KEY
	 * To add a constraint, the table constraint syntax is used. For example:
 	 * >> ALTER TABLE products ADD CONSTRAINT some_name  FOREIGN KEY (product_group_id) REFERENCES product_groups; <<
	 * If we want to create foreign key, we must create column first.
	 * Then we add constraint on column and define foreig key.
	 * @param AddForeignKeyImpl op : op of type AddForeignKeyImpl
	 */
	def dispatch genOperation(AddForeignKeyImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ADD CONSTRAINT «op.name»
			FOREIGN KEY («op.constrainedColumnName») REFERENCES «op.owningSchemaName».«op.targetTableName» (id_«op.targetTableName»);
	'''		

	/**
	 * CREATE UNIQUE
	 * To create a B-tree index on the column title in the table films:
	 * >> CREATE UNIQUE INDEX title_idx ON films (title); <<
	 * To add a constraint, the table constraint syntax is used. For example:
	 * >> ALTER TABLE products ADD CONSTRAINT some_name UNIQUE (product_no); <<
	 * Unique index can use only on column with index.
	 * @param AddUniqueImpl op : op of type AddUniqueIndexImpl
	 */
	def dispatch genOperation(AddUniqueImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ADD CONSTRAINT «op.name» UNIQUE («FOR col : op.constrainedColumnNames SEPARATOR ","»«col»«ENDFOR»);
	'''	
	
	/**
	 * CREATE INDEX
	 * To create a B-tree index on the column title in the table films:
	 * >> CREATE INDEX title_idx ON films (title); <<
	 * @param AddIndexImpl op : op of type AddIndexImpl
	 */
	def dispatch genOperation(AddIndexImpl op) '''
		CREATE INDEX «op.name»
			ON «op.owningSchemaName».«op.owningTableName» («FOR col : op.columnsNames SEPARATOR ","»«col»«ENDFOR»);
	'''
	
	/**
	 * CREATE COLUMN
	 * To add a column, use a command like:
	 * >> ALTER TABLE products ADD COLUMN description text; <<
	 * @param AddColumnImpl op : op of type AddColumnImpl
	 */
	def dispatch genOperation(AddColumnImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ADD COLUMN «op.name» «IF op.type.toString().equals("char")»character(30) «ELSE»«op.type»«ENDIF»;
	'''
	
	/**
	 * CREATE TABLE
	 * So to create a table in the new schema, use:
	 * >> CREATE TABLE myschema.mytable (...); <<
	 * @param AddTableImpl op : op of type AddTableImpl
	 */
	def dispatch genOperation(AddTableImpl op) '''
		CREATE TABLE «op.owningSchemaName».«op.name» ();
	'''
	
	/**
	 * CREATE SCHEMA
	 * To create a schema, use the CREATE SCHEMA command. Give the schema a name of your choice. For example:
	 * >> CREATE SCHEMA myschema; <<
	 * Operation is mode complex. If user want to create schema which name is "public" -> op do nothing
	 * @param AddSchemaImpl op : op of type AddSchemaImpl
	 */
	def dispatch genOperation(AddSchemaImpl op)'''
		«IF !op.name.toLowerCase.equals("public")»CREATE SCHEMA «op.name» «ENDIF»; 
	'''
	
	/**		REMOVE OPERATIONS		**/
	
	/**
	 * REMOVE TABLE
	 * If you no longer need a table, you can remove it using the DROP TABLE command. For example:
	 * >> DROP TABLE products; <<
	 * @param RemoveTableImpl op : op of type RemoveTableImpl
	 */
	def dispatch genOperation(RemoveTableImpl op) '''
		DROP TABLE «op.owningSchemaName».«op.name»;
	'''
	
	/**
	 * REMOVE COLUMN
	 * To remove a column, use a command like:
	 * >> ALTER TABLE products DROP COLUMN description; <<
	 * @param RemoveColumnImpl op : op of type RemoveColumnImpl
	 */
	def dispatch genOperation(RemoveColumnImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
			DROP COLUMN «op.name»;
	'''	
	
	/**
	 * REMOVE INDEX
	 * This command will remove the index title_idx:
	 * >> DROP INDEX title_idx; <<
	 * @param RemoveIndexImpl op : op of type RemoveIndexImpl
	 */
	def dispatch genOperation(RemoveIndexImpl op) '''
		DROP INDEX «op.name»;
	'''		
	
	/**
	 * REMOVE CONSTRAINT
	 * To remove a constraint you need to know its name. If you gave it a name then that's easy:
	 * >> ALTER TABLE products DROP CONSTRAINT some_name; <<
	 * @param RemoveTableConstraintImpl op : op of type TableConstraintImpl
	 */
	def dispatch genOperation(RemoveConstraintImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
			DROP CONSTRAINT «op.name»;
	'''		
	
	/**
	 * REMOVE DEFAULT VALUE
	 * To remove any default value, use:
	 * >> ALTER TABLE products ALTER COLUMN price DROP DEFAULT; <<
	 * @param RemoveDefaultValueImpl op : op of type RemoveDefaultValueImpl
	 */
	def dispatch genOperation(RemoveDefaultValueImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
			ALTER COLUMN «op.owningColumnName» DROP DEFAULT;
	'''		
	
	/**
	 * REMOVE SEQUENCE
	 * To remove sequence serial from database:
	 * >> DROP SEQUENCE serial;
	 * @param RemoveSequenceImpl op : op of type RemoveSequenceImpl
	 */
	def dispatch genOperation(RemoveSequenceImpl op)'''
		DROP SEQUENCE «op.owningSchemaName».«op.name»;
	'''		
	
	/**		RENAME OPERATIONS		**/	
		
	/**
	 * RENAME TABLE
	 * To rename table:
	 * >> ALTER TABLE products RENAME TO items; <<
	 * @param RenameTableImpl op : op of type RenameTableImpl
	 */
	def dispatch genOperation(RenameTableImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.name» 
			RENAME TO «op.newName»;
	'''		
	
	/**
	 * RENAME COLUMN
	 * To rename a column:
	 * >> ALTER TABLE products RENAME COLUMN product_no TO product_number; <<
	 * @param RenameColumnImpl op : op of type RenameColumnImpl
	 */
	def dispatch genOperation(RenameColumnImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
			RENAME COLUMN «op.name» TO «op.newName»;
	'''		
		
	/**	    SET OPERATIONS	    	**/		

	/**
	 * SET DEFAULT VALUE
	 * This op can be used for setting sequence for PrimaryKey -> DEFAULT nextval('seqName')
	 * To set a new default for a column, use a command like:
	 * >> ALTER TABLE products ALTER COLUMN price SET DEFAULT 7.77; <<
	 * Note that this doesn't affect any existing rows in the table, it just changes the default for future INSERT commands.
	 * @param SetColumnDefaultValueImpl op : op of type SetColumnDefaultValueImpl
	 */
	def dispatch genOperation(SetDefaultValueImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
			ALTER COLUMN «op.owningColumnName» SET DEFAULT «op.newDefaultValue»;
	'''	
	
	/**
	 * SET COLUMN TYPE
	 * To convert a column to a different data type, use a command like:
	 * >> ALTER TABLE products ALTER COLUMN price TYPE numeric(10,2); <<
	 * For some not trivial causes of changing of data type are created functions.
	 * @param SetColumnTypeImpl op : op of type SetColumnTypeImpl
	 */
	 
	def dispatch genOperation(SetColumnTypeImpl op){
		// create SQL functions for converting columns data type
		generateFile(op.getFileName(".sql"), this.convertBoolToInt);
		generateFile(op.getFileName(".sql"), this.convertCharToBool);
		generateFile(op.getFileName(".sql"), this.convertCharToInt);
		generateFile(op.getFileName(".sql"), this.convertIntToBool);
		return '''ALTER TABLE «op.owningSchemaName».«op.owningTableName» 
				  	  ALTER COLUMN «op.owningColumnName» TYPE «op.newType»
						«IF op.newType.equals("int") && op.oldType.equals("boolean")»
							USING converting_booltoint(«op.owningColumnName»)
						«ELSEIF op.newType.equals("boolean") && op.oldType.equals("int")»
							USING converting_inttoboolean(«op.owningColumnName»)
						«ELSEIF op.newType.equals("boolean") && op.oldType.equals("char")»
							USING converting_chartobool(«op.owningColumnName»)
						«ELSEIF op.newType.equals("int") && op.oldType.equals("char")»
							USING converting_chartoint(«op.owningColumnName»)
						«ENDIF»;''';
	}
	
	
	/** 		 	DATA OPERATIONS	 		**/
	/** 
 	 * This operations do not change context of models.
     * This operations just work with instances (rows) in database.
     */
       
     /**
     * GENERATE SEQUENCE NUMBERS
     * This operation generate new sequence numbers to column
     * @param GenerateSequenceNumbers op : op of type GenerateSequenceNumbers 
     */     
    def dispatch genOperation(GenerateSequenceNumbersImpl op)'''
    	UPDATE «op.owningSchemaName».«op.tableName» SET «op.columnName» = nextval('«op.sequenceName»');
    '''
    
    /**
     * HAS NO INSTANCES
     * This operation check if table has some rows.
     * @param HasNoInstances op : op of type HasNoInstances
     * @return boolean : t - no instances; f - some instances 
     */ 
    def dispatch genOperation(HasNoInstancesImpl op)'''
    		SELECT COUNT(1) > 0 FROM «op.owningSchemaName».«op.tableName»;
    '''
    
    /**
     * HAS NO OWN INSTANCES
     * This operation check if table has some own rows.
     * This SQL check ownership between instances and tables. Table can have
     * a lot of rows ale nemuseji tabulce patrit hierarchicky.
     * @param CheckInstances op : op of type CheckInstances
     * @return boolean : t - no instances; f - some instances 
     */ 
    def dispatch genOperation(HasNoOwnInstancesImpl op)'''
    		SELECT COUNT(1) > 0 
    			FROM «op.owningSchemaName».«op.tableName» AS parent
    			«FOR tab : op.descendantsNames» LEFT JOIN «tab» ON «tab».«op.idName» = parent.«op.idName»«ENDFOR»
    			WHERE «FOR tab : op.descendantsNames SEPARATOR "AND"»«tab».«op.idName» IS null «ENDFOR»    	
    '''    
    
	/**
	 * UPDATE ROW
	 * This operation copy data from one column to another.
	 * That means update of one column in target table. 
 	 * Target and source column can be in the same table.
 	 * ToleranceType:
 	 * strict -> Can not transfer data if a tables have different number of instances (rows).
 	 * tolerant -> Can transfer data if source table has less number of instances (rows).
 	 * force -> Delete rows if there is more instancef in source table. If source table has less number
 	 * of instances add default value or null.
	 * @param UpdateRowsImpl op : op of type UpdateRowImpl
	 */
	def dispatch genOperation(UpdateRowImpl op){
		if(op.tolerance.toString().equals("strict")){
			generateFile(op.getFileName(".q"), this.isSameTableSize(op.owningSchemaName, op.sourceTableName, op.targetTableName));
			return '''UPDATE «op.owningSchemaName».«op.targetTableName» SET «op.targetColumnName» = 
							(SELECT «op.sourceColumnName» FROM «op.owningSchemaName».«op.sourceTableName» WHERE «op.WHERE_CONDITION» );''';
		}
		if(op.tolerance.toString().equals("force")){
			return '''UPDATE «op.owningSchemaName».«op.targetTableName» SET «op.targetColumnName» = 
							(SELECT «op.sourceColumnName» FROM «op.owningSchemaName».«op.sourceTableName» WHERE «op.WHERE_CONDITION» );''';
		}
		if(op.tolerance.toString().equals("tolerant")){
			generateFile(op.getFileName(".q"), this.targetTableHasMoreRows(op.owningSchemaName, op.sourceTableName, op.targetTableName));
			return '''UPDATE «op.owningSchemaName».«op.targetTableName» SET «op.targetColumnName» = 
							(SELECT «op.sourceColumnName» FROM «op.owningSchemaName».«op.sourceTableName» WHERE «op.WHERE_CONDITION» );''';
		}		
		return "";
	}
	
		

	/**
	 * INSERT ROWS
	 * This operation copy data from source columns to target columns.
	 * That means insert rows from source table to target table. 
 	 * Target and source columns must have same name and data type.
 	 * Target table must not have instances.
	 * @param InsertRowsImpl op : op of type InsertRowsImpl
	 */
	def dispatch genOperation(InsertRowsImpl op)'''
		INSERT INTO «op.owningSchemaName».«op.targetTableName» («FOR col : op.sourceColumnsNames SEPARATOR ","»«col»«ENDFOR»)
			SELECT «FOR col : op.sourceColumnsNames SEPARATOR ","»«col»«ENDFOR» FROM «op.sourceTableName»;
	'''
	
	/**
	 * INSERT ROW
	 * This operation copy data from source column to target column.
	 * That means insert row from source table to target table. 
 	 * Target and source column must have same name and data type.
 	 * Target table must not have instances.
	 * @param InsertRowImpl op : op of type InsertRowImpl
	 */
	def dispatch genOperation(InsertRowImpl op)'''
		INSERT INTO «op.owningSchemaName».«op.targetTableName» («op.sourceColumnName»)
			SELECT «op.sourceColumnName» FROM «op.sourceTableName»;
	'''	
	
	/**
	 * DELETE ROWS
	 * This operation detele row from table
	 * Delete rows which not belong to table 
	 * @param DeleteRowsImpl op : op of type DeleteRowsImpl
	 */
	def dispatch genOperation(DeleteRowsImpl op)'''
		DELETE FROM «op.owningSchemaName».«op.tableName» WHERE «op.idName» IN
			(SELECT «op.tableName».«op.idName» FROM «op.owningSchemaName».«op.tableName»
			«FOR tab : op.descendantsNames» LEFT JOIN «tab» ON «tab».«op.idName» = parent.«op.idName»«ENDFOR»
			WHERE «FOR tab : op.descendantsNames SEPARATOR "AND"»«tab».«op.idName» IS null «ENDFOR»);
	'''	
	
	/** 		 QUERRIES	 		**/
	
	/**
	 * IS SAME TABLE SIZE
	 * This query check size of two tables and compare
	 * number of their rows.
	 * @param String table1 : first table to compare
	 * @param String table2 : secont table to compare
	 * @return boolean : t - the same size; f - different size
	 */
	def isSameTableSize(String schema, String table1, String table2)'''
		SELECT CASE WHEN (SELECT COUNT(*) FROM «schema».«table1») = (SELECT COUNT(*) FROM «schema».«table2») THEN TRUE ELSE FALSE END;
	'''
	
	/**
	 * TARGET TABLE HAS MORE ROWS
	 * This query check size of two tables and compare
	 * number of their rows.
	 * @param String table1 : first table to compare
	 * @param String table2 : secont table to compare
	 * @return boolean : t - t1 has less rows; f - t1 has more or the same nomber of rows
	 */
	def targetTableHasMoreRows(String schema, String table1, String table2)'''
		SELECT CASE WHEN (SELECT COUNT(*) FROM «schema».«table1») <= (SELECT COUNT(*) FROM «schema».«table2») THEN TRUE ELSE FALSE END;
	'''	

	/**
	 * HAS NO INSTANCES
	 * This query check if is table empty
	 * @param String schema : schema
	 * @param String table : table to check
	 * @return boolean : t - is empty; f - has instances
	 */	
	def hasNoInstances(String schema, String table)'''
		SELECT COUNT(1) > 0 FROM «schema».«table»;
	'''
	
	
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
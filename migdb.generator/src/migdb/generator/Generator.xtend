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
import mm.rdb.ops.impl.InsertRowsImpl
import mm.rdb.ops.impl.DeleteRowsImpl
import java.io.PrintWriter
import mm.rdb.ops.impl.UpdateRowsImpl
import mm.rdb.ops.impl.RemoveNotNullImpl
import mm.rdb.ops.impl.NillRowsImpl



class Generator extends BaseCodeGenerator {
	
	/*****************************************************************
	 * 							ATRIBUTES    						 *
 	 *****************************************************************/
 	 
	private PrintWriter writer //file writer
	private boolean queryCheckerWritten = false //query checker generated
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
		var ops = new ArrayList<ModelOperationImpl>();
		
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
		this.createWriter
		
		for (op : ops)
			op.generateOperationFile
			
		this.closeWriter
	}
	
	/**
	 * Method calls the method from the superclass
	 * Superclass method need filename and SQL text
	 * @param ModelOperationImpl op : method do not need specific type of op
	 */
	def generateOperationFile(ModelOperationImpl op) {
		var text = op.genOperation;
		this.write(text)
	}
	
	/**
	 * Creates writer and begins transaction.
	 */	
	def createWriter() {
		val file = generateFile(filename, "")
		writer = new PrintWriter(file)
		write('''BEGIN;
		''') //transaction BEGIN
	}
	
	/**
	 * Closes opened writer and ends transaction.
	 */
	def closeWriter() {
		write('''COMMIT;
		''') //transaction END
		writer.close()
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
	 * >> ALTER TABLE products ALTER COLUMN product_no SET NOT NULL; <<
 	 * @param AddNotNullConstraintImpl op : op of type AddNotNullConstraintImpl
	 */
	def dispatch genOperation(AddNotNullImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ALTER COLUMN «op.constrainedColumnName» SET NOT NULL;
	'''	
	
	def dispatch genOperation(RemoveNotNullImpl op) '''
		ALTER TABLE «op.owningSchemaName».«op.owningTableName»
			ALTER COLUMN «op.constrainedColumnName» DROP NOT NULL;
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
		write(this.convertBoolToInt);
		write(this.convertCharToBool);
		write(this.convertCharToInt);
		write(this.convertIntToBool);
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
     * This operation is more specific than HasNoInstances, it checks inexistance
     * of instances satisfying where condition (constructed in ORM).
     * @param CheckInstances op : op of type CheckInstances
     * @return boolean : t - no instances; f - some instances 
     */ 
    def dispatch genOperation(HasNoOwnInstancesImpl op)'''
    		SELECT COUNT(1) > 0 
    			FROM «op.owningSchemaName».«op.tableName» WHERE «op.whereCondition»;
    '''    
    
	/**
	 * UPDATE ROWS
	 * This operation copy data from one column to another.
	 * That means update of one column in target table. 
 	 * Target and source column can be in the same table.
 	 * @param UpdateRowsImpl op : op of type UpdateRowImpl
	 */
	def dispatch genOperation(UpdateRowsImpl op){
			return '''UPDATE «op.owningSchemaName».«op.targetTableName» SET «op.targetColumnName» = 
							(SELECT «op.owningSchemaName».«op.sourceTableName».«op.sourceColumnName» FROM «op.owningSchemaName».«op.sourceTableName» WHERE 
							     «op.whereCondition» );
	''';
	}
	
	/**
	 * Nill Rows
	 */
	def dispatch genOperation(NillRowsImpl op){
			return '''UPDATE «op.owningSchemaName».«op.tableName» SET «op.owningSchemaName».«op.tableName».«op.columnName» = 
							NULL WHERE «op.whereCondition» ;
	'''
	}

	/**
	 * INSERT ROWS
	 * This operation copy data from source columns to target columns.
	 * That means insert rows from source table to target table. 
 	 * Target and source columns must have same data type.
 	 * Target table must not have instances.
	 * @param InsertRowsImpl op : op of type InsertRowsImpl
	 */
	def dispatch genOperation(InsertRowsImpl op)'''
		INSERT INTO «op.owningSchemaName».«op.targetTableName» («FOR col : op.targetColumnNames SEPARATOR ","»«col»«ENDFOR»)
			SELECT «FOR col : op.sourceColumnsNames SEPARATOR ","»«op.owningSchemaName».«op.sourceTableName».«col»«ENDFOR» FROM «op.sourceTableName»
			«IF op.whereCondition != null && op.whereCondition != ""» where «op.whereCondition»«ENDIF»
			;
	'''
	
	/**
	 * DELETE ROWS
	 * This operation detele row from table
	 * Delete rows which not belong to table 
	 * @param DeleteRowsImpl op : op of type DeleteRowsImpl
	 */
	def dispatch genOperation(DeleteRowsImpl op)'''
		DELETE FROM «op.owningSchemaName».«op.tableName» WHERE «op.whereCondition»;
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
	def isSameTableSize(String schema, String table1, String table2) {
		this.raiseException
		'''
			SELECT CASE WHEN (SELECT COUNT(*) FROM «schema».«table1») = (SELECT COUNT(*) FROM «schema».«table2») THEN
					TRUE
				ELSE
					raise_ex('Tables ''«schema».«table1»'', ''«schema».«table2»'' have different row count!')
				END;
		'''
	}
	
	/**
	 * TARGET TABLE HAS MORE ROWS
	 * This query check size of two tables and compare
	 * number of their rows.
	 * @param String table1 : first table to compare
	 * @param String table2 : secont table to compare
	 * @return boolean : t - t1 has less rows; f - t1 has more or the same nomber of rows
	 */
	def targetTableHasMoreRows(String schema, String table1, String table2) {
		this.raiseException
		'''
			SELECT CASE WHEN (SELECT COUNT(*) FROM «schema».«table1») <= (SELECT COUNT(*) FROM «schema».«table2») THEN
					TRUE
				ELSE
					raise_ex('Table ''«schema».«table1»'' has greater row count than table ''«schema».«table2»''!')
				END;
		'''
	}

	/**
	 * HAS NO INSTANCES
	 * This query check if is table empty
	 * @param String schema : schema
	 * @param String table : table to check
	 * @return boolean : t - is empty; f - has instances
	 */	
	def hasNoInstances(String schema, String table) {
		this.raiseException
		'''
			SELECT CASE WHEN (SELECT COUNT(1) > 0 FROM «schema».«table») THEN
					raise_ex('Table ''«schema».«table»'' has instances!')
				ELSE
					TRUE
				END;
		'''
	}
	
	/**
  	 * Function for raising exception during the transaction.
  	 */
  	def raiseException() {
  		if(!queryCheckerWritten) {
			write('''
				CREATE OR REPLACE FUNCTION raise_ex(text) RETURNS boolean AS
					$BODY$
						BEGIN
							RAISE EXCEPTION 'Query check failed: %', $1;
						END;
					$BODY$
					LANGUAGE plpgsql;
				''')
			queryCheckerWritten = true;
		}
  	}
	
	
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
package migdb.generator
 
import eu.collectionspro.mwe.BaseCodeGenerator
import java.io.PrintWriter
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import mm.rdb.Schema
import mm.rdb.Table
import mm.rdb.Sequence
import mm.rdb.Index
import mm.rdb.Column
import mm.rdb.impl.TableImpl
import mm.rdb.TableConstraint
import mm.rdb.impl.TableConstraintImpl
import mm.rdb.impl.IndexImpl
import mm.rdb.impl.ColumnImpl
import mm.rdb.impl.SequenceImpl
import mm.rdb.impl.ForeignKeyImpl
import mm.rdb.impl.PrimaryKeyImpl
import mm.rdb.impl.UniqueImpl
 
 
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
		var objectList = new ArrayList<Schema>();
		
		for (Object arg : model.eContents) {
			if(arg instanceof Schema){
				objectList.add(arg as Schema);
			}
		}
		for (arg : objectList) {
			arg.generateSchema
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
	def generateSchema(Schema arg) {
		this.write('');
		
		var constraints = new ArrayList<TableConstraint>();
		
		for (EObject object : arg.eContents){
			if(object instanceof Table){
				this.write(object.genSQL)
				val Table table = object as Table;
				for(TableConstraint tableconstraint : table.constraints){
					constraints.add(tableconstraint);
				}				
			}	
		}


		for(TableConstraint constraint : constraints){
			if(constraint instanceof PrimaryKeyImpl){
				this.write(constraint.genSQL)
			}
		}
		
		for(TableConstraint constraint : constraints){
			if(!(constraint instanceof PrimaryKeyImpl)){
				this.write(constraint.genSQL)
			}
		}
		
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
	
	def dispatch genSQL(Table table) '''
		CREATE TABLE «table.owningSchema.name».«table.name» (
			«FOR column : table.columns SEPARATOR ","»
				«column.genSQL»
			«ENDFOR»
		);
	'''
	
	def dispatch genSQL(SequenceImpl sequence)'''
		CREATE SEQUENCE «sequence.name» START «sequence.startValue»;
	'''
	
	def dispatch genSQL(IndexImpl index)'''
		CREATE INDEX «index.name» ON «index.columns.get(0).owningTable.name» (
			«FOR column : index.columns SEPARATOR ","»
				«column.name»
			«ENDFOR»
		);
	'''
	
	def dispatch genSQL(ColumnImpl column) '''
		«column.name» «column.type.name» «IF column.defaultValue != null» DEFAULT «column.defaultValue»«ENDIF»«IF !column.isNillable» NOT NULL «ENDIF»
	'''
	
	def dispatch genSQL(ForeignKeyImpl foreignKey)'''
		ALTER TABLE «foreignKey.owningTable.name» ADD CONSTRAINT «foreignKey.name»
		   FOREIGN KEY («foreignKey.constrainedColumn.name») 
		        REFERENCES «foreignKey.targetTable.name»(id_«foreignKey.targetTable.name»
		);
	'''

	def dispatch genSQL(PrimaryKeyImpl primaryKey)'''
		ALTER TABLE «primaryKey.owningTable.name» ADD CONSTRAINT «primaryKey.name» PRIMARY KEY («primaryKey.constrainedColumn.name»
		);
	'''

	def dispatch genSQL(UniqueImpl unique)'''
		ALTER TABLE «unique.owningTable.name» ADD CONSTRAINT «unique.name» 
			UNIQUE («FOR column : unique.uniqueColumns SEPARATOR ","»
				«column.name»
			«ENDFOR»
		);
	'''
}
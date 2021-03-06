package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import mm.rdb.PrimitiveType;
import mm.rdb.ops.impl.AddColumnImpl;
import mm.rdb.ops.impl.AddForeignKeyImpl;
import mm.rdb.ops.impl.AddIndexImpl;
import mm.rdb.ops.impl.AddNotNullImpl;
import mm.rdb.ops.impl.AddPrimaryKeyImpl;
import mm.rdb.ops.impl.AddSchemaImpl;
import mm.rdb.ops.impl.AddSequenceImpl;
import mm.rdb.ops.impl.AddTableImpl;
import mm.rdb.ops.impl.AddUniqueImpl;
import mm.rdb.ops.impl.DeleteRowsImpl;
import mm.rdb.ops.impl.GenerateSequenceNumbersImpl;
import mm.rdb.ops.impl.HasNoInstancesImpl;
import mm.rdb.ops.impl.HasNoOwnInstancesImpl;
import mm.rdb.ops.impl.InsertRowsImpl;
import mm.rdb.ops.impl.ModelOperationImpl;
import mm.rdb.ops.impl.NillRowsImpl;
import mm.rdb.ops.impl.RemoveColumnImpl;
import mm.rdb.ops.impl.RemoveConstraintImpl;
import mm.rdb.ops.impl.RemoveDefaultValueImpl;
import mm.rdb.ops.impl.RemoveIndexImpl;
import mm.rdb.ops.impl.RemoveNotNullImpl;
import mm.rdb.ops.impl.RemoveSequenceImpl;
import mm.rdb.ops.impl.RemoveTableImpl;
import mm.rdb.ops.impl.RenameColumnImpl;
import mm.rdb.ops.impl.RenameTableImpl;
import mm.rdb.ops.impl.SetColumnTypeImpl;
import mm.rdb.ops.impl.SetDefaultValueImpl;
import mm.rdb.ops.impl.UpdateRowsImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class Generator extends BaseCodeGenerator {
  /**
   * ATRIBUTES
   */
  private PrintWriter writer;
  
  private boolean queryCheckerWritten = false;
  
  private String filename;
  
  /**
   * Main method for generating SQL from model
   * Model in param include all ops which we want to create
   * and ModelGeneration
   * @param EObject model : model of our application
   */
  public void doGenerate(final EObject model) {
      ArrayList<ModelOperationImpl> _arrayList = new ArrayList<ModelOperationImpl>();
      ArrayList<ModelOperationImpl> ops = _arrayList;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof ModelOperationImpl)) {
          ops.add(((ModelOperationImpl) arg));
        }
      }
      this.toplevelGenerator(ops);
  }
  
  /**
   * Method for start generating SQL from each op.
   * @param ArrayList<ModelOperationImpl> ops : list of ops in model
   */
  public void toplevelGenerator(final ArrayList<ModelOperationImpl> ops) {
      this.createWriter();
      for (final ModelOperationImpl op : ops) {
        this.generateOperationFile(op);
      }
      this.closeWriter();
  }
  
  /**
   * Method calls the method from the superclass
   * Superclass method need filename and SQL text
   * @param ModelOperationImpl op : method do not need specific type of op
   */
  public void generateOperationFile(final ModelOperationImpl op) {
      CharSequence _genOperation = this.genOperation(op);
      CharSequence text = _genOperation;
      this.write(text);
  }
  
  /**
   * Creates writer and begins transaction.
   */
  public void createWriter() {
    try {
      {
        File _generateFile = this.generateFile(this.filename, "");
        final File file = _generateFile;
        PrintWriter _printWriter = new PrintWriter(file);
        this.writer = _printWriter;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("BEGIN;");
        _builder.newLine();
        this.write(_builder);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Closes opened writer and ends transaction.
   */
  public void closeWriter() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("COMMIT;");
      _builder.newLine();
      this.write(_builder);
      this.writer.close();
  }
  
  /**
   * Writes string to opened writer
   * @param CharSequence text : string to be written
   */
  public void write(final CharSequence text) {
    this.writer.print(text);
  }
  
  /**
   * Setter for output filename
   * @param String path : filename
   */
  public String setFilename(final String path) {
    String _filename = this.filename = path;
    return _filename;
  }
  
  /**
   * CREATE SEQUENCE
   * Create an ascending sequence called serial, starting at 101:
   * >> CREATE SEQUENCE serial START 101; <<
   * @param AddSequenceImpl op : op of type AddSequenceImpl
   */
  protected CharSequence _genOperation(final AddSequenceImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SEQUENCE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(" START ");
    int _startValue = op.getStartValue();
    _builder.append(_startValue, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE NOT NULL
   * >> ALTER TABLE products ALTER COLUMN product_no SET NOT NULL; <<
   * @param AddNotNullConstraintImpl op : op of type AddNotNullConstraintImpl
   */
  protected CharSequence _genOperation(final AddNotNullImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _constrainedColumnName = op.getConstrainedColumnName();
    _builder.append(_constrainedColumnName, "	");
    _builder.append(" SET NOT NULL;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genOperation(final RemoveNotNullImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _constrainedColumnName = op.getConstrainedColumnName();
    _builder.append(_constrainedColumnName, "	");
    _builder.append(" DROP NOT NULL;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE PRIMARY KEY
   * To add an automatically named primary key constraint to a table, noting that a table can only ever have one primary key:
   * >> ALTER TABLE distributors ADD PRIMARY KEY (dist_id); <<
   * @param AddPrimaryKeyImpl op : op of type AddPrimaryKeyImpl
   */
  protected CharSequence _genOperation(final AddPrimaryKeyImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("PRIMARY KEY (");
    String _constrainedColumnName = op.getConstrainedColumnName();
    _builder.append(_constrainedColumnName, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE FOREIGN KEY
   * To add a constraint, the table constraint syntax is used. For example:
   * >> ALTER TABLE products ADD CONSTRAINT some_name  FOREIGN KEY (product_group_id) REFERENCES product_groups; <<
   * If we want to create foreign key, we must create column first.
   * Then we add constraint on column and define foreig key.
   * @param AddForeignKeyImpl op : op of type AddForeignKeyImpl
   */
  protected CharSequence _genOperation(final AddForeignKeyImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("FOREIGN KEY (");
    String _constrainedColumnName = op.getConstrainedColumnName();
    _builder.append(_constrainedColumnName, "	");
    _builder.append(") REFERENCES ");
    String _owningSchemaName_1 = op.getOwningSchemaName();
    _builder.append(_owningSchemaName_1, "	");
    _builder.append(".");
    String _targetTableName = op.getTargetTableName();
    _builder.append(_targetTableName, "	");
    _builder.append(" (id_");
    String _targetTableName_1 = op.getTargetTableName();
    _builder.append(_targetTableName_1, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE UNIQUE
   * To create a B-tree index on the column title in the table films:
   * >> CREATE UNIQUE INDEX title_idx ON films (title); <<
   * To add a constraint, the table constraint syntax is used. For example:
   * >> ALTER TABLE products ADD CONSTRAINT some_name UNIQUE (product_no); <<
   * Unique index can use only on column with index.
   * @param AddUniqueImpl op : op of type AddUniqueIndexImpl
   */
  protected CharSequence _genOperation(final AddUniqueImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.append(" UNIQUE (");
    {
      EList<String> _constrainedColumnNames = op.getConstrainedColumnNames();
      boolean _hasElements = false;
      for(final String col : _constrainedColumnNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append(col, "	");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE INDEX
   * To create a B-tree index on the column title in the table films:
   * >> CREATE INDEX title_idx ON films (title); <<
   * @param AddIndexImpl op : op of type AddIndexImpl
   */
  protected CharSequence _genOperation(final AddIndexImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE INDEX ");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ON ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "	");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "	");
    _builder.append(" (");
    {
      EList<String> _columnsNames = op.getColumnsNames();
      boolean _hasElements = false;
      for(final String col : _columnsNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append(col, "	");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE COLUMN
   * To add a column, use a command like:
   * >> ALTER TABLE products ADD COLUMN description text; <<
   * @param AddColumnImpl op : op of type AddColumnImpl
   */
  protected CharSequence _genOperation(final AddColumnImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD COLUMN ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.append(" ");
    {
      PrimitiveType _type = op.getType();
      String _string = _type.toString();
      boolean _equals = _string.equals("char");
      if (_equals) {
        _builder.append("character(30) ");
      } else {
        PrimitiveType _type_1 = op.getType();
        _builder.append(_type_1, "	");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE TABLE
   * So to create a table in the new schema, use:
   * >> CREATE TABLE myschema.mytable (...); <<
   * @param AddTableImpl op : op of type AddTableImpl
   */
  protected CharSequence _genOperation(final AddTableImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(" ();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE SCHEMA
   * To create a schema, use the CREATE SCHEMA command. Give the schema a name of your choice. For example:
   * >> CREATE SCHEMA myschema; <<
   * Operation is mode complex. If user want to create schema which name is "public" -> op do nothing
   * @param AddSchemaImpl op : op of type AddSchemaImpl
   */
  protected CharSequence _genOperation(final AddSchemaImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = op.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _equals = _lowerCase.equals("public");
      boolean _operator_not = BooleanExtensions.operator_not(_equals);
      if (_operator_not) {
        _builder.append("CREATE SCHEMA ");
        String _name_1 = op.getName();
        _builder.append(_name_1, "");
        _builder.append(" ");
      }
    }
    _builder.append("; ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE TABLE
   * If you no longer need a table, you can remove it using the DROP TABLE command. For example:
   * >> DROP TABLE products; <<
   * @param RemoveTableImpl op : op of type RemoveTableImpl
   */
  protected CharSequence _genOperation(final RemoveTableImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE COLUMN
   * To remove a column, use a command like:
   * >> ALTER TABLE products DROP COLUMN description; <<
   * @param RemoveColumnImpl op : op of type RemoveColumnImpl
   */
  protected CharSequence _genOperation(final RemoveColumnImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("DROP COLUMN ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE INDEX
   * This command will remove the index title_idx:
   * >> DROP INDEX title_idx; <<
   * @param RemoveIndexImpl op : op of type RemoveIndexImpl
   */
  protected CharSequence _genOperation(final RemoveIndexImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP INDEX ");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE CONSTRAINT
   * To remove a constraint you need to know its name. If you gave it a name then that's easy:
   * >> ALTER TABLE products DROP CONSTRAINT some_name; <<
   * @param RemoveTableConstraintImpl op : op of type TableConstraintImpl
   */
  protected CharSequence _genOperation(final RemoveConstraintImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("DROP CONSTRAINT ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE DEFAULT VALUE
   * To remove any default value, use:
   * >> ALTER TABLE products ALTER COLUMN price DROP DEFAULT; <<
   * @param RemoveDefaultValueImpl op : op of type RemoveDefaultValueImpl
   */
  protected CharSequence _genOperation(final RemoveDefaultValueImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = op.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" DROP DEFAULT;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE SEQUENCE
   * To remove sequence serial from database:
   * >> DROP SEQUENCE serial;
   * @param RemoveSequenceImpl op : op of type RemoveSequenceImpl
   */
  protected CharSequence _genOperation(final RemoveSequenceImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP SEQUENCE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * RENAME TABLE
   * To rename table:
   * >> ALTER TABLE products RENAME TO items; <<
   * @param RenameTableImpl op : op of type RenameTableImpl
   */
  protected CharSequence _genOperation(final RenameTableImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("RENAME TO ");
    String _newName = op.getNewName();
    _builder.append(_newName, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * RENAME COLUMN
   * To rename a column:
   * >> ALTER TABLE products RENAME COLUMN product_no TO product_number; <<
   * @param RenameColumnImpl op : op of type RenameColumnImpl
   */
  protected CharSequence _genOperation(final RenameColumnImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("RENAME COLUMN ");
    String _name = op.getName();
    _builder.append(_name, "	");
    _builder.append(" TO ");
    String _newName = op.getNewName();
    _builder.append(_newName, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * SET DEFAULT VALUE
   * This op can be used for setting sequence for PrimaryKey -> DEFAULT nextval('seqName')
   * To set a new default for a column, use a command like:
   * >> ALTER TABLE products ALTER COLUMN price SET DEFAULT 7.77; <<
   * Note that this doesn't affect any existing rows in the table, it just changes the default for future INSERT commands.
   * @param SetColumnDefaultValueImpl op : op of type SetColumnDefaultValueImpl
   */
  protected CharSequence _genOperation(final SetDefaultValueImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = op.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = op.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" SET DEFAULT ");
    String _newDefaultValue = op.getNewDefaultValue();
    _builder.append(_newDefaultValue, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * SET COLUMN TYPE
   * To convert a column to a different data type, use a command like:
   * >> ALTER TABLE products ALTER COLUMN price TYPE numeric(10,2); <<
   * For some not trivial causes of changing of data type are created functions.
   * @param SetColumnTypeImpl op : op of type SetColumnTypeImpl
   */
  protected CharSequence _genOperation(final SetColumnTypeImpl op) {
      CharSequence _convertBoolToInt = this.convertBoolToInt();
      this.write(_convertBoolToInt);
      CharSequence _convertCharToBool = this.convertCharToBool();
      this.write(_convertCharToBool);
      CharSequence _convertCharToInt = this.convertCharToInt();
      this.write(_convertCharToInt);
      CharSequence _convertIntToBool = this.convertIntToBool();
      this.write(_convertIntToBool);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ALTER TABLE ");
      String _owningSchemaName = op.getOwningSchemaName();
      _builder.append(_owningSchemaName, "");
      _builder.append(".");
      String _owningTableName = op.getOwningTableName();
      _builder.append(_owningTableName, "");
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t  \t  ");
      _builder.append("ALTER COLUMN ");
      String _owningColumnName = op.getOwningColumnName();
      _builder.append(_owningColumnName, "				  	  ");
      _builder.append(" TYPE ");
      PrimitiveType _newType = op.getNewType();
      _builder.append(_newType, "				  	  ");
      _builder.newLineIfNotEmpty();
      {
        boolean _operator_and = false;
        PrimitiveType _newType_1 = op.getNewType();
        boolean _equals = _newType_1.equals("int");
        if (!_equals) {
          _operator_and = false;
        } else {
          PrimitiveType _oldType = op.getOldType();
          boolean _equals_1 = _oldType.equals("boolean");
          _operator_and = BooleanExtensions.operator_and(_equals, _equals_1);
        }
        if (_operator_and) {
          _builder.append("\t\t\t\t\t\t");
          _builder.append("USING converting_booltoint(");
          String _owningColumnName_1 = op.getOwningColumnName();
          _builder.append(_owningColumnName_1, "						");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          boolean _operator_and_1 = false;
          PrimitiveType _newType_2 = op.getNewType();
          boolean _equals_2 = _newType_2.equals("boolean");
          if (!_equals_2) {
            _operator_and_1 = false;
          } else {
            PrimitiveType _oldType_1 = op.getOldType();
            boolean _equals_3 = _oldType_1.equals("int");
            _operator_and_1 = BooleanExtensions.operator_and(_equals_2, _equals_3);
          }
          if (_operator_and_1) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("USING converting_inttoboolean(");
            String _owningColumnName_2 = op.getOwningColumnName();
            _builder.append(_owningColumnName_2, "						");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _operator_and_2 = false;
            PrimitiveType _newType_3 = op.getNewType();
            boolean _equals_4 = _newType_3.equals("boolean");
            if (!_equals_4) {
              _operator_and_2 = false;
            } else {
              PrimitiveType _oldType_2 = op.getOldType();
              boolean _equals_5 = _oldType_2.equals("char");
              _operator_and_2 = BooleanExtensions.operator_and(_equals_4, _equals_5);
            }
            if (_operator_and_2) {
              _builder.append("\t\t\t\t\t\t");
              _builder.append("USING converting_chartobool(");
              String _owningColumnName_3 = op.getOwningColumnName();
              _builder.append(_owningColumnName_3, "						");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _operator_and_3 = false;
              PrimitiveType _newType_4 = op.getNewType();
              boolean _equals_6 = _newType_4.equals("int");
              if (!_equals_6) {
                _operator_and_3 = false;
              } else {
                PrimitiveType _oldType_3 = op.getOldType();
                boolean _equals_7 = _oldType_3.equals("char");
                _operator_and_3 = BooleanExtensions.operator_and(_equals_6, _equals_7);
              }
              if (_operator_and_3) {
                _builder.append("\t\t\t\t\t\t");
                _builder.append("USING converting_chartoint(");
                String _owningColumnName_4 = op.getOwningColumnName();
                _builder.append(_owningColumnName_4, "						");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t\t\t\t");
              }
            }
          }
        }
      }
      _builder.append(";");
      return _builder;
  }
  
  /**
   * GENERATE SEQUENCE NUMBERS
   * This operation generate new sequence numbers to column
   * @param GenerateSequenceNumbers op : op of type GenerateSequenceNumbers
   */
  protected CharSequence _genOperation(final GenerateSequenceNumbersImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UPDATE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = op.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" SET ");
    String _columnName = op.getColumnName();
    _builder.append(_columnName, "");
    _builder.append(" = nextval(\'");
    String _sequenceName = op.getSequenceName();
    _builder.append(_sequenceName, "");
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * HAS NO INSTANCES
   * This operation check if table has some rows.
   * @param HasNoInstances op : op of type HasNoInstances
   * @return boolean : t - no instances; f - some instances
   */
  protected CharSequence _genOperation(final HasNoInstancesImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 FROM ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = op.getTableName();
    _builder.append(_tableName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * HAS NO OWN INSTANCES
   * This operation check if table has some own rows.
   * This operation is more specific than HasNoInstances, it checks inexistance
   * of instances satisfying where condition (constructed in ORM).
   * @param CheckInstances op : op of type CheckInstances
   * @return boolean : t - no instances; f - some instances
   */
  protected CharSequence _genOperation(final HasNoOwnInstancesImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FROM ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "	");
    _builder.append(".");
    String _tableName = op.getTableName();
    _builder.append(_tableName, "	");
    _builder.append(" WHERE ");
    String _whereCondition = op.getWhereCondition();
    _builder.append(_whereCondition, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * UPDATE ROWS
   * This operation copy data from one column to another.
   * That means update of one column in target table.
   * Target and source column can be in the same table.
   * @param UpdateRowsImpl op : op of type UpdateRowImpl
   */
  protected CharSequence _genOperation(final UpdateRowsImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UPDATE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _targetTableName = op.getTargetTableName();
    _builder.append(_targetTableName, "");
    _builder.append(" SET ");
    String _targetColumnName = op.getTargetColumnName();
    _builder.append(_targetColumnName, "");
    _builder.append(" = ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("(SELECT ");
    String _sourceColumnName = op.getSourceColumnName();
    _builder.append(_sourceColumnName, "							");
    _builder.append(" FROM ");
    String _owningSchemaName_1 = op.getOwningSchemaName();
    _builder.append(_owningSchemaName_1, "							");
    _builder.append(".");
    String _sourceTableName = op.getSourceTableName();
    _builder.append(_sourceTableName, "							");
    _builder.append(" WHERE ");
    String _whereCondition = op.getWhereCondition();
    _builder.append(_whereCondition, "							");
    _builder.append(" );");
    return _builder;
  }
  
  /**
   * Nill Rows
   */
  protected CharSequence _genOperation(final NillRowsImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UPDATE ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = op.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" SET ");
    String _columnName = op.getColumnName();
    _builder.append(_columnName, "");
    _builder.append(" = ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("NULL WHERE ");
    String _whereCondition = op.getWhereCondition();
    _builder.append(_whereCondition, "							");
    _builder.append(" ;");
    return _builder;
  }
  
  /**
   * INSERT ROWS
   * This operation copy data from source columns to target columns.
   * That means insert rows from source table to target table.
   * Target and source columns must have same data type.
   * Target table must not have instances.
   * @param InsertRowsImpl op : op of type InsertRowsImpl
   */
  protected CharSequence _genOperation(final InsertRowsImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _targetTableName = op.getTargetTableName();
    _builder.append(_targetTableName, "");
    _builder.append(" (");
    {
      EList<String> _sourceColumnsNames = op.getSourceColumnsNames();
      boolean _hasElements = false;
      for(final String col : _sourceColumnsNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(col, "");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SELECT ");
    {
      EList<String> _sourceColumnsNames_1 = op.getSourceColumnsNames();
      boolean _hasElements_1 = false;
      for(final String col_1 : _sourceColumnsNames_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append(col_1, "	");
      }
    }
    _builder.append(" FROM ");
    String _sourceTableName = op.getSourceTableName();
    _builder.append(_sourceTableName, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _operator_and = false;
      String _whereCondition = op.getWhereCondition();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_whereCondition, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        String _whereCondition_1 = op.getWhereCondition();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_whereCondition_1, "");
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        _builder.append(" where ");
        String _whereCondition_2 = op.getWhereCondition();
        _builder.append(_whereCondition_2, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * DELETE ROWS
   * This operation detele row from table
   * Delete rows which not belong to table
   * @param DeleteRowsImpl op : op of type DeleteRowsImpl
   */
  protected CharSequence _genOperation(final DeleteRowsImpl op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DELETE FROM ");
    String _owningSchemaName = op.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = op.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" WHERE ");
    String _whereCondition = op.getWhereCondition();
    _builder.append(_whereCondition, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * IS SAME TABLE SIZE
   * This query check size of two tables and compare
   * number of their rows.
   * @param String table1 : first table to compare
   * @param String table2 : secont table to compare
   * @return boolean : t - the same size; f - different size
   */
  public CharSequence isSameTableSize(final String schema, final String table1, final String table2) {
    CharSequence _xblockexpression = null;
    {
      this.raiseException();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SELECT CASE WHEN (SELECT COUNT(*) FROM ");
      _builder.append(schema, "");
      _builder.append(".");
      _builder.append(table1, "");
      _builder.append(") = (SELECT COUNT(*) FROM ");
      _builder.append(schema, "");
      _builder.append(".");
      _builder.append(table2, "");
      _builder.append(") THEN");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("TRUE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ELSE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("raise_ex(\'Tables \'\'");
      _builder.append(schema, "		");
      _builder.append(".");
      _builder.append(table1, "		");
      _builder.append("\'\', \'\'");
      _builder.append(schema, "		");
      _builder.append(".");
      _builder.append(table2, "		");
      _builder.append("\'\' have different row count!\')");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("END;");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * TARGET TABLE HAS MORE ROWS
   * This query check size of two tables and compare
   * number of their rows.
   * @param String table1 : first table to compare
   * @param String table2 : secont table to compare
   * @return boolean : t - t1 has less rows; f - t1 has more or the same nomber of rows
   */
  public CharSequence targetTableHasMoreRows(final String schema, final String table1, final String table2) {
    CharSequence _xblockexpression = null;
    {
      this.raiseException();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SELECT CASE WHEN (SELECT COUNT(*) FROM ");
      _builder.append(schema, "");
      _builder.append(".");
      _builder.append(table1, "");
      _builder.append(") <= (SELECT COUNT(*) FROM ");
      _builder.append(schema, "");
      _builder.append(".");
      _builder.append(table2, "");
      _builder.append(") THEN");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("TRUE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ELSE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("raise_ex(\'Table \'\'");
      _builder.append(schema, "		");
      _builder.append(".");
      _builder.append(table1, "		");
      _builder.append("\'\' has greater row count than table \'\'");
      _builder.append(schema, "		");
      _builder.append(".");
      _builder.append(table2, "		");
      _builder.append("\'\'!\')");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("END;");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * HAS NO INSTANCES
   * This query check if is table empty
   * @param String schema : schema
   * @param String table : table to check
   * @return boolean : t - is empty; f - has instances
   */
  public CharSequence hasNoInstances(final String schema, final String table) {
    CharSequence _xblockexpression = null;
    {
      this.raiseException();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SELECT CASE WHEN (SELECT COUNT(1) > 0 FROM ");
      _builder.append(schema, "");
      _builder.append(".");
      _builder.append(table, "");
      _builder.append(") THEN");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("raise_ex(\'Table \'\'");
      _builder.append(schema, "		");
      _builder.append(".");
      _builder.append(table, "		");
      _builder.append("\'\' has instances!\')");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("ELSE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("TRUE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("END;");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  /**
   * Function for raising exception during the transaction.
   */
  public Boolean raiseException() {
    Boolean _xifexpression = null;
    boolean _operator_not = BooleanExtensions.operator_not(this.queryCheckerWritten);
    if (_operator_not) {
      boolean _xblockexpression = false;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("CREATE OR REPLACE FUNCTION raise_ex(text) RETURNS boolean AS");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("$BODY$");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("BEGIN");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("RAISE EXCEPTION \'Query check failed: %\', $1;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("END;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("$BODY$");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("LANGUAGE plpgsql;");
        _builder.newLine();
        this.write(_builder);
        boolean _queryCheckerWritten = this.queryCheckerWritten = true;
        _xblockexpression = (_queryCheckerWritten);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * BOOLEAN TO INTEGER
   * Rule for converting:
   * True -> 1
   * False -> 0
   */
  public CharSequence convertBoolToInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE OR REPLACE FUNCTION convert_booltoint(booltoconvert boolean) RETURNS integer AS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SELECT CASE WHEN $1 = TRUE THEN 1 ELSE 0 END;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LANGUAGE \'sql\' IMMUTABLE STRICT;");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * INTEGER TO BOOLEAN
   * Rule for converting:
   * x < 1 -> False
   * x >= 1 -> True
   */
  public CharSequence convertIntToBool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE OR REPLACE FUNCTION convert_inttoboolean(inttoconvert integer) RETURNS boolean AS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SELECT CASE WHEN $1 < 1 THEN FALSE ELSE TRUE END;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LANGUAGE \'sql\' IMMUTABLE STRICT; ");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * VARCHAR TO INTEGER
   * Rule for converting:
   * Find number in String
   */
  public CharSequence convertCharToInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE OR REPLACE FUNCTION convert_chartoint(chartoconvert character varying) RETURNS integer AS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SELECT CASE WHEN trim($1) SIMILAR TO \'[0-9]+\' THEN CAST(trim($1) AS integer) ELSE NULL END;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LANGUAGE \'sql\' IMMUTABLE STRICT;\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * VARCHAR TO BOOLEAN
   * Rule for converting:
   * Find boolean in String
   */
  public CharSequence convertCharToBool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE OR REPLACE FUNCTION convert_chartobool(chartoconvert character varying) RETURNS boolean AS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SELECT CASE ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("WHEN trim($1) LIKE \'true\' THEN TRUE");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("WHEN trim($1) LIKE \'false\' THEN FALSE ");
    _builder.newLine();
    _builder.append("\t\t\t   ");
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$BODY$");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LANGUAGE \'sql\' IMMUTABLE STRICT;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genOperation(final ModelOperationImpl op) {
    if (op instanceof AddColumnImpl) {
      return _genOperation((AddColumnImpl)op);
    } else if (op instanceof AddForeignKeyImpl) {
      return _genOperation((AddForeignKeyImpl)op);
    } else if (op instanceof AddIndexImpl) {
      return _genOperation((AddIndexImpl)op);
    } else if (op instanceof AddNotNullImpl) {
      return _genOperation((AddNotNullImpl)op);
    } else if (op instanceof AddPrimaryKeyImpl) {
      return _genOperation((AddPrimaryKeyImpl)op);
    } else if (op instanceof AddSchemaImpl) {
      return _genOperation((AddSchemaImpl)op);
    } else if (op instanceof AddSequenceImpl) {
      return _genOperation((AddSequenceImpl)op);
    } else if (op instanceof AddTableImpl) {
      return _genOperation((AddTableImpl)op);
    } else if (op instanceof AddUniqueImpl) {
      return _genOperation((AddUniqueImpl)op);
    } else if (op instanceof DeleteRowsImpl) {
      return _genOperation((DeleteRowsImpl)op);
    } else if (op instanceof GenerateSequenceNumbersImpl) {
      return _genOperation((GenerateSequenceNumbersImpl)op);
    } else if (op instanceof HasNoInstancesImpl) {
      return _genOperation((HasNoInstancesImpl)op);
    } else if (op instanceof HasNoOwnInstancesImpl) {
      return _genOperation((HasNoOwnInstancesImpl)op);
    } else if (op instanceof InsertRowsImpl) {
      return _genOperation((InsertRowsImpl)op);
    } else if (op instanceof NillRowsImpl) {
      return _genOperation((NillRowsImpl)op);
    } else if (op instanceof RemoveColumnImpl) {
      return _genOperation((RemoveColumnImpl)op);
    } else if (op instanceof RemoveConstraintImpl) {
      return _genOperation((RemoveConstraintImpl)op);
    } else if (op instanceof RemoveDefaultValueImpl) {
      return _genOperation((RemoveDefaultValueImpl)op);
    } else if (op instanceof RemoveIndexImpl) {
      return _genOperation((RemoveIndexImpl)op);
    } else if (op instanceof RemoveNotNullImpl) {
      return _genOperation((RemoveNotNullImpl)op);
    } else if (op instanceof RemoveSequenceImpl) {
      return _genOperation((RemoveSequenceImpl)op);
    } else if (op instanceof RemoveTableImpl) {
      return _genOperation((RemoveTableImpl)op);
    } else if (op instanceof RenameColumnImpl) {
      return _genOperation((RenameColumnImpl)op);
    } else if (op instanceof RenameTableImpl) {
      return _genOperation((RenameTableImpl)op);
    } else if (op instanceof SetColumnTypeImpl) {
      return _genOperation((SetColumnTypeImpl)op);
    } else if (op instanceof SetDefaultValueImpl) {
      return _genOperation((SetDefaultValueImpl)op);
    } else if (op instanceof UpdateRowsImpl) {
      return _genOperation((UpdateRowsImpl)op);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(op).toString());
    }
  }
}

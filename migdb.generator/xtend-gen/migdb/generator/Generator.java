package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import mm.rdb.PrimitiveType;
import mm.rdb.operations.MergeType;
import mm.rdb.operations.impl.AddColumnImpl;
import mm.rdb.operations.impl.AddForeignKeyImpl;
import mm.rdb.operations.impl.AddIndexImpl;
import mm.rdb.operations.impl.AddInstancesImpl;
import mm.rdb.operations.impl.AddNotNullConstraintImpl;
import mm.rdb.operations.impl.AddPrimaryKeyImpl;
import mm.rdb.operations.impl.AddSchemaImpl;
import mm.rdb.operations.impl.AddSequenceImpl;
import mm.rdb.operations.impl.AddTableImpl;
import mm.rdb.operations.impl.AddUniqueIndexImpl;
import mm.rdb.operations.impl.CopyInstancesImpl;
import mm.rdb.operations.impl.GenerateSequenceNumbersImpl;
import mm.rdb.operations.impl.HasNoInstancesImpl;
import mm.rdb.operations.impl.HasNoOwnInstancesImpl;
import mm.rdb.operations.impl.InsertInstancesImpl;
import mm.rdb.operations.impl.ModelOperationImpl;
import mm.rdb.operations.impl.RemoveColumnConstraintImpl;
import mm.rdb.operations.impl.RemoveColumnImpl;
import mm.rdb.operations.impl.RemoveDefaultValueImpl;
import mm.rdb.operations.impl.RemoveIndexImpl;
import mm.rdb.operations.impl.RemoveSequenceImpl;
import mm.rdb.operations.impl.RemoveTableConstraintImpl;
import mm.rdb.operations.impl.RemoveTableImpl;
import mm.rdb.operations.impl.RenameColumnImpl;
import mm.rdb.operations.impl.RenameTableImpl;
import mm.rdb.operations.impl.SetColumnDefaultValueImpl;
import mm.rdb.operations.impl.SetColumnTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Generator extends BaseCodeGenerator {
  /**
   * ATRIBUDES
   */
  private int counter;
  
  /**
   * Main method for generating SQL from model
   * Model in param include all operations which we want to create
   * and ModelGeneration
   * @param EObject model : model of our application
   */
  public void doGenerate(final EObject model) {
      ArrayList<ModelOperationImpl> _arrayList = new ArrayList<ModelOperationImpl>();
      ArrayList<ModelOperationImpl> operations = _arrayList;
      this.counter = 100;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof ModelOperationImpl)) {
          operations.add(((ModelOperationImpl) arg));
        }
      }
      this.toplevelGenerator(operations);
  }
  
  /**
   * Method for start generating SQL from each operation.
   * @param ArrayList<ModelOperationImpl> operations : list of operations in model
   */
  public void toplevelGenerator(final ArrayList<ModelOperationImpl> operations) {
    for (final ModelOperationImpl op : operations) {
      this.generateOperationFile(op);
    }
  }
  
  /**
   * Method calls the method from the superclass
   * Superclass method need filename and SQL text
   * @param ModelOperationImpl operation : method do not need specific type of operation
   */
  public File generateOperationFile(final ModelOperationImpl operation) {
    File _xblockexpression = null;
    {
      CharSequence _genOperation = this.genOperation(operation);
      CharSequence text = _genOperation;
      String _fileName = this.getFileName(operation, ".sql");
      File _generateFile = this.generateFile(_fileName, text);
      _xblockexpression = (_generateFile);
    }
    return _xblockexpression;
  }
  
  /**
   * Method define name of file
   * @param ModelOperationImpl operation : method do not need specific type of operation
   */
  public String getFileName(final ModelOperationImpl operation, final String type) {
      int _operator_plus = IntegerExtensions.operator_plus(this.counter, 1);
      this.counter = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("", Integer.valueOf(this.counter));
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, type);
      return _operator_plus_2;
  }
  
  /**
   * CREATE SEQUENCE
   * Create an ascending sequence called serial, starting at 101:
   * >> CREATE SEQUENCE serial START 101; <<
   * @param AddSequenceImpl operation : operation of type AddSequenceImpl
   */
  protected CharSequence _genOperation(final AddSequenceImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SEQUENCE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" START ");
    int _startValue = operation.getStartValue();
    _builder.append(_startValue, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
  protected CharSequence _genOperation(final AddNotNullConstraintImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = operation.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" SET NOT NULL;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE PRIMARY KEY
   * To add an automatically named primary key constraint to a table, noting that a table can only ever have one primary key:
   * >> ALTER TABLE distributors ADD PRIMARY KEY (dist_id); <<
   * @param AddPrimaryKeyImpl operation : operation of type AddPrimaryKeyImpl
   */
  protected CharSequence _genOperation(final AddPrimaryKeyImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("PRIMARY KEY (");
    String _columnName = operation.getColumnName();
    _builder.append(_columnName, "	");
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
   * @param AddForeignKeyImpl operation : operation of type AddForeignKeyImpl
   */
  protected CharSequence _genOperation(final AddForeignKeyImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD CONSTRAINT ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("FOREIGN KEY (");
    String _constrainedColumnName = operation.getConstrainedColumnName();
    _builder.append(_constrainedColumnName, "	");
    _builder.append(") REFERENCES ");
    String _owningSchemaName_1 = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName_1, "	");
    _builder.append(".");
    String _targetTableName = operation.getTargetTableName();
    _builder.append(_targetTableName, "	");
    _builder.append(" (id_");
    String _targetTableName_1 = operation.getTargetTableName();
    _builder.append(_targetTableName_1, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE UNIQUE INDEX
   * To create a B-tree index on the column title in the table films:
   * >> CREATE UNIQUE INDEX title_idx ON films (title); <<
   * To add a constraint, the table constraint syntax is used. For example:
   * >> ALTER TABLE products ADD CONSTRAINT some_name UNIQUE (product_no); <<
   * Unique index can use only on column with index.
   * @param AddUniqueIndexImpl operation : operation of type AddUniqueIndexImpl
   */
  protected CharSequence _genOperation(final AddUniqueIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE UNIQUE INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ON ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "	");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "	");
    _builder.append(" (");
    {
      EList<String> _columnsNames = operation.getColumnsNames();
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
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE INDEX
   * To create a B-tree index on the column title in the table films:
   * >> CREATE INDEX title_idx ON films (title); <<
   * @param AddIndexImpl operation : operation of type AddIndexImpl
   */
  protected CharSequence _genOperation(final AddIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ON ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "	");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "	");
    _builder.append(" (");
    {
      EList<String> _columnsNames = operation.getColumnsNames();
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
   * @param AddColumnImpl operation : operation of type AddColumnImpl
   */
  protected CharSequence _genOperation(final AddColumnImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ADD COLUMN ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.append(" ");
    {
      PrimitiveType _type = operation.getType();
      String _string = _type.toString();
      boolean _equals = _string.equals("char");
      if (_equals) {
        _builder.append("character(30) ");
      } else {
        PrimitiveType _type_1 = operation.getType();
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
   * @param AddTableImpl operation : operation of type AddTableImpl
   */
  protected CharSequence _genOperation(final AddTableImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" ();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * CREATE SCHEMA
   * To create a schema, use the CREATE SCHEMA command. Give the schema a name of your choice. For example:
   * >> CREATE SCHEMA myschema; <<
   * Operation is mode complex. If user want to create schema which name is "public" -> operation do nothing
   * @param AddSchemaImpl operation : operation of type AddSchemaImpl
   */
  protected CharSequence _genOperation(final AddSchemaImpl operation) {
      String _name = operation.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _equals = _lowerCase.equals("public");
      boolean _operator_not = BooleanExtensions.operator_not(_equals);
      if (_operator_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("CREATE SCHEMA ");
        String _name_1 = operation.getName();
        _builder.append(_name_1, " ");
        _builder.append(";");
        return _builder;
      }
      return "";
  }
  
  /**
   * REMOVE TABLE
   * If you no longer need a table, you can remove it using the DROP TABLE command. For example:
   * >> DROP TABLE products; <<
   * @param RemoveTableImpl operation : operation of type RemoveTableImpl
   */
  protected CharSequence _genOperation(final RemoveTableImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE COLUMN
   * To remove a column, use a command like:
   * >> ALTER TABLE products DROP COLUMN description; <<
   * @param RemoveColumnImpl operation : operation of type RemoveColumnImpl
   */
  protected CharSequence _genOperation(final RemoveColumnImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("DROP COLUMN ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE INDEX
   * This command will remove the index title_idx:
   * >> DROP INDEX title_idx; <<
   * @param RemoveIndexImpl operation : operation of type RemoveIndexImpl
   */
  protected CharSequence _genOperation(final RemoveIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE TABLE CONSTRAINT
   * To remove a constraint you need to know its name. If you gave it a name then that's easy:
   * >> ALTER TABLE products DROP CONSTRAINT some_name; <<
   * @param RemoveTableConstraintImpl operation : operation of type TableConstraintImpl
   */
  protected CharSequence _genOperation(final RemoveTableConstraintImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("DROP CONSTRAINT ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE COLUMN CONSTRAINT
   * This works the same for all constraint types except not-null constraints. To drop a not null constraint use:
   * >> ALTER TABLE products ALTER COLUMN product_no DROP NOT NULL; <<
   * @param RemoveColumnConstraintImpl operation : operation of type RemoveColumnConstraintImpl
   */
  protected CharSequence _genOperation(final RemoveColumnConstraintImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = operation.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" DROP NOT NULL;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE DEFAULT VALUE
   * To remove any default value, use:
   * >> ALTER TABLE products ALTER COLUMN price DROP DEFAULT; <<
   * @param RemoveDefaultValueImpl operation : operation of type RemoveDefaultValueImpl
   */
  protected CharSequence _genOperation(final RemoveDefaultValueImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = operation.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" DROP DEFAULT;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * REMOVE SEQUENCE
   * To remove sequence serial from database:
   * >> DROP SEQUENCE serial;
   * @param RemoveSequenceImpl operation : operation of type RemoveSequenceImpl
   */
  protected CharSequence _genOperation(final RemoveSequenceImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP SEQUENCE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _sequenceName = operation.getSequenceName();
    _builder.append(_sequenceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * RENAME TABLE
   * To rename table:
   * >> ALTER TABLE products RENAME TO items; <<
   * @param RenameTableImpl operation : operation of type RenameTableImpl
   */
  protected CharSequence _genOperation(final RenameTableImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("RENAME TO ");
    String _newName = operation.getNewName();
    _builder.append(_newName, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * RENAME COLUMN
   * To rename a column:
   * >> ALTER TABLE products RENAME COLUMN product_no TO product_number; <<
   * @param RenameColumnImpl operation : operation of type RenameColumnImpl
   */
  protected CharSequence _genOperation(final RenameColumnImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("RENAME COLUMN ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.append(" TO ");
    String _newName = operation.getNewName();
    _builder.append(_newName, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * SET COLUMN DEFAULT VALUE
   * This operation can be used for setting sequence for PrimaryKey -> DEFAULT nextval('seqName')
   * To set a new default for a column, use a command like:
   * >> ALTER TABLE products ALTER COLUMN price SET DEFAULT 7.77; <<
   * Note that this doesn't affect any existing rows in the table, it just changes the default for future INSERT commands.
   * @param SetColumnDefaultValueImpl operation : operation of type SetColumnDefaultValueImpl
   */
  protected CharSequence _genOperation(final SetColumnDefaultValueImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _owningTableName = operation.getOwningTableName();
    _builder.append(_owningTableName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ALTER COLUMN ");
    String _owningColumnName = operation.getOwningColumnName();
    _builder.append(_owningColumnName, "	");
    _builder.append(" SET DEFAULT ");
    String _newDefaultValue = operation.getNewDefaultValue();
    _builder.append(_newDefaultValue, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * SET COLUMN DATA TYPE
   * To convert a column to a different data type, use a command like:
   * >> ALTER TABLE products ALTER COLUMN price TYPE numeric(10,2); <<
   * For some not trivial causes of changing of data type are created functions.
   * @param SetColumnTypeImpl operation : operation of type SetColumnTypeImpl
   */
  protected CharSequence _genOperation(final SetColumnTypeImpl operation) {
      String _fileName = this.getFileName(operation, ".sql");
      CharSequence _convertBoolToInt = this.convertBoolToInt();
      this.generateFile(_fileName, _convertBoolToInt);
      String _fileName_1 = this.getFileName(operation, ".sql");
      CharSequence _convertCharToBool = this.convertCharToBool();
      this.generateFile(_fileName_1, _convertCharToBool);
      String _fileName_2 = this.getFileName(operation, ".sql");
      CharSequence _convertCharToInt = this.convertCharToInt();
      this.generateFile(_fileName_2, _convertCharToInt);
      String _fileName_3 = this.getFileName(operation, ".sql");
      CharSequence _convertIntToBool = this.convertIntToBool();
      this.generateFile(_fileName_3, _convertIntToBool);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ALTER TABLE ");
      String _owningSchemaName = operation.getOwningSchemaName();
      _builder.append(_owningSchemaName, "");
      _builder.append(".");
      String _owningTableName = operation.getOwningTableName();
      _builder.append(_owningTableName, "");
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t  \t  ");
      _builder.append("ALTER COLUMN ");
      String _owningColumnName = operation.getOwningColumnName();
      _builder.append(_owningColumnName, "				  	  ");
      _builder.append(" TYPE ");
      PrimitiveType _newType = operation.getNewType();
      _builder.append(_newType, "				  	  ");
      _builder.newLineIfNotEmpty();
      {
        boolean _operator_and = false;
        PrimitiveType _newType_1 = operation.getNewType();
        String _string = _newType_1.toString();
        boolean _equals = _string.equals("int");
        if (!_equals) {
          _operator_and = false;
        } else {
          PrimitiveType _oldType = operation.getOldType();
          String _string_1 = _oldType.toString();
          boolean _equals_1 = _string_1.equals("boolean");
          _operator_and = BooleanExtensions.operator_and(_equals, _equals_1);
        }
        if (_operator_and) {
          _builder.append("\t\t\t\t\t\t");
          _builder.append("USING converting_booltoint(");
          String _owningColumnName_1 = operation.getOwningColumnName();
          _builder.append(_owningColumnName_1, "						");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          boolean _operator_and_1 = false;
          PrimitiveType _newType_2 = operation.getNewType();
          String _string_2 = _newType_2.toString();
          boolean _equals_2 = _string_2.equals("boolean");
          if (!_equals_2) {
            _operator_and_1 = false;
          } else {
            PrimitiveType _oldType_1 = operation.getOldType();
            String _string_3 = _oldType_1.toString();
            boolean _equals_3 = _string_3.equals("int");
            _operator_and_1 = BooleanExtensions.operator_and(_equals_2, _equals_3);
          }
          if (_operator_and_1) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("USING converting_inttoboolean(");
            String _owningColumnName_2 = operation.getOwningColumnName();
            _builder.append(_owningColumnName_2, "						");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _operator_and_2 = false;
            PrimitiveType _newType_3 = operation.getNewType();
            String _string_4 = _newType_3.toString();
            boolean _equals_4 = _string_4.equals("boolean");
            if (!_equals_4) {
              _operator_and_2 = false;
            } else {
              PrimitiveType _oldType_2 = operation.getOldType();
              String _string_5 = _oldType_2.toString();
              boolean _equals_5 = _string_5.equals("char");
              _operator_and_2 = BooleanExtensions.operator_and(_equals_4, _equals_5);
            }
            if (_operator_and_2) {
              _builder.append("\t\t\t\t\t\t");
              _builder.append("USING converting_chartobool(");
              String _owningColumnName_3 = operation.getOwningColumnName();
              _builder.append(_owningColumnName_3, "						");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _operator_and_3 = false;
              PrimitiveType _newType_4 = operation.getNewType();
              String _string_6 = _newType_4.toString();
              boolean _equals_6 = _string_6.equals("int");
              if (!_equals_6) {
                _operator_and_3 = false;
              } else {
                PrimitiveType _oldType_3 = operation.getOldType();
                String _string_7 = _oldType_3.toString();
                boolean _equals_7 = _string_7.equals("char");
                _operator_and_3 = BooleanExtensions.operator_and(_equals_6, _equals_7);
              }
              if (_operator_and_3) {
                _builder.append("\t\t\t\t\t\t");
                _builder.append("USING converting_chartoint(");
                String _owningColumnName_4 = operation.getOwningColumnName();
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
   * 
   * @param GenerateSequenceNumbers operation : operation of type GenerateSequenceNumbers
   */
  protected CharSequence _genOperation(final GenerateSequenceNumbersImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UPDATE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = operation.getTableName();
    _builder.append(_tableName, "");
    _builder.append(" SET ");
    String _columnName = operation.getColumnName();
    _builder.append(_columnName, "");
    _builder.append(" = nextval(\'");
    String _sequenceName = operation.getSequenceName();
    _builder.append(_sequenceName, "");
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * ADD INSTANCES
   * This operation add defined number of rows to defined tables.
   * This SQL get all instances from source table and copy
   * these instances to target tables.
   * 
   * @param AddInstances operation : operation of type AddInstances
   */
  protected CharSequence _genOperation(final AddInstancesImpl operation) {
      EList<String> _targetTableNames = operation.getTargetTableNames();
      for (final String tab : _targetTableNames) {
        String _fileName = this.getFileName(operation, ".sql");
        String _owningSchemaName = operation.getOwningSchemaName();
        String _sourceTableName = operation.getSourceTableName();
        CharSequence _addInstancesToTabble = this.addInstancesToTabble(_owningSchemaName, _sourceTableName, tab);
        this.generateFile(_fileName, _addInstancesToTabble);
      }
      return "";
  }
  
  /**
   * HAS NO INSTANCES
   * This operation check if table has some rows.
   * 
   * @param HasNoInstances operation : operation of type HasNoInstances
   * @return boolean : t - no instances; f - some instances
   */
  protected CharSequence _genOperation(final HasNoInstancesImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 FROM ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _tableName = operation.getTableName();
    _builder.append(_tableName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * HAS NO OWN INSTANCES
   * This operation check if table has some own rows.
   * This SQL check ownership between instances and tables. Table can have
   * a lot of rows ale nemuseji tabulce patrit hierarchicky.
   * 
   * @param CheckInstances operation : operation of type CheckInstances
   * @return boolean : t - no instances; f - some instances
   */
  protected CharSequence _genOperation(final HasNoOwnInstancesImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("FROM ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "	");
    _builder.append(".");
    String _tableName = operation.getTableName();
    _builder.append(_tableName, "	");
    _builder.append(" AS parent");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<String> _descendantsNames = operation.getDescendantsNames();
      for(final String tab : _descendantsNames) {
        _builder.append("LEFT JOIN ");
        _builder.append(tab, "	");
        _builder.append(" ON ");
        _builder.append(tab, "	");
        _builder.append(".id = parent.id");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("WHERE ");
    {
      EList<String> _descendantsNames_1 = operation.getDescendantsNames();
      boolean _hasElements = false;
      for(final String tab_1 : _descendantsNames_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("AND", "	");
        }
        _builder.append(" ");
        _builder.append(tab_1, "	");
        _builder.append(".id IS null ");
      }
    }
    _builder.append("    \t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * COPY INSTANCES
   * This operation copy data from one column to another.
   * Target and source column can be in the same table.
   * @param CopyInstancesImpl operation : operation of type CopyInstancesImpl
   */
  protected CharSequence _genOperation(final CopyInstancesImpl operation) {
      MergeType _type = operation.getType();
      String _string = _type.toString();
      boolean _equals = _string.equals("strict");
      if (_equals) {
        {
          String _fileName = this.getFileName(operation, ".q");
          String _owningSchemaName = operation.getOwningSchemaName();
          String _owningTableName = operation.getOwningTableName();
          String _targetTableName = operation.getTargetTableName();
          CharSequence _isSameTableSize = this.isSameTableSize(_owningSchemaName, _owningTableName, _targetTableName);
          this.generateFile(_fileName, _isSameTableSize);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("UPDATE ");
          String _owningSchemaName_1 = operation.getOwningSchemaName();
          _builder.append(_owningSchemaName_1, "");
          _builder.append(".");
          String _targetTableName_1 = operation.getTargetTableName();
          _builder.append(_targetTableName_1, "");
          _builder.append(" SET ");
          String _targetColumnName = operation.getTargetColumnName();
          _builder.append(_targetColumnName, "");
          _builder.append(" = ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("(SELECT ");
          String _sourceColumnName = operation.getSourceColumnName();
          _builder.append(_sourceColumnName, "							");
          _builder.append(" FROM ");
          String _owningSchemaName_2 = operation.getOwningSchemaName();
          _builder.append(_owningSchemaName_2, "							");
          _builder.append(".");
          String _owningTableName_1 = operation.getOwningTableName();
          _builder.append(_owningTableName_1, "							");
          _builder.append(");");
          return _builder;
        }
      }
      MergeType _type_1 = operation.getType();
      String _string_1 = _type_1.toString();
      boolean _equals_1 = _string_1.equals("force");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("UPDATE ");
        String _owningSchemaName_3 = operation.getOwningSchemaName();
        _builder_1.append(_owningSchemaName_3, "");
        _builder_1.append(".");
        String _targetTableName_2 = operation.getTargetTableName();
        _builder_1.append(_targetTableName_2, "");
        _builder_1.append(" SET ");
        String _targetColumnName_1 = operation.getTargetColumnName();
        _builder_1.append(_targetColumnName_1, "");
        _builder_1.append(" = ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t\t\t\t");
        _builder_1.append("(SELECT ");
        String _sourceColumnName_1 = operation.getSourceColumnName();
        _builder_1.append(_sourceColumnName_1, "							");
        _builder_1.append(" FROM ");
        String _owningSchemaName_4 = operation.getOwningSchemaName();
        _builder_1.append(_owningSchemaName_4, "							");
        _builder_1.append(".");
        String _owningTableName_2 = operation.getOwningTableName();
        _builder_1.append(_owningTableName_2, "							");
        _builder_1.append(");");
        return _builder_1;
      }
      return "";
  }
  
  /**
   * INSERT INSTANCES
   * This operation copy data from source columns to target columns.
   * Target and source column must have same name antd data type.
   * Target table must not have instances.
   * @param InsertInstancesImpl operation : operation of type InsertInstancesImpl
   */
  protected CharSequence _genOperation(final InsertInstancesImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _targetTableName = operation.getTargetTableName();
    _builder.append(_targetTableName, "");
    _builder.append(" (");
    {
      EList<String> _targetColumnsNames = operation.getTargetColumnsNames();
      boolean _hasElements = false;
      for(final String col : _targetColumnsNames) {
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
    _builder.append("\t\t\t\t");
    _builder.append("SELECT ");
    {
      EList<String> _sourceColumnsNames = operation.getSourceColumnsNames();
      boolean _hasElements_1 = false;
      for(final String col_1 : _sourceColumnsNames) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "				");
        }
        _builder.append(col_1, "				");
      }
    }
    _builder.append(" FROM ");
    String _sourceTableName = operation.getSourceTableName();
    _builder.append(_sourceTableName, "				");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * ADD INSTANCES TO TABLE
   * This query copy instances form source table to target table
   * @param String schema : tables schema
   * @param String targetTable : target table for instances
   * @param String sourceTable : source table for copiing
   * @return SQL
   */
  public CharSequence addInstancesToTabble(final String schema, final String sourceTable, final String targetTable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    _builder.append(schema, "");
    _builder.append(".");
    _builder.append(targetTable, "");
    _builder.append(" (id)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("SELECT id FROM ");
    _builder.append(schema, "	");
    _builder.append(".");
    _builder.append(sourceTable, "	");
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT CASE WHEN (SELECT COUNT(*) FROM ");
    _builder.append(schema, "");
    _builder.append(".");
    _builder.append(table1, "");
    _builder.append(") = (SELECT COUNT(*) FROM ");
    _builder.append(schema, "");
    _builder.append(".");
    _builder.append(table2, "");
    _builder.append(") THEN TRUE ELSE FALSE END;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * HAS NO INSTANCES
   * This query check if is table empty
   * @param String schema : schema
   * @param String table : table to check
   * @return boolean : t - is empty; f - has instances
   */
  public CharSequence hasNoInstances(final String schema, final String table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 FROM ");
    _builder.append(schema, "");
    _builder.append(".");
    _builder.append(table, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
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
  
  public CharSequence genOperation(final ModelOperationImpl operation) {
    if (operation instanceof AddColumnImpl) {
      return _genOperation((AddColumnImpl)operation);
    } else if (operation instanceof AddForeignKeyImpl) {
      return _genOperation((AddForeignKeyImpl)operation);
    } else if (operation instanceof AddIndexImpl) {
      return _genOperation((AddIndexImpl)operation);
    } else if (operation instanceof AddInstancesImpl) {
      return _genOperation((AddInstancesImpl)operation);
    } else if (operation instanceof AddNotNullConstraintImpl) {
      return _genOperation((AddNotNullConstraintImpl)operation);
    } else if (operation instanceof AddPrimaryKeyImpl) {
      return _genOperation((AddPrimaryKeyImpl)operation);
    } else if (operation instanceof AddSchemaImpl) {
      return _genOperation((AddSchemaImpl)operation);
    } else if (operation instanceof AddSequenceImpl) {
      return _genOperation((AddSequenceImpl)operation);
    } else if (operation instanceof AddTableImpl) {
      return _genOperation((AddTableImpl)operation);
    } else if (operation instanceof AddUniqueIndexImpl) {
      return _genOperation((AddUniqueIndexImpl)operation);
    } else if (operation instanceof CopyInstancesImpl) {
      return _genOperation((CopyInstancesImpl)operation);
    } else if (operation instanceof GenerateSequenceNumbersImpl) {
      return _genOperation((GenerateSequenceNumbersImpl)operation);
    } else if (operation instanceof HasNoInstancesImpl) {
      return _genOperation((HasNoInstancesImpl)operation);
    } else if (operation instanceof HasNoOwnInstancesImpl) {
      return _genOperation((HasNoOwnInstancesImpl)operation);
    } else if (operation instanceof InsertInstancesImpl) {
      return _genOperation((InsertInstancesImpl)operation);
    } else if (operation instanceof RemoveColumnConstraintImpl) {
      return _genOperation((RemoveColumnConstraintImpl)operation);
    } else if (operation instanceof RemoveColumnImpl) {
      return _genOperation((RemoveColumnImpl)operation);
    } else if (operation instanceof RemoveDefaultValueImpl) {
      return _genOperation((RemoveDefaultValueImpl)operation);
    } else if (operation instanceof RemoveIndexImpl) {
      return _genOperation((RemoveIndexImpl)operation);
    } else if (operation instanceof RemoveSequenceImpl) {
      return _genOperation((RemoveSequenceImpl)operation);
    } else if (operation instanceof RemoveTableConstraintImpl) {
      return _genOperation((RemoveTableConstraintImpl)operation);
    } else if (operation instanceof RemoveTableImpl) {
      return _genOperation((RemoveTableImpl)operation);
    } else if (operation instanceof RenameColumnImpl) {
      return _genOperation((RenameColumnImpl)operation);
    } else if (operation instanceof RenameTableImpl) {
      return _genOperation((RenameTableImpl)operation);
    } else if (operation instanceof SetColumnDefaultValueImpl) {
      return _genOperation((SetColumnDefaultValueImpl)operation);
    } else if (operation instanceof SetColumnTypeImpl) {
      return _genOperation((SetColumnTypeImpl)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation).toString());
    }
  }
}

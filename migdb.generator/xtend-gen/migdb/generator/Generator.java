package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
import mm.rdb.PrimitiveType;
import mm.rdb.operations.impl.AddColumnImpl;
import mm.rdb.operations.impl.AddForeignKeyImpl;
import mm.rdb.operations.impl.AddIndexImpl;
import mm.rdb.operations.impl.AddNotNullConstraintImpl;
import mm.rdb.operations.impl.AddPrimaryKeyImpl;
import mm.rdb.operations.impl.AddSchemaImpl;
import mm.rdb.operations.impl.AddSequenceImpl;
import mm.rdb.operations.impl.AddTableImpl;
import mm.rdb.operations.impl.AddUniqueIndexImpl;
import mm.rdb.operations.impl.ModelOperationImpl;
import mm.rdb.operations.impl.RemoveColumnConstraintImpl;
import mm.rdb.operations.impl.RemoveColumnImpl;
import mm.rdb.operations.impl.RemoveDefaultValueImpl;
import mm.rdb.operations.impl.RemoveIndexImpl;
import mm.rdb.operations.impl.RemoveTableConstraintImpl;
import mm.rdb.operations.impl.RemoveTableImpl;
import mm.rdb.operations.impl.RenameColumnImpl;
import mm.rdb.operations.impl.RenameTableImpl;
import mm.rdb.operations.impl.SetColumnDefaultValueImpl;
import mm.rdb.operations.impl.SetColumnTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Generator extends BaseCodeGenerator {
  
  private int counter;
  
  public void doGenerate(final EObject model) {
    {
      ArrayList<ModelOperationImpl> _arrayList = new ArrayList<ModelOperationImpl>();
      ArrayList<ModelOperationImpl> operations = _arrayList;
      this.counter = 0;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof mm.rdb.operations.impl.ModelOperationImpl)) {
          operations.add(((ModelOperationImpl) arg));
        }
      }
      this.toplevelGenerator(operations);
    }
  }
  
  public void toplevelGenerator(final ArrayList<ModelOperationImpl> operations) {
    for (final ModelOperationImpl op : operations) {
      this.generateOperationFile(op);
    }
  }
  
  public File generateOperationFile(final ModelOperationImpl operation) {
    String _fileName = this.getFileName(operation, ".sql");
    CharSequence _genOperation = this.genOperation(operation);
    File _generateFile = this.generateFile(_fileName, _genOperation);
    return _generateFile;
  }
  
  public String getFileName(final ModelOperationImpl operation, final String type) {
    {
      int _operator_plus = IntegerExtensions.operator_plus(((Integer)this.counter), ((Integer)1));
      this.counter = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("", ((Integer)this.counter));
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, type);
      return _operator_plus_2;
    }
  }
  
  protected CharSequence _genOperation(final AddSequenceImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SEQUENCE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" START ");
    int _cacheSize = operation.getCacheSize();
    _builder.append(_cacheSize, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
    String _owningTableName_1 = operation.getOwningTableName();
    _builder.append(_owningTableName_1, "	");
    _builder.append(" (id);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genOperation(final AddUniqueIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE UNIQUE INDEX ");
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
    String _underlyingIndexName = operation.getUnderlyingIndexName();
    _builder.append(_underlyingIndexName, "	");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
      boolean hasAnyElements = false;
      for(final String col : _columnsNames) {
        if (!hasAnyElements) {
          hasAnyElements = true;
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
    PrimitiveType _type = operation.getType();
    _builder.append(_type, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
  
  protected CharSequence _genOperation(final AddSchemaImpl operation) {
    {
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
  }
  
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
  
  protected CharSequence _genOperation(final RemoveIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
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
  
  protected CharSequence _genOperation(final SetColumnTypeImpl operation) {
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
    String _newType = operation.getNewType();
    _builder.append(_newType, "				  	  ");
    _builder.newLineIfNotEmpty();
    {
      boolean _operator_and = false;
      String _newType_1 = operation.getNewType();
      boolean _operator_equals = ObjectExtensions.operator_equals(_newType_1, "boolean");
      if (!_operator_equals) {
        _operator_and = false;
      } else {
        String _oldType = operation.getOldType();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_oldType, "int");
        _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
      }
      if (_operator_and) {
        _builder.append("\t\t\t\t\t\t");
        _builder.append("USING converting_booltoint(");
        String _owningColumnName_1 = operation.getOwningColumnName();
        _builder.append(_owningColumnName_1, "						");
        _builder.append(")");
        _builder.newLineIfNotEmpty();} else {
        boolean _operator_and_1 = false;
        String _newType_2 = operation.getNewType();
        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_newType_2, "int");
        if (!_operator_equals_2) {
          _operator_and_1 = false;
        } else {
          String _oldType_1 = operation.getOldType();
          boolean _operator_equals_3 = ObjectExtensions.operator_equals(_oldType_1, "boolean");
          _operator_and_1 = BooleanExtensions.operator_and(_operator_equals_2, _operator_equals_3);
        }
        if (_operator_and_1) {
          _builder.append("\t\t\t\t\t\t");
          _builder.append("USING converting_inttoboolean(");
          String _owningColumnName_2 = operation.getOwningColumnName();
          _builder.append(_owningColumnName_2, "						");
          _builder.append(")");
          _builder.newLineIfNotEmpty();} else {
          boolean _operator_and_2 = false;
          String _newType_3 = operation.getNewType();
          boolean _operator_equals_4 = ObjectExtensions.operator_equals(_newType_3, "char");
          if (!_operator_equals_4) {
            _operator_and_2 = false;
          } else {
            String _oldType_2 = operation.getOldType();
            boolean _operator_equals_5 = ObjectExtensions.operator_equals(_oldType_2, "boolean");
            _operator_and_2 = BooleanExtensions.operator_and(_operator_equals_4, _operator_equals_5);
          }
          if (_operator_and_2) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("USING converting_chartobool(");
            String _owningColumnName_3 = operation.getOwningColumnName();
            _builder.append(_owningColumnName_3, "						");
            _builder.append(")");
            _builder.newLineIfNotEmpty();} else {
            boolean _operator_and_3 = false;
            String _newType_4 = operation.getNewType();
            boolean _operator_equals_6 = ObjectExtensions.operator_equals(_newType_4, "char");
            if (!_operator_equals_6) {
              _operator_and_3 = false;
            } else {
              String _oldType_3 = operation.getOldType();
              boolean _operator_equals_7 = ObjectExtensions.operator_equals(_oldType_3, "int");
              _operator_and_3 = BooleanExtensions.operator_and(_operator_equals_6, _operator_equals_7);
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
  
  public StringConcatenation convertBoolToInt() {
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
  
  public StringConcatenation convertIntToBool() {
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
  
  public StringConcatenation convertCharToInt() {
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
  
  public StringConcatenation convertCharToBool() {
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
    if ((operation instanceof AddColumnImpl)) {
      return _genOperation((AddColumnImpl)operation);
    } else if ((operation instanceof AddForeignKeyImpl)) {
      return _genOperation((AddForeignKeyImpl)operation);
    } else if ((operation instanceof AddIndexImpl)) {
      return _genOperation((AddIndexImpl)operation);
    } else if ((operation instanceof AddNotNullConstraintImpl)) {
      return _genOperation((AddNotNullConstraintImpl)operation);
    } else if ((operation instanceof AddPrimaryKeyImpl)) {
      return _genOperation((AddPrimaryKeyImpl)operation);
    } else if ((operation instanceof AddSchemaImpl)) {
      return _genOperation((AddSchemaImpl)operation);
    } else if ((operation instanceof AddSequenceImpl)) {
      return _genOperation((AddSequenceImpl)operation);
    } else if ((operation instanceof AddTableImpl)) {
      return _genOperation((AddTableImpl)operation);
    } else if ((operation instanceof AddUniqueIndexImpl)) {
      return _genOperation((AddUniqueIndexImpl)operation);
    } else if ((operation instanceof RemoveColumnConstraintImpl)) {
      return _genOperation((RemoveColumnConstraintImpl)operation);
    } else if ((operation instanceof RemoveColumnImpl)) {
      return _genOperation((RemoveColumnImpl)operation);
    } else if ((operation instanceof RemoveDefaultValueImpl)) {
      return _genOperation((RemoveDefaultValueImpl)operation);
    } else if ((operation instanceof RemoveIndexImpl)) {
      return _genOperation((RemoveIndexImpl)operation);
    } else if ((operation instanceof RemoveTableConstraintImpl)) {
      return _genOperation((RemoveTableConstraintImpl)operation);
    } else if ((operation instanceof RemoveTableImpl)) {
      return _genOperation((RemoveTableImpl)operation);
    } else if ((operation instanceof RenameColumnImpl)) {
      return _genOperation((RenameColumnImpl)operation);
    } else if ((operation instanceof RenameTableImpl)) {
      return _genOperation((RenameTableImpl)operation);
    } else if ((operation instanceof SetColumnDefaultValueImpl)) {
      return _genOperation((SetColumnDefaultValueImpl)operation);
    } else if ((operation instanceof SetColumnTypeImpl)) {
      return _genOperation((SetColumnTypeImpl)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
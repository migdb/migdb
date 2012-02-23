package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
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
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
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
    int _startValue = operation.getStartValue();
    _builder.append(_startValue, "");
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
    _builder.append("); ");
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
    {
      PrimitiveType _type = operation.getType();
      String _string = _type.toString();
      boolean _equals = _string.equals("char");
      if (_equals) {
        _builder.append("character ");} else {
        PrimitiveType _type_1 = operation.getType();
        _builder.append(_type_1, "	");
      }
    }
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
    {
      String _fileName = this.getFileName(operation, ".sql");
      StringConcatenation _convertBoolToInt = this.convertBoolToInt();
      this.generateFile(_fileName, _convertBoolToInt);
      String _fileName_1 = this.getFileName(operation, ".sql");
      StringConcatenation _convertCharToBool = this.convertCharToBool();
      this.generateFile(_fileName_1, _convertCharToBool);
      String _fileName_2 = this.getFileName(operation, ".sql");
      StringConcatenation _convertCharToInt = this.convertCharToInt();
      this.generateFile(_fileName_2, _convertCharToInt);
      String _fileName_3 = this.getFileName(operation, ".sql");
      StringConcatenation _convertIntToBool = this.convertIntToBool();
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
          _builder.newLineIfNotEmpty();} else {
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
            _builder.newLineIfNotEmpty();} else {
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
              _builder.newLineIfNotEmpty();} else {
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
  }
  
  protected CharSequence _genOperation(final AddInstancesImpl operation) {
    {
      EList<String> _targetTableNames = operation.getTargetTableNames();
      for (final String tab : _targetTableNames) {
        String _fileName = this.getFileName(operation, ".sql");
        String _owningSchemaName = operation.getOwningSchemaName();
        String _sourceTableName = operation.getSourceTableName();
        StringConcatenation _addInstancesToTabble = this.addInstancesToTabble(_owningSchemaName, _sourceTableName, tab);
        this.generateFile(_fileName, _addInstancesToTabble);
      }
      return "";
    }
  }
  
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
      boolean hasAnyElements = false;
      for(final String tab_1 : _descendantsNames_1) {
        if (!hasAnyElements) {
          hasAnyElements = true;
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
  
  protected CharSequence _genOperation(final CopyInstancesImpl operation) {
    {
      MergeType _type = operation.getType();
      String _string = _type.toString();
      boolean _equals = _string.equals("strict");
      if (_equals) {
        {
          String _fileName = this.getFileName(operation, ".q");
          String _owningSchemaName = operation.getOwningSchemaName();
          String _owningTableName = operation.getOwningTableName();
          String _targetTableName = operation.getTargetTableName();
          StringConcatenation _isSameTableSize = this.isSameTableSize(_owningSchemaName, _owningTableName, _targetTableName);
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
  }
  
  protected CharSequence _genOperation(final InsertInstancesImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _targetTableName = operation.getTargetTableName();
    _builder.append(_targetTableName, "");
    _builder.append(" (id,");
    {
      EList<String> _targetColumnsNames = operation.getTargetColumnsNames();
      boolean hasAnyElements = false;
      for(final String col : _targetColumnsNames) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(col, "");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("SELECT nextval(\'seq_global\'), ");
    {
      EList<String> _sourceColumnsNames = operation.getSourceColumnsNames();
      boolean hasAnyElements_1 = false;
      for(final String col_1 : _sourceColumnsNames) {
        if (!hasAnyElements_1) {
          hasAnyElements_1 = true;
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
  
  public StringConcatenation addInstancesToTabble(final String schema, final String sourceTable, final String targetTable) {
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
  
  public StringConcatenation isSameTableSize(final String schema, final String table1, final String table2) {
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
  
  public StringConcatenation hasNoInstances(final String schema, final String table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT COUNT(1) > 0 FROM ");
    _builder.append(schema, "");
    _builder.append(".");
    _builder.append(table, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
    } else if ((operation instanceof AddInstancesImpl)) {
      return _genOperation((AddInstancesImpl)operation);
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
    } else if ((operation instanceof CopyInstancesImpl)) {
      return _genOperation((CopyInstancesImpl)operation);
    } else if ((operation instanceof HasNoInstancesImpl)) {
      return _genOperation((HasNoInstancesImpl)operation);
    } else if ((operation instanceof HasNoOwnInstancesImpl)) {
      return _genOperation((HasNoOwnInstancesImpl)operation);
    } else if ((operation instanceof InsertInstancesImpl)) {
      return _genOperation((InsertInstancesImpl)operation);
    } else if ((operation instanceof RemoveColumnConstraintImpl)) {
      return _genOperation((RemoveColumnConstraintImpl)operation);
    } else if ((operation instanceof RemoveColumnImpl)) {
      return _genOperation((RemoveColumnImpl)operation);
    } else if ((operation instanceof RemoveDefaultValueImpl)) {
      return _genOperation((RemoveDefaultValueImpl)operation);
    } else if ((operation instanceof RemoveIndexImpl)) {
      return _genOperation((RemoveIndexImpl)operation);
    } else if ((operation instanceof RemoveSequenceImpl)) {
      return _genOperation((RemoveSequenceImpl)operation);
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
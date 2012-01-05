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
import mm.rdb.operations.impl.AddTableImpl;
import mm.rdb.operations.impl.AddUniqueIndexImpl;
import mm.rdb.operations.impl.ModelOperationImpl;
import mm.rdb.operations.impl.RemoveColumnConstraintImpl;
import mm.rdb.operations.impl.RemoveColumnImpl;
import mm.rdb.operations.impl.RemoveIndexImpl;
import mm.rdb.operations.impl.RemoveTableConstraintImpl;
import mm.rdb.operations.impl.RemoveTableImpl;
import mm.rdb.operations.impl.RenameColumnImpl;
import mm.rdb.operations.impl.RenameTableImpl;
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
    String _fileName = this.getFileName(operation);
    StringConcatenation _genOperation = this.genOperation(operation);
    File _generateFile = this.generateFile(_fileName, _genOperation);
    return _generateFile;
  }
  
  public String getFileName(final ModelOperationImpl operation) {
    {
      int _operator_plus = IntegerExtensions.operator_plus(((Integer)this.counter), ((Integer)1));
      this.counter = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("", ((Integer)this.counter));
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".sql");
      return _operator_plus_2;
    }
  }
  
  protected StringConcatenation _genOperation(final AddNotNullConstraintImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddPrimaryKeyImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddForeignKeyImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddUniqueIndexImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddIndexImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddColumnImpl operation) {
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
  
  protected StringConcatenation _genOperation(final AddTableImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _owningSchemaName = operation.getOwningSchemaName();
    _builder.append(_owningSchemaName, "");
    _builder.append(".");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("id int PRIMARY KEY");
    _builder.newLine();
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddSchemaImpl operation) {
    StringConcatenation _xifexpression = null;
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
    return _xifexpression;
  }
  
  protected StringConcatenation _genOperation(final RemoveTableImpl operation) {
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
  
  protected StringConcatenation _genOperation(final RemoveColumnImpl operation) {
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
  
  protected StringConcatenation _genOperation(final RemoveIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final RemoveTableConstraintImpl operation) {
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
  
  protected StringConcatenation _genOperation(final RemoveColumnConstraintImpl operation) {
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
  
  protected StringConcatenation _genOperation(final RenameTableImpl operation) {
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
  
  protected StringConcatenation _genOperation(final RenameColumnImpl operation) {
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
  
  public StringConcatenation genOperation(final ModelOperationImpl operation) {
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
    } else if ((operation instanceof AddTableImpl)) {
      return _genOperation((AddTableImpl)operation);
    } else if ((operation instanceof AddUniqueIndexImpl)) {
      return _genOperation((AddUniqueIndexImpl)operation);
    } else if ((operation instanceof RemoveColumnConstraintImpl)) {
      return _genOperation((RemoveColumnConstraintImpl)operation);
    } else if ((operation instanceof RemoveColumnImpl)) {
      return _genOperation((RemoveColumnImpl)operation);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
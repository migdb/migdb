package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
import mm.rdb.PrimitiveType;
import mm.rdb.operations.impl.AddColumnImpl;
import mm.rdb.operations.impl.AddForeignKeyImpl;
import mm.rdb.operations.impl.AddIndexImpl;
import mm.rdb.operations.impl.AddSchemaImpl;
import mm.rdb.operations.impl.AddTableImpl;
import mm.rdb.operations.impl.AddUniqueIndexImpl;
import mm.rdb.operations.impl.ModelOperationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
    _builder.append(" (\"id\")");
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
    _builder.append(")");
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
        _builder.append("\"");
        _builder.append(col, "	");
        _builder.append("\"");
      }
    }
    _builder.append(")");
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
    _builder.append("ADD ");
    String _name = operation.getName();
    _builder.append(_name, "	");
    _builder.append(" ");
    PrimitiveType _type = operation.getType();
    _builder.append(_type, "	");
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
    _builder.append("\t  ");
    _builder.append("id integer PRIMARY KEY");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddSchemaImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SCHEMA ");
    String _name = operation.getName();
    _builder.append(_name, "");
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
    } else if ((operation instanceof AddSchemaImpl)) {
      return _genOperation((AddSchemaImpl)operation);
    } else if ((operation instanceof AddTableImpl)) {
      return _genOperation((AddTableImpl)operation);
    } else if ((operation instanceof AddUniqueIndexImpl)) {
      return _genOperation((AddUniqueIndexImpl)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
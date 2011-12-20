package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
import mm.rdb.PrimitiveType;
import mm.rdb.operations.impl.AddColumnImpl;
import mm.rdb.operations.impl.AddIndexImpl;
import mm.rdb.operations.impl.AddSchemaImpl;
import mm.rdb.operations.impl.AddTableImpl;
import mm.rdb.operations.impl.ModelOperationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Generator extends BaseCodeGenerator {
  
  public void doGenerate(final EObject model) {
    {
      ArrayList<ModelOperationImpl> _arrayList = new ArrayList<ModelOperationImpl>();
      ArrayList<ModelOperationImpl> operations = _arrayList;
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
    Class<? extends Object> _class = operation.getClass();
    String _operator_plus = StringExtensions.operator_plus("operace", _class);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".sql");
    return _operator_plus_1;
  }
  
  public int generateNumber() {
    return 1;
  }
  
  protected StringConcatenation _genOperation(final AddIndexImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE INDEX ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ON ");
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
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddColumnImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
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
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("`id` int NOT NULL AUTO_INCREMENT,");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("PRIMARY KEY (`id`),");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("UNIQUE KEY `ID_UNIQUE` (`id`)");
    _builder.newLine();
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddSchemaImpl operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE DATABASE ");
    String _name = operation.getName();
    _builder.append(_name, "");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation genOperation(final ModelOperationImpl operation) {
    if ((operation instanceof AddColumnImpl)) {
      return _genOperation((AddColumnImpl)operation);
    } else if ((operation instanceof AddIndexImpl)) {
      return _genOperation((AddIndexImpl)operation);
    } else if ((operation instanceof AddSchemaImpl)) {
      return _genOperation((AddSchemaImpl)operation);
    } else if ((operation instanceof AddTableImpl)) {
      return _genOperation((AddTableImpl)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
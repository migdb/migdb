package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mm.rdb.operations.AddColumn;
import mm.rdb.operations.AddForeignKey;
import mm.rdb.operations.AddIndex;
import mm.rdb.operations.ModelOperation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Generator extends BaseCodeGenerator {
  
  public void doGenerate(final EObject model) {
    {
      ArrayList<ModelOperation> _arrayList = new ArrayList<ModelOperation>();
      ArrayList<ModelOperation> operations = _arrayList;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof mm.rdb.operations.ModelOperation)) {
          operations.add(((ModelOperation) arg));
        }
      }
      this.toplevelGenerator(operations);
    }
  }
  
  public void toplevelGenerator(final List<ModelOperation> operations) {
    for (final ModelOperation op : operations) {
      this.generateOperationFile(op);
    }
  }
  
  public File generateOperationFile(final ModelOperation operation) {
    String _fileName = this.getFileName(operation);
    StringConcatenation _genOperation = this.genOperation(operation);
    File _generateFile = this.generateFile(_fileName, _genOperation);
    return _generateFile;
  }
  
  public String getFileName(final EObject operation) {
    return "some file name derived from operation";
  }
  
  protected StringConcatenation _genOperation(final AddColumn operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Add Column");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddForeignKey operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Add ForeignKey");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final AddIndex operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Add Index");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genOperation(final ModelOperation operation) {
    if ((operation instanceof AddColumn)) {
      return _genOperation((AddColumn)operation);
    } else if ((operation instanceof AddForeignKey)) {
      return _genOperation((AddForeignKey)operation);
    } else if ((operation instanceof AddIndex)) {
      return _genOperation((AddIndex)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
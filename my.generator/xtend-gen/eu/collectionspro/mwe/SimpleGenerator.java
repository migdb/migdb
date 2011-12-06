package eu.collectionspro.mwe;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SimpleGenerator extends BaseCodeGenerator {
  
  public void doGenerate(final EObject model) {
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Argument list:");
      _builder.newLine();
      _builder.append(model, "");
      _builder.newLineIfNotEmpty();
      {
        EList<EObject> _eContents = model.eContents();
        for(final Object arg : _eContents) {
          _builder.newLine();
        }
      }
      StringConcatenation fileContent = _builder;
      this.generateFile("test.txt", fileContent);
    }
  }
  
  public StringConcatenation printArg(final String arg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("some indented");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _printMoreIndented = this.printMoreIndented();
    _builder.append(_printMoreIndented, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("text");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation printMoreIndented() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("and");
    _builder.newLine();
    _builder.append("even");
    _builder.newLine();
    _builder.append("more");
    _builder.newLine();
    _builder.append("indented");
    _builder.newLine();
    return _builder;
  }
  
  public void toplevelGenerator(final List<EObject> operations) {
    for (final EObject op : operations) {
      this.generateOperationFile(op);
    }
  }
  
  public File generateOperationFile(final EObject operation) {
    String _fileName = this.getFileName(operation);
    StringConcatenation _genOperation = this.genOperation(operation);
    File _generateFile = this.generateFile(_fileName, _genOperation);
    return _generateFile;
  }
  
  public String getFileName(final EObject operation) {
    return "some file name derived from operation";
  }
  
  protected StringConcatenation _genOperation(final EObject operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fdsfdsf gf gfsdg d");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _genOperation(final EStructuralFeature operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fgdfgfsd fg fg fd");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genOperation(final EObject operation) {
    if ((operation instanceof EStructuralFeature)) {
      return _genOperation((EStructuralFeature)operation);
    } else if ((operation instanceof EObject)) {
      return _genOperation((EObject)operation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(operation).toString());
    }
  }
}
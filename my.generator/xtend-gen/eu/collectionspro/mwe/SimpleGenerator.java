package eu.collectionspro.mwe;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SimpleGenerator extends BaseCodeGenerator {
  
  public void doGenerate(final EObject model) {
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Argument list:");
      _builder.newLine();
      {
        Set<String> _keySet = this.arguments.keySet();
        for(final String arg : _keySet) {
          _builder.append(arg, "");
          _builder.append(" = ");
          Object _get = this.arguments.get(arg);
          String _string = _get.toString();
          _builder.append(_string, "");
          _builder.append(":");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          StringConcatenation _printArg = this.printArg(arg);
          _builder.append(_printArg, "	");
          _builder.newLineIfNotEmpty();
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
}
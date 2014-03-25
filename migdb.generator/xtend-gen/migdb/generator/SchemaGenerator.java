package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import mm.rdb.impl.TableImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SchemaGenerator extends BaseCodeGenerator {
  /**
   * ATRIBUTES
   */
  private PrintWriter writer;
  
  private String filename;
  
  /**
   * Main method for generating SQL from model
   * Model in param include all ops which we want to create
   * and ModelGeneration
   * @param EObject model : model of our application
   */
  public void doGenerate(final EObject model) {
      this.createWriter();
      ArrayList<TableImpl> _arrayList = new ArrayList<TableImpl>();
      ArrayList<TableImpl> objectList = _arrayList;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof TableImpl)) {
          objectList.add(((TableImpl) arg));
        }
      }
      for (final TableImpl arg_1 : objectList) {
        this.generateOperationFile(arg_1);
      }
      this.writer.close();
  }
  
  /**
   * Creates writer
   */
  public PrintWriter createWriter() {
    try {
      PrintWriter _xblockexpression = null;
      {
        File _generateFile = this.generateFile(this.filename, "");
        final File file = _generateFile;
        PrintWriter _printWriter = new PrintWriter(file);
        PrintWriter _writer = this.writer = _printWriter;
        _xblockexpression = (_writer);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method calls the method from the superclass
   * Superclass method need filename and SQL text
   */
  public void generateOperationFile(final TableImpl arg) {
      CharSequence _genSQL = this.genSQL(arg);
      CharSequence text = _genSQL;
      this.write(text);
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
  
  public CharSequence genSQL(final TableImpl arg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("1");
    _builder.newLine();
    return _builder;
  }
}

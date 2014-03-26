package migdb.generator;

import eu.collectionspro.mwe.BaseCodeGenerator;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import mm.rdb.Column;
import mm.rdb.PrimitiveType;
import mm.rdb.Schema;
import mm.rdb.Table;
import mm.rdb.TableConstraint;
import mm.rdb.impl.ColumnImpl;
import mm.rdb.impl.ForeignKeyImpl;
import mm.rdb.impl.IndexImpl;
import mm.rdb.impl.PrimaryKeyImpl;
import mm.rdb.impl.SequenceImpl;
import mm.rdb.impl.UniqueImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

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
      ArrayList<Schema> _arrayList = new ArrayList<Schema>();
      ArrayList<Schema> objectList = _arrayList;
      EList<EObject> _eContents = model.eContents();
      for (final Object arg : _eContents) {
        if ((arg instanceof Schema)) {
          objectList.add(((Schema) arg));
        }
      }
      for (final Schema arg_1 : objectList) {
        this.generateSchema(arg_1);
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
  public void generateSchema(final Schema arg) {
      this.write("");
      ArrayList<TableConstraint> _arrayList = new ArrayList<TableConstraint>();
      ArrayList<TableConstraint> constraints = _arrayList;
      EList<EObject> _eContents = arg.eContents();
      for (final EObject object : _eContents) {
        if ((object instanceof Table)) {
          {
            CharSequence _genSQL = this.genSQL(object);
            this.write(_genSQL);
            final Table table = ((Table) object);
            EList<TableConstraint> _constraints = table.getConstraints();
            for (final TableConstraint tableconstraint : _constraints) {
              constraints.add(tableconstraint);
            }
          }
        }
      }
      for (final TableConstraint constraint : constraints) {
        CharSequence _genSQL_1 = this.genSQL(constraint);
        this.write(_genSQL_1);
      }
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
  
  protected CharSequence _genSQL(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    Schema _owningSchema = table.getOwningSchema();
    String _name = _owningSchema.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = table.getName();
    _builder.append(_name_1, "");
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    {
      EList<Column> _columns = table.getColumns();
      boolean _hasElements = false;
      for(final Column column : _columns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("\t");
        CharSequence _genSQL = this.genSQL(column);
        _builder.append(_genSQL, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genSQL(final SequenceImpl sequence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE SEQUENCE ");
    String _name = sequence.getName();
    _builder.append(_name, "");
    _builder.append(" START ");
    int _startValue = sequence.getStartValue();
    _builder.append(_startValue, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genSQL(final IndexImpl index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE INDEX ");
    String _name = index.getName();
    _builder.append(_name, "");
    _builder.append(" ON ");
    EList<Column> _columns = index.getColumns();
    Column _get = _columns.get(0);
    Table _owningTable = _get.getOwningTable();
    String _name_1 = _owningTable.getName();
    _builder.append(_name_1, "");
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    {
      EList<Column> _columns_1 = index.getColumns();
      boolean _hasElements = false;
      for(final Column column : _columns_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("\t");
        String _name_2 = column.getName();
        _builder.append(_name_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genSQL(final ColumnImpl column) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = column.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    PrimitiveType _type = column.getType();
    String _name_1 = _type.name();
    _builder.append(_name_1, "");
    _builder.append(" ");
    {
      String _defaultValue = column.getDefaultValue();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_defaultValue, null);
      if (_operator_notEquals) {
        _builder.append(" DEFAULT ");
        String _defaultValue_1 = column.getDefaultValue();
        _builder.append(_defaultValue_1, "");
      }
    }
    {
      Boolean _isNillable = column.getIsNillable();
      boolean _operator_not = BooleanExtensions.operator_not(_isNillable);
      if (_operator_not) {
        _builder.append(" NOT NULL ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genSQL(final ForeignKeyImpl foreignKey) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    Table _owningTable = foreignKey.getOwningTable();
    String _name = _owningTable.getName();
    _builder.append(_name, "");
    _builder.append(" ADD CONSTRAINT ");
    String _name_1 = foreignKey.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("FOREIGN KEY (");
    Column _constrainedColumn = foreignKey.getConstrainedColumn();
    String _name_2 = _constrainedColumn.getName();
    _builder.append(_name_2, "   ");
    _builder.append(") ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("REFERENCES ");
    Table _targetTable = foreignKey.getTargetTable();
    String _name_3 = _targetTable.getName();
    _builder.append(_name_3, "        ");
    _builder.append("(id_");
    Table _targetTable_1 = foreignKey.getTargetTable();
    String _name_4 = _targetTable_1.getName();
    _builder.append(_name_4, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genSQL(final PrimaryKeyImpl primaryKey) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    Table _owningTable = primaryKey.getOwningTable();
    String _name = _owningTable.getName();
    _builder.append(_name, "");
    _builder.append(" ADD CONSTRAINT ");
    String _name_1 = primaryKey.getName();
    _builder.append(_name_1, "");
    _builder.append(" PRIMARY KEY (");
    Column _constrainedColumn = primaryKey.getConstrainedColumn();
    String _name_2 = _constrainedColumn.getName();
    _builder.append(_name_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genSQL(final UniqueImpl unique) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ALTER TABLE ");
    Table _owningTable = unique.getOwningTable();
    String _name = _owningTable.getName();
    _builder.append(_name, "");
    _builder.append(" ADD CONSTRAINT ");
    String _name_1 = unique.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("UNIQUE (");
    {
      EList<Column> _uniqueColumns = unique.getUniqueColumns();
      boolean _hasElements = false;
      for(final Column column : _uniqueColumns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_2 = column.getName();
        _builder.append(_name_2, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genSQL(final EObject foreignKey) {
    if (foreignKey instanceof ForeignKeyImpl) {
      return _genSQL((ForeignKeyImpl)foreignKey);
    } else if (foreignKey instanceof PrimaryKeyImpl) {
      return _genSQL((PrimaryKeyImpl)foreignKey);
    } else if (foreignKey instanceof UniqueImpl) {
      return _genSQL((UniqueImpl)foreignKey);
    } else if (foreignKey instanceof ColumnImpl) {
      return _genSQL((ColumnImpl)foreignKey);
    } else if (foreignKey instanceof IndexImpl) {
      return _genSQL((IndexImpl)foreignKey);
    } else if (foreignKey instanceof SequenceImpl) {
      return _genSQL((SequenceImpl)foreignKey);
    } else if (foreignKey instanceof Table) {
      return _genSQL((Table)foreignKey);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(foreignKey).toString());
    }
  }
}

/*
 * The MIT License
 *
 * Copyright (c) 2010 MigDB team [https://rabbit.felk.cvut.cz/trac/migdb]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package migdb.util;

import java.io.IOException;
import java.util.Map;
import migdb.ecore.EcoreUtil;
import migdb.sql.PostgreDialect;
import migdb.sql.SqlGenerator;

/**
 *
 * @author Tomas Herout
 */
public class Executor {

    private SqlGenerator sqlGenerator;
    private EcoreUtil ecoreUtil;
    private InputParser inputParser;

    public Executor(String modelName, String xmlInput, String sqlDialect) throws Exception {

        ecoreUtil = new EcoreUtil(modelName);

        if (sqlDialect.equals("postgre")) {
            sqlGenerator = new SqlGenerator(ecoreUtil, new PostgreDialect());
        } else {
            throw new UnsupportedOperationException("SQL dialect \"" + sqlDialect + "\" is unknown");
        }

        inputParser = new InputParser(xmlInput, this);
    }

    public String run() throws Exception {
        String sql = inputParser.parse();

        ecoreUtil.save();

        return sql;
    }

    String addTable(String tableName, Map<String, String> columns) {
        try {
            ecoreUtil.addClass(tableName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
        for (String column : columns.keySet()) {
            try {
                ecoreUtil.addAttribute(tableName, column, columns.get(column));
            } catch (IOException ex) {
                return ex.getMessage();
            }
        }
        return sqlGenerator.addTable(tableName);
    }

    String addColumn(String tableName, String colName, String colType) {
        try {
            ecoreUtil.addAttribute(tableName, colName, colType);
            return sqlGenerator.addColumn(tableName, colName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    String renameTable(String oldName, String newName) {
        try {
            ecoreUtil.renameClass(oldName, newName);
            return sqlGenerator.renameTable(oldName, newName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    String renameColumn(String tableName, String oldName, String newName) {
        try {
            ecoreUtil.renameAttribute(tableName, oldName, newName);
            return sqlGenerator.renameColumn(tableName, oldName, newName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    String deleteTable(String tableName) {
        try {
            ecoreUtil.delClass(tableName);
            return sqlGenerator.delTable(tableName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    String deleteColumn(String tableName, String columnName) {
        try {
            ecoreUtil.delAttribute(tableName, columnName);
            return sqlGenerator.delColumn(tableName, columnName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}

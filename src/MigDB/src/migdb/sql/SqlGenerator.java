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
package migdb.sql;

import java.util.Map;
import migdb.ecore.EcoreUtil;

/**
 *
 * @author Tomáš Herout
 */
public class SqlGenerator {

    private EcoreUtil ecoreUtil;
    private DialectSQL dialect;

    public SqlGenerator(EcoreUtil ecoreUtil, DialectSQL dialect) {
        this.ecoreUtil = ecoreUtil;
        this.dialect = dialect;
    }

    public String addTable(String tableName) {
        StringBuffer sql = new StringBuffer();

        sql.append("CREATE TABLE " + tableName + " (");
        Map<String, String> columns = ecoreUtil.getClassAttributes(tableName);

        boolean first = true;
        for (String columnName : columns.keySet()) {
            if (first) {
                first = false;
            } else {
                sql.append(", ");
            }
            sql.append(columnName + " " + dialect.getType(columns.get(columnName)));
        }
        sql.append(");");

        return sql.toString();
    }

    public String addColumn(String tableName, String columnName) {
        return "ALTER TABLE " + tableName + " ADD COLUMN "
                + columnName + " "
                + dialect.getType(ecoreUtil.getAttributeType(tableName, columnName)) + ";";
    }

    public String renameTable(String oldName, String newName) {
        return "ALTER TABLE " + oldName + " RENAME "
                + newName + ";";
    }

    public String renameColumn(String tableName, String oldName, String newName) {
        return "ALTER TABLE " + tableName + " MODIFY "
                + oldName + " "
                + newName + " "
                + dialect.getType(ecoreUtil.getAttributeType(tableName, newName)) + ";";
    }

    public String delTable(String tableName) {
        return "DROP TABLE " + tableName + ";";
    }

    public String delColumn(String tableName, String columnName) {
        return "ALTER TABLE " + tableName + " DROP " + columnName + ";";
    }
}

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
package migdb;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import migdb.ecore.EcoreUtil;
import migdb.sql.PostgreDialect;
import migdb.sql.SqlGenerator;

/**
 *
 * @author Tomas Herout
 */
public class Main {

    private static SqlGenerator sqlGenerator;
    private static EcoreUtil ecoreUtil;

    public static void main(String[] args) {

        try {
            ecoreUtil = new EcoreUtil("test.ecore");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        sqlGenerator = new SqlGenerator(ecoreUtil, new PostgreDialect());

        Map<String, String> atts = new HashMap<String, String>();
        atts.put("jmeno", "string");
        atts.put("vek", "int");
        
        System.out.println(addTable("clovek", atts));
          System.out.println(addColumn("clovek", "iq", "int"));
        System.out.println(renameTable("clovek", "opice"));
   //       System.out.println(renameColumn("opice", "jmeno", "prezdivka"));
   //     System.out.println(deleteColumn("opice", "iq"));
   //     System.out.println(deleteTable("opice"));
   
   //     System.out.println(deleteTable("opice"));
        try {
            ecoreUtil.save();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String addTable(String tableName, Map<String, String> columns) {
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

    private static String addColumn(String tableName, String colName, String colType) {
        try {
            ecoreUtil.addAttribute(tableName, colName, colType);
            return sqlGenerator.addColumn(tableName, colName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static String renameTable(String oldName, String newName) {
        try {
            ecoreUtil.renameClass(oldName, newName);
            return sqlGenerator.renameTable(oldName, newName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static String renameColumn(String tableName, String oldName, String newName) {
        try {
            ecoreUtil.renameAttribute(tableName, oldName, newName);
            return sqlGenerator.renameColumn(tableName, oldName, newName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static String deleteTable(String tableName) {
        try {
            ecoreUtil.delClass(tableName);
            return sqlGenerator.delTable(tableName);
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    private static String deleteColumn(String tableName, String columnName) {
        try {
            ecoreUtil.delAttribute(tableName, columnName);
            return sqlGenerator.delColumn(tableName, columnName);
        } catch (IOException ex) {
        return ex.getMessage();
        }

    }
}

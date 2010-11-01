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

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tomas Herout
 */
public class InputParser {

    private String fileName;
    private Executor executor;

    public InputParser(String fileName, Executor executor) {
        this.fileName = fileName;
        this.executor = executor;
    }

    public String parse() throws Exception {

        StringBuffer sql = new StringBuffer();
        File file = new File(fileName);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeLst = doc.getElementsByTagName("operations");

        for (int s = 0; s < nodeLst.getLength(); s++) {

            Node fstNode = nodeLst.item(s);

            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                Element fstElmnt = (Element) fstNode;
                NodeList operations = fstElmnt.getChildNodes();

                for (int j = 0; j < operations.getLength(); ++j) {
                    Node operationNode = operations.item(j);
                    if (operationNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element operationElmnt = (Element) operationNode;

                        if (operationElmnt.getNodeName().equals("addTable")) {
                            sql.append(addTable(operationElmnt));
                        } else if (operationElmnt.getNodeName().equals("addColumn")) {
                            sql.append(addColumn(operationElmnt));
                        } else if (operationElmnt.getNodeName().equals("renameTable")) {
                            sql.append(renameTable(operationElmnt));
                        } else if (operationElmnt.getNodeName().equals("renameColumn")) {
                            sql.append(renameColumn(operationElmnt));
                        } else if (operationElmnt.getNodeName().equals("deleteTable")) {
                            sql.append(deleteTable(operationElmnt));
                        } else if (operationElmnt.getNodeName().equals("deleteColumn")) {
                            sql.append(deleteColumn(operationElmnt));
                        } else {
                            throw new UnsupportedOperationException("operation \"" + operationElmnt.getNodeName() + "\" is unknown");
                        }
                    }
                }

            }
        }
        return sql.toString();
    }

    private String addTable(Element addTable) {
        NodeList columns = addTable.getElementsByTagName("column");

        Map<String, String> atts = new HashMap<String, String>();

        for (int i = 0; i < columns.getLength(); ++i) {
            Element column = (Element) columns.item(i);
            atts.put(column.getAttribute("name"), column.getAttribute("type"));
        }

        return executor.addTable(addTable.getAttribute("tableName"), atts);
    }

    private String addColumn(Element addColumn) {
        return executor.addColumn(addColumn.getAttribute("tableName"), addColumn.getAttribute("colName"), addColumn.getAttribute("type"));
    }

    private String renameTable(Element renameTable) {
        return executor.renameTable(renameTable.getAttribute("oldName"), renameTable.getAttribute("newName"));
    }

    private String renameColumn(Element renameColumn) {
        return executor.renameColumn(renameColumn.getAttribute("tableName"), renameColumn.getAttribute("oldName"), renameColumn.getAttribute("newName"));
    }

    private String deleteTable(Element deleteTable) {
        return executor.deleteTable(deleteTable.getAttribute("tableName"));
    }

    private String deleteColumn(Element deleteColumn) {
        return executor.deleteColumn(deleteColumn.getAttribute("tableName"), deleteColumn.getAttribute("columnName"));
    }
}

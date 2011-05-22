import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

class MyHandler extends DefaultHandler {
    String outFile;
    String sqlCode = "";

    public MyHandler(String outputFile) {
        outFile = outputFile;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void showEvent(String s) {
        System.out.println("showevent: " + s);
    }

    /**
     * akce zpracovana pri nalezeni zacatku dokumentu
     */
    public void startDocument() throws SAXException {
    }

    /**
     * akce zpracovana pri nalezeni zacatku Elementu
     */
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("statements")) {
            sqlCode += atts.getValue("sqlCode") + "\n\n";
        }
    }

    /**
     * akce zpracovana pri nalezeni konce Elementu
     */
    public void endElement(String uri, String localName, String qName) throws SAXException {
    }

    /**
     * akce zpracovana pri nalezeni konce dokumentu
     */
    public void endDocument() throws SAXException {
        try {
            OutputStreamWriter fw = new FileWriter(new File(outFile));
            fw.write(sqlCode.substring(0, sqlCode.length()-3));
            fw.close();
        } catch (IOException ex) {
        }

    }

    public void characters(char[] ch, int start, int length) throws SAXException {
    }

    /**
     * chyba
     */
    public void error(SAXParseException e) {
        System.out.println("SAXParseException: error");
        e.printStackTrace();
    }

    /**
     * varovani
     */
    public void warning(SAXParseException e) {
        System.out.println("SAXParseException: warning");
        e.printStackTrace();
    }

    /**
     * selhani
     */
    public void fatalError(SAXParseException e) {
        System.out.println("SAXParseException: fatal error");
        System.exit(1);
    }
}

public class Sax {

    /**
     * main funkce
     */
    public static void main(String [] args) {

        // defaultni vstupni soubor
        String inFile = "../data/test1.xmi";
        String outFile ="output.sql";

        if(args.length == 1 || args.length == 2){
          inFile = args[0];
          
          if(args.length == 2){
          outFile = args[1];                  
          }
        }
        
        

        try {
            SAXParserFactory spfactory = SAXParserFactory.newInstance();
            spfactory.setValidating(false);

            SAXParser saxparser = spfactory.newSAXParser();

            XMLReader xmlreader = saxparser.getXMLReader();

            xmlreader.setContentHandler(new MyHandler(outFile));
            xmlreader.setErrorHandler(new MyHandler(outFile));

            InputSource source = new InputSource(inFile);
            xmlreader.parse(source);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package modelupdater;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author woxie
 */
public abstract class AHandler extends DefaultHandler{

    public String xmlContent;
    protected int spacesCount;
    
    AHandler(){
       xmlContent = "";
       spacesCount = 0;
    }
    
    public void showEvent(String s) {
        System.out.println("showevent: " + s);
    }
    
    /**
     * Navrati zpracovany obsah XML
     * @return 
     */
    public String getContent(){
        return xmlContent;
    }
    
    /**
     * akce zpracovana pri nalezeni zacatku dokumentu
     */
    public void startDocument() throws SAXException {
        xmlContent = "<?xml version=\"1.0\" encoding=\"ASCII\"?>\r\n";
    }

    /**
     * akce zpracovana pri nalezeni zacatku Elementu
     */
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        for(int i = 0 ; i < spacesCount ; i++){
            System.out.print(" ");
        }
    }

    /**
     * akce zpracovana pri nalezeni konce Elementu
     */
    public void endElement(String uri, String localName, String qName) throws SAXException{
        spacesCount-=2;
        for(int i = 0 ; i < spacesCount ; i++){
            System.out.print(" ");
        }
        xmlContent += "</" + qName + ">";
        xmlContent += "\r\n";
    }

    /**
     * akce zpracovana pri nalezeni konce dokumentu
     */
    public void endDocument() throws SAXException {
        System.out.println("xmlContent:" + xmlContent);
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
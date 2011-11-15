/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelupdater;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author woxie
 */
public class AddAttributeToElement extends AHandler{
    /**
     *  jmeno elementu, jemuz se ma pridat attribut
     */    
    private String ownerName;
    /**
     *  Jmeno pridaneho atributu
     */    
    
    private String attributeName;
    /**
     * Hodnota pridaneho atributu
     */
    private String value;

    /**
     *  Urcuje, jestli se ma na mnozinu elementu s atributem name = elementName
     *  toto pravidlo vztahovat ci na doplnek teto mnoziny (vsechny elementy typu ownerValue - 
     *  elementy s atributem name = elementName)
     */
    private boolean include; 
    /**
     *  Atribut elementu name k rozhodnuti o mnozine elementu, na ktere se ma modifikace provest
     */
    private String elementName;


    public AddAttributeToElement(String ownerName, String attributeName, String value, boolean include, String elementName) {
        this.attributeName = attributeName;
        this.ownerName = ownerName;
        this.value = value;
        this.elementName = elementName;
        this.include = include;
    }
    
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        for(int i = 0 ; i < spacesCount ; i++){
            xmlContent += " ";
        }
        xmlContent += "<" + qName;
        int length = atts.getLength();
        for(int i = 0 ; i < length ; i++){
                    xmlContent += " " + atts.getQName(i) + "=";
                    xmlContent += "\"" + atts.getValue(i) + "\"";                    
        if (qName.equals(ownerName) && isInGroup(atts.getQName(i), atts.getValue(i))) {
            xmlContent += " " + attributeName + "=";
            xmlContent += "\"" + value + "\"";
        }
        
        }
        xmlContent += ">\r\n";
        spacesCount+=2;
    }
    
    public boolean isInGroup(String attName, String attValue){
        
        if(!attName.equals("name")){
            return false;
        } else{
            return (attValue.equals(elementName) && include) || (!attValue.equals(elementName) && !include);
        }
    }
}

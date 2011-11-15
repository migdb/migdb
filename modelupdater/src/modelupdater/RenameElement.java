package modelupdater;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

class RenameElementHandler extends AHandler {
    protected String renamedElement;
    protected String newName;

    public RenameElementHandler(String renamedElement, String newName) {
        this.renamedElement = renamedElement;
        this.newName = newName;
    }

    /**
     * akce zpracovana pri nalezeni zacatku Elementu
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {            
        for(int i = 0 ; i < spacesCount ; i++){
                xmlContent += " ";
            }
        if (qName.equals(renamedElement)) {
            xmlContent += "<" + newName;
        }else{
            xmlContent += "<" + qName;
        }
        int length = atts.getLength();
        for(int i = 0 ; i < length ; i++){
                    xmlContent += " " + atts.getQName(i) + "=";
                    xmlContent += "\"" + atts.getValue(i) + "\"";                    
        }
        xmlContent += ">\r\n";
        spacesCount += 2;
    }

    /**
     * akce zpracovana pri nalezeni konce Elementu
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        spacesCount-=2;
        for(int i = 0 ; i < spacesCount ; i++){
                xmlContent += " ";
            }
        if (qName.equals(renamedElement)) {
            xmlContent += "</" + newName + ">";
        }else{
            xmlContent += "</" + qName + ">";
        }
        xmlContent += "\r\n";
    }
}

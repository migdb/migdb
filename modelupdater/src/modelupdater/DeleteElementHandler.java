package modelupdater;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

class DeleteElementHandler extends AHandler {
    protected String removedElement;

    public DeleteElementHandler(String removedElement) {
        this.removedElement = removedElement;
    }

    /**
     * akce zpracovana pri nalezeni zacatku Elementu
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (!qName.equals(removedElement)) {
            for(int i = 0 ; i < spacesCount ; i++){
                xmlContent += " ";
            }
        
            xmlContent += "<" + qName;
            int length = atts.getLength();
            for(int i = 0 ; i < length ; i++){
                    xmlContent += " " + atts.getQName(i) + "=";
                    xmlContent += "\"" + atts.getValue(i) + "\"";                    
            }
            xmlContent += ">\r\n";
            spacesCount += 2;
        }
    }

    /**
     * akce zpracovana pri nalezeni konce Elementu
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (!qName.equals(removedElement)) {
            spacesCount-=2;
            for(int i = 0 ; i < spacesCount ; i++){
                xmlContent += " ";
            }
            xmlContent += "</" + qName + ">";
            xmlContent += "\r\n";
        }
    }
}

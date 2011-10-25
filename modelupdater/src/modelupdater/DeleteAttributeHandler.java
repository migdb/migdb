package modelupdater;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class DeleteAttributeHandler extends AHandler {
    protected String removeddAttribute;
    protected String owningElement;
    protected String newName;

    public DeleteAttributeHandler(String owningElement, String removedAttribute) {
        this.owningElement = owningElement;
        this.removeddAttribute = removedAttribute;
    }

    /**
     * akce zpracovana pri nalezeni zacatku Elementu
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        for(int i = 0 ; i < spacesCount ; i++){
            xmlContent += " ";
        }
        xmlContent += "<" + qName + " ";
        int length = atts.getLength();
            
        if (qName.equals(owningElement)) {
            for(int i = 0 ; i < length ; i++){
                if(!atts.getQName(i).equals(removeddAttribute)){
                    xmlContent += atts.getQName(i) + "=";
                    xmlContent += "\"" + atts.getValue(i) + "\" ";
                }
            }   
        }else{
            for(int i = 0 ; i < length ; i++){
                xmlContent += atts.getQName(i) + "=";
                xmlContent += "\"" + atts.getValue(i) + "\" ";
            }
        }
        xmlContent += ">\r\n";
        spacesCount +=2;
    }
}
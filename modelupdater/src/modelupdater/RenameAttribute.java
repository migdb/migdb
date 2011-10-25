package modelupdater;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

class RenameAttributeHandler extends AHandler {
    protected String renamedAttribute;
    protected String owningElement;
    protected String newName;

    public RenameAttributeHandler(String owningElement, String renamedAttribute, String newName) {
        this.owningElement = owningElement;
        this.renamedAttribute = renamedAttribute;
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
        xmlContent += "<" + qName + " ";
        int length = atts.getLength();
            
        if (qName.equals(owningElement)) {
            for(int i = 0 ; i < length ; i++){
                if(!atts.getQName(i).equals(renamedAttribute)){
                    xmlContent += atts.getQName(i) + "=";
                }else{
                    xmlContent += newName + "=";
                }
                xmlContent += "\"" + atts.getValue(i) + "\" ";                    
            }   
        }else{
            for(int i = 0 ; i < length ; i++){
                xmlContent += atts.getQName(i) + "=";
                xmlContent += "\"" + atts.getValue(i) + "\" ";
            }
        }
        xmlContent += ">\r\n";
        spacesCount += 2;
    }
}
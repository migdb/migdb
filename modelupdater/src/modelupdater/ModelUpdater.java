/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelupdater;

import java.io.File;
import java.io.FileWriter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/**
 *
 * @author woxie
 */
public class ModelUpdater {

public static final String RENAME_ELEMENT_MODE = "r";
public static final String RENAME_ATTRIBUTE_MODE = "ra";
public static final String DELETE_ELEMENT_MODE = "d";
public static final String DELETE_ATTRIBUTE_MODE = "da";
public static final String ADD_ATTRIBUTE_MODE = "a";
private String args[];
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //String[] args = {"ra", "app-test.xmi", "properties", "opositeProperty","karkulka"};
        //String[] args = {"da", "app-test.xmi", "properties", "opositeProperty"};
        //String[] args = {"r", "app-test.xmi", "properties", "karkulka"};
        //String[] args = {"d", "app-test.xmi", "properties"};
        
        //String[] args = {"ra", "data", "properties", "opositeProperty","karkulka"};
        //String[] args = {"da", "data", "properties", "opositeProperty"};
        //String[] args = {"r", "data", "properties", "karkulka"};
        //String[] args = {"d", "data", "properties"};
        
        if(args.length <1 || !isMode(args[0])){
            System.out.println("Musite pouzit mod DeleteElement(" + DELETE_ELEMENT_MODE +"), " +
            		"RenameElement(" + RENAME_ELEMENT_MODE + "), " +
                    "RenameAttribute(" + RENAME_ATTRIBUTE_MODE + "), " +
                    "DeleteAttribute(" + DELETE_ATTRIBUTE_MODE + ")" +
                    " nebo AddAtribute (" + ADD_ATTRIBUTE_MODE + ")");
            printDeleteElementHelp();
            printRenameElementHelp();
            printDeleteAttributeHelp();
            printRenameAttributeHelp();
            printAddAtributeHelp();
            System.exit(0);
        }
        ModelUpdater updater = new ModelUpdater(args);
        String inFile = args[1];
        updater.processFile(new File(inFile));
        
    }
    
    public ModelUpdater(String [] args){
        this.args = args;
    }
    
    private static void printDeleteElementHelp(){
        System.out.println("Mod delete element potrebuje 3 parametry v poradi : "+ DELETE_ELEMENT_MODE + " <input> <element>");
    } 
    
    private static void printRenameElementHelp(){
        System.out.println("Mod rename element potrebuje 4 parametry v poradi : "+ RENAME_ELEMENT_MODE + " <input> <renamedElement> <newName>");
    }

    private static void printDeleteAttributeHelp(){
        System.out.println("Mod delete attribute potrebuje 4 parametry v poradi : "+ DELETE_ATTRIBUTE_MODE + " <input> <ownerElement> <attribute>");
    }

    private static void printRenameAttributeHelp(){
        System.out.println("Mod rename attribute potrebuje 5 parametru v poradi : "+ RENAME_ATTRIBUTE_MODE + " <input> <ownerElement> <renamedAttribute> <newName>");
    }
    
    private static void printAddAtributeHelp(){
        System.out.println("Mod add attribute potrebuje 7 parametru v poradi : "+ ADD_ATTRIBUTE_MODE + " <input> <ownerElement> <attributeName> <attributeValue> <includeVal> <elementName>");
        System.out.println("Posledni dva parametry urcuji, ke kteremu typu elementu se ma atribut pridavat. ElementName vyjadruje konkretni jmeno elementu. Parametr includeVal potom "
            + "jestli se ma zmena aplikovat na elementy s name =  ElementName ci naopak na vsechny ostatni.");    
    }
    
    public AHandler getHandler(String args[]){
        if(args[0].equals(DELETE_ELEMENT_MODE)){
            if(args.length != 3){
                printDeleteElementHelp();
                System.exit(0);
            }   else{
                return new DeleteElementHandler(args[2]);
            }
        }        
        if(args[0].equals(DELETE_ATTRIBUTE_MODE)){
            if(args.length != 4){
                printDeleteAttributeHelp();
                System.exit(0);
            } else{
                return new DeleteAttributeHandler(args[2], args[3]);
            }
        }
        
        if(args[0].equals(RENAME_ELEMENT_MODE)){
            if(args.length != 4){
                printRenameElementHelp();
                System.exit(0);
            } else{
                return new RenameElementHandler(args[2], args[3]);
            }
        }
        
        if(args[0].equals(RENAME_ATTRIBUTE_MODE)){
            if(args.length != 5){
                printRenameAttributeHelp();
                System.exit(0);
            } else{
                return new RenameAttributeHandler(args[2], args[3], args[4]);
            }
        }
        
        if(args[0].equals(ADD_ATTRIBUTE_MODE)){
            if(args.length != 7 || !(args[5].equals("t") || args[5].equals("f"))){
                printAddAtributeHelp();
                System.exit(0);
            } else{
                return new AddAttributeToElement(args[2], args[3], args[4], args[5].equals("t"), args[6]);
            }
        }
        
        return null;
    }
         
    public void processFile(File file){
        System.out.println("zpracovavam:" + file.getPath());
        if(!file.exists()){
            System.out.println("spatne zadana cesta k souboru:" + file.getPath());
            return;
        }
        if(file.isDirectory()){
            File [] fileList = file.listFiles();
            for(int i = 0 ; i < fileList.length ; i++){
                processFile(fileList[i]);
            }
        }else{
            try {
                SAXParserFactory spfactory = SAXParserFactory.newInstance();
                spfactory.setValidating(false);
                SAXParser saxparser = spfactory.newSAXParser();
                XMLReader xmlreader = saxparser.getXMLReader();
                AHandler handler = getHandler(this.args);
                xmlreader.setContentHandler(handler);
                xmlreader.setErrorHandler(handler);
                InputSource source = new InputSource(file.getPath());
                xmlreader.parse(source);
//                Debugging purposes
//                FileWriter fw = new FileWriter(new File(file.getPath() + "out.xmi"));
                FileWriter fw = new FileWriter(new File(file.getPath()), false);
                
                fw.write(handler.getContent());
                fw.flush();
                fw.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
            
    public static boolean isMode(String mode){
        return mode.equals(RENAME_ELEMENT_MODE) || mode.equals(RENAME_ATTRIBUTE_MODE) || 
                mode.equals(DELETE_ELEMENT_MODE) || mode.equals(DELETE_ATTRIBUTE_MODE) || 
                mode.equals(ADD_ATTRIBUTE_MODE);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Třída odpovědná za načtení obsahu souborů.
 * Použit návrhový vzor Singleton.
 * @author pavel
 */
public class SQLFileReader implements iConstants {
    private static SQLFileReader SINGLETON;         /** Reference na jedinou instanci třídy. */
    private String fileName;                        /** Jméno aktuálně čteného souboru. */
    private String fileContent;                     /** Obsah aktuálně čteného souboru. */
    
    /**
     * Privátní konstruktor. 
     */
    private SQLFileReader() {}
    
    /**
     * Metoda, která umožňuje přístup k jediné instanci třídy SQLFileReader.
     * @return Reference na SQLFileReader.
     */
    public static SQLFileReader getReader() {
        if (SINGLETON == null)
            SINGLETON = new SQLFileReader();
        return SINGLETON;
    }
    
    /**
     * Metoda, která umožňuje načíst obsah souboru.
     * @param file Jméno čteného souboru.
     * @return Obsah čteného souboru.
     */
    public String readFile(String file) {
        fileName = file;
        clear();
        read();
        return fileContent;
    }
    
    /**
     * Metoda, která umožňuje vyčistit obsah proměnné fileContent, ve které je uložen
     * obsah aktuálně čteného nebo předchozího souboru.
     */
    private void clear() {
        fileContent = "";
    }
    
    /**
     * Metoda, která umožňuje čtení souboru.
     */
    private void read() {
        File file = new File(fileName);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line = null;
            boolean firstLine = TS_SQLREADER_FIRST_LINE;
            
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    fileContent += line;
                    firstLine = !firstLine;
                }
                else
                    fileContent += "\n" + line;
            }
            
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(SQLFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

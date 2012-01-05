/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.util.ArrayList;
import java.util.List;

/**
 * Třída odpovědná za běh programu.
 * Použit návrhový vzor Singleton.
 * @author pavel
 */
public class App implements iConstants {
    private static App SINGLETON;                   /** Jediná instance třídy. */
    private State state;                            /** Stav aplikace. */
    private List<Command> list;                     /** List s načtenými SQL soubory. */
    private String path;                            /** Cesta k SQL souborům. */
    private String connection;                      /** Connection string k DB. */
    
    /**
     * Privátní konstruktor třídy App.
     * Inicializuje proměnné path a connection defaultní hodnotou.
     * Inicializuje prázdný ArrayList použitý pro ukládání SQL příkazů.
     */
    private App() {
        path = "";
        connection = "";
        list = new ArrayList<Command>();
    }
    
    /**
     * Metoda, která umožňuje získat kopii jediné instance třídy App.
     * @return Návratovou hodnotou jediná instance třídy App.
     */
    public static App getApp() {
        if (SINGLETON == null)
            SINGLETON = new App();
        return SINGLETON;
    }
    
    /**
     * Metoda, která umožňuje zobrazit nápovědu použití programu.
     */
    public static void showHelp() {
        System.out.println("Zadej 2 parametry:");
        System.out.println("1. parametr: Cesta ke slozce s obsahem SQL souboru.");
        System.out.println("2. parametr: Connection string k Databazi.");
    }
    
    /**
     * Metoda, která umožňuje nastavit cestu ke složce obsahující SQL soubory.
     * @param p Cesta ke složce, která obsahuje SQL soubory.
     */
    public void setPath(String p) {
        path = p;
    }
    
    /**
     * Metoda, která předává informaci o složce, kde jsou uloženy SQL soubory.
     * @return Cesta ke složce, která obsahuje SQL soubory.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Metoda, která umožňuje nastavit connection string k databázi.
     * @param c Connection string k databázi.
     */
    public void setConnection(String c) {
        connection = c;
    }
    
    /**
     * Metoda, která předává informaci o connection stringu.
     * @return Connection string k databázi.
     */
    public String getConnection() {
        return connection;
    }
    
    /**
     * Metoda, která vrací ukazatel na list obsahující obsahy načtených SQL souborů.
     * @return Ukazatel na list, který obsahuje načtené SQL soubory.
     */
    public List<Command> getCommand() {
        return list;
    }
    
    /**
     * Metoda, která umožňuje nastartovat program.
     */
    public void run() {
        clear();
        state = new StateReading(this);
        
        while (!state.finished())
            state = state.run();
        
        System.exit(TS_SYSTEM_EXIT_OK);
    }
    
    /**
     * Metoda, která umožňuje vyčistit list obsahující data z SQL souborů.
     */
    private void clear() {
        if (!list.isEmpty())
            list.clear();
    }
}

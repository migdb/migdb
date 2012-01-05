/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.io.File;
import java.util.List;

/**
 * Třída mapující stav aplikace, ve kterém jsou čteny SQL soubory.
 * @author pavel
 */
class StateReading implements State {
    private SQLFileReader reader;                   /** Reference na čítač SQL souborů. */
    private App app;                                /** Reference na aplikaci. */
    private List<Command> list;                     /** Reference na list obsahující SQL. */
    private String path;                            /** Cesta k SQL souborům. */
    private int fileCounter;                        /** Čítač načtených souborů. */

    /**
     * Konstruktor třídy.
     * @param a Reference na aplikaci.
     */
    public StateReading(App a) {
        app = a;
        reader = SQLFileReader.getReader();
        list = a.getCommand();
        path = a.getPath();
        fileCounter = TS_FILE_COUNTER_ZERO;
    }

    /**
     * Metoda, která informuje o ukončení programu.
     * @return True, pokud program skončil úspěšně. False, pokud program stále probíhá.
     */
    @Override
    public boolean finished() {
        return TS_STATE_NOT_FINISHED_YET;
    }
    
    /**
     * Metoda, která umožňuje spustit čtení souborů.
     * @return Stav, ve kterém se aplikace nachází po vykonání metody.
     */
    @Override
    public State run() {
        readFiles();
        return new StateExecuting(app);
    }

    /**
     * Metoda, která umožňuje načíst obsah souborů ve složce path, pokud jsou
     * typu .SQL nebo .QU.
     */
    private void readFiles() {
        File dir = new File(path);
        String[] files =dir.list();
        
        for(int i=0; i<files.length; ++i) {
            if (files[i].equalsIgnoreCase(fileCounter+".sql"))
                readSQLFile(path+files[i]);
            else if (files[i].equalsIgnoreCase(fileCounter+".qu"))
                readQUFile(path+files[i]);
            else
                continue;
        }
    }

    /**
     * Metoda, která umožňuje načíst obsah SQL souboru.
     * @param file Adresa SQL souboru.
     */
    private void readSQLFile(String file) {
        Command comm = new CommandSQL(reader.readFile(file));
        list.add(comm);
        incCounter();
    }

    /**
     * Metoda, která umožňuje načíst obsah QU souboru.
     * @param file Adresa QU souboru.
     */
    private void readQUFile(String file) {
        Command comm = new CommandQU(reader.readFile(file));
        list.add(comm);
        incCounter();
    }

    /**
     * Metoda, která umožňuje inkrementovat počet načtených souborů.
     */
    private void incCounter() {
        ++fileCounter;
    }

}

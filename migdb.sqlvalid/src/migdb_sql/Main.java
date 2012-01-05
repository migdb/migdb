/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

/**
 * Třída Main. Nepotřebuje komentář.
 * @author pavel
 */
public class Main implements iConstants {
    private static App app;                         /** Reference na instanci třídy App. */
    
    /**
     * Metoda, která umožňuje spustit aplikaci, pokud byly zadány dva parametry.
     * @param args Pole obsahující zadané parametry.
     */
    public static void run(String[] args) {
        app = App.getApp();
        app.setPath(args[0]);
        app.setConnection(args[1]);
        app.run();
    }
    
    /**
     * Metoda, která umožňuje zobrazit nápovědu použití programu, pokud nebyly
     * zadány právě dva parametry.
     */
    public static void exit() {
        App.showHelp();
        System.exit(TS_SYSTEM_EXIT_WRONG_PARAMS);
//        String path = "./";
//        String connection = "jdbc:derby://localhost:1527/sample;user=app;password=app";
//        app = App.getApp();
//        app.setPath(path);
//        app.setConnection(connection);
//        app.run();
    }
    
    /**
     * Metoda Main.
     * @param args Parametry programu.
     */
    public static void main(String[] args) {
        if (args.length == 2)
            run(args);
        else
            exit();
    }
}
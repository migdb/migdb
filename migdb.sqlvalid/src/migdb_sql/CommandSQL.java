/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Třída spravující informaci z načteného SQL souboru. Umožňuje vykonat SQL
 * příkaz, který byl načten.
 * @author pavel
 */
public class CommandSQL implements Command {
    private String command;                         /** Příkaz načtený z SQL souboru. */
    private boolean error;                          /** Informace o chybě během vykonání SQL. */
    private SQLConnection executor;                 /** Reference na SQL exekutora. */
    
    /**
     * Konsturktor třídy.
     * @param c SQL, které je načtené z QU souboru.
     */
    public CommandSQL(String c) {
        executor = SQLConnection.getExecutor();
        command = c;
        error = TS_NO_ERROR;
    }
    
    /**
     * Metoda, která umožňuje vykonat SQL načtené z SQL souboru.
     */
    @Override
    public void execute() {
        try {
            executor.executeSQL(command);
        } catch (SQLException ex) {
            Logger.getLogger(CommandSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(TS_SYSTEM_EXIT_SQL_SYNTAX);
        }
    }

    /**
     * Metoda, která vrací informaci o chybě, která se (ne)objevila během
     * vykonání SQL.
     * @return True, pokud nastala chyba během vykonání SQL.
     */
    @Override
    public boolean error() {
        return error;
    }

    /**
     * Metoda, která vrací podrobné informace o chybě, která nastala během
     * vykonání SQL.
     */
    @Override
    public void printError() {
        System.out.println("Error: CommandSQL->execute()");
    }
    
}

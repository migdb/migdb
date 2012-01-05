/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Třída spravující informaci z načteného QU souboru. Umožňuje vykonat SQL
 * příkaz, který byl načten.
 * @author pavel
 */
public class CommandQU implements Command {
    private String command;                         /** Příkaz načtený z QU souboru. */
    private boolean error;                          /** Informace o chybě během vykonání SQL. */
    private SQLConnection executor;                 /** Reference na SQL exekutora. */

    /**
     * Konsturktor třídy.
     * @param c SQL, které je načtené z QU souboru.
     */
    public CommandQU(String c) {
        executor = SQLConnection.getExecutor();
        command = c;
        error = TS_NO_ERROR;
    }
    
    /**
     * Metoda, která umožňuje vykonat SQL načtené z QU souboru.
     */
    @Override
    public void execute() {
        try {
            ResultSet rs = executor.executeQU(command);
            if (rs == null)
                return;
            else
                error = TS_ERROR;
        } catch (SQLException ex) {
            Logger.getLogger(CommandQU.class.getName()).log(Level.SEVERE, null, ex);
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
        System.out.println("Error: CommandQU->execute()");
        System.out.println(command);
        System.out.println("System.exit(TS_SYSTEM_EXIT_CHECK)");
    }
    
}

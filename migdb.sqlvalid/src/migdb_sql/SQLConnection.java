/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Třída odpovědná za práci s databází.
 * Použit návrhový vzor Singleton.
 * @author pavel
 */
public class SQLConnection implements iConstants {
    private static SQLConnection SINGLETON;         /** Reference na jedinou instanci třídy. */
    private Connection connection;                  /** Connection. */
    private Statement statement;                    /** Statement. */
    
    /**
     * Privátní konstruktor.
     */
    private SQLConnection() {}
    
    /**
     * Metoda, která umožňuje přístup k jediné instanci třídy SQLConnection.
     * @return 
     */
    public static SQLConnection getExecutor() {
        if (SINGLETON == null)
            SINGLETON = new SQLConnection();
        return SINGLETON;
    }
    
    /**
     * Metoda, která umožňuje připojení k databázi.
     * @param url Connection string.
     */
    public void connect(String url) {
        try {
            loadDriver(url);
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(TS_SYSTEM_EXIT_EXCEPTION);
        }
    }
    
    /**
     * Metoda, která umožňuje načíst správný driver.
     */
    private void loadDriver(String url) {
        try {
            int x = url.indexOf(":");
            url = url.substring(x+1);
            x = url.indexOf(":");
            url = url.substring(0,x);
            
            if (url.equalsIgnoreCase(TS_DATABASE_DERBY))
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            else if (url.equalsIgnoreCase(TS_DATABASE_POSTGRESQL))
                Class.forName("org.postgresql.Driver");
            else {
                // jiný driver
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metoda, která umožňuje odpojení se od databáze.
     */
    public void disconnect() {
        try {
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metoda, která umožňuje vykonat SQL příkaz z SQL souboru.
     * @param sql Obsah SQL souboru.
     * @throws SQLException Výjimka během vykonávání SQL.
     */
    public void executeSQL(String sql) throws SQLException {
        statement.executeUpdate(sql);
    }
    
    /**
     * Metoda, která umožňuje vykonat SQL příkaz z QU souboru.
     * @param qu Obsah QU souboru.
     * @return Množinu výsledků po vykonání SQL.
     * @throws SQLException Výjimka během vykonávání SQL.
     */
    public ResultSet executeQU(String qu) throws SQLException {
        return statement.executeQuery(qu);
    }
}

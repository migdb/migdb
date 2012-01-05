/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

/**
 * Rozhraní definující konstanty programu.
 * @author pavel
 */
public interface iConstants {
    /* Konstanty pro čtení souborů. */
    public static final boolean TS_SQLREADER_FIRST_LINE = true;
    public static final int TS_FILE_COUNTER_ZERO = 1;
    
    /* Konstanty určující stav programu. */
    public static final boolean TS_STATE_NOT_FINISHED_YET = false;
    public static final boolean TS_STATE_FINISHED = true;
    
    /* Konstanty definující existenci chyby, která se objevila během programu. */
    public static final boolean TS_ERROR = true;
    public static final boolean TS_NO_ERROR = false;
    
    /* Konstanty definující návratové hodnoty programu po jeho ukončení. */
    public static final int TS_SYSTEM_EXIT_OK = 0;              /** Program byl úspěšně ukončen. */
    public static final int TS_SYSTEM_EXIT_SQL_SYNTAX = 1;      /** Špatná SQL syntaxe vstupních souborů. */
    public static final int TS_SYSTEM_EXIT_CHECK = 2;           /** Chyba detekovaná během dotazování se nad DB. */
    public static final int TS_SYSTEM_EXIT_WRONG_PARAMS = 3;    /** Špatné zadané parametry. */
    public static final int TS_SYSTEM_EXIT_EXCEPTION = 4;       /** Výjimka způsobená programem. */
    
    public static final String TS_DATABASE_POSTGRESQL = "postgresql";
    public static final String TS_DATABASE_DERBY = "derby";
}

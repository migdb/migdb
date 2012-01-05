/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

import java.util.List;

/**
 * Třída mapující stav aplikace, ve kterém jsou vykonávány SQL soubory.
 * @author pavel
 */
class StateExecuting implements State {
    private SQLConnection executor;                 /** Reference na správce DB. */
    private List<Command> list;                     /** List obsahující SQL příkazy. */
    String connection;                              /** Connection string k DB. */

    /**
     * Konstruktor třídy.
     * @param a Reference na aplikaci.
     */
    public StateExecuting(App a) {
        executor = SQLConnection.getExecutor();
        list = a.getCommand();
        connection = a.getConnection();
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
     * Metoda, která umožňuje spustit vykonání SQL souborů.
     * @return Stav, ve kterém se aplikace nachází po vykonání metody.
     */
    @Override
    public State run() {
        executor.connect(connection);
        
        for(int i=0; i<list.size(); ++i)
            execute(i);
        
        executor.disconnect();
        return new StateFinishing();
    }

    /**
     * Metoda, která umožňuje vykonání jednotlivých SQL souborů.
     * @param i Adresa vykonávaného SQL.
     */
    private void execute(int i) {
        Command comm = list.get(i);
        comm.execute();
        if (comm.error()) {
            comm.printError();
            executor.disconnect();
            System.exit(TS_SYSTEM_EXIT_CHECK);
        }
    }
    
}

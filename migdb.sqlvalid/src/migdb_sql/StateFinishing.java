/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

/**
 * Třída mapující stav aplikace, kdy program vykonal všechny operace.
 * @author pavel
 */
class StateFinishing implements State {

    /**
     * Konstruktor třídy.
     */
    public StateFinishing() {}

    /**
     * Metoda, která informuje o ukončení programu.
     * @return True, pokud program skončil úspěšně. False, pokud program stále probíhá.
     */
    @Override
    public boolean finished() {
        return TS_STATE_FINISHED;
    }

    /**
     * Metoda, která nebude nikdy volána.
     * @return 
     */
    @Override
    public State run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

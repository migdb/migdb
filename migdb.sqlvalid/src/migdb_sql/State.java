/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

/**
 * Rozhraní definující metody pro jednotlivé stavy, ve kterých se nachází aplikace.
 * Použit návrhový vzor State.
 * @author pavel
 */
public interface State extends iConstants {
    public boolean finished();
    public State run();
}

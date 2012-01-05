/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package migdb_sql;

/**
 * Rozhraní definující metody pro vykonání SQL z načtených souborů.
 * Použit návrhový vzor Strategy.
 * @author pavel
 */
public interface Command extends iConstants {
    public void execute();
    public boolean error();
    public void printError();
    
}

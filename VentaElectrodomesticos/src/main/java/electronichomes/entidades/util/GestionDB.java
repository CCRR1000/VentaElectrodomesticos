
package electronichomes.entidades.util;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public interface GestionDB {
    
    /**
     * Constantes requeridas como parámetro para el método ejecutarInstruccion
     */
    public static final int DELETE = 1;
    public static final int INSERT = 2;
    public static final int UPDATE = 3;
    
    /**
     * Realiza la instruccion indicada, sea INSERT, UPDATE o DELETE
     * @param operacion requiere utilizar una de las constantes estáticas de la interface GestionDB
     * @return true si la instrucción se ejecuta correctamente, de lo contrario devuelve false.
     */
    public boolean ejecutarInstruccionPSQL(int operacion);
    
    
}

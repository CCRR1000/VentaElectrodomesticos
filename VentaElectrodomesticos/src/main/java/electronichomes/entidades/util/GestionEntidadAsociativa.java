
package electronichomes.entidades.util;

import electronichomes.entidades.Empleado;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public interface GestionEntidadAsociativa {
    
    public void mostrarRegistros(DefaultTableModel modelotabla, Empleado empleado);
    
}


package electronichomes;

import electronichomes.UI.Login;
import electronichomes.conexion.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author CIROSS
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Conexion con = new Conexion();
        
        if (con.inicializarConexion()) {
            Login login = new Login();
            login.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos");
        }
    }
    
}

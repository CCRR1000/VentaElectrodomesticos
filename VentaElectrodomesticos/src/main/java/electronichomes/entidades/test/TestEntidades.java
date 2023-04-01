package electronichomes.entidades.test;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.Cliente;
import electronichomes.entidades.Establecimiento;

//import electronichomes.entidades.Cliente;
//import electronichomes.entidades.util.GestionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CIROSS
 */
public class TestEntidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conexion con = new Conexion();

        if (con.inicializarConexion()) {

            try {
//                Cliente cliente = new Cliente("5478632-8", "Spencer Hastings", "59315443", "Ciudad");
//                System.out.println(cliente.toString());
//
//                System.out.println("\n\n - - - SELECT - - -");
//                cliente.mostrarRegistros();
//
//                System.out.println("\n\n - - - INSERT - - -");
//                cliente.ejecutarInstruccionPSQL(GestionDB.INSERT);
//                cliente.mostrarRegistros();
//
//                System.out.println("\n\n - - - UPDATE - - - ");
//                cliente.setTelefono("60426554");
//                cliente.ejecutarInstruccionPSQL(GestionDB.UPDATE);
//                cliente.mostrarRegistros();
//
//                System.out.println("\n\n - - - DELETE - - - ");
//                cliente.ejecutarInstruccionPSQL(Cliente.DELETE);
//                cliente.mostrarRegistros();

/*
                Cliente cliente = Cliente.getClientePorNit("7054718-4");
                if (cliente!=null) {
                    System.out.println(cliente.toString());
                    System.out.println(cliente.getNit());
                    System.out.println(cliente.getNombre());
                    System.out.println(cliente.getTelefono());
                    System.out.println(cliente.getDireccion());
                    
                } else {
                    System.out.println("cliente nulo");
                }
*/
//                String lista[] = Establecimiento.generarListaEstablemientos();
//                System.out.println("\n\n Lista Establecimientos");
//                for (int i = 0; i < lista.length; i++) {
//                    System.out.println(lista[i]);
//                }
                
                ArrayList<Establecimiento> lista = new Establecimiento().generarListaEstablemientos();
                System.out.println("\n\n Lista Establecimientos");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } catch (Exception e) {
                System.out.println("todo mal " + e.getMessage());
            }


        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos");
        }

    }

}

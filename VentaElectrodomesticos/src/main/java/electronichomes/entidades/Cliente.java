
package electronichomes.entidades;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadConcreta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Cliente extends EntidadConcreta {
    private String nit;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    public Cliente() {
        this.nit = "C/F";
        this.nombre = "Consumidor Final";
    }

    public Cliente(String nit, String nombre, String telefono, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        
        String instruccion;
        switch(operacion) {
            case 1:
                instruccion = "DELETE FROM GestionVenta.Cliente WHERE nit=?";
                break;
            case 2:
                instruccion = "INSERT INTO GestionVenta.Cliente VALUES (?,?,?,?)";
                break;
            case 3:
                instruccion = "UPDATE GestionVenta.Cliente SET nit=?,nombre=?,telefono=?,direccion=? WHERE nit=?";
                break;
            default:
                System.out.println("Operacion incorrecta, solo se aceptan los valores constantes de esta clase");
                return false;
        }
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(instruccion)) {
            preSt.setString(1, this.nit);
            if (operacion>=Cliente.INSERT) {
                preSt.setString(2, this.nombre);
                preSt.setString(3, this.telefono);
                preSt.setString(4, this.direccion);
            }
            if (operacion==Cliente.UPDATE) {
                preSt.setString(5, this.nit);
            }
            preSt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
            return false;
        }
        
    }
    
    @Override
    public void mostrarRegistros(DefaultTableModel modelotabla) {
        String consulta = "SELECT * FROM GestionVenta.Cliente";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[4];
            
            while (result.next()) {  
                datos[0] = result.getString("nit");
                datos[1] = result.getString("nombre");
                datos[2] = result.getString("telefono");
                datos[3] = result.getString("direccion");
                modelotabla.addRow(datos);
                System.out.println("NIT: " + result.getString("nit") + " - Nombre: " + result.getString("nombre") + " - Telefono: " + result.getString("telefono"));
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
        
    }
    
    public static Cliente getClientePorNit(String nitCliente) {

        Cliente cliente = null;
        String consulta = "SELECT * FROM GestionVenta.Cliente WHERE nit=?";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, nitCliente);
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String nit = result.getString("nit");
                String nombre = result.getString("nombre");
                String telefono = result.getString("telefono");
                String direccion = result.getString("direccion");
                
                cliente = new Cliente(nit, nombre, telefono, direccion);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
        }
        return cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nit=" + nit + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    /* INICIO DE GETTERS Y SETTERS */

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    
}

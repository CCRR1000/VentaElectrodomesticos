
package electronichomes.entidades;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadAsociativa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Existencia extends EntidadAsociativa {
    
    private Producto producto;
    private Establecimiento establecimiento;
    private int cantidad;

    public Existencia(Producto producto, Establecimiento establecimiento, int cantidad) {
        this.producto = producto;
        this.establecimiento = establecimiento;
        this.cantidad = cantidad;
    }   

    public Existencia() {
    }
    
    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        String instruccion;
        switch(operacion) {
            case 1:
                instruccion = "DELETE FROM Stock.Existencia WHERE producto=? AND establecimiento=?";
                break;
            case 2:
                instruccion = "INSERT INTO Stock.Existencia VALUES (?,?,?)";
                break;
            case 3:
                instruccion = "UPDATE Stock.Existencia SET producto=?,establecimiento=?,cantidad=? WHERE producto=? AND establecimiento=?";
                break;
            default:
                System.out.println("Operacion incorrecta, solo se aceptan los valores constantes de esta clase");
                return false;
        }
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(instruccion)) {
            preSt.setString(1, this.producto.getCodigo());
            preSt.setString(2, this.establecimiento.getId());
            if (operacion>=Cliente.INSERT) {
                preSt.setInt(3, this.cantidad);
            }
            if (operacion==Cliente.UPDATE) {
                preSt.setString(4, this.producto.getCodigo());
                preSt.setString(5, this.establecimiento.getId());
            }
            preSt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
            return false;
        }
    }
    
    public static Existencia getExistenciaPorIDS(String codigoProducto, String idEstablecimiento) {
        String consulta = "SELECT * FROM Stock.Existencia WHERE producto=? AND establecimiento=?";
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, codigoProducto);
            preSt.setString(2, idEstablecimiento);
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String codigo = result.getString("producto");
                Producto producto = Producto.getProductoPorCodigo(codigo);
                String idEst = result.getString("establecimiento");
                Establecimiento establecimiento = Establecimiento.getEstablecimientoPorId(idEst);
                int cantidad = result.getInt("cantidad");
                
                return new Existencia(producto, establecimiento, cantidad);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modelotabla, Empleado empleado) {
        String consulta = "SELECT p.codigo_barras,p.nombre,p.marca,p.precio,e.cantidad,p.descripcion FROM Stock.Existencia AS e INNER JOIN Stock.Producto AS p ON e.producto = p.codigo_barras WHERE e.establecimiento=? ORDER BY p.nombre";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            String idEstablecimiento = empleado.getEstablecimiento().getId();
            preSt.setString(1, idEstablecimiento);
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[6];
            
            while (result.next()) {  
                datos[0] = result.getString("codigo_barras");
                datos[1] = result.getString("nombre");
                datos[2] = result.getString("marca");
                datos[3] = result.getDouble("precio");
                datos[4] = result.getInt("cantidad");
                datos[5] = result.getString("descripcion");
                
                modelotabla.addRow(datos);
                System.out.println("Producto: " + result.getString("codigo_barras") + " - Nombre: " + result.getString("nombre") + " - Cantidad: " + result.getString("cantidad"));
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
    }
    
    /* INICIO DE GETTERS Y SETTERS */

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Existencia{" + "producto=" + producto + ", establecimiento=" + establecimiento + ", cantidad=" + cantidad + '}';
    }


    
    
}

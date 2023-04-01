
package electronichomes.entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadConcreta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Producto extends EntidadConcreta {

    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private String descripcion;
    Producto producto;

    public Producto(String codigo, String nombre, String marca, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public Producto(String codigo, String nombre, String marca, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Producto(Producto producto) {
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.marca = producto.getMarca();
        this.precio = producto.getPrecio();
        this.descripcion = producto.getDescripcion();
    }

    public Producto() {
    }

    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        String instruccion;
        switch(operacion) {
            case 1:
                instruccion = "DELETE FROM Stock.Producto WHERE codigo_barras=?";
                break;
            case 2:
                instruccion = "INSERT INTO Stock.Producto VALUES (?,?,?,?,?)";
                break;
            case 3:
                instruccion = "UPDATE Stock.Producto SET codigo_barras=?,nombre=?,marca=?,precio=?,descripcion=? WHERE codigo_barras=?";
                break;
            default:
                System.out.println("Operacion incorrecta, solo se aceptan los valores constantes de esta clase");
                return false;
        }
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(instruccion)) {
            preSt.setString(1, this.codigo);
            if (operacion>=Cliente.INSERT) {
                preSt.setString(2, this.nombre);
                preSt.setString(3, this.marca);
                preSt.setDouble(4, this.precio);
                preSt.setString(5, this.descripcion);
            }
            if (operacion==Cliente.UPDATE) {
                preSt.setString(6, this.codigo);
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
        String consulta = "SELECT * FROM GestionVenta.Producto";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[5];
            
            while (result.next()) {  
                datos[0] = result.getString("codigo_barras");
                datos[1] = result.getString("nombre");
                datos[2] = result.getString("marca");
                datos[3] = result.getDouble("precio");
                datos[4] = result.getString("descripcion");
                modelotabla.addRow(datos);
                //System.out.println("Codigo: " + result.getString("codigo_barras") + " - Nombre: " + result.getString("nombre") + " - Marca: " + result.getString("marca"));
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
    }

    public static Producto getProductoPorCodigo(String codigoProducto) {
        String consulta = "SELECT * FROM Stock.Producto WHERE codigo_barras=?";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, codigoProducto);
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String codigo = result.getString("codigo_barras");
                String nombre = result.getString("nombre");
                String marca = result.getString("marca");
                double precio = result.getDouble("precio");
                String descripcion = result.getString("descripcion");
                
                return new Producto(codigo, nombre, marca, precio, descripcion);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
        }
        return null;
    }

    /* INICIO DE GETTERS Y SETTERS */

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", descripcion=" + descripcion + ", producto=" + producto + '}';
    }
    
    
}

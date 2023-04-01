
package electronichomes.entidades;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadConcreta;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Factura extends EntidadConcreta {

    private String noDocumento;
    private Cliente cliente;
    private java.util.Date fechaDate;
    private java.sql.Date fechaSql;
    private double subtotal;
    private double descuento;
    private double total;
    private Empleado vendedor;
    private Establecimiento sucursal;
    private static int ultimoDigito;

    public Factura(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public Factura(String noDocumento, Cliente cliente, java.util.Date fechaDate, Empleado vendedor, Establecimiento sucursal) {
        this.noDocumento = noDocumento;
        this.cliente = cliente;
        this.fechaDate = fechaDate;
        this.fechaSql = new java.sql.Date(fechaDate.getTime());
        this.vendedor = vendedor;
        this.sucursal = sucursal;
    }

    public Factura(String noDocumento, Cliente cliente, Date fechaSql, double subtotal,
            double descuento, double total, Empleado vendedor, Establecimiento sucursal) {
        this.noDocumento = noDocumento;
        this.cliente = cliente;
        this.fechaSql = fechaSql;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
        this.vendedor = vendedor;
        this.sucursal = sucursal;
    }

    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modelotabla) {
        String consulta = "SELECT * FROM GestionVenta.Factura";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[8];
            
            while (result.next()) {  
                datos[0] = result.getString("noDocumento");
                datos[1] = result.getString("cliente");
                datos[2] = result.getDate("fecha");
                datos[3] = result.getDouble("subtotal");
                datos[4] = result.getDouble("descuento");
                datos[5] = result.getDouble("total");
                datos[6] = result.getString("vendedor");
                datos[7] = result.getString("sucursal");
                modelotabla.addRow(datos);
                System.out.println("No. Documento: " + result.getString("noDocumento") + " - Cliente: " + result.getString("cliente"));
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
    }

    public static Factura getFacturaPorNumero(String numeroFactura) {
        String consulta = "SELECT * FROM GestionVenta.Factura WHERE noDocumento=?";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, numeroFactura);
            preSt.executeUpdate();
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String noDocumento = result.getString("noDocumento");
                Cliente cliente = Cliente.getClientePorNit(result.getString("cliente"));
                java.sql.Date fechaSql = result.getDate("fecha");
                double subtotal = result.getDouble("subtotal");
                double descuento = result.getDouble("descuento");
                double total = result.getDouble("total");
                Empleado vendedor = Empleado.obtenerEmpleadoPorId(result.getString("vendedor"));
                Establecimiento sucursal = Establecimiento.getEstablecimientoPorId(result.getString("sucursal"));
                
                return new Factura(noDocumento, cliente, fechaSql, subtotal, descuento, total, vendedor, sucursal);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
        }
        return null;
    }

    /* INICIO DE GETTERS Y SETTERS */

    public String getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public java.util.Date getFecha() {
        return fechaDate;
    }

    public void setFecha(java.util.Date fecha) {
        this.fechaDate = fecha;
    }

    public java.sql.Date getFechaSql() {
        return fechaSql;
    }

    public void setFechaSql(java.sql.Date fechaSql) {
        this.fechaSql = fechaSql;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Establecimiento getSucursal() {
        return sucursal;
    }

    public void setSucursal(Establecimiento sucursal) {
        this.sucursal = sucursal;
    }

    
    
    
}

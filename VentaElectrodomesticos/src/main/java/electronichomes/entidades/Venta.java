
package electronichomes.entidades;

import electronichomes.entidades.clasesabstractas.EntidadAsociativa;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Venta extends EntidadAsociativa {

    private Factura factura;
    private Producto producto;
    private int unidades;
    private double subtotal;

    public Venta(Factura factura, Producto producto, int unidades, double subtotal) {
        this.factura = factura;
        this.producto = producto;
        this.unidades = unidades;
        this.subtotal = subtotal;
    }

    public Venta(Factura factura, Producto producto, int unidades) {
        this.factura = factura;
        this.producto = producto;
        this.unidades = unidades;
        this.subtotal = producto.getPrecio()*unidades;
    }

    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modelotabla, Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /* INICIO DE GETTERS Y SETTERS */

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    
    
}


package electronichomes.UI;

import electronichomes.UI.paneles.PanelAgregarProducto;
import electronichomes.UI.paneles.PanelDatosCliente;
import electronichomes.entidades.Cliente;
import electronichomes.entidades.Empleado;
import electronichomes.entidades.Factura;
import electronichomes.entidades.Venta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Vendedor extends javax.swing.JFrame {

    private Empleado vendedor;
    private DefaultTableModel modeloTabla;
    private Factura facturaActual;
    private ArrayList<Venta> listaVentas = new ArrayList<>();
    
    /**
     * Creates new form Vendedor
     */
    public Vendedor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Electronic-Homes");
        ImageIcon icono = new ImageIcon(getClass().getResource("/electronichomes/UI/images/icon.png"));
        setIconImage(icono.getImage());
        inicializarTabla();
    }
    
    public void inicializarTabla() {
        modeloTabla.addColumn("Factura");
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Unidades");
        modeloTabla.addColumn("Monto");
    }

    public Vendedor(Empleado vendedor) {
        this();
        this.vendedor = vendedor;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSubtotal = new javax.swing.JLabel();
        jLabelVendedor1 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelNit = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelDescuento = new javax.swing.JLabel();
        jTextFieldNit = new javax.swing.JTextField();
        jTextFieldVendedor = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldDescuento = new javax.swing.JTextField();
        jTextFieldSubtotal = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonNuevaVenta = new javax.swing.JButton();
        jButtonFinalizarVenta = new javax.swing.JButton();
        jLabelProductos = new javax.swing.JLabel();
        jButtonAgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitulo.setText("NUEVA VENTA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabelSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSubtotal.setText("Subtotal:");

        jLabelVendedor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelVendedor1.setText("Vendedor:");

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFecha.setText("Fecha:");

        jLabelCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCliente.setText("Cliente:");

        jLabelNit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNit.setText("NIT:");

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTotal.setText("Total:");

        jLabelDescuento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDescuento.setText("Descuento:");

        jTextFieldNit.setEditable(false);

        jTextFieldVendedor.setEditable(false);

        jTextFieldFecha.setEditable(false);

        jTextFieldDescuento.setEditable(false);

        jTextFieldSubtotal.setEditable(false);

        jTextFieldCliente.setEditable(false);

        jTextFieldTotal.setEditable(false);

        jButtonNuevaVenta.setText("Iniciar Venta");
        jButtonNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaVentaActionPerformed(evt);
            }
        });

        jButtonFinalizarVenta.setText("Finalizar Venta");
        jButtonFinalizarVenta.setEnabled(false);
        jButtonFinalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVentaActionPerformed(evt);
            }
        });

        jLabelProductos.setText("Productos:");

        jButtonAgregarProducto.setText("AgregarProducto");
        jButtonAgregarProducto.setEnabled(false);
        jButtonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCliente)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelVendedor1)
                                .addComponent(jLabelFecha)
                                .addComponent(jLabelNit)
                                .addComponent(jLabelSubtotal)
                                .addComponent(jLabelDescuento, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNuevaVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFinalizarVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAgregarProducto)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelProductos)
                    .addComponent(jButtonAgregarProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVendedor1)
                            .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNit)
                            .addComponent(jTextFieldNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescuento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevaVenta)
                            .addComponent(jButtonFinalizarVenta)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaVentaActionPerformed
        
        //java.util.Date fecha = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        
        try {
            String fechaTxt = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
            java.util.Date fechaDate =new SimpleDateFormat("yyyy/MM/dd").parse(fechaTxt);
            PanelDatosCliente panel = new PanelDatosCliente();
        
            String noFactura = JOptionPane.showInputDialog("Ingrese número de Factura:");
            String nit = JOptionPane.showInputDialog("Ingrese número de NIT:");
            Cliente cliente = Cliente.getClientePorNit(nit);

            if (cliente==null) {
                int boton = JOptionPane.showOptionDialog(null, panel, "Ingresar cliente", 2, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Guardar","Cancelar"}, null);

                if (boton==0) {
                    cliente = panel.getNuevoCliente();
                }
            } 

            this.facturaActual = new Factura(noFactura,cliente, fechaDate, vendedor,vendedor.getEstablecimiento());
            jTextFieldVendedor.setText(vendedor.getNombre());
            jTextFieldFecha.setText(fechaTxt);
            jTextFieldNit.setText(cliente.getNit());
            jTextFieldCliente.setText(cliente.getNombre());
            
            this.ventaEnProceso = true;
            this.jButtonAgregarProducto.setEnabled(true);
            this.jButtonFinalizarVenta.setEnabled(true);
            
        } catch (ParseException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonNuevaVentaActionPerformed

    private void jButtonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProductoActionPerformed
        if (ventaEnProceso==true) {
            PanelAgregarProducto panel = new PanelAgregarProducto();
            int boton = JOptionPane.showOptionDialog(null, panel, "Agregar producto", 2, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Agregar","Cancelar"}, null);
            if (boton==0) {
                Venta venta = panel.getNuevaVenta(facturaActual);
                listaVentas.add(venta);
                Object datos[] = new Object[5];
                datos[0] = venta.getFactura().getNoDocumento();
                datos[1] = venta.getProducto().getCodigo();
                datos[2] = venta.getProducto().getDescripcion();
                datos[3] = venta.getUnidades();
                datos[4] = venta.getSubtotal();
                modeloTabla.addRow(datos);
                actualizarValores();
            }
        }
    }//GEN-LAST:event_jButtonAgregarProductoActionPerformed

    private void jButtonFinalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVentaActionPerformed
        reiniciarDatos();
    }//GEN-LAST:event_jButtonFinalizarVentaActionPerformed

    public void actualizarValores() {
        int subtotal = 0;
        for (int i = 0; i < listaVentas.size(); i++) {
            subtotal += listaVentas.get(i).getSubtotal();
        }
        jTextFieldSubtotal.setText(""+subtotal);
        jTextFieldDescuento.setText("0");
        jTextFieldTotal.setText(""+subtotal);
    }
    
    public void reiniciarDatos() {
        int filas = modeloTabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTabla.removeRow(0);
        }
        jTextFieldFecha.setText("");
        jTextFieldNit.setText("");
        jTextFieldCliente.setText("");
        this.ventaEnProceso = false;
        this.jButtonAgregarProducto.setEnabled(false);
        this.jButtonFinalizarVenta.setEnabled(false);
        
    }
    private boolean ventaEnProceso = false;

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarProducto;
    private javax.swing.JButton jButtonFinalizarVenta;
    private javax.swing.JButton jButtonNuevaVenta;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNit;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNit;
    private javax.swing.JTextField jTextFieldSubtotal;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVendedor;
    // End of variables declaration//GEN-END:variables
}
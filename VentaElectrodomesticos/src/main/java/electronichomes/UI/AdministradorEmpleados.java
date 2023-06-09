
package electronichomes.UI;

import electronichomes.UI.paneles.PanelDatosEmpleado;
import electronichomes.entidades.Empleado;
import electronichomes.entidades.Establecimiento;
import electronichomes.entidades.Producto;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class AdministradorEmpleados extends javax.swing.JFrame {

    
    private Empleado administrador;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private ArrayList<Establecimiento> listaEstablecimientos = new ArrayList<>();
    
    /**
     * Creates new form Administrador
     */
    public AdministradorEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Electronic-Homes");
        ImageIcon icono = new ImageIcon(getClass().getResource("/electronichomes/UI/images/icon.png"));
        setIconImage(icono.getImage());
        this.listaEstablecimientos = new Establecimiento().generarListaEstablemientos();
        inicializarTabla();
    }

    public AdministradorEmpleados(Empleado administrador) {
        this();
        this.administrador = administrador;
        String nombreUsuario = administrador.getNombre() + " " + administrador.getApellido();
        this.jTextFieldUsuario.setText(nombreUsuario);
        jTextFieldRol.setText(administrador.getRol().name());
    }
    
    public void inicializarTabla() {
        
        modeloTabla.addColumn("Usuario");
        modeloTabla.addColumn("Contraseña");
        modeloTabla.addColumn("CUI");
        modeloTabla.addColumn("Rol");
        modeloTabla.addColumn("Establecimiento");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Salario");

        this.jTableEmpleados.setModel(modeloTabla);
    }

    public void llenarTabla() {
        Empleado empleado = new Empleado();
        empleado.mostrarRegistros(modeloTabla);
    }
    
    public void actualizarTabla() {
        int filas = modeloTabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTabla.removeRow(0);
        }
        llenarTabla();
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
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldRol = new javax.swing.JTextField();
        jLabelRol = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jButtonEditarEmpleado = new javax.swing.JButton();
        jButtonIngresarNuevo = new javax.swing.JButton();
        jButtonVerEmpleados = new javax.swing.JButton();
        jButtonReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 90, 120));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setText("USUARIO:");

        jTextFieldUsuario.setEditable(false);
        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldRol.setEditable(false);
        jTextFieldRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRol.setText("ROL:");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("Planilla de Empleados:");

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo de Producto", "Nombre", "Marca", "Precio", "Cantidad", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);

        jButtonEditarEmpleado.setText("Editar Empleado");
        jButtonEditarEmpleado.setActionCommand("");
        jButtonEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarEmpleadoActionPerformed(evt);
            }
        });

        jButtonIngresarNuevo.setText("Ingresar Nuevo Empleado");
        jButtonIngresarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarNuevoActionPerformed(evt);
            }
        });

        jButtonVerEmpleados.setText("Ver Empleados");
        jButtonVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEmpleadosActionPerformed(evt);
            }
        });

        jButtonReportes.setText("Generar Reportes");
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonReportes)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerEmpleados)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIngresarNuevo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitulo)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUsuario)
                                .addComponent(jLabelRol))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                                .addComponent(jTextFieldRol)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRol))
                .addGap(28, 28, 28)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresarNuevo)
                    .addComponent(jButtonEditarEmpleado)
                    .addComponent(jButtonVerEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReportes))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEmpleadosActionPerformed
        this.actualizarTabla();
    }//GEN-LAST:event_jButtonVerEmpleadosActionPerformed

    private void jButtonEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarEmpleadoActionPerformed
        String usuario = JOptionPane.showInputDialog("Ingrese el usuario del empleado:");
        
        if (!usuario.equals("")) {
            Empleado empleado = Empleado.obtenerEmpleadoPorId(usuario);
            if (empleado==null) {
                JOptionPane.showMessageDialog(null, "El codigo ingresado es incorrecto","Codigo incorrecto",JOptionPane.ERROR_MESSAGE);
            } else {
                PanelDatosEmpleado panel = new PanelDatosEmpleado("Editar empleado:", empleado.getUsuario(), empleado.getContrasena(), empleado.getCUI(), empleado.getNombre(), empleado.getApellido(),empleado.getSalario(),empleado.getRol(),empleado.getEstablecimiento());
                int boton = JOptionPane.showOptionDialog(null, panel, "Editar empleado", 2, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Guardar","Cancelar"}, null);
                
                if (boton==0) {
                    empleado = panel.getNuevoEmpleado();
                    empleado.ejecutarInstruccionPSQL(Producto.UPDATE);
                    this.actualizarTabla();
                }
            }
        
        }
    }//GEN-LAST:event_jButtonEditarEmpleadoActionPerformed

    private void jButtonIngresarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarNuevoActionPerformed
        PanelDatosEmpleado panel = new PanelDatosEmpleado();
        panel.limpiarCampos();
        int boton = JOptionPane.showOptionDialog(null, panel, "Ingresar empleado", 2, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Guardar","Cancelar"}, null);
        
        if (boton==0) {
            Empleado empleado = panel.getNuevoEmpleado();
            
            if (empleado==null) {
                JOptionPane.showMessageDialog(null, "No se puedo ingresar el empleado","ERROR",JOptionPane.ERROR_MESSAGE);
            } else {
                empleado.ejecutarInstruccionPSQL(Empleado.INSERT);
                this.actualizarTabla();
            }
        } 
    }//GEN-LAST:event_jButtonIngresarNuevoActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        AdministradorReportes adminR = new AdministradorReportes(administrador);
        adminR.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonReportesActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarEmpleado;
    private javax.swing.JButton jButtonIngresarNuevo;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonVerEmpleados;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextFieldRol;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}

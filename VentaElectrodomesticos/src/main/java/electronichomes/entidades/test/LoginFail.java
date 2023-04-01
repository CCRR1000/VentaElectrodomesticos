package electronichomes.entidades.test;

import electronichomes.UI.AdministradorEmpleados;
import electronichomes.UI.Bodega;
import electronichomes.UI.Inventario;
import electronichomes.UI.Vendedor;
import electronichomes.entidades.Cliente;
import electronichomes.entidades.Empleado;
import electronichomes.entidades.util.Image;
import electronichomes.entidades.util.Rol;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class LoginFail extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    Image img = new Image();

    /**
     * Creates new form Login
     */
    public LoginFail() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Electronic-Homes");
        ImageIcon icono = new ImageIcon(getClass().getResource("/electronichomes/UI/images/icon.png"));
        setIconImage(icono.getImage());
        jLabelLogo.setIcon(img.scaleIcon("/electronichomes/UI/images/logo.png", jLabelLogo));
//        inicializarTabla();
//        llenarTabla();
    }

    public void iniciarSesion(Rol rol) {
        if(rol.equals(Rol.ADMINISTRADOR)) {
            AdministradorEmpleados admin = new AdministradorEmpleados();
            admin.setVisible(true);
            this.dispose();
        } else if (rol.equals(Rol.VENDEDOR)) {
            Vendedor vendedor = new Vendedor();
            vendedor.setVisible(true);
            this.dispose();
        } else if (rol.equals(Rol.INVENTARIO)) {
            Inventario inventario = new Inventario();
            inventario.setVisible(true);
            this.dispose();
        } else if (rol.equals(Rol.BODEGA)) {
            Bodega bodega = new Bodega();
            bodega.setVisible(true);
            this.dispose();
        }
    }
//    public void inicializarTabla() {
//        modeloTabla.addColumn("Nit");
//        modeloTabla.addColumn("Nombre");
//        modeloTabla.addColumn("Telefono");
//        modeloTabla.addColumn("Direccion");
//
//        this.jTable1.setModel(modeloTabla);
//    }
//
//    public void llenarTabla() {
//        Empleado empleado = new Empleado();
//        empleado.mostrarRegistros(modeloTabla);
//    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonIniciar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 115, 115));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronichomes/UI/images/icono.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR");

        jLabelContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContrasena.setText("Password:");

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButtonIniciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonIniciar.setText("Iniciar Sesion");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelContrasena)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jButtonIniciar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonIniciar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        Empleado empleado = new Empleado();
        String password = new String(jPasswordField.getPassword());
        empleado = empleado.validarEmpleado(jTextFieldUsuario.getText(), password);
        if (empleado!=null) {
            this.iniciarSesion(empleado.getRol());
        } else {
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos");
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}

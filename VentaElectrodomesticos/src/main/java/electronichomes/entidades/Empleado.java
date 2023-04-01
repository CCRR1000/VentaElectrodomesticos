
package electronichomes.entidades;

import electronichomes.entidades.util.Rol;
import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadConcreta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Empleado extends EntidadConcreta {
    
    private String usuario;
    private String contrasena;
    private String CUI;
    private Rol rol;
    private Establecimiento establecimiento;
    private String nombre;
    private String apellido;
    private double salario;
    
    

    public Empleado(String usuario, String contrasena, String CUI, Rol rol, Establecimiento establecimiento, String nombre, String apellido, double salario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.CUI = CUI;
        this.rol = rol;
        this.establecimiento = establecimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado(String usuario, String contrasena, String CUI, Rol rol, String nombre, String apellido, double salario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.CUI = CUI;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    
    
    
    public Empleado validarEmpleado(String usuario, String contrasena) {
        Empleado empleado = obtenerEmpleadoPorId(usuario);
        System.out.println(empleado.toString());
        
        if (empleado!=null && contrasena.equals(empleado.getContrasena())) {
            return empleado;
        } else {
            System.out.println("La contrasena es incorrecta");
        }
        return null;
    }

    public Empleado() {
    }
    
    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        
        String instruccion;
        switch(operacion) {
            case 1:
                instruccion = "DELETE FROM Personal.Empleado WHERE usuario=?";
                break;
            case 2:
                instruccion = "INSERT INTO Personal.Empleado VALUES (?,?,?,?,?,?,?,?)";
                break;
            case 3:
                instruccion = "UPDATE Personal.Empleado SET usuario=?,contrasena=?,cui=?,rol=?,establecimiento=?,nombre=?,apellido=?,salario=? WHERE usuario=?";
                break;
            default:
                System.out.println("Operacion incorrecta, solo se aceptan los valores constantes de esta clase");
                return false;
        }
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(instruccion)) {
            preSt.setString(1, this.usuario);
            if (operacion>=Cliente.INSERT) {
                preSt.setString(2, this.contrasena);
                preSt.setString(3, this.CUI);
                preSt.setString(4, this.rol.toString());
                preSt.setString(5, this.establecimiento.getId());
                preSt.setString(6, this.nombre);
                preSt.setString(7, this.apellido);
                preSt.setDouble(8, this.salario);
            }
            if (operacion==Cliente.UPDATE) {
                preSt.setString(9, this.usuario);
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
        String consulta = "SELECT * FROM Personal.Empleado";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[8];
            
            while (result.next()) {  
                datos[0] = result.getString("usuario");
                datos[1] = result.getString("contrasena");
                datos[2] = result.getString("cui");
                datos[3] = result.getString("rol");
                datos[5] = result.getString("nombre");
                datos[6] = result.getString("apellido");
                datos[7] = result.getDouble("salario");
                
                if (result.getString("establecimiento")==null) {
                    datos[4] = "";
                } else {
                    datos[4] = result.getString("establecimiento");
                }
                modelotabla.addRow(datos);
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
    }

    public static Empleado obtenerEmpleadoPorId(String usuarioEmpleado) {
        String consulta = "SELECT * FROM Personal.Empleado WHERE usuario=?";
        Empleado empleado = new Empleado();
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, usuarioEmpleado);
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String usuario = result.getString("usuario");
                String contrasena = result.getString("contrasena");
                String CUI = result.getString("cui");
                Rol rol = Empleado.getRol(result.getString("rol"));
                Establecimiento establecimiento = Establecimiento.getEstablecimientoPorId(result.getString("establecimiento"));
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                double salario = result.getDouble("salario");
                
                empleado = new Empleado(usuario, contrasena, CUI, rol, establecimiento, nombre, apellido, salario);
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
            
        }
        return empleado;
    }

    /* INICIO DE GETTERS Y SETTERS */

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public Rol getRol() {
        return rol;
    }

    public static Rol getRol(String roltxt) {
        if (roltxt.equals(Rol.ADMINISTRADOR.name())) 
            return Rol.ADMINISTRADOR;
        else if (roltxt.equals(Rol.BODEGA.name())) 
            return Rol.BODEGA;
        else if (roltxt.equals(Rol.INVENTARIO.name())) 
            return Rol.INVENTARIO;
        else 
            return Rol.VENDEDOR;
        
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "usuario=" + usuario + ", CUI=" + CUI + ", rol=" + rol + ", establecimiento=" + establecimiento + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';
    }



    
}

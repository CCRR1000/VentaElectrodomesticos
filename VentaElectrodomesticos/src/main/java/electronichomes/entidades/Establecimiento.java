
package electronichomes.entidades;

import electronichomes.conexion.Conexion;
import electronichomes.entidades.clasesabstractas.EntidadConcreta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CIROSS
 */
public class Establecimiento extends EntidadConcreta {

    private String id;
    private String nombre;
    private String tipo;
    private String direccion;
    private ArrayList<Establecimiento> listaEstablecimientos = new ArrayList<>();;

    public Establecimiento(String id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
//        this.listaEstablecimientos = new ArrayList<>();
    }

    public Establecimiento(String id, String nombre, String tipo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
//        this.listaEstablecimientos = new ArrayList<>();
    }

    public Establecimiento() {
    }

    @Override
    public boolean ejecutarInstruccionPSQL(int operacion) {
        String instruccion;
        switch(operacion) {
            case 1:
                instruccion = "DELETE FROM Espacios.Establecimiento WHERE id=?";
                break;
            case 2:
                instruccion = "INSERT INTO Espacios.Establecimiento VALUES (?,?,?,?)";
                break;
            case 3:
                instruccion = "UPDATE Espacios.Establecimiento SET id=?,nombre=?,tipo=?,direccion=? WHERE id=?";
                break;
            default:
                System.out.println("Operacion incorrecta, solo se aceptan los valores constantes de esta clase");
                return false;
        }
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(instruccion)) {
            preSt.setString(1, this.id);
            if (operacion>=Cliente.INSERT) {
                preSt.setString(2, this.nombre);
                preSt.setString(3, this.tipo);
                preSt.setString(4, this.direccion);
            }
            if (operacion==Cliente.UPDATE) {
                preSt.setString(5, this.id);
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
        String consulta = "SELECT * FROM Espacios.Establecimiento";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            
            ResultSet result = preSt.executeQuery();
            Object datos[] = new Object[4];
            
            while (result.next()) {  
                datos[0] = result.getString("id");
                datos[1] = result.getString("nombre");
                datos[2] = result.getString("tipo");
                datos[3] = result.getString("direccion");
                modelotabla.addRow(datos);
                System.out.println("ID: " + datos[0] + ", Nombre: " + datos[1]);
            }
        } catch (Exception e) {
            System.err.println("Error al visualizar registros: " + e.getMessage());
        }
    }
    
    public ArrayList<Establecimiento> generarListaEstablemientos() {
        
        String consulta = "SELECT id FROM Espacios.Establecimiento";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            ResultSet result = preSt.executeQuery();
            while (result.next()) {  
                String idText = result.getString("id");
                Establecimiento est = getEstablecimientoPorId(idText);
                listaEstablecimientos.add(est);
            }
        } catch (Exception e) {
            System.err.println("Error al obtener registros: " + e.getMessage());
        }
        return listaEstablecimientos;
    }
    
    public static Establecimiento getEstablecimientoPorId(String idEstablecimiento) {
        String consulta = "SELECT * FROM Espacios.Establecimiento WHERE id=?";
        
        try (PreparedStatement preSt = Conexion.dbConnection.prepareStatement(consulta)) {
            preSt.setString(1, idEstablecimiento);
            ResultSet result = preSt.executeQuery();

            while (result.next()) {
                String id = result.getString("id");
                String nombre = result.getString("nombre");
                String tipo = result.getString("tipo");
                String direccion = result.getString("direccion");
                
                return new Establecimiento(id, nombre, tipo, direccion);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la instruccion: " + e.getMessage());
        }
        return null;
    }

    
    /* INICIO DE GETTERS Y SETTERS */
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Establecimiento> getListaEstablecimientos() {
        return listaEstablecimientos;
    }

    public void setListaEstablecimientos(ArrayList<Establecimiento> listaEstablecimientos) {
        this.listaEstablecimientos = listaEstablecimientos;
    }



    @Override
    public String toString() {
        return "Establecimiento{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", direccion=" + direccion + '}';
    }

    
    
    
}

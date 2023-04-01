/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electronichomes.entidades.test;

import electronichomes.UI.paneles.PanelDatosProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author CIROSS
 */
public class PruebaGraficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
//                                   "COLORES", JOptionPane.QUESTION_MESSAGE, null,
//                              new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
        PanelDatosProducto datosProducto = new PanelDatosProducto();
//        Object ob1 = JOptionPane.showConfirmDialog(null, datosProducto, "ingrese", 0);
        int guardar = JOptionPane.showOptionDialog(null, datosProducto, "ingresar", 2, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Guardar","Cancelar"}, null);
        
        String codigo = datosProducto.jTextFieldCodigo.getText();
        String nombre = datosProducto.jTextFieldNombre.getText();
        System.out.println("Codigo: " + codigo + " - Nombre: " + nombre);
//        System.out.println("guardar" + guardar);
//        System.out.println(color.toString());
    }
    
}

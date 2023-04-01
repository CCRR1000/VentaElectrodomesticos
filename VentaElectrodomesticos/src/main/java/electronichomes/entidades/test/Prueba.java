/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electronichomes.entidades.test;

import electronichomes.entidades.util.Rol;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author CIROSS
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fecha = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        System.out.println(fecha);
    }
    
}

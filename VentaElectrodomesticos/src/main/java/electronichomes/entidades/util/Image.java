
package electronichomes.entidades.util;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author CIROSS
 */
public class Image {
    
    public Icon scaleIcon(String ruta, JLabel label) {
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH));        
        return icono;
    }
}

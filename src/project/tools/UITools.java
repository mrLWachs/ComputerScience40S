/** Required package class namespace */
package project.tools;
 
/** Required API imports */
import javax.swing.JFrame;

/**
 * UITools.java - description
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public abstract class UITools 
{

    public static void setForm(JFrame frame) {
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);                     // Set UI look and show user
    }
    
}
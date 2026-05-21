/** Required package class namespace */
package project.tools;
 
/** Required API imports */
import javax.swing.JFrame;

/**
 * UITools.java - an abstract class with static methods for working with forms
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public abstract class UITools 
{

    /**
     * Static method to set properties of a form (JFrame) when it is created
     * 
     * @param frame the form to set
     */
    public static void setForm(JFrame frame) {
        frame.setResizable(false);                // Do not allow user to resize
        frame.setLocationRelativeTo(null);       // Center form on user's screen
        frame.setVisible(true);                     // Set UI look and show user
    }
    
}
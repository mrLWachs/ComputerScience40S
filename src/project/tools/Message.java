/** Required package class namespace */
package project.tools;
 
/** Required API imports */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Message.java - description
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public abstract class Message 
{

    private static final int ERROR = JOptionPane.ERROR_MESSAGE;
    private static final String TITLE = "Project";
    
    
    public static void notInDatabase(JFrame frame) {
        show(frame, "User not in database!", null);        
    }

    public static void fillInName(JFrame frame, JTextField field) {
        show(frame, "Please fill out user name", field);
    }

    public static void fillInPassword(JFrame frame, JTextField field) {
        show(frame, "Please fill out password", field);
    }
    
    private static void show(JFrame frame, String message, JTextField field) {
        JOptionPane.showMessageDialog(frame, message,TITLE,ERROR);
        if (field != null) field.requestFocus();
    }
    
}
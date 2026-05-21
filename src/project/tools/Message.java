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

    private static JOptionPane dialog = new JOptionPane();
    private static int ERROR = JOptionPane.ERROR_MESSAGE;
    
    public static void notInDatabase(JFrame frame) {
        dialog.showMessageDialog(frame, "User not in database!","",ERROR);        
    }

    public static void fillInName(JFrame frame, JTextField field) {
        JOptionPane.showMessageDialog(frame, "Please fill out user name","",ERROR);
        field.requestFocus();
    }

    public static void fillInPassword(JFrame frame, JTextField field) {
        JOptionPane.showMessageDialog(frame, "Please fill out password","",ERROR);
        field.requestFocus();
    }
    
}
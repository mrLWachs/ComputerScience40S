/** Required package class namespace */
package project.tools;
 
/** Required API imports */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 * Message.java - abstract class with static (shared) methods (can be called 
 * directly from the class) for displaying application messages to the user
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public abstract class Message 
{

    /**
     * Internal encapsulated constants for the class methods
     */
    private static final int ERROR = JOptionPane.ERROR_MESSAGE;
    private static final String TITLE = "Project";
    
    
    /**
     * A "wrapper" method to message to tell the user that this user is not in 
     * the database
     * 
     * @param frame the UI to display the message over
     */
    public static void notInDatabase(JFrame frame) {
        show(frame, "User not in database!", null);        
    }

    /**
     * A "wrapper" message to tell the user to fill in the name field on the UI
     * 
     * @param frame the UI to display the message over
     */
    public static void fillInName(JFrame frame, JTextField field) {
        show(frame, "Please fill out user name", field);
    }

    /**
     * A "wrapper" message to tell the user to fill in the password field on the UI
     * 
     * @param frame the UI to display the message over
     */
    public static void fillInPassword(JFrame frame, JTextField field) {
        show(frame, "Please fill out password", field);
    }
    
    /**
     * Internal utility method to display a message to the user in a dialog
     * 
     * @param frame the UI to display the message over
     * @param message the message to display in the dialog
     * @param field the text field to give focus to (or ignore)
     */
    private static void show(JFrame frame, String message, JTextField field) {
        JOptionPane.showMessageDialog(frame, message,TITLE,ERROR);
        if (field != null) field.requestFocus();
    }
    
}
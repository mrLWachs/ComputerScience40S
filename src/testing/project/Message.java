/** Required package class namespace */
package testing.project;

/** Required API imports */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
/**
 * Message.java - an abstract class to send simple dialog messages to the user 
 * using static methods
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public abstract class Message 
{
    
    private static final String TITLE   = "Database";    
    private static final int    INFO    = JOptionPane.INFORMATION_MESSAGE;
    private static final int    ERROR   = JOptionPane.ERROR_MESSAGE;
    private static final int    TYPE    = JOptionPane.YES_NO_OPTION;
    private static final int    CONFIRM = JOptionPane.QUESTION_MESSAGE;
    private static final int    YES     = JOptionPane.YES_OPTION;
    

    /**
     * Show the user a message of something being invalid in a dialog
     * 
     * @param frame the frame to parent the dialog to
     * @param message the message to show in the dialog
     */
    public static void showInvalid(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }

    /**
     * Show the user a message of a user is in the database in a dialog
     * 
     * @param user the user that is in the database
     * @param frame the frame to parent the dialog to
     */
    public static void showValid(User user, JFrame frame) {
        String message = "User " + user.username;
        message += " confirmed in database!";
        JOptionPane.showMessageDialog(frame, message, TITLE, INFO);
    }

    /**
     * Show the user a message of a user already being in the database in a 
     * dialog
     * 
     * @param user the user to show is already in the database
     * @param frame the frame to parent the dialog to
     */
    public static void showAlreadyUser(User user, JFrame frame) {
        String message = "User " + user.username;
        message += " is already in the database!";        
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }

    /**
     * Show the user a message that a user has been added to the database in a 
     * dialog
     * 
     * @param user the user to show has been added to the database
     * @param frame the frame to parent the dialog to
     */
    public static void showAdded(User user, JFrame frame) {
        String message = "User " + user.username + " added to database!";
        JOptionPane.showMessageDialog(frame, message, TITLE, INFO);
    }

    /**
     * Show the user a message that nothing has been selected in a dialog
     * 
     * @param frame the frame to parent the dialog to
     */
    public static void showNotSelected(JFrame frame) {
        String message = "Please select a user to delete!";
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }
    
    /**
     * Confirms with a dialog where the user selects yes or no that they want
     * to add a user to the database
     * 
     * @param user the user to add to the database
     * @param frame the frame to parent the dialog to
     * @return the user wants to be added (yes/true) or not (no/false)
     */
    public static boolean confirmNew(User user, JFrame frame) {
        String message = "Are you sure you want to add user: " + user.username;
        message += " to the database?";
        if (JOptionPane.showConfirmDialog(frame, message, TITLE, TYPE, 
                CONFIRM) == YES) {
            return true;
        }
        return false;
    }

    /**
     * Confirms with a dialog where the user selects yes or no that the user 
     * wants to delete the selected user from the database
     * 
     * @param frame the frame to parent the dialog to
     * @param index the selected index value from the database
     * @return want to delete a user (yes/true) or not (no/false)
     */
    public static boolean confirmDelete(JFrame frame, int index) {
        User user = Database.getUser(index);           // Get user from database
        String message = "Are you sure you want to delete user: ";
        message += user.username + " from the database?";
        if (JOptionPane.showConfirmDialog(frame, message, TITLE, TYPE, 
                CONFIRM) == YES) {
            return true;
        }
        return false;
    }

    /**
     * Confirms with a dialog where the user selects yes or no to save the 
     * database to a permanent file
     * 
     * @param frame the frame to parent the dialog to
     * @return the user wants to save the database (yes/true) or not (no/false)
     */
    public static boolean confirmSave(JFrame frame) {
        String message = "Are you sure you want to save the database?";
        if (JOptionPane.showConfirmDialog(frame, message, TITLE, TYPE, 
                CONFIRM) == YES) {
            return true;
        }
        return false;
    }

}
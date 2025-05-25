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
    
    private static final String TITLE = "Database";
    
    private static final int INFO    = JOptionPane.INFORMATION_MESSAGE;
    private static final int ERROR   = JOptionPane.ERROR_MESSAGE;
    private static final int TYPE    = JOptionPane.YES_NO_OPTION;
    private static final int CONFIRM = JOptionPane.QUESTION_MESSAGE;
    private static final int YES     = JOptionPane.YES_OPTION;
    

    /**
     * 
     * @param frame
     * @param message 
     */
    public static void showInvalid(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }

    /**
     * 
     * @param user
     * @param frame 
     */
    public static void showValid(User user, JFrame frame) {
        String message = "User " + user.username;
        message += " confirmed in database!";
        JOptionPane.showMessageDialog(frame, message, TITLE, INFO);
    }

    /**
     * 
     * @param user
     * @param frame 
     */
    public static void showAlreadyUser(User user, JFrame frame) {
        String message = "User " + user.username;
        message += " is already in the database!";        
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }

    /**
     * 
     * @param user
     * @param frame 
     */
    public static void showAdded(User user, JFrame frame) {
        String message = "User " + user.username + " added to database!";
        JOptionPane.showMessageDialog(frame, message, TITLE, INFO);
    }

    /**
     * 
     * @param frame 
     */
    public static void showNotSelected(JFrame frame) {
        String message = "Please select a user to delete!";
        JOptionPane.showMessageDialog(frame, message, TITLE, ERROR);
    }
    
    /**
     * 
     * @param user
     * @param frame
     * @return 
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
     * 
     * @param frame
     * @param index
     * @return 
     */
    public static boolean confirmDelete(JFrame frame, int index) {
        User user = Database.getUser(index);
        String message = "Are you sure you want to delete user: " + user.username;
        message += " from the database?";
        if (JOptionPane.showConfirmDialog(frame, message, TITLE, TYPE, 
                CONFIRM) == YES) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @param frame
     * @return 
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
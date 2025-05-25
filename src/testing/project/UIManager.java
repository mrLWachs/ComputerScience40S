
/** Required package class namespace */
package testing.project;

/** Required API imports */
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 
/**
 * UIManager.java - description
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public abstract class UIManager 
{

    /**
     * 
     * @param frame
     * @param width
     * @param height 
     */
    public static void start(JFrame frame, int width, int height) {
        frame.setResizable(false);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * 
     * @param frame
     * @param usernameField
     * @param passwordField
     * @return 
     */
    public static boolean validate(JFrame frame, JTextField usernameField, 
            JPasswordField passwordField) {
        if (isValid(usernameField) == false) {
            Message.showInvalid(frame, "Username invalid");
            clear(usernameField, passwordField);
            return false;
        }
        else if (isValid(passwordField) == false) {
            Message.showInvalid(frame,"Password invalid");
            clear(usernameField, passwordField);
            return false;
        }
        return true;
    }
    
    /**
     * 
     * @param usernameField
     * @return 
     */
    private static boolean isValid(JTextField usernameField) {
        String username = usernameField.getText();
        if (username == null)    return false;
        if (username.equals("")) return false;
        return true;
    }

    /**
     * 
     * @param passwordPasswordField
     * @return 
     */
    private static boolean isValid(JPasswordField passwordPasswordField) {
        char[] characters = passwordPasswordField.getPassword();
        String password   = new String(characters);
        if (password == null)    return false;
        if (password.equals("")) return false;
        return true;
    }

    /**
     * 
     * @param usernameField
     * @param passwordField
     * @return 
     */
    public static User getUser(JTextField usernameField, 
            JPasswordField passwordField) {
        String username   = usernameField.getText();
        char[] characters = passwordField.getPassword();
        String password   = new String(characters);
        User   user       = new User(username, password);
        return user;
    }

    /**
     * 
     * @param usernameField
     * @param passwordField 
     */
    public static void clear(JTextField usernameField, 
            JPasswordField passwordField) {
        usernameField.setText("");
        passwordField.setText("");
        usernameField.requestFocus();
    }

    /**
     * 
     * @param frame 
     */
    public static void loadProject(JFrame frame) {
        UIProject projectUI = new UIProject();
        frame.dispose();
    }

    /**
     * 
     * @param frame 
     */
    public static void loadAllUsers(JFrame frame) {
        UIAllUsers allUsersUI = new UIAllUsers();
        frame.dispose();
    }

    /**
     * 
     * @param frame 
     */
    public static void loadLogin(JFrame frame) {
        UILogin logInUI = new UILogin();
        frame.dispose();
    }
    
}
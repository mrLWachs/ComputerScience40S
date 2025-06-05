
/** Required package class namespace */
package testing.project;

/** Required API imports */
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 
/**
 * UIManager.java - an abstract class to shift some of the UI logic for the 
 * various UIs using static methods
 *
 * @author Mr. Wachs
 * @since May 24, 2025
 */
public abstract class UIManager 
{

    /**
     * Start frame/form by setting some user look properties and then shows
     * the form to the user
     * 
     * @param frame the frame to set
     * @param width the width to make the frame
     * @param height the height to make the frame 
     */
    public static void start(JFrame frame, int width, int height) {
        frame.setResizable(false);                          // Frame not sizable
        frame.setSize(width, height);                          // Set frame size
        frame.setLocationRelativeTo(null);             // Center frame on screen
        frame.setVisible(true);                            // Show frame to user
    }

    /**
     * Checks the textbox for username and password to validate if they are 
     * proper user inputs
     * 
     * @param frame the frame for these controls
     * @param usernameField the text username field
     * @param passwordField the text password field
     * @return inputs are valid (true) or not (false)
     */
    public static boolean validate(JFrame frame, JTextField usernameField, 
            JPasswordField passwordField) {
        String username = usernameField.getText();          // Get username text
        if (username == null || username.equals("")) {     // Username not valid
            Message.showInvalid(frame, "Username invalid");      // Message user
            clear(usernameField, passwordField);            // Clear user inputs
            return false;                              // Username input invalid
        }
        char[] characters = passwordField.getPassword();    // Get passwrod text
        String password   = new String(characters);         // Convert to string
        if (password == null || password.equals("")) {     // Password not valid
            Message.showInvalid(frame,"Password invalid");       // Message user
            clear(usernameField, passwordField);            // Clear user inputs
            return false;                              // Password input invalid
        }
        return true;                                         // All valid inputs
    }
    
    /**
     * Gets the information from the user to instantiate a User object
     * 
     * @param usernameField the text username field
     * @param passwordField the text password field
     * @return a User object
     */
    public static User getUser(JTextField usernameField, 
            JPasswordField passwordField) {
        String username   = usernameField.getText();        // Get username text
        char[] characters = passwordField.getPassword();    // Get passwrod text
        String password   = new String(characters);         // Convert to string
        User   user       = new User(username, password);  // Create User object
        return user;
    }

    /**
     * Clears the user inputs on the user interface 
     * 
     * @param usernameField the text username field
     * @param passwordField the text password field 
     */
    public static void clear(JTextField usernameField, 
            JPasswordField passwordField) {
        usernameField.setText("");              // Clear out text field controls
        passwordField.setText("");
        usernameField.requestFocus();   // Put user focus on username text field
    }

    /**
     * Load the project user interface and unload the current user interface
     * 
     * @param frame the current UI frame
     */
    public static void loadProject(JFrame frame) {
        UIProject projectUI = new UIProject();
        frame.dispose();
    }

    /**
     * Load the all users user interface and unload the current user interface
     * 
     * @param frame the current UI frame 
     */
    public static void loadAllUsers(JFrame frame) {
        UIAllUsers allUsersUI = new UIAllUsers();
        frame.dispose();
    }

    /**
     * Load the login user interface and unload the current user interface
     * 
     * @param frame the current UI frame 
     */
    public static void loadLogin(JFrame frame) {
        UILogin logInUI = new UILogin();
        frame.dispose();
    }
    
}
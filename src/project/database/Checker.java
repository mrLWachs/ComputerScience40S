/** Required package class namespace */
package project.database;
 
import javax.swing.JTextField;

/**
 * Checker.java - description
 *
 * @author YOUR NAME
 * @since May 21, 2026, 9:04:16 AM
 */
public class Checker 
{

    public static boolean checkUsername(JTextField usernameTextbox) {
        String text = usernameTextbox.getText();
        if (text == null) return false;
        if (text.equals("")) return false;
        return true;
    }

    public static boolean checkPassword(JTextField passwordTextbox) {
        String text = passwordTextbox.getText();
        if (text == null) return false;
        if (text.equals("")) return false;
        if (text.length() < 8) return false;
        return true;
    }

}
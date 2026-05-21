/** Required package class namespace */
package project.database;
 
/** Required API imports */
import javax.swing.JTextField;


/**
 * Checker.java - class to check text fields to ensure they have valid inputs
 *
 * @author Mr. Wachs
 * @since May 2026
 */
public class Checker 
{

    /**
     * Wrapper method that checks the username text field to ensure it it not
     * left empty
     * 
     * @param field text field to check
     * @return field is valid (true) or not (false)
     */
    public static boolean checkUsername(JTextField field) {
        return isEmpty(field);
    }

    /**
     * Checks the password text field to ensure it it not left empty and the
     * password is at least 8 characters in length (more potential code for
     * checking could be added here...)
     * 
     * @param field text field to check
     * @return field is valid (true) or not (false)
     */
    public static boolean checkPassword(JTextField field) {
        if (!isEmpty(field)) return false;               // Check if empty first
        String text = field.getText();                    // Get text from field
        if (text.length() < 8) return false;                // Check text length
        return true;                                                    // Valid
    }
    
    /**
     * Checks the text field to ensure it it not left empty
     * 
     * @param field text field to check
     * @return field is valid (true) or not (false)
     */
    private static boolean isEmpty(JTextField field) {
        String text = field.getText();                    // Get text from field
        if (text == null) return false;                    // Null value in text
        if (text.equals("")) return false;                    // Text left empty
        return true;                                                    // Valid
    }

}
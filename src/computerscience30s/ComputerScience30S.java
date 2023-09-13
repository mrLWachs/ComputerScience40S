
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package computerscience30s;

import javax.swing.JOptionPane;


/**
 *
 * @author lawrence.wachs
 */
public class ComputerScience30S 
{

    public static void main(String[] args) {
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // This is a comment all typing after "//" until the line ends        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output
        System.out.println("Hello World");  // Comments can be on code lines
        
        // Use print without the "ln", does not add a line break at the end        
        System.out.print("I'm in");
        System.out.println(" the world");
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");             // \" makes quote
        System.out.println("Make a slash \\ ");             // \\ makes slash
        System.out.println("Make a \t tab ");               // \t makes tab
        System.out.println("Make a new line \n break ");    // \n makes new line
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Make a "fancier" output with a dialog box
        
        JOptionPane.showMessageDialog(null, "Hi");
 
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
                
        // However, these OPTIONS (not needed, but cool) for other
        // dialog output message boxes below...
        
        // Code could span multiple lines until it reaches a semi colon ";"
        // The light red line on the far right -------------------------------->
        // can be thought of as a "barrier" and you should try not to code too
        // much past this line
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs...
        
        // The simpliest version is the one you will need to know:
        
        JOptionPane.showInputDialog("Enter Something");
        
        // There is a little more to using this input dialog that we will 
        // cover after learning variables
        
        // Some other optional input dialogs...
        
        JOptionPane.showInputDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 3",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 4",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 5",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        
        
        
    }
    
}

// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5)  Click the green triangle on the top toolbar to run code
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"

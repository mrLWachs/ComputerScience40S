/** required package class namespace - the line below is put in
 * automatically, and connects file to the project */
package computerscience30s;

import javax.swing.JOptionPane;

/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course
 *
 * @author Mr. Wachs
 * @since 09-Feb-2019
 * @instructor Mr. Wachs
 */
public class ComputerScience30S {   // Curly brackets DO NOT remove

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("Hello World");
        
        System.out.println("In the world");
        
        System.out.println("Good-bye world");
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // special characters
        System.out.println("Quote \" ");
        System.out.println("Make a tab \t appear");
        System.out.println("Slash \\ ");
        System.out.println("Line \n break");
        
        // characters \" and \t and \\ and \n are escape sequences
        
        // TIP: if your want intellisense to appear at any time press:
        // "CTRL" + "SPACE"        
        // TIP: "null" is a placeholder for code you don't actually want
        
        // Create "fancy" ouptut using a dialog
        JOptionPane.showMessageDialog(null, "Hi");
        
        // optional versions of this output dialog:
        
        JOptionPane.showMessageDialog(
                null, 
                "Information dialog icon is i", 
                "Information Title", 
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(
                null, 
                "Question dialog icon is ?", 
                "Question Title", 
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning dialog icon is !", 
                "Warning Title", 
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain dialog has no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE);
        
        // dialogs for inputs
        
        // simple one first
        JOptionPane.showInputDialog("Enter something");
        
        // variations on the input dialog
        
        JOptionPane.showInputDialog(
                null, 
                "Information dialog icon is i",
                "Information Title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Question dialog icon is ?", 
                "Question Title", 
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Warning dialog icon is !", 
                "Warning Title", 
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Plain dialog has no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE);
        
        // more optional examples of confirm dialog
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm dialog");
        
        
        
        
        
        
        
        
        
        
        
    }

}

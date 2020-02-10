
// anything following the 2 slashes is a comment, until the end of the line

/*  
    This is for multiple line comments, as it covers as many lines as you want
    starting with "slash star" until it sees the closing "star slash"
*/

// NETBEANS TIPS:
// ==============
// (1) Hold Alt + scroll mouse to zoom in and out on code
// (2) Double click the top of a tab of code to make bigger or smaller
// (3) Type in lowercase "sout" and hit TAB to write System.out....
// (4) Words in capital letters and in blue are IMPORTANT code words, the words
//     in captial letters are powerful, they are a "class"
// (5) Intellisense (autocomplete) can appear if you press "CTRL + SPACE"
// (6) The word "null" means "nothing" and can act as a placeholder for code 
//     you don't actually want
// (7) To "comment out" some code, select the code (with your mouse) and 
//     click on the two buttons under the code tab (at the end)


/** 
 * required package class namespace - the line below is put in
 * automatically, and connects file to the project 
 */
package computerscience30s;

/** 
 * Required imports for the project - the lines below are added when your
  * code needs to connect to another library (API) of code 
  */
import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course
 *
 * @author Mr. Wachs
 * @since Feb. 5, 2020, 1:50:54 p.m.
 */
public class ComputerScience30S {       // Curly brackets DO NOT remove

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        ///////////////////////////////////////////////////////////////////////
//        // JAVA BASIC INPUT AND OUTPUTS
//        ///////////////////////////////////////////////////////////////////////
//                
//        // Basic output
//        System.out.print("Hello World...");
//        
//        // If you use println, it adds a line break at the end
//        System.out.println("I'm in the world");
//        
//        // Additional output tips.... (these are "special" characters):        
//        System.out.println("Quote \" ");
//        System.out.println("Make a \t tab");
//        System.out.println("Slash \\ ");
//        System.out.println("New \n Line");
//        
//        // Make a "dialog" box appear        
//        JOptionPane.showMessageDialog(null, "Hi");
//        
//        // Optional (does not "need" to be in assignments) dialog boxes:
//        JOptionPane.showMessageDialog(null,
//                "Information dialog icon is i",
//                "Information title",
//                JOptionPane.INFORMATION_MESSAGE);
//        // You can hit "enter" in some lines of code at certain places to 
//        // drop the code to the next line and save having too long of a line
//        
//        JOptionPane.showMessageDialog(null,
//                "Question dialog icon is ?",
//                "Question title",
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null,
//                "Warning dialog icon is !",
//                "Warning title",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null,
//                "Plain dialog icon is !",
//                "Plain title",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // dialogs for inputs
//        
//        // the simpliest version is the one you have to use        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // some optional versions of input dialogs
//        JOptionPane.showInputDialog(null,
//                "Information dialog icon is i",
//                "Information title",
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Question dialog icon is ?",
//                "Question title",
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Warning dialog icon is !",
//                "Warning title",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Plain dialog icon is !",
//                "Plain title",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // NOTE: these examples above are NOT being used 
//        // properly if used in a assignment, correct way
//        // comes up later in this code...
//        
//        // an optional type of dialog (may not be needed)
//        
//        JOptionPane.showConfirmDialog(null, "Confirm");
//        
//        // more different versions...
//        
//        JOptionPane.showConfirmDialog(null,
//                "Example 1",
//                "Information",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Example 2",
//                "Question",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Example 3",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Example 4",
//                "Plain",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
//        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // the simpliest of variable types
        
        boolean a = true;
        // type name = value ;
        // how to create "declare" a variable 
        
        int b = 0;
        
        double c = 0.0;
        
        // variables can change (vary)
        a = false;
        b = 1;
        c = 1.2;
        
        // variable always goes on the LHS (left hand side) of the equals 
        // sign (=) and the value going into the variable always goes on the 
        // RHS (right hand side)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        System.out.println("d = " + d);
        
        // The boolean, int, double and char are all
        // simple (primitive) data type, now a 
        // complex data type....
        
        String e = "banana";
        System.out.println("e = " + e);
        
        // manipulate (change) the varaibles...
        
        int x = 10;        
        System.out.println("x = " + x); // 10
        x = 20;
        System.out.println("x = " + x); // 20
        int y = x + 10;
        System.out.println("y = " + y); // 30
        
        // optional shorthand
        
        y++;    // means y = y + 1
        y--;    // means y = y - 1
        
        // even more optional 
        
        y += 10;  // means y = y + 10;
        y -= 10;  // means y = y - 10;
        y *= 10;  // means y = y * 10;
        y /= 10;  // means y = y / 10;
        
        System.out.println("y = " + y);
        
        // modulus (mod) gives you the remainder
        // of a division, java uses % symbol
        
        x = 28;
        y = x / 5;
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Good-bye World!");
    }

}

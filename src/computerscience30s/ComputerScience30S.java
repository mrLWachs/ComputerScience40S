
/** required package class namespace */
package computerscience30s;

/** required imports */
import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since Feb 20, 2018 
 * @instructor Mr. Wachs
 */
public class ComputerScience30S
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        ////////////////////////////////////////////////////////////
//        // JAVA BASICS:
//        ////////////////////////////////////////////////////////////
//        
//        // This is a comment, anything after // is a comment
//        
//        /* 
//            This is another way to comment, but it opens a
//            a multiple line comment that continues until a 
//            star and a slash is reached
//        */        
//        
//        System.out.print("Hello World..."); // simple output
//        
//        System.out.println("Goodbye world");
//        // sout and tab autocompleted this code
//        
//        // examples of "special" output characters:        
//        System.out.println("Make a quote, \" is a quote");
//        System.out.println("Make a tab, \t is a tab");
//        System.out.println("Make a slash, \\ is a slash");
//        System.out.println("Make a new line, \n is newline");
//        
//        // fancy dialog boxes for outputs ........ 
//        
//        // message dialog (shows user a message)
//        
//        JOptionPane.showMessageDialog(null, "Hi there!");
//        
//        // variations on the message dialog (not needed for assignments)
//        
//        JOptionPane.showMessageDialog(null,
//                "Message 2, change to a i icon",
//                "Information Dialog",
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null,
//                "Message 3, change to a ? icon",
//                "Question Dialog",
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null,
//                "Message 4, change to a ! icon",
//                "Warning Dialog",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null,
//                "Message 5, change to no icon",
//                "Plain Dialog",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // input dialog box (used to get user input information)
//        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // variations on input dialog (not needed for assignments)
//        
//        JOptionPane.showInputDialog(null,
//                "Input dialog 2, change to a i icon",
//                "Information Input dialog",
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Input dialog 3, change to a ? icon",
//                "Question Input dialog",
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Input dialog 4, change to a ! icon",
//                "Warning Input dialog",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showInputDialog(null,
//                "Input dialog 5, change to no icon",
//                "Plain Input dialog",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // input dialog where you set the text
//        JOptionPane.showInputDialog(null,
//                "Input dialog 6, setting the text area",
//                "Set the text area");
//        
//        // confirm dialog (you may never need this)
//        
//        JOptionPane.showConfirmDialog(null, "Confirm dialog");
//        
//        // variations on confirm dialog (not needed for assignments)
//        
//        JOptionPane.showConfirmDialog(null,
//                "Confirm 2, change to a i icon",
//                "Information Confirm dialog",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Confirm 3, change to a ? icon",
//                "Question Confirm dialog",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Confirm 4, change to a ! icon",
//                "Warning Confirm dialog",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(null,
//                "Confirm 5, change to no icon",
//                "Plain Confirm dialog",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
        
        ////////////////////////////////////////////////////////////
        // VARIABLES:
        ////////////////////////////////////////////////////////////
        
        // create a simple variable
        boolean a = true;       // declares the variable
        a = false;              // change (vary) the variable        
        // booleans are just true and false
        
        // numbers:
        int    b = 0;           // whole #s, no decimals
        double c = 0.0;         // allow for decimals
        
        // character:
        char d = '@';
                
        // more complex type for words...
        String e = "zebra";     // multiple characters (including numbers)
        
        // output the variables:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        
        
        
        
        
        
    }
    
}

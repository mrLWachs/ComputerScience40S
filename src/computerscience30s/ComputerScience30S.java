
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
        
        // simpliest variable
        boolean a = true;           // declares the variable
        a = false;                  // changes (varies) the variable
        // booleans store only true or false
        
        // number data types:
        int    b = 0;               // whole #s, no decimals
        double c = 0.0;             // allows for decimals
                
        // character data type:
        char d = '$';
        
        // more complex data type:
        String e = "words";
        
        // output the variables:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        // manipulate (change) variables
        int x = 10;
        System.out.println("x = " + x);
        x = 20;
        System.out.println("x = " + x);
        int y = x + 10;
        System.out.println("y = " + y);
        y = y + 10;
        System.out.println("y = " + y);
        y++;
        // shorthand for adding 1 to variable
        System.out.println("y = " + y);
        y--;
        // shorthand for subtracting 1 from variable
        System.out.println("y = " + y);
        // y++ or y-- can still be y = y + 1, etc.
        
        // optional shorthand
        y += 10;        // means y = y + 10
        y -= 20;        // means y = y - 20
        y *= 2;         // means y = y * 2
        y /= 10;        // means y = y / 10;
        System.out.println("y = " + y);
        
        // modulus (gets the remainder) uses %
        x = 28;
        y = x % 5;
        System.out.println("y = " + y);
        
        // constants (variables that don't change)
        // constants are typed in ALL CAPITALS
        final double  PI           = 3.141592635;
        final int     PROBLEMS     = 99;
        final char    YES          = 'y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI + " and " + 
                           PROBLEMS + " and " +
                           YES + " and " +
                           FOUND + " and " +
                           TEACHER_NAME);
        
        // converting between variable data types
        
        
        
        
    }
    
}

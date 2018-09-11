
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
        
        ////////////////////////////////////////////////////////////
        // JAVA BASICS:
        ////////////////////////////////////////////////////////////
        
        // This is a comment, anything after // is a comment
        
        /* 
            This is another way to comment, but it opens a
            a multiple line comment that continues until a 
            star and a slash is reached
        */        
        
        System.out.print("Hello World..."); // simple output
        
        System.out.println("Goodbye world");
        // sout and tab autocompleted this code
        
        // examples of "special" output characters:        
        System.out.println("Make a quote, \" is a quote");
        System.out.println("Make a tab, \t is a tab");
        System.out.println("Make a slash, \\ is a slash");
        System.out.println("Make a new line, \n is newline");
        
        // fancy dialog boxes for outputs        
        JOptionPane.showMessageDialog(null, "Hi there!");
        
        // some variations (not need these for any assignments)
        
        JOptionPane.showMessageDialog(null,
                "Message 2, with a i icon",
                "Information Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 3, with a ? icon",
                "Question Dialog",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 4, with a ! icon",
                "Warning Dialog",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 5, with no icon",
                "Plain Dialog",
                JOptionPane.PLAIN_MESSAGE);
        
        // basic dialog for getting user inputs
        JOptionPane.showInputDialog("enter something");
        
        // some variations on the input (not needed for assignents)
        
        JOptionPane.showInputDialog(null,
                "Input Dialog 2",
                "Information Input dialog",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input Dialog 3",
                "Question Input dialog",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input Dialog 4",
                "Warning Input dialog",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input Dialog 5",
                "Plain Input dialog",
                JOptionPane.PLAIN_MESSAGE);
        
        // input option with set text        
        JOptionPane.showInputDialog(null,
                "Input dialog 6",
                "The starting text set in the textbox");
        
        // confirm dialog box (may not need this)
        
        JOptionPane.showConfirmDialog(null, "Confirm dialog");
        
        
        
    }
    
}

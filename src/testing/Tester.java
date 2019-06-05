
/** required package class namespace */
package testing;

/** required imports */
import game.UserInterface;
import javax.swing.JOptionPane;

/**
 * Tester.java - tests the concepts learned in all the units.
 *
 * @author Mr. Wachs 
 * @since 3-May-2019 
 */
public class Tester 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Tester() {
        System.out.println("\nComputer Science 40S Testing begins...\n");     
        final String[] OPTIONS = {
            "See examples of learning recursion in Java (unit 1)",
            "See examples of learning advanced classes in Java (unit 2)",
            "See examples of learning collections in Java (unit 3)",
            "See optional example of gaming in Java (optional unit)"
        };
        String choice = JOptionPane.showInputDialog(null, 
                "Select the Mr. Wachs unit to view below:", 
                "Computer Science 40S", JOptionPane.PLAIN_MESSAGE, null, 
                OPTIONS, OPTIONS[0]).toString();
        if      (choice.equals(OPTIONS[0])) new RecursionTest();  
        else if (choice.equals(OPTIONS[1])) new AdvancedClassesTest();  
        else if (choice.equals(OPTIONS[2])) new CollectionsTest();  
        else if (choice.equals(OPTIONS[3])) new UserInterface();  
        System.out.println("\nComputer Science 40S Testing complete!\n");
    }
    
}

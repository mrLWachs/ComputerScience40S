/** Required package class namespace */
package testing;

/** Required API imports */
import javax.swing.JOptionPane;


/*
 * Tester - tests the concepts learned in all the units.
 *
 * @author Mr. Wachs 
 * @since Feb 25, 2025
*/
public class Tester
{

    /**
     * Default constructor, sets class properties
     */
    public Tester() {
        System.out.println("Start testing...");
        
        RecursionTest unit1 = new RecursionTest();
        // Later we will add code here for unit 2 and 3...
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        CollectionsTest     unit3 = new CollectionsTest();
        
        // And a "extra" testing class (optional)...
        int choice = JOptionPane.showConfirmDialog(null, 
                "Do you wish to see more CS40S testing content and an "
                + "example project using CS40S content?", 
                "Computer Scinece 40S", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            ExtrasTest extras = new ExtrasTest();
        }
        
        System.out.println("Completed testing!");
    }
    
}
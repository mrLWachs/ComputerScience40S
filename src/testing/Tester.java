
/** Required package class namespace */
package testing;

/** Required API imports */
import testing.extras.ExtrasTest;

 
/**
 * Tester.java - tests the concepts learned in all the units.
 *
 * @author Mr. Wachs 
 * @since September 18, 2024
 */
public class Tester 
{

    /**
     * Default constructor, sets class properties
     */
    public Tester() {
        System.out.println("Testing has begun...");
        RecursionTest unit1 = new RecursionTest();
        // Later we will add code here for unit 2 and 3...        
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        CollectionsTest     unit3 = new CollectionsTest(); 
        // A bonus unit (not required)...
        ExtrasTest          extra = new ExtrasTest();
        System.out.println("Testing complete!");
    }
    
}

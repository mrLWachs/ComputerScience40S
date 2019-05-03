
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.AdvancedClassesTest;
import testing.collections.CollectionsTest;


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
        System.out.println("\nTesting begins...\n");        
        RecursionTest       unit1 = new RecursionTest();
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        CollectionsTest     unit3 = new CollectionsTest();        
        System.out.println("\nTesting complete!\n");
    }
    
}

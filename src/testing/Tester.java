
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.AdvancedClassesTest;

/**
 * Tester.java - tests the concepts learned in all the units.
 *
 * @author Mr. Wachs 
 * @since Sep 20, 2017 
 * @instructor Mr. Wachs
 */
public class Tester 
{
    
    /** 
     * Default constructor for the class 
     */
    public Tester() {
        System.out.println("\nComputer Science 40S unit testing started...\n");
        RecursionTest       unit1 = new RecursionTest(); 
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        CollectionsTest     unit3 = new CollectionsTest();
        System.out.println("\nComputer Science 40S unit testing scomplete!\n");
    }  

}

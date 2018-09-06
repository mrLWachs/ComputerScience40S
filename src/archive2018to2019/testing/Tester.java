
/** required package class namespace */
package archive2018to2019.testing;

/** required imports */
import archive2018to2019.advancedclasses.AdvancedClassesTest;

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

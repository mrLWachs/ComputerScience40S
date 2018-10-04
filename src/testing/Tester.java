
/** required package class namespace */
package testing;

import testing.advancedclasses.AdvancedClassesTest;


/**
 * Tester.java - the unit testing class that drives the various unit tests
 *
 * @author Mr. Wachs 
 * @since 24-Sep-2018 
 */
public class Tester 
{

    /**
     * Default class constructor, runs on instantiation
     */
    public Tester() {
        System.out.println("Testing begins.....");        
//        RecursionTest       unit1 = new RecursionTest();
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        System.out.println("Testing complete!");
    }
    
}
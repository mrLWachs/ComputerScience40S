
/** required package class namespace */
package testing;


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
        RecursionTest unit1 = new RecursionTest();        
        System.out.println("Testing complete!");
    }
    
}

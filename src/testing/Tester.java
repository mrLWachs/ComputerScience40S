
/** Required package class namespace */
package testing;

 
/**
 * Tester.java - tests the concepts learned in all the units.
 *
 * @author Mr. Wachs
 * @since September 27, 2021
 */
public class Tester 
{

    /**
     * Default constructor, sets class properties
     */
    public Tester() {
        System.out.println("\nTesting begins...\n");          
        RecursionTest       unit1 = new RecursionTest();
        AdvancedClassesTest unit2 = new AdvancedClassesTest();        
        System.out.println("\nTesting complete!\n");
    }
        
}
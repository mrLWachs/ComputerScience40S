/** Required package class namespace */
package testing;


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
        
        System.out.println("Completed testing!");
    }
    
    

}
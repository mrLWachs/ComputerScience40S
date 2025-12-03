
/** Required package class namespace */
package testing;

import static tools.Format.RED;
import static tools.Format.RESET;

/** Required code library (API) imports */


/*
 * Tester - tests the concepts learned in all the units.
 * 
 * @author Mr. Wachs
 * @since Sep 23, 2025
*/
public class Tester
{
    
    /**
     * Default constructor, sets class properties
     */
    public Tester() {
        System.out.println(RED + "Start Testing..." + RESET);
        RecursionTest unit1 = new RecursionTest();
        // Later we will add code here for unit 2 and 3...        
        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        System.out.println(RED + "Completed Testing!" + RESET);
    }

}

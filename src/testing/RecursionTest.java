
/** Required package class namespace */
package testing;

/** Required imports */
import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since March 4, 2021
 */
public class RecursionTest 
{

    /**
     * Default constructor, sets class properties
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // 1) Typical case: the user does what they are told
            // 2) Edge cases: the user pushes the "edges"
            // 3) Beyond the edges: bad users, tying to break things
            
        System.out.println("Recursive factorial............................."); 
        
        int number = 5;
        int answer = Calculator.factorial(number);
        System.out.println(number + "\t factorial = \t" + answer);       
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}

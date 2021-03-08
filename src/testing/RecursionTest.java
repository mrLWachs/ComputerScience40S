
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
        
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;        
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive Powers.................................");
        
        final int MIN_POWER = -10;
        final int MAX_POWER = 10;                
        for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
            for (int base = MIN_POWER; base <= MAX_POWER; base++) {                
                double answer = Calculator.power(base,exponent);                
                System.out.println(base + " to the exponent " +
                                   exponent + " = " + answer);                
            }
        }
                
        System.out.println("\nRecursion test complete!\n");
    }
    
}

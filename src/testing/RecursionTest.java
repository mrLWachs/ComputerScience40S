
/** Required package class namespace */
package testing;

import tools.Calculator;


/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since September 27, 2021
 */
public class RecursionTest 
{

    /**
     * Default constructor, sets class properties
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // 1) Typical case: the user does what they are told to do
            // 2) Edge cases: the user pushes the "edges"
            // 3) Beyond the edges: bad users, tying to break things        
        
        System.out.println("Recursive factorial..............................");
        
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;
                
        // Loop through a series of tests (going through the "edge cases")
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive Powers.................................");
        
        final int MIN_POWER = -10;
        final int MAX_POWER =  10;
        
        // Testing all the exponents (edges)
        for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
            // Nested loop increasing the bases (to the edges)
            for (int base = MIN_POWER; base <= MAX_POWER; base++) {
                // Calculate (test this case) and display the test results
                double answer = Calculator.power(base, exponent);
                System.out.println(base     + " to the exponent " +
                                   exponent + " = "               + answer);                
            }
        }
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}
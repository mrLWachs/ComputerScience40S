
/** Required package class namespace */
package testing;

import tools.Calculator;

 
/** 
 * RecursionTest.java - tests the concepts learned in this unit. Recursion is 
 * the process of something recurring, and is defined as a method that calls 
 * itself. Recursive methods may have 1 or more than 1 base cases, and 1 or 
 * more than 1 recursive cases, but the method must have a minimum of 1 base 
 * case and 1 recursive case. Recursion is a programming tool that can often 
 * be used as an alternative to looping, or as a simpler way to solve 
 * specific problems. Recursion is not always the most efficient solution as 
 * it often consumes more memory than an iterative solution. Often recursion 
 * is ‘hidden’ by using a public method call that then calls a private 
 * recursive method to implement the recursion that eventually returns to the 
 * original method that then returns the result (this is known as a “wrapper” 
 * method).
 *
 * @author Mr. Wachs 
 * @since September, 2022
 */
public class RecursionTest 
{

    /**
     * Constructor method
     */
    public RecursionTest() {        
        System.out.println("\nRecursion test starting...\n");
        
        // When testing, think of three scenarios:
            // 1) Typical case ("user"): do what they are told to do
            // 2) Edge cases ("user"): they push the "edges"
            // 3) Beyond the edges: "bad" users, trying to break things
            
        System.out.println("Recursive factorials............................");
            
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;
                
        // Loop through a series of tests (going through the "edge cases")
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
            
        System.out.println("Recursive powers................................");
        
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
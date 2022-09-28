
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
            
        final int MIN = -1;
        final int MAX = 50;
        
        // Loop through a series of tests (going through all the "edge" cases)
        for (int number = MIN; number <= MAX; number++) {
            long answer = Calculator.factorial(number);
            System.out.println(number + " factorial = " + answer);
        }
            
        System.out.println("Recursive powers................................");
        
        final int MIN_POWER = 0;
        final int MAX_POWER = 10;
        
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                long answer = Calculator.power(base,exponent);
                System.out.println(base + " to the exponent " + exponent +
                                   " = " + answer);
            }
        }
        
        System.out.println("\nRecursion test complete!\n");
    }    
    
}
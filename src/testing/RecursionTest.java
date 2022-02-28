
/** Required package class namespace */
package testing;

/** Required API imports */
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
 * @since Feb. 9, 2022, 8:01:03 a.m. 
 */
public class RecursionTest 
{

    /**
     * Constructor method
     */
    public RecursionTest() {        
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // (1) Typical case(s) - typical user
            // (2) Edge case(s) - "push the edge"
            // (3) Beyond the edges - "bad" users
        
        System.out.println("Recursive factorial.............................");
        // Constants to set the "edges"
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;
        
        // Travel ("traverse") through all the edges
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            int  number = i;
            long answer = Calculator.factorial(number);
            System.out.println("Number " + number + " is factorial " + answer);
        }
        
        System.out.println("Recursive powers................................"); 
        final int MIN_POWER = 0;
        final int MAX_POWER = 15;
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                long answer = Calculator.power(base, exponent);
                System.out.println("Base "             + base + 
                                   " to the exponent " + exponent +
                                   " = "               + answer);
            }
        }
                
        System.out.println("\nRecursion test complete!\n");
    }    
    
}
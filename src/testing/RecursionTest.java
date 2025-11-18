
/** Required package class namespace */
package testing;

/** Required code library (API) imports */
import tools.Calculator;


/*
 * RecursionTest - tests the concepts learned in this unit. Recursion is 
 * the process of something recurring, and is defined as a method that calls 
 * itself. Recursive methods may have 1 or more than 1 base cases, and 1 or 
 * more than 1 recursive cases, but the method must have a minimum of 1 base 
 * case and 1 recursive case. Recursion is a programming tool that can often 
 * be used as an alternative to looping, or as a simpler way to solve 
 * specific problems. Recursion is not always the most efficient solution as 
 * it often consumes more memory than an iterative solution. Often recursion 
 * is 'hidden' by using a public method call that then calls a private 
 * recursive method to implement the recursion that eventually returns to the 
 * original method that then returns the result (this is known as a "wrapper"
 * method).
 * 
 * @author Mr. Wachs
 * @since Sep 23, 2025
*/
public class RecursionTest
{
    
    /**
     * Constructor method - constructor methods with no parameters (like this 
     * one) - empty round brackets it is called the "default" constructor
     */
    public RecursionTest() {
        System.out.println("Let's start learning Recursion");
        
        // When testing, think of three scenarios:
            // (1) Typical case ("user"): do what they are told to do
            // (2) Edge cases (more than one): they "push" the edge
            // (3) Beyond the edge: "bad" users, trying to break things
            
        System.out.println("Recursive factorials............................");
        
        // Meaning we will write a METHOD to calculate (using the Calculator 
        // class) the factorial of a number recursively (means the method
        // will call itself)
        
        final long LOWER_EDGE = -1;
        final long UPPER_EDGE = 20;
            
        // Loop through a series of tests (going through the "edge cases")
        for (long i = LOWER_EDGE; i <= UPPER_EDGE; i++) {
            long number = i;
            long answer = Calculator.factorial(number);
            System.out.println(number + " factorial = " + answer);
        }
        
        System.out.println("Recursive powers................................");    
           
        // Set the testing "edges"
        final long MIN_POWER = -5;
        final long MAX_POWER = 20;
        
        // Testing all the exponents (edges)
        for (long exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
            // Nested loop increasing the bases (to the edges)
            for (long base = MIN_POWER; base <= MAX_POWER; base++) {
                // Calculate (test this case) and display the test results
                double answer = Calculator.power(base, exponent);
                System.out.println("Base " + base + " ^ Exponent " + exponent +
                                   " = " + answer);
            }
        }
            
        System.out.println("Completed learning Recursion");
    }

}

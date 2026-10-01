/** Required package class namespace */
package testing;

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
 * @since Sep 29, 2026
*/
public class RecursionTest
{
    
    public RecursionTest() {
        System.out.println("Start learning Recursion...");
        
        // When testing, think of three scenarios (phase):
            // Phase 1: Typical case ("user"): do what they are told to do
            // Phase 2: Edge cases (more than one): they "push" the edge
            // Phase 3: Beyond the edge: "bad" users, trying to break things
            
        System.out.println("Recursive factorials.............................");
            
        // Meaning we will write a METHOD to calculate (using the Calculator 
        // class) the factorial of a number recursively (means the method
        // will call itself)
        
        final int LOWER_EDGE = -1;
        final int UPPER_EDGE = 20;
        
        // Loop through a series of tests (going through the "edge cases")
        for (int i = LOWER_EDGE; i <= UPPER_EDGE; i++) {
            int number = i;
            long answer = Calculator.factorial(number);
            System.out.println(number + " is factorial " + answer);
        }
        
        System.out.println("Recursive powers................................");   
        
        
        int    base     = 5;
        int    exponent = 3;
        double answer   = Calculator.power(base, exponent);
        System.out.println(base + " to exponent " + exponent + " = " + answer);
            
            
            
        
        System.out.println("Completed learning Recursion!");
    }

}
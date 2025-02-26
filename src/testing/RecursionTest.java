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
 * is ‘hidden’ by using a public method call that then calls a private 
 * recursive method to implement the recursion that eventually returns to the 
 * original method that then returns the result (this is known as a “wrapper” 
 * method).
 *
 * @author Mr. Wachs
 * @since Feb 25, 2025
*/
public class RecursionTest
{

    /**
     * Constructor method - constructor methods with no parameters (like this 
     * one) - empty round brackets it is called the "default" constructor
     */
    public RecursionTest() {
        System.out.println("Start learning recursion...");
        
        
        int number = 5;
        int answer = Calculator.factorial(number);        
        System.out.println(number + " factorial = " + answer);
        
        
        // When testing, think of three scenarios:
            // (1) Typical case ("user"): do what they are told to do
            // (2) Edge cases (more than one): they "push" the edge
            // (3) Beyond the edge: "bad" users, trying to break things
        
            
            
            
        System.out.println("Completed learning recursion!");
    }

}
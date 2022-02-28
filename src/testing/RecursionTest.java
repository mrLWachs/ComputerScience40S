
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
        int number = 5;        
        int answer = Calculator.factorial(number);        
        System.out.println("Number " + number + " factorial = " + answer);                
    }    
    
}
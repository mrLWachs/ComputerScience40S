
/** Required package class namespace */
package testing;

import tools.Calculator;

 
/**
 * RecursionTest.java - description
 *
 * @author Mr. Wachs
 * @since Sep 26, 2023, 11:52:29 a.m.
 */
public class RecursionTest 
{

    /**
     * Constructor method - constructor methods with no parameters (like this 
     * one) - empty round brackets it is called the "default" constructor
     */
    public RecursionTest() {
        System.out.println("Recursion Text Started...");
        
        
        int answer = Calculator.factorial(5);
        System.out.println("5 factorial = " + answer);
        
        
        System.out.println("Recursion Text Complete!");
    }
   
}

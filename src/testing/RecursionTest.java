
/** Required package class namespace */
package testing;

import tools.Calculator;


/** 
 * RecursionTest.java - tests the concepts learned in unit 1. 
 * 
 * @author Mr. Wachs 
 * @since February 2023
 */
public class RecursionTest 
{

    /**
     * Constructor method - constructor methods with no parameters (like this 
     * one) - empty round brackets it is called the "default" constructor
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // (1) Typical case ("user"): do what they are told to do
            // (2) Edge cases (more than one): they "push" the edge
            // (3) Beyond the edges: "bad" users, trying to break things
        
        System.out.println("Recursive factorials............................");
        
        
        int answer = Calculator.factorial(5);
        System.out.println("5 factorial = " + answer);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nRecursion complete!\n");
    }

}









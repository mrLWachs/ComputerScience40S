
/** Required package class namespace */
package testing;

import tools.Calculator;


/*
 * RecursionTest - tests the concepts learned in this unit.
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
        
        final long LOWER_EDGE = -1;
        final long UPPER_EDGE = 20;
            
        for (long i = LOWER_EDGE; i <= UPPER_EDGE; i++) {
            long number = i;
            long answer = Calculator.factorial(number);
            System.out.println(number + " factorial = " + answer);
        }
        
        

        
        
        
        
        
        
        
        
        
            
            
            
        System.out.println("Completed learing Recursion");
    }

}

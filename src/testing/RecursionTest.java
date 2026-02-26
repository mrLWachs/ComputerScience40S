/** Required package class namespace */
package testing;

/** Required API imports */
import tools.Calculator;


/*
 * RecursionTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since Feb 23, 2026
*/
public class RecursionTest
{

    /**
     * Constructor method - constructor methods with no parameters (like this 
     * one) - empty round brackets it is called the "default" constructor
     */
    public RecursionTest() {
        System.out.println("Start Recursion...");
        
        System.out.println("Recursive factorials............................");
        
        // Meaning we will write a METHOD to calculate (using the Calculator 
        // class) the factorial of a number recursively (means the method
        // will call itself)
        
        final int LOWER_EDGE = 0;
        final int UPPER_EDGE = 20;
        
        // Loop through a series of tests (going through the "edge cases")  
        for (int i = LOWER_EDGE; i <= UPPER_EDGE; i++) {
            int number = i;
            long answer = Calculator.factorial(number);
            System.out.println(number + " factorial = " + answer);
        }
        
        
        
        
        
        
        System.out.println("Recursion complete!");
    }
    

}
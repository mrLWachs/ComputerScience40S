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
        
        int number = 5;
        long answer = Calculator.factorial(number);
        System.out.println(number + " factorial = " + answer);
        
        
        System.out.println("Recursion complete!");
    }
    

}
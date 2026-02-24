
/** Required package class namespace */
package testing;

/** Required API imports */
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
        
        // This Java file ends in "Test" as will the other Java files for 
        // upcoming units - this hints at a higher level Computer Science 
        // topic that we are not studying in detail (and won't be assessed on)
        // but is a topic if you are moving forward in Computer Science studies.
        
        // "Unit Testing" is a Computer Science topic and is defined as:
        // Unit testing is the process of isolating and verifying the smallest 
        // testable parts of an application, typically individual functions or 
        // methods - to ensure each piece of logic behaves exactly as intended.
        // By identifying bugs at this level early in development, it serves 
        // as a safety net that simplifies debugging and provides the 
        // confidence needed to refactor code without introducing regressions.
        // see: https://en.wikipedia.org/wiki/Unit_testing
        
        // When testing, think of three scenarios:
            // (1) Typical case ("user"): do what they are told to do
            // (2) Edge cases (more than one): they "push" the edge
            // (3) Beyond the edge: "bad" users, trying to break things
        
        System.out.println("Recursive factorials............................");
        
        // Meaning we will write a METHOD to calculate (using the Calculator 
        // class) the factorial of a number recursively (means the method
        // will call itself)
        
        final int LOWER_EDGE = -1;
        final int UPPER_EDGE = 20;
        
        // Loop through a series of tests (going through the "edge cases")     
        for (int i = LOWER_EDGE; i <= UPPER_EDGE; i++) {
            int number = i;
            long answer = Calculator.factorial(number);
            System.out.println(number + " factorial = " + answer);
        }
        
        
        
        System.out.println("Completed Recursion!");
    }

}
/** Required package class namespace */
package testing;

import tools.Calculator;


/*
 * RecursionTest - tests the concepts learned in this unit. 
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
        
        
            
            
            
            
        
        System.out.println("Completed learning Recursion!");
    }

}
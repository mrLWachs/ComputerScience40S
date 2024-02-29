
/** Required package class namespace */
package testing;

/** Required imports */
import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since February 28, 2024
 */
public class RecursionTest 
{

    /**
     * Default constructor, sets class properties
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
                
        // When testing, think of three scenarios:
            // (1) Typical case ("user"): do what they are told to do
            // (2) Edge cases (more than one): they "push" the edge
            // (3) Beyond the edge: "bad" users, trying to break things
            
        for (int i = 1; i <= 5; i++) {
            int answer = Calculator.factorial(i);
            System.out.println(i + " factorial = " + answer);
        }
    
            
            
        
        
        
        
        
        
        
        
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}

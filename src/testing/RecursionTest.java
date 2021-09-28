
/** Required package class namespace */
package testing;

import tools.Calculator;


/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since September 27, 2021
 */
public class RecursionTest 
{

    /**
     * Default constructor, sets class properties
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        
        int answer = Calculator.factorial(5);
        
        System.out.println("5 factorial = " + answer);
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}
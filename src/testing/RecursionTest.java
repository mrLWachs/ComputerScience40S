
/** required package class namespace */
package testing;

import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Sep. 18, 2019, 11:35:20 a.m.
 */
public class RecursionTest 
{
    
    /** 
     * Default constructor for the class 
     */
    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");    
        
        // edge testing
        System.out.println("Recursive factorial...........................");
        final int MIN_FACORIAL = -1;
        final int MAX_FACORIAL = 20;
        for (int i = MIN_FACORIAL; i <= MAX_FACORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive powers...........................");
        
        final int MIN_POWER = 0;
        final int MAX_POWER = 10;
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                double answer = Calculator.power(base,exponent);        
                System.out.println(base + " to the exponent " +
                                   exponent + " = " + answer);
            }
        }
                
        System.out.println("\nRecursion complete!\n");
    }

}

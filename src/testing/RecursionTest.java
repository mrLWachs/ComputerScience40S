/** required package class namespace */
package testing;

/** required imports */
import tools.Calculator;

/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since 20-Feb-2019 
 */
public class RecursionTest 
{
    
    /** 
     * Default constructor for the class 
     */
    public RecursionTest() {
        System.out.println("\nRecursion test starting...\n");
                
        // edge testing
        System.out.println("Recursive factorial...........................");
        final int MIN_FACORIAL = -1;
        final int MAX_FACORIAL = 20;
        for (int i = MIN_FACORIAL; i <= MAX_FACORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive powers...........................");
        final long MIN_EXPONENT = -10;
        final long MAX_EXPONENT =  10;
        final long MIN_BASE     = -10;
        final long MAX_BASE     =  10;        
        for (long exponent = MIN_EXPONENT; 
                  exponent <= MAX_EXPONENT; 
                  exponent++) {            
            for (long base = MIN_BASE; base <= MAX_BASE; base++) {   
                long answer = Calculator.power(base,exponent);
                System.out.println(base + "\t to the exponent \t" + 
                        exponent + "\t = " + answer);
            }
        }
                
        System.out.println("\nRecursion test complete!\n");
    }
    
    
}
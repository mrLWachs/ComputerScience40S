
/** required package class namespace */
package testing;

/** required imports */
import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Feb. 18, 2020, 1:42:34 p.m.
 */
public class RecursionTest 
{

    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // 1) typical case
            // 2) edge cases
            // 3) beyond edges (bad user)
            
        System.out.println("Recursive factorial.............................");        
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;        
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive powers................................");        
        final int MIN_POWER = -1;
        final int MAX_POWER = 10;        
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                double answer = Calculator.power(base,exponent);
                System.out.println(base + "\t to the exponent \t" +
                        exponent + "\t = \t" + answer);
            }
        }
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}

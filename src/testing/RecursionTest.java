
/** required package class namespace */
package testing;
 
/** required imports */
import tools.Calculator;

/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Oct. 5, 2020
 */
public class RecursionTest 
{

    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        
        // When testing, think of three scenarios:
            // (1) Typical case (user does what they are told)
            // (2) Edge cases (user pushes the edges)
            // (3) Beyond the edges (bad users, tying to break things)
            
        System.out.println("Recursive factorial................");
            
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;
        
        for (long i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }
        
        System.out.println("Recursive powers................");
        
        final int MAX_POWER = 20;
        final int MIN_POWER = -MAX_POWER;
                
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {                
                double answer = Calculator.power(base,exponent);                
                System.out.println("Base \t" + base + "\t Exponent \t" +
                                   exponent + "\t = \t" + answer);                
            }
        }
        
        System.out.println("\nRecursion test complete!\n");
    }
    
}

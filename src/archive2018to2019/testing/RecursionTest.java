
/** required package class namespace */
package archive2018to2019.testing;

/** required imports */
import archive2018to2019.numbers.Calculator;

/**
 * RecursionTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since Sep 19, 2017 
 * @instructor Mr. Wachs
 */
public class RecursionTest 
{

    /** 
     * Default constructor for the class 
     */
    public RecursionTest() {
        System.out.println("\nRecursion unit test started...\n");
        System.out.println("Recursive Factorial:");
        final int MIN_FACORIAL = -1;            // minimum value for factorials
        final int MAX_FACORIAL = 21;            // maximum value for factorials
        for (int i = MIN_FACORIAL; i <= MAX_FACORIAL; i++) {
            long number = Calculator.factorial(i);              // calculate
            System.out.println(i + " factorial = " + number);   // display
        }
        System.out.println("Recursive Powers:");
        final int MIN_POWER = -10;              // minimum value for powers
        final int MAX_POWER = 10;               // maximum value for powers
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                double answer = Calculator.power(base, exponent);  // calculate
                System.out.println(base + " to the power of " +    // display
                        exponent + " = " + answer);
            }
        }
        System.out.println("\nRecursion unit test complete!\n");
    }

}

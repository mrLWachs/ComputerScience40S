/** required package class namespace */
package testing;

import numbers.Calculator;

/**
 * RecursionTest.java - the unit test to test the concept of recursion
 *
 * @author Mr. Wachs
 * @since 24-Sep-2018
 */
public class RecursionTest {

    /**
     * Default class constructor, runs on instantiation
     */
    public RecursionTest() {
        System.out.println("\nRecursion testing started...\n");

        int maximum = 65;
        int minimum = 0;
        
        System.out.println("Factorials...");
        for (int number = minimum; number <= maximum; number++) {
            double answer = Calculator.factorial(number);
            System.out.println("Number \t" + number +
                               " is factorial \t" + answer);
        }
        
        System.out.println("Powers...");
        maximum = 143;
        minimum = -maximum;
        
        for (int base = minimum; base <= maximum; base++) {
            for (int exponent = minimum; exponent <= maximum; exponent++) {
                double answer = Calculator.power(base, exponent);
                System.out.println("Base \t" + base +
                                   " to the exponent \t" + exponent + 
                                   " = \t" + answer);
            }
        }
        
        System.out.println("\nRecusion testing complete!\n");
    }

}

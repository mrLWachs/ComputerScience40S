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
        System.out.println("Recursion testing started...");

        int maximum = 500;
        int minimum = 0;
        
        System.out.println("Factorials...");
        for (int number = minimum; number <= maximum; number++) {
            double answer = Calculator.factorial(number);
            System.out.println("Number " + number +
                           " is factorial " + answer);
        }
        
        System.out.println("Powers...");
        maximum = 142;
        minimum = -maximum;
        
        for (int base = minimum; base <= maximum; base++) {
            for (int exponent = minimum; exponent <= maximum; exponent++) {
                double answer = Calculator.power(base, exponent);
                System.out.println("Base " + base +
                                   " to the exponent " + exponent + 
                                   " = \t" + answer);
            }
        }
        
        System.out.println("Recusion testing complete!");
    }

}

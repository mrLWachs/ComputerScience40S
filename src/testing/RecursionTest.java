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

        int minimum = -1;
        int maximum = 170;
                
        System.out.println("Factorials....");
        for (int number = minimum; number <= maximum; number++) {
            double answer = Calculator.factorial(number);
            System.out.println("Number " + number + " factorial = \t"
                    + answer);
        }
        
        maximum =  143;
        minimum = -maximum;        
        
        System.out.println("Powers....");        
        for (int base = minimum; base <= maximum; base++) {
            for (int exponent = minimum; exponent <= maximum; exponent++) {
                double answer = Calculator.power(base, exponent);
                System.out.println("Base " + base + " with exponent " +
                        exponent + " = \t" + answer);                
            }
        }
        
        System.out.println("Recusion testing complete!");
    }

}


/** required package class namespace */
package archive2018to2019.numbers;

/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs 
 * @since Feb 20, 2018 
 * @instructor Mr. Wachs
 */
public class Calculator 
{

    /**
     * Calculates the factorial of a number
     * 
     * @param number the value to calculate
     * @return the factorial of that number
     */
    public static long factorial(int number) {
        if      (number == 0) return 1;                            // base case
        else if (number < 0)  return Integer.MIN_VALUE;            // base case
        else                  return number * factorial(number-1);  
        // recursive case
    }

    /**
     * Calculates the power of a base to it's exponent 
     * 
     * @param base the power's base
     * @param exponent the power's exponent
     * @return the base ^ exponent
     */
    public static double power(int base, int exponent) {
        if      (exponent <  0)                         // recursive case
            return 1 / power(base,Math.abs(exponent));
        else if (exponent == 0) return 1;               // base case
        else if (exponent == 1) return base;            // base case
        else                                            // recursive case
            return base * power(base, exponent-1);  
    }
    
}

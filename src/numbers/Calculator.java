
/** required package class namespace */
package numbers;


/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs 
 * @since 24-Sep-2018 
 */
public class Calculator 
{

    public static double factorial(int number) {
        // base case
        if (number <= 1) {
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
        // recursive case
    }
    
    /**
     * Calculates a power
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the answer (the power itself)
     */
    public static double power(int base, int exponent) {
        //base case
        if      (exponent == 0) return 1;
        else if (exponent == 1) return base;
        else if (exponent <  0) 
            return 1 / power(base, Math.abs(exponent));
        else 
            return base * power(base,exponent-1);
        // recursive case
    }
    
    
    
}
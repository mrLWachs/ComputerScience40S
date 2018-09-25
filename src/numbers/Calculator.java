
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
    
    /**
     * Calculates the factorial of a number
     * 
     * @param number the number to calculate
     * @return the factorial answer
     */
    public static double factorial(int number) {
        if      (number <  0) return Integer.MIN_VALUE;             // base case
        else if (number == 0) return 1;                             // base case
        else                  return number * factorial(number-1); 
        // recursive case     
    }
    
    /**
     * Calculates the power of the number to the exponent
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the answer of this power
     */
    public static double power(int base, int exponent) {
        if      (exponent == 0) return 1;                       // base case(s)
        else if (exponent == 1) return base;        
        else if (exponent <  0) return 1 / power(base,Math.abs(exponent));
        else                    return base * power(base,exponent-1);
        // recursive case(s)        
    }    
    
}

/** Required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since September 27, 2021
 */
public class Calculator 
{

    /**
     * Calculates the factorial on a number using a recursive method. Recursive
     * methods need at minimum ONE BASE CASE (to stop the recursion), but can 
     * have more than one. They also need to have at minimum ONE RECUURSIVE
     * CASE (but also can have multiple recursive cases). Recursive cases 
     * means the method calls itself!
     * 
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter (number)
     */
    public static long factorial(int number) {    
        // Base case - stops the recursion
        if (number <= 1) {
            return 1;
        }
        // Recursive case - like a loop, method calls itself
        else {
            return number * factorial(number - 1);
        }
    }

    /**
     * Calculates the power of a base to it's exponent
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the base^exponent
     */
    public static double power(int base, int exponent) {
        // Base Case(s):
        // =============
        
        // Special base case for negative exponents and base of zero (we can
        // never divide by zero) if a base of base of zerop occurs return a 
        // "flag" value (a rarely used value)
        if (exponent < 0 && base == 0) return Integer.MIN_VALUE;
                
        // More base cases...
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        
        // Recursive Case(s):
        // ==================
        
        // Special recursive case for negative expponents
        if (exponent < 0) return 1 / power(base,exponent*-1);
        
        // Default recursive case
        return base * power(base,exponent-1);        
    }

}
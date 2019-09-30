
/** required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since Sep. 18, 2019, 11:34:29 a.m.
 */
public class Calculator 
{
    
    /**
     * Calculates the factorial of a number
     * 
     * @param number the value to calculate
     * @return the factorial of that number
     */
    public static long factorial(long number) {
        // base case(s) - stops recursion
        if (number <= 0) return 0;
        if (number == 1) return 1;        
        // recursive case(s) - like a loop, method will call itself
        return number * factorial(number-1);
    }

    
    
    public static double power(double base, double exponent) {
        // base case(s)
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        // recursive case(s)   
        return base * power(base, exponent-1);        
    }

    
    
}

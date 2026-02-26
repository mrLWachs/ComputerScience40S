
/** Required package class namespace */
package tools;


/*
 * Calculator - useful collection of methods for doing calculations. This class
 * is an example of using "Wrapper" methods. A wrapper method is a method whose
 * primary purpose is to call another method, essentially acting as a 
 * "middleman," or "hiding" the fact another method is being called. It is 
 * analogous to a "candy wrapper" hiding the candy inside the packaging. It 
 * allows the method call to interact with existing code more easily or safely
 * without calling the original source method directly. 
 * See: https://en.wikipedia.org/wiki/Wrapper_function
 * 
 * @author Mr. Wachs
 * @since Feb 23, 2026
*/
public class Calculator
{

    /**
     * Calculates the factorial (n!) on a number using a recursive method.
     * Recursive methods need at minimum ONE BASE CASE (to stop the recursion),
     * but can have more than one. They also need to have at minimum ONE
     * RECURSIVE CASE (but they can have multiple recursive cases). Recursive
     * cases means the method calls itself.
     * 
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter (number)
     */
    public static long factorial(int number) {
        // BASE CASE(s) - stops the recursion (stops the "looping" effect)
        if (number <= 1) {
            return 1;
        }        
        // RECURSIVE CASE(S) - the method calls itself (like a "loop")
        else {
            return number * factorial(number-1);
        }
    }
    
    /**
     * Calculates the power of a base to it's exponent (recursively)
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the base^exponent
     */
    public static double power(long exponent, long base) {
        // BASE CASE(s):
        // =============
        
        // Special base case for negative exponents and a base of zero (we can
        // never divide by zero) - if a base of zero occurs, we need to return
        // "something" we could use "flag" value (a rarely used value) 
        if (exponent < 0 && base == 0) return Double.MIN_VALUE;
        
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        
        // RECURSIVE CASE(s):
        // ==================
        
        // Special recursive case for negative exponents
        if (exponent < 0) return 1 / power(base, Math.abs(exponent));
        
        // Default recursive case (for positive exponents)
        return base * power(exponent-1, base);  
    }
        
}
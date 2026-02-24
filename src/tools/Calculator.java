
/** Required package class namespace */
package tools;


/*
 * Calculator - useful collection of methods for doing calculations.
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


}
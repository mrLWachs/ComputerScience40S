
/** Required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs 
 * @since February 28, 2024
 */
public class Calculator 
{

    /**
     * Calculates the factorial (!) on a number using a recursive method.
     * Recursive methods need at minimum ONE BASE CASE (to stop the recursion),
     * but can have more than one. They also need to have at minimum ONE
     * RECURSIVE CASE (but they can have multiple recursive cases). Recursive
     * cases means the method calls itself.
     * 
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter (number)
     */
    public static long factorial(int number) {  
        if (number <= 1) {
            // BASE CASE - stops the recursion (stops the "looping" effect)
            return 1;
        }
        else {
            // RECURSIVE CASE - the method calls itself (like a "loop")
            return number * factorial(number - 1);
        }        
    }

 
 
}

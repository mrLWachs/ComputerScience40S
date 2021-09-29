
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
 
}
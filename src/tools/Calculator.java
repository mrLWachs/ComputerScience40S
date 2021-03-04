
/** Required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since March 4, 2021
 */
public class Calculator 
{

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
    }
    
}


/** Required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since 25-Feb-2022, 3:04:24 PM
 */
public class Calculator 
{
    
    public static int factorial(int number) {        
        if (number == 1) {
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }
    
    
}
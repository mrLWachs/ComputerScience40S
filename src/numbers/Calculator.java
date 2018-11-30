
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
     * @param number the value to calculate
     * @return the factorial of that number
     */
    public static long factorial(int number) {
        if      (number == 0) return 1;                            // base case
        else if (number < 0)  return Integer.MIN_VALUE;            // base case
        else                  return number * factorial(number-1);  
        // recursive case
    }

    /**
     * Calculates the power of a base to it's exponent 
     * 
     * @param base the power's base
     * @param exponent the power's exponent
     * @return the base ^ exponent
     */
    public static double power(int base, int exponent) {
        if      (exponent <  0)                         // recursive case
            return 1 / power(base,Math.abs(exponent));
        else if (exponent == 0) return 1;               // base case
        else if (exponent == 1) return base;            // base case
        else                                            // recursive case
            return base * power(base, exponent-1);  
    }
    
    /**
     * Generates a random number inside a range
     * 
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return random number in the range
     */
    public static double random(double low, double high) {
        double seed   = Math.random();
        double random = (high - low + 1) * seed + low;
        return random;
    }
    
    /**
     * Generates a random boolean
     * 
     * @return true or false
     */
    public static boolean random() {
        return Calculator.random(0,1) == 0;
    }
    
    /**
     * Generates a random number inside a range
     * 
     * @param low the lowest possible random number
     * @param high the highest possible random number
     * @return random number in the range
     */
    public static int random(int low, int high) {
        return (int)Calculator.random((double)low, (double)high);
    }

    /**
     * Generates a random character inside a range
     * 
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return random character in the range
     */
    public static char random(char low, char high) {
        return (char)Calculator.random((int)low, (int)high);
    }
    
    /**
     * Generates a random String inside a range
     * 
     * @param length the length of the string to generate
     * @param low the lowest possible random character
     * @param high the highest possible random character
     * @return random String in the range
     */
    public static String random(int length, char low, char high) {
        String word = "";
        for (int i = 0; i < length; i++) {
            word += Calculator.random(low,high);
        }
        return word;
    }
    
    /**
     * Generates a random String of a set length
     * 
     * @param length the length of the string to generate
     * @return a random string of set length
     */
    public static String random(int length) {
        return Calculator.random(length,'a','z');
    }
    
}
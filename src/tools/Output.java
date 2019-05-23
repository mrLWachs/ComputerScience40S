
/** required package class namespace */
package tools;


/**
 * Output.java - a collection of static useful methods for producing standard
 * outputs to the screen
 *
 * @author Mr. Wachs 
 * @since 23-May-2019 
 */
public class Output 
{
    
    private static final int    MAX    = 200;
    private static final String DIVIDE = "\t= ";
    
    /**
     * Outputs a line in header style of standard output with line breaks and
     * a drawn line of dots
     * 
     * @param text the text to put in the header line
     */
    public static void header(String text) {
        text = "\n" + text;                             // add leading new line
        int length = text.length();                     // length of passed text
        for (int i = 0; i < (MAX - length); i++) {      // loop to max length
            text += ".";                                // add "dots"
        }
        text += "\n";                                   // add trailing new line
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     * @param fourth an object to add to the output line
     * @param fifth an object to add to the output line
     * @param sixth an object to add to the output line
     */
    public static void show(Object first, Object second, Object third, 
                            Object fourth, Object fifth, Object sixth) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        String text6 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();
        if (sixth  != null) text6 = sixth.toString();        
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5 + DIVIDE +
                      text6;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     * @param fourth an object to add to the output line
     * @param fifth an object to add to the output line
     */
    public static void show(Object first, Object second, Object third, 
                            Object fourth, Object fifth) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();       
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     * @param fourth an object to add to the output line
     */
    public static void show(Object first, Object second, Object third, 
                            Object fourth) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();      
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     * @param third an object to add to the output line
     */
    public static void show(Object first, Object second, Object third) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        String text3 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();      
        String text = text1 + DIVIDE + 
                      text2 + DIVIDE + 
                      text3;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     * @param second an object to add to the output line
     */
    public static void show(Object first, Object second) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls
        if (second != null) text2 = second.toString();     
        String text = text1 + DIVIDE + 
                      text2;                            // concatenate all text
        show(text);                                     // output text
    }
    
    /**
     * Outputs a line to standard output with a divider between each 
     * parameter to space out the line for the output
     * 
     * @param first an object to add to the output line
     */
    public static void show(Object first) {
        String text1 = "null";          // variable(s) for the output
        String text2 = "null";
        if (first  != null) text1 = first.toString();   // adjust for nulls    
        String text = text1;                            // concatenate all text
        System.out.println(text);                       // standard output
    }
    
    /**
     * Creates a formatted line of text for an array to use in outputs
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String show(int[] array) {
        if (array == null) return "null";           // adjust for null
        String text = "Array       [";              // start line
        for (int i = 0; i < array.length-1; i++) {  // traverse array
            text += array[i] + ",";                 // concatenate array content
        }
        return text + array[array.length-1] + "]";  // complete line
    }
    
    /**
     * Creates a formatted line of text for an array to use in outputs
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String show(Object[] array) {
        if (array == null) return "null";           // adjust for null
        String text = "Array       [";              // start line
        for (int i = 0; i < array.length-1; i++) {  // traverse array
            text += array[i] + ",";                 // concatenate array content
        }
        return text + array[array.length-1] + "]";  // complete line
    }
        
}

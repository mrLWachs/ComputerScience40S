
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package computerscience30s;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code
 */
import javax.swing.JOptionPane;

/** 
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code example that might come up over the course.
 *
 * @author Mr. Wachs 
 * @since Feb. 9, 2022, 8:01:03 a.m.
*/
public class ComputerScience30S {        // Curly brackets DO NOT remove

    /**
     * Don't worry about this for now - we will examine what this means in
     * unit 2 (methods)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        ///////////////////////////////////////////////////////////////////////
//        // (1) COMMENTS:
//        ///////////////////////////////////////////////////////////////////////
//                
//        // This is a commment, all typing after "//" forward slashes until the  
//        // line ends is a comment
//        
//        // Comments are not code, so you can write what you want
//        
//        /*         
//            This is for multiple line comments, as it covers as many lines as
//            you want starting with "slash star" until it see the closing 
//            "star slash"  
//        */
//        
//        ///////////////////////////////////////////////////////////////////////
//        // (2) BASIC OUTPUTS:
//        ///////////////////////////////////////////////////////////////////////
//        
//        System.out.print("Hello World"); // Comments can also be on code lines
//        
//        // Use the same line as above with the letters "ln" ("LN" in lower) as
//        // this will add a "line break" at the end
//        
//        System.out.println("I'm in the world");
//        
//        // If you type "sout" and hit "TAB" (no spaces) it will automatically
//        // type the next line...
//        
//        System.out.println("Good-bye world!");
//        
//        // Additional output tips... (these are "special" characters")   
//        
//        System.out.println("Make a quotation mark \" ");
//        System.out.println("Make a slash  \\ ");
//        System.out.println("Make a \t tab");
//        System.out.println("Make a \n new line");
//        
//        // These special ("escape sequences") start with "\" and then things
//        // like "n" for a new line, etc. These may not be needed in this course
//        
//        ///////////////////////////////////////////////////////////////////////
//        // (3) DIALOG OUTPUTS AND INPUTS:
//        ///////////////////////////////////////////////////////////////////////
//                
//        // Make a "fancier" output with a dialog box...
//        
//        // Use the keyboard shortcut "CTRL + SPACE" to bring up autocomplete
//        // at any point to help type all the code (including the correct upper 
//        // and lower case letters) as well as doing an "import" line of code
//        // at the top of the project automatically to "bring in" a library 
//        // of code for you to make the dialog box in this next line...
//        
//        JOptionPane.showMessageDialog(null, "Hello");
//        
//        // The above line of code is the ONLY one needed for assignments, final 
//        // projects, etc. to make outputs - however, these next lines are  
//        // OPTIONS (not needed, but cool) for other types of dialog output 
//        // message boxes as seen below...
//        
//        // Make more dialog outut boxes, with some variations (these are NOT
//        // required for assignments in this course) - you ARE able to use them
//        // (note: code can span multiple lines until it reaches 
//        //  the semi colon ";")
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Information icon is i", 
//                "Information Title", 
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Question icon is ?", 
//                "Question Title", 
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Warning icon is !", 
//                "Warning Title", 
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Plain no icon", 
//                "Plain Title", 
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // Dialogs for inputs...
//
//        // The simpliest verison is the one you need to know
//        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // There is a little more to using this that we cover 
//        // after learning variables...
//        
//        // Some optional input dialogs below:
//                                
//        JOptionPane.showInputDialog(
//                null, 
//                "Input Information icon is i", 
//                "Input Information Title", 
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Input Question icon is i", 
//                "Input Question Title", 
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Input Warning icon is i", 
//                "Input Warning Title", 
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Input Plain icon is i", 
//                "Input Plain Title", 
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // More different (and optional) dialogs...
//        
//        JOptionPane.showConfirmDialog(null,"Confirm");
//
//        JOptionPane.showConfirmDialog(
//                null,
//                "Confirm Example 2",
//                "Information",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.INFORMATION_MESSAGE
//        );
//
//        JOptionPane.showConfirmDialog(
//                null,
//                "Confirm Example 3",
//                "Question",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE
//        );
//
//        JOptionPane.showConfirmDialog(
//                null,
//                "Confirm Example 4",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE
//        );
//
//        JOptionPane.showConfirmDialog(
//                null,
//                "Confirm Example 5",
//                "Plain",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        ///////////////////////////////////////////////////////////////////////
//        // (4) VARIABLES:
//        ///////////////////////////////////////////////////////////////////////
//        
//        // A variable is a piece of code that tells the computer to store (or 
//        // "remember") information (or "data")
//        
//        // This is an example of the simpliest variable type
//        
//        boolean a = true;
//        
//        // type name = value ;
//        
//        // When you write a line of code to create (declare) a variable
//        
//        int b = 0;
//        
//        double c = 0.0;
//        
//        // "Variables" can change ("vary")
//        
//        a = false;
//        b = 1;
//        c = 1.2;
//        
//        // Most of the time, we create variables for:
//        // (1) Getting user input (then store it in that variable)
//        // (2) Formulas
//        
//        // Variables always go on the left hand side (LHS) of the equals
//        // sign (=) and the value going into the variable always goes on
//        // the right hand side (RHS)
//        
//        // Output the variables...
//        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        char d = 'A';
//        
//        // The "char" is short for "character" holds (remembers) ONE character
//        
//        System.out.println("d = " + d);
//        
//        // The boolean, integer (int), double, character (char) are all simple
//        // (primitive) data types, now a complex data type...
//        
//        String e = "apple";
//        
//        System.out.println("e = " + e);
//        
//        // Variable data types we can use:
//        // (1) boolean - just true and false (different from "bool" in C#)
//        // (2) int     - the integer, a whole number
//        // (3) double  - can have decimals
//        // (4) char    - character hold one character
//        // (5) String  - holds a bunch of characters (uses capital "S")
//        
//        // Manipulate (use) our variables...
//        
//        int x = 10;
//        
//        System.out.println("x = " + x);
//                
//        x = 20;
//        
//        System.out.println("x = " + x);
//        
//        int y = x + 10;
//        
//        System.out.println("y = " + y);
//        
//        // Code (like in math) likes to use shorthand (optional)
//        
//        y++;    // Means the same as y = y + 1
//        y--;    // Means the same as y = y - 1
//        
//        // Even more shorthand (less recomended)...
//        
//        y += 10;    // Means y = y + 10;
//        y -= 10;    // Means y = y - 10;
//        y *= 10;    // Means y = y * 10;
//        y /= 10;    // Means y = y / 10;
//        
//        System.out.println("y = " + y);
//        
//        // More complicated types of calculations might be needed for formulas, 
//        // like for example the Modulus (mod) gives you the remainder of a 
//        // division, in java and it uses the percentage "%" symbol for this
//        
//        x = 28;
//        y = x / 5;
//        
//        int z = x % 5;
//        
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        // Constants are variables that don't change, and constants are
//        // written in ALL_CAPITAL_LETTERS with an underscore to seperate words
//        
//        // They also start with the keyword "final" (in C# it was "const")
//        
//        final double  PI           = 3.141592658389;
//        final int     PROBLEMS     = 99;
//        final char    YES          = 'Y';
//        final boolean FOUND        = true;
//        final String  TEACHER_NAME = "Wachs";
//        
//        System.out.println(PI       + ", " + 
//                           PROBLEMS + ", " +
//                           YES      + ", " +
//                           FOUND    + ", " +
//                           TEACHER_NAME);
//        
//        // Converting one data type to another 
//        
//        int f = 25;
//        
//        System.out.println("f = " + f);
//        
//        double g = f;
//        
//        System.out.println("g = " + g);
//        
//        g = 25.99999999999;
//        
//        System.out.println("g = " + g);
//        
//        int h = (int) g;
//        
//        // When we use round brackets ( )  with a data type inside, this is
//        // called "casting" which means it converts (temporarily) to another
//        // data type - which meant it ignored the decimal part
//        
//        System.out.println("h = " + h);
//        
//        // Casting again...
//        
//        double k = 2.999999999;
//        int    l = (int)k;
//        double m = (double)l;
//        
//        // Casting can happen with other data types
//        
//        char n = 'A';
//        int  o = (int)n;
//        char p = (char)70;
//        
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("o = " + o);
//        System.out.println("p = " + p);
//        
//        // Use dialog boxes with variables
//        
//        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
//        // at the front of the line that makes the input dialog (code above is
//        // wrong, always make a string variable then the input dialog)
//        
//        String q = JOptionPane.showInputDialog("Enter string (text)");
//        
//        // The variable stores what they typed in the input dialog box
//        // we test this by diplaying it right away
//        
//        JOptionPane.showMessageDialog(null, q);
//        
//        // With numbers (integers or doubles), you HAVE to start off with a 
//        // string, and then convert it to a number. This is like:
//        // Convert.ToInt32(text).... this was in C#
//        
//        String r = JOptionPane.showInputDialog("Enter int");
//        
//        // We use code to "parse" the string (means "reading")
//        
//        int s = Integer.parseInt(r);
//        
//        JOptionPane.showMessageDialog(null, s);
//        
//        // Same example with a double
//        
//        String t = JOptionPane.showInputDialog("Enter double");
//        double u = Double.parseDouble(t);
//        JOptionPane.showMessageDialog(null, u);
//        
//        // Example with a char (character)
//        
//        String v = JOptionPane.showInputDialog("Enter char");
//        char   w = v.charAt(0);
//        JOptionPane.showMessageDialog(null, w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        // Strings have MANY built-in "actions" (function, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        
        int length = word.length();
        
        System.out.println("Word " + word + " is length " + length);
                
        // The "String" data type (uses a capital "S") is more 'powerful'
        // (means built-in functions) than the int, double, boolean or char
        
        String upper = word.toUpperCase();
        
        System.out.println("Word " + word + " in upper case is " + upper);
                
        // Many more string functions to be explored
                
        // Most words in code (in Java) that start with a capital letter, all
        // have built-in 'powers' (methods) that you can explore using NetBeans
        // autocomplete and reading what pops up
        
        // "Math" library of code comes with built-in functions (actions,
        // powers, methods)
        
        
                
                
                
        
        
        
        
        
        
        
        
        
        
        
    }

}

// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Click the green triangle on the top toolbar to run code
// (5)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)
// (8)  To "comment out" chunks of code, select the code with your mouse or 
//      keyboard, then click on the two buttons under the code tab (on right)
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)

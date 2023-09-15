
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package computerscience30s;

import javax.swing.JOptionPane;


/**
 *
 * @author lawrence.wachs
 */
public class ComputerScience30S 
{

    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        ///////////////////////////////////////////////////////////////////////
//        // JAVA BASIC INPUT AND OUTPUTS
//        ///////////////////////////////////////////////////////////////////////
//        
//        // This is a comment all typing after "//" until the line ends        
//        // Commments are not code, so you can write what you want        
//        // Curly brackets (braces, parenthesis) { and } are important        
//        // All code right now goes between these two brackets. Comments are 
//        // not code, so you can write what you want
//        
//        /*  
//            This is for multiple line comments, as it covers as many lines as
//            you want starting with "slash star" until it sees the closing 
//            "star slash"
//        */
//        
//        // A basic output
//        System.out.println("Hello World");  // Comments can be on code lines
//        
//        // Use print without the "ln", does not add a line break at the end        
//        System.out.print("I'm in");
//        System.out.println(" the world");
//        
//        System.out.println("Good-bye world!");
//        
//        // Additional output tips... (these are "special" characters)
//        
//        System.out.println("Make a quote \" ");             // \" makes quote
//        System.out.println("Make a slash \\ ");             // \\ makes slash
//        System.out.println("Make a \t tab ");               // \t makes tab
//        System.out.println("Make a new line \n break ");    // \n makes new line
//        
//        // In all these, the key is to use the "\" backslash
//        // which is called an "escape character"
//        
//        // Make a "fancier" output with a dialog box
//        
//        JOptionPane.showMessageDialog(null, "Hi");
// 
//        // Above line of code is the ONLY one needed for assignment, final 
//        // project, etc.
//                
//        // However, these OPTIONS (not needed, but cool) for other
//        // dialog output message boxes below...
//        
//        // Code could span multiple lines until it reaches a semi colon ";"
//        // The light red line on the far right -------------------------------->
//        // can be thought of as a "barrier" and you should try not to code too
//        // much past this line
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Information icon is i",
//                "Information title",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Question icon is i",
//                "Question title",
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Warning icon is i",
//                "Warning title",
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//
//        JOptionPane.showMessageDialog(
//                null, 
//                "Error icon is x",
//                "Error title",
//                JOptionPane.ERROR_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Plain icon is i",
//                "Plain title",
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // Dialogs for inputs...
//        
//        // The simpliest version is the one you will need to know:
//        
//        JOptionPane.showInputDialog("Enter Something");
//        
//        // There is a little more to using this input dialog that we will 
//        // cover after learning variables
//        
//        // Some other optional input dialogs...
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Information icon is i",
//                "Information title",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Question icon is i",
//                "Question title",
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Warning icon is i",
//                "Warning title",
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Error icon is x",
//                "Error title",
//                JOptionPane.ERROR_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Plain icon is i",
//                "Plain title",
//                JOptionPane.PLAIN_MESSAGE
//        );                
//        
//        // More different (and optional) dialogs...
//        
//        JOptionPane.showConfirmDialog(null, "Confirm");
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 2",
//                "Information",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 3",
//                "Question",
//                JOptionPane.YES_NO_OPTION,
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
//                "Error",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.ERROR_MESSAGE
//        );
//                
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 6",
//                "Plain",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        ///////////////////////////////////////////////////////////////////////
//        // VARIABLES:
//        ///////////////////////////////////////////////////////////////////////
//        
//        // A variable is a piece of code that tells the computer to
//        // store (or "remember") information (or "data")
//        
//        // This is an example of the simpliest variable type:
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
//        // Variables can change ("vary")
//        
//        a = false;
//        b = 1;
//        c = 1.2;
//        
//        // Variables always go on the left hand side (LHS) of the equals
//        // sign (=) and the value going into the variable always goes on
//        // the right hand side (RHS)
//        
//        // Output our variables when outputted it always outputs the 
//        // value stored in the variable not the name of it
//        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        // The "char" is short for "character" it holds (remembers) ONE
//        // character
//        
//        char d = 'A';
//        
//        System.out.println("d = " + d);
//        
//        // The boolean ("bool" in C#), integer (int), double, and character
//        // (char) are all simple (primitive) data types, now a "complex" data
//        // type....
//
//        String e = "apple";
//
//        System.out.println("e = " + e);
//        
//        // Manipulate ("use") our variables:
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
//        // Optional ("you don't have to use this code") shorthand...
//        
//        y++;    // Means the same as y = y + 1;
//        y--;    // Means the same as y = y - 1;
//        
//        // Even more optional shorthand (less recommended)
//        
//        y += 10;    // Means the same as y = y + 10;
//        y -= 10;    // Means the same as y = y - 10;
//        y *= 10;    // Means the same as y = y * 10;
//        y /= 10;    // Means the same as y = y / 10;
//        
//        System.out.println("y = " + y);
//        
//        // Modulus (mod) division gives you the remainder of a division
//        // (not the normal answer) - in Java it uses the percentage "%"
//        // symbol for this
//        
//        x = 28;
//        y = x / 5;
//        
//        int z = x % 5;
//        
//        System.out.println("x = "+ x);
//        System.out.println("y = "+ y);
//        System.out.println("z = "+ z);
//        
//        // Constants are variables that don't change (they stay "constant"),
//        // and constants are written in ALL_CAPITAL_LETTERS with underscores
//        // to seperate words
//        
//        // They also start with the keyword "final" (in C# it was "const")
//        
//        final double  PI       = 3.141592658389;
//        final int     PROBLEMS = 99;
//        final char    YES      = 'Y';
//        final boolean FOUND    = true;
//        final String  TEACHER  = "Wachs";
//        
//        System.out.println(PI       + ", " + 
//                           PROBLEMS + ", " + 
//                           YES      + ", " +
//                           FOUND    + ", " +
//                           TEACHER);
//        
//        // Constants are used for things like: easier code to maintain,
//        // easier to read/understand (especially for other programmers)
//        
//        // Converting between variable data types...
//        
//        int f = 25;
//        
//        System.out.println("f = " + f);
//        
//        double g = f;
//        
//        System.out.println("g = " + g);
//        
//        g = 25.999999999999;
//        
//        System.out.println("g = " + g);
//        
//        int h = (int) g;
//        
//        System.out.println("h = " + h);
//        
//        // When we use round brackets ( )  with a data type inside, this is
//        // called "casting" which means it converts (temporarily) to another
//        // data type - which meant it ignored the decimal part
//        
//        double k = 2.99999999;
//        int    l = (int)k;
//        double m = (double)l;
//        
//        // Casting can happen with other data types...
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
//        // Use dialog boxes (specifically the input) with variables...
//        
//        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
//        // at the front of the line that makes the input dialog (code above is
//        // wrong, always make a string variable then the input dialog)
//        
//        String q = JOptionPane.showInputDialog("Enter");
//        
//        // The variable (always has to start as a string) stores what the 
//        // user types in the input dialog box
//        
//        JOptionPane.showMessageDialog(null, q);
//        
//        // With numbers, you HAVE to start off with a string, and then convert
//        // it to a number. This is like Convert.ToInt32(text); in C#
//        
//        String r = JOptionPane.showInputDialog("Enter int");
//        
//        // We convert using code to "parse" (means "to read")
//        
//        int s = Integer.parseInt(r);
//        
//        // Always use a capital "I" and whole word "Integer" for this parsing
//        // the string into a number
//        
//        JOptionPane.showMessageDialog(null, s);
//        
//        // Same example but with a double...
//        
//        String t = JOptionPane.showInputDialog("Enter double");
//        double u = Double.parseDouble(t);
//        JOptionPane.showMessageDialog(null, u);
//        
//        // Example with a char (single character)...
//        
//        String v = JOptionPane.showInputDialog("Enter char");
//        char   w = v.charAt(0);
//        JOptionPane.showMessageDialog(null, w);
//        
//        // Strings have built-in actions like "charAt" to pull out a character
//        // "at" location "0" which means the very first character (because 
//        // numbering in Computer Science usually starts at 0)
        
        // String have MANY built-in "actions" ("powers", functions, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        
        int length = word.length();
        
        System.out.println("Word " + word + " is length " + length);
        
        String upper = word.toUpperCase();
        
        System.out.println("Word " + word + " in upper case is " + upper);
        
        // Many more string functions to explore (could use CTRL+SPACE)
        
        // Another useful "library" of code is the "Math" library which is
        // also "built-in" (you can easily use it) to Java. It comes with 
        // its own functions (actions, methods)
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5)  Click the green triangle on the top toolbar to run code
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)
// (8) To "comment out" chunks of code, select the code with your mouse or 
//     your keyboard, then click on one of the two buttons under the code tab
//     (on the right)
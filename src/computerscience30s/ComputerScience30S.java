/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscience30s;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.wachs
 */
public class ComputerScience30S {       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here        
//        // This is a comment all typing after "//" until the line ends        
//        // Commments are not code, so you can write what you want        
//        // Curly brackets (braces, parenthesis) { and } are important        
//        // All code right now goes between these two brackets
//        
//        /*  
//            This is for multiple line comments, as it covers as many lines as
//            you want starting with "slash star" until it sees the closing 
//            "star slash"
//        */
//        
//        ///////////////////////////////////////////////////////////////////////
//        // JAVA BASIC INPUT AND OUTPUTS
//        ///////////////////////////////////////////////////////////////////////
//                
//        // Basic output
//        System.out.println("Hello World...");
//        // Use print without the "ln", does not add a line break at the end
//        System.out.println("I'm in the world");
//        
//        System.out.println("Good-bye world!");
//                
//        // Additional output tips... (these are "special" characters)
//        
//        System.out.println("Make a quote \" ");
//        System.out.println("Make a slash \\ ");
//        System.out.println("Make a \t tab");
//        System.out.println("Make a \n new line");
//        
//        // Make a dialog box appear
//        JOptionPane.showMessageDialog(null, "Hello");
//        
//        // Above is the only one need for assignments, final projects, etc.
//        // Optional (not needed, but cool) dialog boxes below:
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
//                "Plain no no icon",
//                "Plain Title",
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // Dialogs for inputs....
//        
//        // The simpliest version is the one you have to use
//        JOptionPane.showInputDialog("Enter something");
//        
//        // Some optional input dialogs below:
//        JOptionPane.showInputDialog(
//                null, 
//                "Information dialog icon is i", 
//                "Information Title", 
//                JOptionPane.INFORMATION_MESSAGE);
//
//        JOptionPane.showInputDialog(
//                null, 
//                "Question dialog icon is ?", 
//                "Question Title", 
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Warning dialog icon is !", 
//                "Warning Title", 
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Plain dialog no icon", 
//                "Plain Title", 
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // More different (and optional) dialogs...
//        
//        JOptionPane.showConfirmDialog(null, "Confirm");
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 1",
//                "Information",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 2",
//                "Question",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 3",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 4",
//                "Plain",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
//        
//        ///////////////////////////////////////////////////////////////////////
//        // VARIABLES:
//        ///////////////////////////////////////////////////////////////////////
//        
//        // The simpliest variable (variables stores "remembers" data) type:
//        
//        boolean a = true;
//        
//        // type name = value ;
//        
//        // when you write a line of code to create (declare) a variable
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
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        char d = 'A';
//        
//        // "char" is short for "character" hold (remembers) one character
//        
//        System.out.println("d = " + d);
//        
//        // The boolean, integer (int), double, character (char) are all
//        // simple (primitive) data types, now a complex data type...
//        
//        String e = "apple";
//        
//        System.out.println("e = " + e);
//        
//        // Manipulate our variables
//        
//        int x = 10;        
//        System.out.println("x = " + x);
//        x = 20;        
//        System.out.println("x = " + x);        
//        int y = x + 10;        
//        System.out.println("y = " + y);
//        
//        // Optional shorthand...        
//        y++;    // means y = y + 1
//        y--;    // means y = y - 1
//        
//        // Even more shorthand...
//        
//        y += 10;    // Means y = y + 10
//        y -= 10;    // Means y = y - 10
//        y *= 10;    // Means y = y * 10
//        y /= 10;    // Means y = y / 10
//        
//        System.out.println("y = " + y);
//                
//        // Modulus (mod) gives you the remainder of a division, in java
//        // uses the percentage "%" symbol for this
//        
//        x = 28;
//        y = x / 5;
//        int z = x % 5;
//        
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        // Constants are variables that don't change, and constants are 
//        // written in ALL_CAPITAL_LETTERS with underscores to seperate words
//        
//        final double  PI           = 3.14159265;
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
//        double g = f;
//        
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        
//        g = 25.9999999999;
//        
//        int h = (int)g;
//        
//        // When we use round brackets ( ) with the data type inside, this is 
//        // called "casting" which means it ignores the decimal part 
//        
//        System.out.println("h = " + h);
//        
//        double k = 2.9999999;
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
//        String q = JOptionPane.showInputDialog("Enter");
//        
//        JOptionPane.showMessageDialog(null, q);
//        
//        // when using input dialogs, ALWAYS use a variable first at the front
//        // of the line
//        
//        // with numbers, you have to start off with a string, and then convert
//        //  it to a number (like: Convert.ToInt32(text) ... )
//        
//        String r = JOptionPane.showInputDialog("Enter int");
//        
//        // We use code that "parses" (means "reading")
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
//        // Example with a char
//        String v = JOptionPane.showInputDialog("Enter char");
//        
//        char w = v.charAt(0);
//        
//        JOptionPane.showMessageDialog(null, w);
//        
//        // Strings have built-in actions like "charAt" to pull out a character
//        // "at" location "0" which means the very first character (because 
//        // numbering in Computer Science usually starts at 0)
//        
//        // Strings have many built-in actions (functions, methods)
//        
//        String word = "hippopotomonsprosesquippedaiophobia";
//        
//        int length = word.length();
//        
//        System.out.println(word + " is length " + length);
//        
//        word = word.toUpperCase();
//        
//        System.out.println(word);
//        
//        // many more string functions can be explored
//        
//        // Also built-in to java is a math "library" of code
//        
//        double answer1 = Math.PI;
//        double answer2 = Math.cos(0.5);
//        double answer3 = Math.abs(-1);
//        double answer4 = Math.pow(5, 3);
//        double answer5 = Math.sqrt(9);
//        double answer6 = Math.log(0.5);
//        
//        System.out.println("answer1 = " + answer1);
//        System.out.println("answer2 = " + answer2);
//        System.out.println("answer3 = " + answer3);
//        System.out.println("answer4 = " + answer4);
//        System.out.println("answer5 = " + answer5);
//        System.out.println("answer6 = " + answer6);
//        
//        // Math "library" does random numbers, like:
//        // Random random = new Random();
//        
//        double seed = Math.random();
//        System.out.println("seed = " + seed);
//        
//        // you can use a formula for generating random numbers in a range 
//        // between a low and a high number:
//        
//        // eg. between 1 and 10 and make it an int
//        
//        // start with the constants defining the highest and lowest
//        final double LOW  = 1.0;
//        final double HIGH = 10.0;
//        // now a formula to generate in that range
//        double number = (HIGH - LOW + 1) * seed + LOW;
//        // now cast it to an integer
//        int value = (int)number;
//        // and display it
//        System.out.println("random value = " + value);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // Simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // if statements use both round ( ) and curly { } brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only run when the test inside of the round 
        // brackets tests true. It also indents the code inside the block
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}


// NETBEANS TIPS:
// ==============
// (1) To zoom in and out on the code, hold ALT and roll the mouse
// (2) Double click the top of a tab to hide side windows or show them
// (3) The curly brackets (braces, parenthesis) are important "{" and "}"
// (4) Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5) Click the green triangle on the top toolbar to run code
// (6) Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7) The word "null" means nothing and can act as a placeholder for code
//     you don't actually need (right now)
// (8) To "comment out" chunks of code, select the code with your mouse or
//     keyboard, then click on the two buttons under the code tab









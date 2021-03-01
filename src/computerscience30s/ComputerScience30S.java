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
        // TODO code application logic here        
        // This is a comment all typing after "//" until the line ends        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
                
        // Basic output
        System.out.println("Hello World...");
        // Use print without the "ln", does not add a line break at the end
        System.out.println("I'm in the world");
        
        System.out.println("Good-bye world!");
                
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");
        System.out.println("Make a slash \\ ");
        System.out.println("Make a \t tab");
        System.out.println("Make a \n new line");
        
        // Make a dialog box appear
        JOptionPane.showMessageDialog(null, "Hello");
        
        // Above is the only one need for assignments, final projects, etc.
        // Optional (not needed, but cool) dialog boxes below:
        
        JOptionPane.showMessageDialog(
                null,
                "Information icon is i",
                "Information Title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Question icon is ?",
                "Question Title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Warning icon is !",
                "Warning Title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Plain no no icon",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs....
        
        // The simpliest version is the one you have to use
        JOptionPane.showInputDialog("Enter something");
        
        // Some optional input dialogs below:
        JOptionPane.showInputDialog(
                null, 
                "Information dialog icon is i", 
                "Information Title", 
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog(
                null, 
                "Question dialog icon is ?", 
                "Question Title", 
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Warning dialog icon is !", 
                "Warning Title", 
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Plain dialog no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE);
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 1",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 2",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 3",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 4",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // The simpliest variable (variables stores "remembers" data) type:
        
        boolean a = true;
        
        // type name = value ;
        
        // when you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // Variables can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals 
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS) 
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // "char" is short for "character" hold (remembers) one character
        
        System.out.println("d = " + d);
        
        // The boolean, integer (int), double, character (char) are all
        // simple (primitive) data types, now a complex data type...
        
        String e = "apple";
        
        System.out.println("e = " + e);
        
        // Manipulate our variables
        
        int x = 10;        
        System.out.println("x = " + x);
        x = 20;        
        System.out.println("x = " + x);        
        int y = x + 10;        
        System.out.println("y = " + y);
        
        // Optional shorthand...        
        y++;    // means y = y + 1
        y--;    // means y = y - 1
        
        // Even more shorthand...
        
        y += 10;    // Means y = y + 10
        y -= 10;    // Means y = y - 10
        y *= 10;    // Means y = y * 10
        y /= 10;    // Means y = y / 10
        
        System.out.println("y = " + y);
                
        // Modulus (mod) gives you the remainder of a division, in java
        // uses the percentage "%" symbol for this
        
        x = 28;
        y = x / 5;
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change, and constants are 
        // written in ALL_CAPITAL_LETTERS with underscores to seperate words
        
        final double  PI           = 3.14159265;
        final int     PROBLEMS     = 99;
        final char    YES          = 'Y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " + 
                           YES      + ", " + 
                           FOUND    + ", " + 
                           TEACHER_NAME);
        
        // Converting one data type to another
        
        int f = 25;
        
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        g = 25.9999999999;
        
        int h = (int)g;
        
        // When we use round brackets ( ) with the data type inside, this is 
        // called "casting" which means it ignores the decimal part 
        
        System.out.println("h = " + h);
        
        double k = 2.9999999;
        int    l = (int)k;
        double m = (double)l;
        
        // Casting can happen with other data types
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)70;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // Use dialog boxes with variables
        
        String q = JOptionPane.showInputDialog("Enter");
        
        JOptionPane.showMessageDialog(null, q);
        
        // when using input dialogs, ALWAYS use a variable first at the front
        // of the line
        
        // with numbers, you have to start off with a string, and then convert
        //  it to a number (like: Convert.ToInt32(text) ... )
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We use code that "parses" (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example with a double
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char
        String v = JOptionPane.showInputDialog("Enter char");
        
        char w = v.charAt(0);
        
        JOptionPane.showMessageDialog(null, w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        // Strings have many built-in actions (functions, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        
        int length = word.length();
        
        System.out.println(word + " is length " + length);
        
        word = word.toUpperCase();
        
        System.out.println(word);
        
        // Many more string functions can be explored
        
        // Also built-in to java is a math "library" of code
        
        double answer1 = Math.PI;
        double answer2 = Math.cos(0.5);
        double answer3 = Math.abs(-1);
        double answer4 = Math.pow(5, 3);
        double answer5 = Math.sqrt(9);
        double answer6 = Math.log(0.5);
        
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);
        
        // Math library also does random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        
        System.out.println("seed = " + seed);
        
        // You can use a formula for generating random numbers in a range
        // between a low and a high number
        
        // e.g. between 1 and 10 and make it an integer
        
        // Start with some constants defining the high and low
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula to generate in that range
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        // Now "cast" it to an int
        
        int value = (int)number;
        
        // And display it
        
        System.out.println("value = " + value);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code insode the block
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }

        // if with "else" (an option) for both true and false, checks 2 things

        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.println("Less than");
        }
        else {
            System.out.println("Greater than");
        }

        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement        
        
        char value5 = 'A', value6 = 'a';
        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
               
        // Use "else if" for multiple cases of more than 2 things (same as 
        // the "switch" statement - which I don't use) use string for this
        // example which are more complex (because they use many characters,
        // and upper and lower case) 
        // NOTE: with string NEVER use == ALWAYS use .equals()...
        
        String word1 = "edgy";
        String word2 = "edGy";
        
        if (word1.equals(word2)) {
            System.out.println("w1==w2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("w1 kind of == w2");
        }
        else {
            System.out.println("w1!=w2");
        }
        
        // Combine logic using "and" "or" "not" which uses the symbols:
        // "&&" for "and"
        // "||" for "or"
        // "!" for "not"
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 1.15) {
            // with "and" BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0.85) {
            // with "or" EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Simple loop...
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++; // counter = counter + 1
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            password = JOptionPane.showInputDialog("Create password");
        }
        
        // The next type of loop is rarely used (you may never need it)
        // it test for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";
        
        do {            
            
            choice = JOptionPane.showInputDialog("Enter password");
            
        } while (choice.equalsIgnoreCase(password) == false);
        
        
        JOptionPane.showMessageDialog(null, "You got it");
        
        // The "for" loop is used for counting (and for the upcoming unit
        // called "arrays")
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // count down (not up)
            // start at 100
            // stop at zero (including zero)
            // count by 10s
        
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
        }
        
        ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
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
// (7)  The word "null" means nothing and can act as a placeholder for code
//      you don't actually need (right now)
// (8)  To "comment out" chunks of code, select the code with your mouse or
//      keyboard, then click on the two buttons under the code tab
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) You can get more NetBeans tips and autocompletes by selecting 
//      Help -> Keyboard Shortcuts Card
// (11) A red squiggily line and/or a "lightbulb" in NetBeans means a potential 
//      error and a potential fix (if you click on the lightbulb)
// (12) Go to Tools -> Templates, scroll down and click on the "+" beside 
//      "Java", select "Java Main Class", and "Open in Editor" and the enter 
//      this into the temple:
//
//      /**
//        * ${name}.java - 
//        *
//        * @author Mr. Wachs 
//        * @since ${date} 
//        */
//       public class ${name} 
//       { .... etc .....     
// 
// (13) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (14) To autoformat code (fixes indents, extra spaces, etc.) select code with
//      mouse or keyboard (or it will format all if none is selected) and press
//      ALT + SHIFT + F  (you should do this before hand in!)





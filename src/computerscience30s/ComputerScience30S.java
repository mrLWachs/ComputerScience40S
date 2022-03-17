
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
//        learnIntroToJava();
        // The line above is a "call" to the method named "learnIntroToJava"
        // meaning the code stops at that line and "jumps" (or branches) to the
        // method written below. Then runs all the code inside that method
        // (the code in the 'block' of the method between two { } ) then comes
        // back to the next line after the "call" (execute, run, etc.)
        
        // In NetBeans, you can write the call to a method before you write the
        // method - then NetBeans will suggest (with a 'lightbulb') that it 
        // writes the method for you
        learnMethods();
    }

    private static void learnIntroToJava() {
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // (1) COMMENTS:
        ///////////////////////////////////////////////////////////////////////
                
        // This is a commment, all typing after "//" forward slashes until the  
        // line ends is a comment
        
        // Comments are not code, so you can write what you want
        
        /*         
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it see the closing 
            "star slash"  
        */
        
        ///////////////////////////////////////////////////////////////////////
        // (2) BASIC OUTPUTS:
        ///////////////////////////////////////////////////////////////////////
        
        System.out.print("Hello World"); // Comments can also be on code lines
        
        // Use the same line as above with the letters "ln" ("LN" in lower) as
        // this will add a "line break" at the end
        
        System.out.println("I'm in the world");
        
        // If you type "sout" and hit "TAB" (no spaces) it will automatically
        // type the next line...
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters")   
        
        System.out.println("Make a quotation mark \" ");
        System.out.println("Make a slash  \\ ");
        System.out.println("Make a \t tab");
        System.out.println("Make a \n new line");
        
        // These special ("escape sequences") start with "\" and then things
        // like "n" for a new line, etc. These may not be needed in this course
        
        ///////////////////////////////////////////////////////////////////////
        // (3) DIALOG OUTPUTS AND INPUTS:
        ///////////////////////////////////////////////////////////////////////
                
        // Make a "fancier" output with a dialog box...
        
        // Use the keyboard shortcut "CTRL + SPACE" to bring up autocomplete
        // at any point to help type all the code (including the correct upper 
        // and lower case letters) as well as doing an "import" line of code
        // at the top of the project automatically to "bring in" a library 
        // of code for you to make the dialog box in this next line...
        
        JOptionPane.showMessageDialog(null, "Hello");
        
        // The above line of code is the ONLY one needed for assignments, final 
        // projects, etc. to make outputs - however, these next lines are  
        // OPTIONS (not needed, but cool) for other types of dialog output 
        // message boxes as seen below...
        
        // Make more dialog outut boxes, with some variations (these are NOT
        // required for assignments in this course) - you ARE able to use them
        // (note: code can span multiple lines until it reaches 
        //  the semi colon ";")
        
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
                "Plain no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs...

        // The simpliest verison is the one you need to know
        
        JOptionPane.showInputDialog("Enter something");
        
        // There is a little more to using this that we cover 
        // after learning variables...
        
        // Some optional input dialogs below:
                                
        JOptionPane.showInputDialog(
                null, 
                "Input Information icon is i", 
                "Input Information Title", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Question icon is i", 
                "Input Question Title", 
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Warning icon is i", 
                "Input Warning Title", 
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Plain icon is i", 
                "Input Plain Title", 
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null,"Confirm");

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 3",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 4",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 5",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // (4) VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to store (or 
        // "remember") information (or "data")
        
        // This is an example of the simpliest variable type
        
        boolean a = true;
        
        // type name = value ;
        
        // When you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // "Variables" can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Most of the time, we create variables for:
        // (1) Getting user input (then store it in that variable)
        // (2) Formulas
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        // Output the variables...
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // The "char" is short for "character" holds (remembers) ONE character
        
        System.out.println("d = " + d);
        
        // The boolean, integer (int), double, character (char) are all simple
        // (primitive) data types, now a complex data type...
        
        String e = "apple";
        
        System.out.println("e = " + e);
        
        // Variable data types we can use:
        // (1) boolean - just true and false (different from "bool" in C#)
        // (2) int     - the integer, a whole number
        // (3) double  - can have decimals
        // (4) char    - character hold one character
        // (5) String  - holds a bunch of characters (uses capital "S")
        
        // Manipulate (use) our variables...
        
        int x = 10;
        
        System.out.println("x = " + x);
                
        x = 20;
        
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        System.out.println("y = " + y);
        
        // Code (like in math) likes to use shorthand (optional)
        
        y++;    // Means the same as y = y + 1
        y--;    // Means the same as y = y - 1
        
        // Even more shorthand (less recomended)...
        
        y += 10;    // Means y = y + 10;
        y -= 10;    // Means y = y - 10;
        y *= 10;    // Means y = y * 10;
        y /= 10;    // Means y = y / 10;
        
        System.out.println("y = " + y);
        
        // More complicated types of calculations might be needed for formulas, 
        // like for example the Modulus (mod) gives you the remainder of a 
        // division, in java and it uses the percentage "%" symbol for this
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change, and constants are
        // written in ALL_CAPITAL_LETTERS with an underscore to seperate words
        
        // They also start with the keyword "final" (in C# it was "const")
        
        final double  PI           = 3.141592658389;
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
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.99999999999;
        
        System.out.println("g = " + g);
        
        int h = (int) g;
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        System.out.println("h = " + h);
        
        // Casting again...
        
        double k = 2.999999999;
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
        
        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
        // at the front of the line that makes the input dialog (code above is
        // wrong, always make a string variable then the input dialog)
        
        String q = JOptionPane.showInputDialog("Enter string (text)");
        
        // The variable stores what they typed in the input dialog box
        // we test this by diplaying it right away
        
        JOptionPane.showMessageDialog(null, q);
        
        // With numbers (integers or doubles), you HAVE to start off with a 
        // string, and then convert it to a number. This is like:
        // Convert.ToInt32(text).... this was in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We use code to "parse" the string (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example with a double
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char (character)
        
        String v = JOptionPane.showInputDialog("Enter char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, w);
        
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
        
        double answer1 = Math.PI;
        double answer2 = Math.cos(0.5);
        double answer3 = Math.abs(-1);
        double answer4 = Math.pow(5,3);
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
        
        // Start with some constants defining the low and high
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula to generate a random number in the range
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        // Now cast it into an int
        
        int value = (int)number;
        
        // and diplay it
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int)( (53 - 2 + 1) * Math.random() + 2);
        System.out.println("card = " + card);
        
        ///////////////////////////////////////////////////////////////////////
        // (5) CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code inside the block
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with "else" (an option) for both true and false, check 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
        
        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement
        
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
                
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        String word1 = "edgy";
        String word2 = "eDgy";
        
        // NOTE: with strings NEVER use "==" ALWAYS use ".equals()"
        
        if (word1.equals(word2)) {
            System.out.println("W1==W2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("W1 kind of == W2");
        }
        else {
            System.out.println("W1!=W2");
        }
        
        // Combining logic using "and" "or" "not"
        // "And" - means BOTH have to be true
        // "Or" - means EITHER can be true
        // "Not" - reverses logic
        // In Java it uses symbols for these:
        // "AND" - "&&" (ampersand Shift 7)
        // "OR"  - "||" (pipe shift key above enter)
        // "NOT" - "!" (like not equal)
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 90) {
            // with "and" BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0) {
            // with "or" EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // (6) LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Simple loop...
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;  // counter = counter + 1;
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create a password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            password = JOptionPane.showInputDialog("Create another password");
        }
        
        // The next type of loop is rarely used (you may never need it)
        // it tests for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";
        
        do {            
            choice = JOptionPane.showInputDialog("Enter password");
        } while (choice.equalsIgnoreCase(password) == false);
        
        JOptionPane.showMessageDialog(null, "You got it!");
        
        // The "for" loop is used for counting (and for the upcoming unit 
        // called "arrays"). It is a much more technical ("codey") looking loop
        // The inside of the round brackets means: ( start ; end ; change)        
        // The for loop creates its own variable (by default NetBeans calls
        // it "i") - short for "iteration"
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // START - at 100
            // END (stops) - at zero (including zero)
            // CHANGE - count down (not up)
            //          count by 10s
        
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
        }
        
        ///////////////////////////////////////////////////////////////////////
        // (7) EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // Create welcome screen for the user (message dialog box)
        String message = "You are an intern at radio station, C-RAP, The \n"
                       + "disk jockeys announce the current temperature \n"
                       + "in both Fahrenheit and Celsius every half-hour.\n"
                       + "They would like an easy way to display both the \n"
                       + "Fahrenheit and Celsius temperatures quickly and \n"
                       + "at the same time. The local airport phones in \n"
                       + "the temperature (but only in Celsius). They \n"
                       + "have requested that you develop an application \n"
                       + "that will display both temperatures after the \n"
                       + "Celsius temperature is inputted. Note: Use \n"
                       + "this conversion formula F = (C ∗ 1.8) + 32";        
        // Get user input (temperature in celcius) - dialog
        String userInput = JOptionPane.showInputDialog("Enter temperature "
                + "in Celcius");
        // Convert this to a number I can do math with
        double celcius = Double.parseDouble(userInput);
        // Apply a formula  (F = (C ∗ 1.8) + 32 )
        double fahrenheit = (celcius * 1.8) + 32;
        // Show the user the results (fahrenheit) in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        // Show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        // This line terminates any running java program at any point
        // System.exit(0);
        
        // Curly brackets (braces, parenthesis) { and } are important - all 
        // code goes between these two brackets
        
    }

    private static void learnMethods() {
        System.out.println("Start Learning Methods...");
        
        // Methods (functions, procedures, actions) are named in a style like 
        // variables are named (lowercase then camel casing), but use verb
        // type words starting with lowercase then using camel casing the
        // presense of round brackets ( ) indicate a method. We make methods
        // for: (1) to break up a problem (2) reusability (3) to avoid 
        // repeating code
        
        // Code to "jump" to a method, is "calling" the method (method call)
        writeStar();
        
        // Call it again
        writeStar();
        
        // When we call a method, we place "data" (information) inside the
        // round brackets and that data is "passed" (sending) over to the 
        // method. The data being passed is tecehnically called the "argument"
        // and the data being recieved is called the "parameter(s)". You can
        // always change the arguement.
        
        write("Frog");
        
        write("Dragon");
        write("Panda");
        write("Tapeworm");
        write("Liger");
        
        // You can have more than one, multiple parameters/arguments in a 
        // method which are separated with commas ","
        
        writeLotsOf("Dalmations",101);
        
        writeLotsOf("Problems", 99);
        
        // You can make methods that "send back" (output) information, the 
        // previous methods needed information (inputs) as parameters or 
        // empty brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        
        
        
        System.out.println("Learning Methods complete!");
    }

    /**
     * Draws a star on the screen
     */
    private static void writeStar() {
        System.out.println("*");
    }
    
    /**
     * Draws something on the screen
     * 
     * @param thing the thing to draw
     */
    private static void write(String thing) {
        // Information (data) "passed" to this method is called the parameter,
        // if you use the lightbulb to write this method, you should (do this 
        // first) rewrite the name of that parameter
        System.out.println(thing);
    }

    /**
     * Draws something on the screen multiple times
     * 
     * @param thing the thing to draw
     * @param times how many times to draw the thing
     */
    private static void writeLotsOf(String thing, int times) {
        // If you use NetBeans and the lightbulb to write the method for you,
        // you should rename the parameters to what they more accurately 
        // represent - methods can have no parameters (empty brackets),
        // one parameter, or lots of parameters (separated with commas)
        for (int i = 0; i < times; i++) {
            write(thing);
        }
    }

    /**
     * Gives you a number
     * 
     * @return a random number between 1 and 10
     */
    private static int giveMeNumber() {
        // Methods can have no outputs (the word "void") or can have ONE output
        // which means the method will "return" that data type in the method
        return random(1,10);
    }

    /**
     * Generates a random number in a range between two numbers
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number less than or equal to low and greater than or 
     * equal to high
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double number = (H - L + 1) * seed + L;
        return (int)number;
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
// (11) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (12) Go to Tools -> Templates, scroll down and click on the "+" beside 
//      "Java", select "Java Main Class", and "Open in Editor" and the enter 
//      this into the temple (but use the slash "/" instead of "|"):
//
//      /** 
//       * ${name}.java - 
//       *
//       * @author Mr. Wachs 
//       * @since ${date} 
//       */
//      public class ${name} 
//       { .... etc .....     
//
// (13) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (14) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (15) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (16) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (17) If you hold down the CTRL key, method calls become links with the
//      mouse to jump to the method (even ones we don't write)
// (18) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 10) will help you write it
// (19) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (20) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
// (21) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make
// (22) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line

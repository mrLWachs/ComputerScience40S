
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
 * ComputerScience30s.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code example that might come up over the course.
 * 
 * @author Mr. Wachs
 * @since September 2023
 */
public class ComputerScience30S 
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The line below "calls" a method (by its name) like making a 
        // "phone call" it uses two round brackets "( )" like functions in
        // math - when you see two round brackets, it is a clue that a 
        // method is being called (or it is the method itself)
        
        // learnIntroToJava();
        
        // learnMethods(); // Calling another method (that may not yet exist)
        // If you call upon a method that does not yet exist, NetBeans can help
        // you create it (write it) by clicking on the lightbulb icon on the 
        // left side of NetBeans... 
        learnArrays();
    }

    private static void learnIntroToJava() {
        
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // This is a comment all typing after "//" until the line ends        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output
        System.out.println("Hello World");  // Comments can be on code lines
        
        // Use print without the "ln", does not add a line break at the end        
        System.out.print("I'm in");
        System.out.println(" the world");
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");             // \" makes quote
        System.out.println("Make a slash \\ ");             // \\ makes slash
        System.out.println("Make a \t tab ");               // \t makes tab
        System.out.println("Make a new line \n break ");    // \n makes new line
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Make a "fancier" output with a dialog box
        
        JOptionPane.showMessageDialog(null, "Hi");
 
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
                
        // However, these OPTIONS (not needed, but cool) for other
        // dialog output message boxes below...
        
        // Code could span multiple lines until it reaches a semi colon ";"
        // The light red line on the far right -------------------------------->
        // can be thought of as a "barrier" and you should try not to code too
        // much past this line
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        

        JOptionPane.showMessageDialog(
                null, 
                "Error icon is x",
                "Error title",
                JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs...
        
        // The simpliest version is the one you will need to know:
        
        JOptionPane.showInputDialog("Enter Something");
        
        // There is a little more to using this input dialog that we will 
        // cover after learning variables
        
        // Some other optional input dialogs...
        
        JOptionPane.showInputDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Error icon is x",
                "Error title",
                JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );                
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 3",
                "Question",
                JOptionPane.YES_NO_OPTION,
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
                "Error",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE
        );
                
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 6",
                "Plain",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to
        // store (or "remember") information (or "data")
        
        // This is an example of the simpliest variable type:
        
        boolean a = true;
        
        // type name = value ;
        
        // When you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // Variables can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        // Output our variables when outputted it always outputs the 
        // value stored in the variable not the name of it
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        // The "char" is short for "character" it holds (remembers) ONE
        // character
        
        char d = 'A';
        
        System.out.println("d = " + d);
        
        // The boolean ("bool" in C#), integer (int), double, and character
        // (char) are all simple (primitive) data types, now a "complex" data
        // type....

        String e = "apple";

        System.out.println("e = " + e);
        
        // Manipulate ("use") our variables:
        
        int x = 10;
        
        System.out.println("x = " + x);
        
        x = 20;
        
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        System.out.println("y = " + y);
        
        // Optional ("you don't have to use this code") shorthand...
        
        y++;    // Means the same as y = y + 1;
        y--;    // Means the same as y = y - 1;
        
        // Even more optional shorthand (less recommended)
        
        y += 10;    // Means the same as y = y + 10;
        y -= 10;    // Means the same as y = y - 10;
        y *= 10;    // Means the same as y = y * 10;
        y /= 10;    // Means the same as y = y / 10;
        
        System.out.println("y = " + y);
        
        // Modulus (mod) division gives you the remainder of a division
        // (not the normal answer) - in Java it uses the percentage "%"
        // symbol for this
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;
        
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("z = "+ z);

        // Constants are variables that don't change (they stay "constant"),
        // and constants are written in ALL_CAPITAL_LETTERS with underscores
        // to seperate words
        
        // They also start with the keyword "final" (in C# it was "const")
        
        final double  PI       = 3.141562658389;
        final int     PROBLEMS = 99;
        final char    YES      = 'Y';
        final boolean FOUND    = true;
        final String  TEACHER  = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " + 
                           YES      + ", " +
                           FOUND    + ", " +
                           TEACHER);
        
        // Constants are used for things like: easier code to maintain,
        // easier to read/understand (especially for other programmers)
                
        // Converting between variable data types...
        
        int f = 25;
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.9999999999;
        
        System.out.println("g = " + g);
        
        int h = (int)g;
        
        System.out.println("h = " + h);
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        double k = 2.99999999;
        int    l = (int)k;
        double m = (double)l;
        
        // Casting can happen with other data types...
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)70;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // Use dialog boxes (specifically the input) with variables...
        
        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
        // at the front of the line that makes the input dialog (code above is
        // wrong, always make a string variable then the input dialog)
        
        String q = JOptionPane.showInputDialog("Enter");
        
        // The variable (always has to start as a string) stores what the 
        // user types in the input dialog box
        
        JOptionPane.showMessageDialog(null, q);
        
        // With numbers, you HAVE to start off with a string, and then convert
        // it to a number. This is like Convert.ToInt32(text); in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We convert using code to "parse" (means "to read")
        
        int s = Integer.parseInt(r);
        
        // Always use a capital "I" and whole word "Integer" for this parsing
        // the string into a number
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example but with a double...
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char (single character)...
        
        String v = JOptionPane.showInputDialog("Enter char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
                
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
        
        // Math library also includes the ability to make random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        
        System.out.println("seed = " + seed);
        
        // The "seed" is the starting point - generates a random number between
        // zero and one (never gets to zero or one)
        
        // You can now use a formula for generating random numbers in a range
        // between a low and high value (e.g between 1 and 10 and an integer)
        
        // Start off with some constants to define the LOW and HIGH
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula...
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        System.out.println("low    = " + LOW);
        System.out.println("high   = " + HIGH);        
        System.out.println("number = " + number);
        
        // Now convert to int
        
        int value = (int)number;
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int)( (53 - 2 + 1) * Math.random() + 2);
        System.out.println("card is " + card);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code inside the block

        int value1 = 10;
        int value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with "else" (an option) for both true and false, check 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.print("The example is ");
            System.out.println("less than");
        }
        else {
            System.out.println("Greater than");
        }
        
        // You can have as many lines of code as you want in a "block"
        
        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement
        
        char value5 = 'A';
        char value6 = 'a';
        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        // NOTE: with strings NEVER use "==" ALWAYS use ".equals()"
        
        String word1 = "edgy";
        String word2 = "edGy";
        
        if (word1.equals(word2)) {
            System.out.println("W1=W2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("W1 kind of == W2");
        }
        else {
            System.out.println("W1!=W2");
        }
        
        // As an optional way to combine logic using: "and" "or" "not"
        // "and" means BOTH   must be true - uses the symbol "&&"
        // "or"  means EITHER can  be true - uses the symbol "||"
        // "not" reverse logic (so false)  - uses the symbol "!" 
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 18 && iq > 90) {
            // with "and" ("&&") BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0) {
            // with "or" ("||") EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Loops ARE just like conditional statements (like "if") BUT the code
        // keeps repeating while something is TRUE...
        
        // Simple loop
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;  // Shorthand for "counter = counter + 1"
        }
        
        // Loop with a string...
        
        String password = JOptionPane.showInputDialog("Create a password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again");
            password = JOptionPane.showInputDialog("Create another password");
        }
        
        JOptionPane.showMessageDialog(null, "Ok, continue...");
        
        // The next type of loop is rarely used (you may never need it)
        // it tests for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";
        
        do {            
            choice = JOptionPane.showInputDialog("Enter password");
        } while (choice.equalsIgnoreCase(password) == false);
        
        JOptionPane.showMessageDialog(null, "You got it");
        
        // The "for" loop is used for counting (and for the upcoming unit 
        // called "arrays"). It is a much more technical ("codey") looking loop
        // The inside of the round brackets means: ( start ; end ; change)        
        // The for loop creates its own variable (by default NetBeans calls
        // it "i") - short for "iteration"
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // start at 100
            // end (stop) at zero (including zero)
            // count down (not up)
            // count by 10s (not 1s)
        
        for (int counting = 100; counting >= 0; counting -= 10) {
            System.out.println("counting = " + counting);
        }
        
        // After you autocomplete a for loop (by typing "for" then tab),
        // you can immediately rename the varaible "i" (which is highlighted)
        // to whatever you want, if you press tab a second time, it will 
        // highlight the ending value of the loop

        // One more for "fun"

        for (double i = 99.789; i > 15.6; i/=5.25) {
            System.out.println("i = " + i);
        }

        ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // Create welcome screen for the user (message dialog box)
        JOptionPane.showMessageDialog(null, 
                         "You are an intern at radio station, C-RAP, The \n"
                       + "disk jockeys announce the current temperature \n"
                       + "in both Fahrenheit and Celsius every half-hour.\n"
                       + "They would like an easy way to display both the \n"
                       + "Fahrenheit and Celsius temperatures quickly and \n"
                       + "at the same time. The local airport phones in \n"
                       + "the temperature (but only in Celsius). They \n"
                       + "have requested that you develop an application \n"
                       + "that will display both temperatures after the \n"
                       + "Celsius temperature is inputted. Note: Use \n"
                       + "this conversion formula F = (C ∗ 1.8) + 32"); 
        
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
                
        // When preparing this for hand in, you should first:
            // Make sure all comments are done
            // Clean up your code (see tip 12 below)
            // Watch out for long code lines (beyond the border)
            // Set NetBeans for printing a HTML document (see tip 15 below)
            // Create as many screen captures as needed to prove it works
        
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
        
        // Call it again (now that we have the method, autocomplete recognizes
        // it and you can find it when you press CTRL + SPACE)
        writeStar();
        
        // When we call a method, we place "data" (information) inside the
        // round brackets and that data is "passed" (sending) over to the 
        // method. The data being passed is technically called the "argument"
        // and the data being received is called the "parameter(s)". You can
        // always change the arguement.
        
        write("Defenestration");
        write("Vollywood");
        write("pancakes");
        write("Spider-man");
        write("Batman");
                
        // You can have more than one, multiple parameters/arguments in a
        // method which are seperated with commas ","
        
        writeLotsOf("Dalmations",101);
        writeLotsOf("Problems",99);
        
        // You can make methods that "send back" (output) information, the 
        // previous methods needed information (inputs) as parameters or 
        // empty brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        // Overloaded methods are methods with the same name, BUT different
        // parameters / arguments
        
        output("Hello");
        
        output("Good-Bye","Learning Methods");
        
        System.out.println("Completed Learning Methods!"); 
    }
    
    /**
     * Writes a star on the screen
     */
    private static void writeStar() {
        System.out.println("*");
    }

    /**
     * Writes something on the screen
     * 
     * @param thing the something to write
     */
    private static void write(String thing) {
        // Information (data) "passed" to this method is called the parameter,
        // if you use the lightbulb to write this method, you should (do this 
        // first) rewrite the name of that parameter
        System.out.println(thing);
    }

    /**
     * Writes something on the screen multiple times
     * 
     * @param thing the something to write 
     * @param times how many times to write it
     */
    private static void writeLotsOf(String thing, int times) {
        // Methods can have no parameters, one parameter, or lots of parameters,
        // if it has more than one parameter, they are separated by commas
        for (int i = 0; i < times; i++) {
            write(thing);
        } 
    }

    /**
     * Gives you a number
     * 
     * @return a random number between 0 and 100
     */
    private static int giveMeNumber() {
        // Methods can have no outputs (the word "void") or they can have
        // ONE output which means the method will "return" (the keyword to use)
        // that data type defined in the method signature line
        return random(0, 100);
    }
    
    /**
     * Generates a random number in range between two numbers
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number less than or equal to the low and greater than
     * or equal to the high
     */
    private static int random(int low, int high) {
        double seed   = Math.random();                  // Seed value (random)
        double L      = (double)low;                    // Casting into a double
        double H      = (double)high;                   
        double number = (H - L + 1) * seed + L;         // Random number Formula
        return (int)number;                             // Cast back into a int
    }
    
    /**
     * Display text in a dialog
     * 
     * @param text the test to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Displays text in a dialog with a title at the top of that dialog
     * 
     * @param text the text to display
     * @param title what to show at the top (title) of the dialog
     */
    private static void output(String text, String title) {
        // Overloaded methods are methods with the same name, BUT different 
        // parameter(s) / arguement(s) so we know which version of the 
        // method to call
        JOptionPane.showMessageDialog(null, text, title, 
                JOptionPane.PLAIN_MESSAGE);
    }    

    /**
     * Learn the content of the arrays unit (unit 3)
    */
    private static void learnArrays() {
        System.out.println("Start learning arrays...");
        
        // An array is a collection of similar data elements (values or 
        // variables) of same memory size each stored at contiguous memory 
        // (right next to each other in sequence) locations. It is a data
        // structure where each data element can be accessed directly by 
        // using its index number (or "spot", "element", "key", "subscript")
        
        
        
        System.out.println("Completed learning arrays!");
    }
    
}

// <editor-fold>

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
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click the lightbulb)
// (11) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (12) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (13) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (14) To have NetBeans automate code comments for assignments, select the 
//      code below this tip, and uncomment it (see tip 8) and then copy the 
//      same (uncommented) code. Then go to the menu: Tools -> Templates, and
//      scroll down and click on the "+" beside "Java", and select 
//      "Java Main Class", and "Open in Editor" and the enter (paste) this into
//      the template (instead of the text that is already there). Then close 
//      and save the Template so it now applies to every new project you make...
//
///** Required package class namespace */
//package ${package};
//
//
///*
// * ${name} - description
// * 
// * @author Your Name
// * @since ${date}
//*/
//public class ${name}
//{
//
//    /**
//     * Main method for the project
//     * 
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
//
//}
//
// (15) When preparing code for hand in: I would suggest the first option, but
//      you can also do the second: (A) Go to the menu File -> Print to HTML...
//      click Browse to select a location and name the file (end the name with
//      ".html") to save a HTML file with all your code (it will already be
//      properly formatted. (B) Alternatively, you can "print" your code to a
//      PDF file but first you need to set NetBeans (this only needs to be done
//      once), by clicking on "Print Options" and uncheck everything previously
//      checked off, and then check off "Print as in Editor", then either print
//      it to a PDF (which means select "Microsoft Print to PDF" on the next 
//      screen), or cancel and resize the code to fit better (see tip #1) and 
//      then print again
// (16) The + and - signs and gray lines along the left side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (17) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 10) will help you write it
// (18) To remove the line that gets added to methods when you use the lightbulb
//      "throws new excepton..." you go to Tools -> Templates, and scroll down
//      and click on the "+" beside "Java", and select "Code Snippets" and 
//      "Generated Method Body" and then Open in Editor - then delete the 
//      last line and then save and close the template
// (19) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (20) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
// (21) If you hold down the "CTRL" key and then click on a call to a method the
//      call becomes a "link" and jumps to the method itself
// (22) NetBeans can auto comment methods if you type "/**" above the method
//      signature line, it will add the comment and define what needs to be
//      commented for the method (using the "JavaDoc" commenting style)

// </editor-fold>
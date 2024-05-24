
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package computerscience30s;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/**
 * ComputerScience30s.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code example that might come up over the course.
 * 
 * @author Mr. Wachs
 * @since February 2024
 */
public class ComputerScience30S 
{

    /**
     * Default constructor, sets class properties
     */
    public ComputerScience30S() {        
        // "Call" a method (means you use the name of the method)
        System.out.println("\nComputer Science 30S Example started...\n");
        final String[] OPTIONS = {
            "See examples of learning basic Java (unit 1)",
            "See examples of learning methods in Java (unit 2)",
            "See examples of learning arrays in Java (unit 3)",
            "See examples of learning classes in Java (unit 4)",
            "See optional examples of learning graphics in Java (optional unit)"
        };
        String choice = JOptionPane.showInputDialog(null, 
                "Select the Mr. Wachs unit to view below:", 
                "Computer Science 30S", JOptionPane.PLAIN_MESSAGE, null, 
                OPTIONS, OPTIONS[0]).toString();
        if      (choice.equals(OPTIONS[0])) learnIntroToJava();  
        else if (choice.equals(OPTIONS[1])) learnMethods();  
        else if (choice.equals(OPTIONS[2])) learnArrays();  
        else if (choice.equals(OPTIONS[3])) learnClasses();  
        else if (choice.equals(OPTIONS[4])) {
            LearnGraphics learnGraphics = new LearnGraphics();
        }
        else                                System.exit(0);
        System.out.println("\nComputer Science 30S Example completed!\n"); 
    }

    /**
     * Learn the content of the introduction unit (unit 1)
     */
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
        System.out.print("Hello World"); // Comments can be on code lines
        
        System.out.print(" I'm in ");
        // Spaces, you have to add them inside the quotes
        
        System.out.println("The world!");
        
        // There are "shortcuts" to coding (see the tips below)        
        System.out.println("Good-bye World");
        
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");         //  \" Makes quote
        System.out.println("Make a slash \\ ");         //  \\ Makes slash
        System.out.println("Make a \t tab ");           //  \t Make "tab" 
        System.out.println("Make a \n new line break"); // \n Makes break
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Make a "fancier" output with a dialog box ("Message box")
        
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
                "Error icon is X",
                "Error Title",
                JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain icon (no icon)",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs....
        
        // The simpliest version (is the one you will need to know):
        
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
        
        JOptionPane.showConfirmDialog(null, "confirm");
        
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
        
        // Even more shorthand (less recommended)
        
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
        
        final double  PI       = 3.1415962658389;
        final int     PROBLEMS = 99;
        final char    YES      = 'Y';
        final boolean FOUND    = true;
        final String  TEACHER  = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " + 
                           YES      + ", " + 
                           FOUND    + ", " + 
                           TEACHER);
        
        // In a line of code, one space or multiple spaces doesn't matter
        // as seen above when declaring constants (it only matter when
        // between quotation marks). You can hit enter in a line of code
        // to break to a new line, because the computer will still consider
        // it ONE line of code until we reach the semicolon.
        
        // Constants are used for things like: easier code to maintain,
        // easier to read/understand (especially for other programmers)
        
        // Converting between variable data types...
        
        int f = 25;
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.9999999999;
        
        System.out.println("g = " + g);
        
        int h = (int) g;
        
        System.out.println("h = " + h);
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        double k = 2.9999999;
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
        
        JOptionPane.showMessageDialog(null, q);
        
        // The variable (always has to start as a string) stores what the 
        // user types in the input dialog box
        
        // With numbers, you HAVE to start off with a string, and then convert
        // it to a number. This is like Convert.ToInt32(text); in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We convert using code to "parse" (means "to read")
        
        int s = Integer.parseInt(r);
        
        // Always use a capital "I" and whole word "Integer" for this parsing
        // the string into a number
        
        JOptionPane.showMessageDialog(null, "int is " + s);
        
        // Same example but with a double...
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, "double is " + u);
        
        // Example with a char (single character)...
        
        String v = JOptionPane.showInputDialog("Enter char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, "char is " + w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        // Strings have MANY built-in "actions" (function, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        int length = word.length();
        
        System.out.println("word " + word + " is length " + length);
        
        String upper = word.toUpperCase();
        
        System.out.println("word " + word + " in upper case is " + upper);
        
        // Many more string functions can be explored
        
        // "Math" library of code is also "built-in" to java
        // which comes with it's own functions (actions, methods)
        
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
        
        // The "seed" generates a number (decimal) between
        // 0 and 1 (but it never reaches 0 or 1)
        
        System.out.println("seed = " + seed);
        
        // You can use a formula for generatiing random numbers in a range
        // between a low and a high number
        
        // e.g. between 1 and 10 and make it an integer
        
        // Start with some constants defining the low and high
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula to generate in that range
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        // Now cast it into an int
        
        int value = (int)number;
        
        // and display it
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int) ( ( 53 - 2 + 1 ) * Math.random() + 2 );
        System.out.println("card = " + card);
        
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
        
        // Using a comma is a option (I do not recomend)
        
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
        
        char value5 = 'A';
        char value6 = 'a';        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        // NOTE: with string NEVER use == ALWAYS use .equals()...
        
        String word1 = "edgy";
        String word2 = "edGy";
        
        if (word1.equals(word2)) {
            System.out.println("W1==W2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("W1 kind of == W2");
        }
        else {
            System.out.println("W1!=W2");
        }
        
        // Combine logic using "and" "or" "not" which use the symbols:
        // "&&" for "and"
        // "||" for "or"
        // "!"  for "not"
        
        int age = 17;
        double iq = 100.0;
        
        if (age >= 21 && iq > 130) {
            // with "AND" (&&) BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq >= 100) {
            // with "OR" (||) EITHER can be true
            System.out.println("Keep trying");
        }
        else if (!(age < 200 && iq <= 200)) {
            // the "NOT" ! REVERSES the logic
            System.out.println("?");
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
            counter++;  // counter = counter + 1;
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again");
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
            // count by 10s
            
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
        }
            
        for (int i = 100; i <= 500; i*=2) {
            System.out.println("running...");
        }
        
         ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
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
        // convert this to a number I can do math with
        double celcius = Double.parseDouble(userInput);
        // apply a formula  (F = (C ∗ 1.8) + 32 )
        double fahrenheit = (celcius * 1.8) + 32;
        // Show the user the results (fahrenheit) in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        // show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        // This line terminates any running java program at any point
        // System.exit(0);
        
        // Curly brackets (braces, parenthesis) { and } are important - all 
        // code goes between these two brackets  
    }

    /**
     * Learn the content of the methods unit (unit 2)
     */
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
         
        // When we call a method, we sometimes place "data" (information) 
        // inside the round brackets and that data is "passed" (sending) over 
        // to the method. The data being passed is tecehnically called the
        // "argument" and the data being recieved is called the "parameter(s)". 
        // You can always change the arguement.
        
        write("Spider-man");

        write("Batman");
        write("Wonder woman");
        write("Ant-man");
        
        // You can have more than one, multiple parameters/arguments in a 
        // method which are seperated with commas ","
        
        writeLotsOf("Dalmations", 101);
        
        writeLotsOf("Problems", 99);
        
        // You can make methods that "send back" (output) information, the 
        // previous methods needed information (inputs) as parameters or 
        // empty brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        // Overloaded methods are methods with the smae name, BUT different
        // parameters / arguments
        
        output("Hello");
        
        output("Good-bye","Learning Methods");
                
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
     * @param times how many times to write ut
     */
    private static void writeLotsOf(String thing, int times) {
        // Methods can have no parameters, one parameter, or lots of parameters,
        // if it has more than one parameter, they are separated by commas
        for (int i = 0; i < times; i++) {
            write(thing);
        }
    }

    /**
     * Gives you a random number
     * 
     * @return random number between 1 and 10
     */
    private static int giveMeNumber() {
        // Methods can have no outputs (the word "void") or can have ONE output
        // which means the method will "return" that data type in the method
        return random(1, 100);
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
        double number = ( H - L + 1 ) * seed + L;
        return (int)number;
    }

    /**
     * Display text in a dialog
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Display text in a dialog with a title at the top of the dialog
     * 
     * @param text the text to display
     * @param title what to show at the top of the dialog
     */
    private static void output(String text, String title) {
        // Overloaded methods are methods with the same name, BUT different
        // parameters / arguments so we know which version of the method to call
        JOptionPane.showMessageDialog(null, text, title, 
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Learn the content of the arrays unit (unit 3)
     */
    private static void learnArrays() {
        System.out.println("Start Learning Arrays...");
        
        // Create (declare) a variable (for comparison)
        int variable = 5;
        
        // E.g. in memory a variable could "look" like...
        //
        //          +-------+
        // variable |   5   | (type integer)
        //          +-------+
        
        // Now declare (create) an array:
        
        int array[] = new int[5];
        
        // The order of words in declaring an array:
        // (1)    (2)    (3)   (4)   (5)     (6)    (7)                     (7)
        // type   name   [ ]    =    "new"   type    [ size of the array ]   ;
                
        // E.g. in memory an array could "look" like...
        //
        //       +-------+-------+-------+-------+-------+
        // array |       |       |       |       |       | (a length of 5)
        //       +-------+-------+-------+-------+-------+
        
        // Array names are usually "plural" words
        // The square brackets "[  ]" in code indicate we are using an array, 
        // the word "new" is used because arrays (they are technically 
        // "advanced" data types) are more complicated than variables (which 
        // are "simple" or "primitive" data types) then you repeat the data 
        // type ("int" in this case) and the square brackets are also repeated 
        // with a number (or a variable) inside - this number represents the 
        // SIZE of the array. When arrays are first created, they are EMPTY.
        
        // The array has now 5 "spots" (or "index", "elements", "subscript")
        // which automatically numbers them - BUT the first spot is ALWAYS
        // numbered as spot zero and the rest and numbered in order:
        //
        //       +-------+-------+-------+-------+-------+
        // array |       |       |       |       |       | (indexed)
        //       +-------+-------+-------+-------+-------+
        //           0       1       2       3       4
        
        // Now we assign values to all individual spots (indices):
        array[0] = 25;
        array[1] = 250;
        array[2] = 2;
        array[3] = -25;
        array[4] = 0;
        
        //       +-------+-------+-------+-------+-------+
        // array |   25  |  250  |   2   |  -25  |   0   | (now filled)
        //       +-------+-------+-------+-------+-------+
        //           0       1       2       3       4
        
        // These next lines would be errors when the code runs:
        // array[5] = 25;
        // array[500] = 25;
        // array[-1] = 25;
        // They would be "out of bounds" errors (or "range" error)
        
        // Declare an array (a little different) of NO size...      
        double[] a;
        
        // In memory...
        //
        // a
        //
        
        // Later on (in the code) you can re-create (re-declare, re-dimension, 
        // or resize) using the same array but now giving it some size (but 
        // still empty)
        
        a = new double[3];
        
        // In memory....
        //
        //   +----------+----------+----------+
        // a |          |          |          | (now has size of 3, but empty)
        //   +----------+----------+----------+
        //        0          1          2
        
        // Now fill the content
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;

        //   +----------+----------+----------+
        // a |   1.1    |   2.2    |   3.3    | (now it is filled with content)
        //   +----------+----------+----------+
        //        0          1          2
        
        // You can re-dimension (resize) an array multiple times, BUT
        // every time it wipes out any content stored in the array
        a = new double[5];
        
        //   +----------+----------+----------+----------+----------+
        // a |          |          |          |          |          | (size 5)
        //   +----------+----------+----------+----------+----------+
        //        0          1          2          3          4
        
        // Another way to declare arrays, but this way creates the array of
        // a set size, BUT with pre-filled values inside (make and fill at the
        // same time - on the same ONE line of code) - you can as an option,
        // put the "[]" beside the data type OR the array name
        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
        
        //       +------+------+------+------+------+
        // coins | 0.05 | 0.10 | 0.25 | 1.00 | 2.00 |  (has a length of 5)
        //       +------+------+------+------+------+
        //          0      1      2      3      4  
        
        // You can also create CONSTANT arrays that are pre-filled, the name
        // we gives array should be a plural word (e.g. 'scores' (array name)
        // not 'score' (variable name), 'names' not 'name', etc.)  
        
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Quit"
        };
        
        // When using arrays, use individual elements (spots, indices - the 
        // plural of "index") of the array like regular variables, for example
        
        int[] numbers = new int[100];
        
        // Change (assign) a index (spot)
        numbers[99] = 333;
        
        //         +-----+-----+-----+
        // numbers |     | ... | 333 | (length is 100)
        //         +-----+-----+-----+
        //            0    ...   99
        // Remember, the last index is always ONE LESS than the length
        
        // Output that spot
        System.out.println(numbers[99]);
        
        // Perform equations with array indices like variables
        numbers[0] = numbers[99] + numbers[99];
        System.out.println(numbers[0]);
        
        // To work with, and to "travel" (means to "visit" every spot) the 
        // entire array, we use a loop!
        
        // Specifically, the FOR loop!
        
        // for loops were literally built for arrays
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
        // The for loop is perfect because it automatically (when I type "for"
        // and TAB) starts at 0, goes up by 1, is "less than" then ending 
        // number (which can be the length)
        
        
        // When using the for loop with arrays, it is even BETTER to use a
        // built-in feature of all arrays! All arrays have a ".length" feature
        // for example 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = " + numbers[i]);
        }
        // Tip: if type "for" TAB, then TAB AGAIN it jump to the ending value
        // So if the array size changes, the loop adapts to it
        
        // Array can easily work with methods, the arrays can be sent into a 
        // method (as one of multiple parameters, or the only parameter), and 
        // arrays can be outputted (returned) from a method - in other words:
        // Arrays can be INPUT(s) or OUTPUT from a method
        
        output(array);      // Send a array to a method as a parameter
        output(numbers);    // Call the method with a different argument
        output(coins);      // Overload the "output" method again
        
        int[] randoms = random(1,10,50);    // Overload "random" method
        output(randoms);
        
        // Multi-dimensional array (also known as a "array of arrays", or a 
        // array filled with other arrays, 2D, etc.) - and also known as a 
        // table, grid, or a MATRIX
        
        // Create some constants to use when building the matrix (these are
        // not needed to declare a matrix, but they might help in understanding 
        // it) - we make contants as a way to "visualize" what we are building
        
        final int ROWS    = 30; // "dimension" going "down" (also like "y" axis)
        final int COLUMNS = 40; // "dimension" going "across" (also like "x")
        
        // We declare (create) a matrix , by adding multiple sets of square
        // brackets (a set of brackets for each dimension)
        
        char[][] matrix = new char[ROWS][COLUMNS];
        
        // If we "visualize this as a 3 by 4 matrix (3 rows by 4 columns), or 
        // y = 3 and x = 4, or a "height" of 3 and a "width" of 4, then it
        // could be "seen" as...
        //
        //               (columns, width, x axis is 4, meaning 0-3)
        //
        //                     0         1         2         3
        //                +---------+---------+---------+---------+
        // (rows,       0 |         |         |         |         |
        //  height,       +---------+---------+---------+---------+
        //  y axis      1 |         |         |         |         |
        //  is 3,         +---------+---------+---------+---------+
        //  meaning     2 |         |         |         |         |
        //  0-2)          +---------+---------+---------+---------+
        // 
        // A matrix "row" can also be "visualized" as the matrix "height"
        // A matrix "column" can also be "visualized" as the matrix "width"
        
        // Fill the matrix with random characters...
        // (using a method for random characters)
        
        final char LOW  = '!';
        final char HIGH = '~';
        
        // Test our method first
        char character = random(LOW, HIGH);
        System.out.println("Random character was " + character);
        
        // Fill our matrix (meaning put content in every location/index/spot
        // in the matrix) by traversing (travelling, 'visit' every spot) the
        // matrix and adding random characters (our method) - when traversing
        // matricies (plural of matrix) we use multiple nested for loops
        
        // We might rename looping variables to better understand what the 
        // nested for loops are refering to (e.g. like row, column, x, y)
        // With Netbeans, when you rename a loop variable it renames all 3
        
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random(LOW, HIGH);
            }
        }
        
        // Output the matrix, by turning it into a string (using our new method)        
        String text1 = toString(matrix);
        System.out.println(text1);
        
        // Another matrix, but they (matricies) can also be made with pre-set
        // values (like 1D arrays)
        
        final char[][] TIC_TAC_TOE = {
            { 'X', 'O', 'X' },
            { 'O', 'X', 'O' },
            { 'X', 'O', 'X' }
        };
        
        String text2 = toString(TIC_TAC_TOE);
        JOptionPane.showMessageDialog(null, text2);
        
        // Optional Graphics code...
        
        // Download graphic file(s) to use, and we examine the "names" of these
        // files:
        
        String first  = "C:\\1temp\\";  // AKA: directory, path, folder
        String middle = "matrix";       // What the user usually enters
        String last   = ".gif";         // File "extension" or type
        // Every file "name" has a first, middle and last name
        String image1 = first + middle + last;
        String image2 = "C:\\1temp\\ticTacToe.gif";
        
        // Call a method to display a "fancy" dialog
        // (have a picture, formatted text: font, size, color)
        message(text1,image1,"The Matrix");
        message(text2,image2,"Tic-Tac-Toe");
        
        System.out.println("Completed Learning Arrays!");
    }

    /**
     * Outputs an array of integers in a dialog
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        // Arrays can be a parameter (or one of the parameters)
        String text = "Array = [";    // Created a string to fill up
        // Loop (traverse) through the array and add the contents to the string        
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + ",";
        }        
        text += "]";    // "+=" means the same as "text = text + ..."        
        output(text);           // Outputs it by calling an overloaded method
    }

    /**
     * Convert all the doubles into integers and then output the array in a 
     * dialog
     * 
     * @param array the array of doubles
     */
    private static void output(double[] array) {
        int[] a = convert(array);   // Create int array of converted doubles        
        output(a);                  // Now output the converted array
    }

    /**
     * Converts an array of doubles into an array of integers
     * 
     * @param array the array of doubles
     * @return an array of integers
     */
    private static int[] convert(double[] array) {
        // Methods can return (output) entire arrays
        int[] a = new int[array.length];      // Create empty array (same size)
        for (int i = 0; i < a.length; i++) {  // Traverse the array
            a[i] = (int)array[i];             // Cast the double into a int
        }        
        return a;                             // Return the converted new array        
    }

    /**
     * Generates an array of a set size filled with random integers in the 
     * range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    private static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // Create empty array of passed size
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low, high); // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
    
    /**
     * Generates a random character between tow low and high characters
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    private static char random(char low, char high) {
        return (char)random((int)low, (int)high);     // cast to int and back  
    }
    
    /**
     * Change the matrix into a single string (for outputting)
     * 
     * @param matrix the 2D array of characters
     * @return a single string representing the matrix
     */
    private static String toString(char[][] matrix) {
        String text = "";   // Create string variable to store all values
        // Use the nested for loops (with simplier varaibles names) and
        // use the ".length" but also in the nested loop, we will use 
        // the ".length" of that particular array
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                // Means the length of "this row"  
                text = text + matrix[r][c] + " ";
            }     
            text = text + "\n";     // Add a line break after each row
        }     
        return text;            // Return the filled up string
    }

    /**
     * Displays a 'graphical' version of the message dialog (for JOptionPane)
     * to the user, including a custom image, colors (background / foreground),
     * new font (includes the type of font and the size) along with text and 
     * title.
     * 
     * @param text what text to show in the dialog
     * @param imageName the full (first, middle, last) name of the image
     * @param title the title at the top of the dialog
     */
    private static void message(String text, String imageName, String title) {
        // We set up some 'graphical' "things" to make the dialog more 
        // interesting by 'importing' the code that does this (we are not 
        // writing that specific code, we are 'using' others code)
        
        // Using capital letters and importing (using the lightbulb) and a line
        // similar to the way we declare arrays, and using round brackets 
        // (implies a method? - we will study in the next unit 'classes') 
        
        Color background = new Color(0,0,0);
        // The three numbers in "Color" are for red, green and blue values 
        // from 0 (no amount) up to 255 (the maximum amount of that color) 
        Color foreground = new Color(0,255,0);
        
        // Fonts are done the same way (import, declare them)
        Font font = new Font("Consolas", Font.PLAIN, 18);
        // Inside the bracket we put the font name (must be installed on this 
        // computer), style (e.g. plain, bold, underline, etc.) - uses a 
        // CONSTANT style, and finally the font size (in points)
        
        // For image, we need an image file downloaded onto the computer and we  
        // need the NAME of that image (name includes the ending part or 
        // extension, and I also need the path to get to that image / folder).
        // To do this, right click and go to properties and "Location" and 
        // copy/paste. It will change the "\" to two "\\" and also type two of 
        // those at the end...
        
        // Create a "icon" for the image (icon is like a picturebox) and also 
        // use "ImageIcon" - connected to the image name (which is the actual 
        // image on our computer)          
        Icon image = new ImageIcon(imageName);
        
        // Now need something that can display the fonts and colors - called a 
        // "text area" (can use intellisense, with CTRL + SPACE, which 
        // automatically imports it)  
        JTextArea area = new JTextArea();
        
        // Now we add things into the area, using methods built into the text 
        // area object
        area.setText(text);
        area.setBackground(background);
        area.setForeground(foreground);
        
        // Now we finally display the dialog box, BUT we USE the text area and 
        // the image in the dialog as parameters
        JOptionPane.showMessageDialog(
                null, 
                area, 
                title, 
                JOptionPane.PLAIN_MESSAGE, 
                image
        );
    }

    /**
     * Learn the content of the classes unit (unit 4)
     */
    private static void learnClasses() {
        System.out.println("Start Learning Classes...");
        
        // Create a "person" (add a class called "Person" to this Java project)
        // To do this, click on File - New File (or icon on toolbar)
        // A dialog will appear and you select "Java" and "Java Class"
        // Then next...
        // Then give it a name (starts with a capital letter and camel casing)
        // Then click finish!
        
        // use a line of code like this:
        // Random random = new Random();
        Person person = new Person();
        // Class object = new Class() <--- implies a method?
        // that is the call to the constructor method
        
        // We can call (invoke) methods within the object
        // person.born();
        // The original "born" method was changed into a constructor
        
        // Use (call,invoke) other methods and change properties
        person.talk();
        person.name = "Personoy Personifcaus";
        person.gender = "person";
        
        // Note: this method was originally public but then it was
        // "encapsulated" by making it a private (helper) method so it can 
        // no longer be called (invoked) outside the class
        
        // person.birthday();
        person.talk();
        
        // Create (instantiate) another object with a different (overloaded) 
        // constructor  
        Person other = new Person("Another Name");
        other.birthday(18);
        other.talk();
        
        // Another instance using the 3rd constructor option
        Person third = new Person("Three Thurdy",33,"female");
        third.talk();
        
        // Create a Student object and call it's methods (including the 
        // ones it inherited from the Person class)  
        Student student = new Student("Robert Studentson",17,"non-binary",123);
        student.talk();
        // Call (invoke) methods specifically for the student class
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        // Still can call inherited methods
        student.die();
        student.talk();
        
        // Instantiate a Husky object
        Husky husky = new Husky("Havoc", 17, "Husky", 2665);
        husky.talk();
        
        // Make a Teacher instance
        Teacher teacher = new Teacher("Mr. Wachs");
        teacher.talk();
        
        // Assigned student objects to the public array
        teacher.students[0] = student;
        teacher.students[1] = husky;
        
        // Called talk again to see the students we added
        teacher.talk();
        
        // Build (declare, initiaize, instantiate) a Meeting object
        Meeting meeting = new Meeting();
        
        // Calling our polymorphic method
        meeting.attend(person);
        meeting.attend(other);
        meeting.attend(third);
        meeting.attend(student);
        meeting.attend(husky);
        meeting.attend(teacher);
        
        meeting.hold();   
        
        System.out.println("Completed Learning Classes!");
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
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
// (11) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (12) To make projects easier and automate some tasks, go to 
//      Tools -> Templates, scroll down and click on the ">" beside "Java", 
//      select "Java Main Class", and "Open in Editor" and the enter 
//      the text below (by uncommenting it, then copying it, and pasting it 
//      into the temple (first delete all the text in the template and then 
//      replace what is there with this by pasting it):
//
///** Required package class namespace */
//package ${package};
//
//
///*
// * ${name} - description
// * 
// * @author YOUR NAME
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
// (13) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (14) When printing code for hand in, when in NetBeans (after the code is 
//      cleaned up and ready - see tip 13) go to File -> Print to HTML... and 
//      then use the dialog box that appears to select a location you can find 
//      the HTML file, and give the file you are saving a good name (with your 
//      name in the file name). Then use the hand in page to hand in the files
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
// (23) All arrays have a ".length" feature built in that you can have NetBeans
//      autocomplete for you by typing the name of your array, then dot length
//      (".length") which automatically gives you how many elements are in
//      the array
// (24) When writing for loops with array, if you type "for" then press TAB, 
//      and then press TAB AGAIN it jump to the ending value (which should be 
//      the ".length" of the array (so if the array size changes, the loop 
//      adapts to it) - the loop variable "i" also represents the array "index"
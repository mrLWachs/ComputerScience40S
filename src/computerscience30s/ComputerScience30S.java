
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
 * @since September 2021
 */
public class ComputerScience30S {        // Curly brackets DO NOT remove

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
//        learnIntroToJava();
//        learnMethods();       
        learnArrays();
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnIntroToJava() {
        // TODO code application logic here
        
        // This is a comment, all typing after "//" foward slashes
        // until the line ends is a comment
        
        // Comments are not code, so you can write what you want
                
        
        /* 
            This is for multiple line comments, as it covers as 
            many lines as you want starting with "slash star" until
            it sees the closing "star slash"
        */
        
        System.out.println("Hello World");  // Comments can be on code lines
        
        // Use print without the "ln", does not add
        // a line break at the end
        
        System.out.print("I'm in");
        System.out.println(" the world");
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... 
        // (these are "special" characters)
        
        System.out.println("Make a quote \" ");
        System.out.println("Make a slash \\ ");
        System.out.println("Make a \t tab ");
        System.out.println("Make a \n new line ");
        
        // Make a "fancier" output with a dialog box
        
        JOptionPane.showMessageDialog(null, "Hello");
        
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
        
        // However, these OPTIONS (not needed, but cool) for other
        // dialog output message boxes below...
        
        // Code could span mulitple lines until it reaches a semi colon ";"
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
                
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is ?",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is !",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain no icon",
                "Plain title",
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
                "Information Input dialog icon is i",
                "Information Input Title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Question Input dialog icon is ?",
                "Question Input Title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Warning Input dialog icon is !",
                "Warning Input Title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Plain Input dialog no icon",
                "Plain Input Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
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
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // The "char" is short for "character" holds (remembers) ONE
        // character
        
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
        
        // Even more optional (less recomended) shorthand:
        
        y += 10;    // means y = y + 10
        y -= 10;    // means y = y - 10
        y *= 10;    // means y = y * 10
        y /= 10;    // means y = y / 10
        
        System.out.println("y = " + y); // y is 30
                
        // Modulus (mod) gives you the remainder of a division, in java
        // it uses the percentage "%" symbol for this
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change, and constants are
        // written in ALL_CAPITAL_LETTERS with an underscore to seperate words
        
        // They also start with the keyword "final" (in C# it was "const")
        
        final double  PI           = 3.141592658389 ;
        final int     PROBLEMS     = 99             ;
        final char    YES          = 'Y'            ;
        final boolean FOUND        = true           ;
        final String  TEACHER_NAME = "Wachs"        ;
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " +
                           YES      + ", " +
                           FOUND    + ", " +
                           TEACHER_NAME 
        );
        
        // Converting one data type to another
        
        int f = 25;
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.999999999;
        
        System.out.println("g = " + g);
        
        int h = (int) g;
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        System.out.println("h = " + h);
        
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
        
        String q = JOptionPane.showInputDialog("Enter");
        
        // The variable stores what they typed in the input dialog box
        
        JOptionPane.showMessageDialog(null, q);
        
        // With numbers, you HAVE to start off with a string, and then convert
        // it to a number. This is like: Convert.ToInt32(text); in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We use code to "parse" (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example with a double
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char
        
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
        
        String upper = word.toUpperCase();
        
        System.out.println("Word " + word + " in uppercase is " + upper);
        
        // Many more string functions can be explored
        
        // "Math" library of code is also "built-in" to java
        // which comes with it's own functions (actions, methods)
        
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
        
        // And display it
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int)( (53 - 2 + 1) * Math.random() + 2);
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
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with "else" (an option) for both true and false, check 2 things
        
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
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Simple loop...
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;  // counter = counter + 1
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
            // count by 10s
        
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
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
     * Learn the content of the methods unit
     */
    private static void learnMethods() {
        System.out.println("Start learning methods...");
        
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
                
        write("Dogalicious");
        
        write("mumble");
        write("Spider-man");
        write("Banana bread");
        
        // You can have more than one, multiple parameters/arguments in a 
        // method which are seperated with commas ","
        
        writeLotsOf("Dalmations",101);
        
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
        
        System.out.println("Learning methods complete!");
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
        double number = (H - L + 1) * seed + L;
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
        System.out.println("Start learning arrays...");

        // Create (declare) a variable for comparison
        int variable = 5;

        // E.g. in memory a variable could "look" like...
        //
        //          +-------+
        // variable |   5   | (type integer)
        //          +-------+
        // Now declare (create) an array:
        int array[] = new int[5];

        // type name [square brackets] = new type [size of the array];
        // array names are usually "plural" words
        // E.g. in memory an array could "look" like...
        //
        //       +-------+-------+-------+-------+-------+
        // array |       |       |       |       |       | (a length of 5)
        //       +-------+-------+-------+-------+-------+
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
        // array[-1] = 25;
        // They would be "out of bounds" errors (or "range" error)

        // Declare an array (a little different) of NO size...        
        double a[];

        // In memory...
        //
        // a
        //
        
        // Later on (in code) you can re-create (re-declare, re-dimension, or
        // resize) using the same array but now giving it some size (still empty)
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
        output(coins);
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning arrays!");
    }

    /**
     * Outputs an array of integers in a dialog
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        // Arrays can be a parameter (or one of the parameters)
        String text = "Array [";    // Created a string to fill up
        // Loop (traverse) through the array and add the contents to the string
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + ",";
        }
        text = text + "]";
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
        
    }
    
}

// <editor-fold>   

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

// </editor-fold>

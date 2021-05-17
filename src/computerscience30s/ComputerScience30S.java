  
/** 
 * Required package class namespace - the line below is put in automatically,
 * and connects file to the project all done
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
 * any in class requests for code examples that might come up over the course.
 * 
 * @author Mr. Wachs
 * @since Feb. 9, 2021
 */
public class ComputerScience30S {       

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        learnIntroToJava();         // "calling" a method means run the code
//        learnMethods();
        learnArrays();
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnIntroToJava() {
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
        
        // The "char" is short for "character" hold (remembers) one character
        
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
        
        // When using input dialogs, ALWAYS use a variable first at the front
        // of the line
        
        // With numbers, you have to start off with a string, and then convert
        // it to a number. This is like: Convert.ToInt32(text) in C#
        
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
        
        // create welcome screen for the user
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
        // show a message dialog box
        JOptionPane.showMessageDialog(null, "Welcome to the C-RAP number "
                + "2 radio station\n\n" + message);
        // get user input
        String userInput = JOptionPane.showInputDialog("Enter temperature "
                + "in Celcius");
        // convert to a number variable
        double celcius = Double.parseDouble(userInput);
        // apply formula
        double fahrenheit = (celcius * 1.8) + 32;
        // show user the results in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        // show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        System.out.println("Good-bye World!");
        
        // this line terminates any running java program at any point
        //System.exit(0);
    }

    /**
     * Learn the content of the methods unit
     */
    private static void learnMethods() {
        System.out.println("Start learning methods...");

        // Methods (functions, procedures, actions) are named in a style like 
        // variables are named (lowercase then camel casing), but use verb
        // type words starting with lowercase then using camel casing the
        // presense of round brackets ( ) indicate a method
        
        // Code to "jump" to a method, is "calling" the method
        writeStar();
        
        // If you hold down the CTRL key, methods calls become links with the
        // mouse to the method, or use the "navigator" window on the left
        
        // Call it again        
        writeStar();
                
        // When we call a method, we can place "data" inside the round brackets
        // and that data is "passed" over to the method the data being passed
        // from the method call is named the "argument" the variable that 
        // receives the data is named the "parameter" (you can always change  
        // the argument) 
        
        write("Spider-man");
        
        write("Larry");
        write("Ironman");
        write("Ben 10");
        
        // You can have multiple parameters/arguments in a method which are 
        // separated with commas
        
        writeLotsOf("dalmations",101);
        
        writeLotsOf("Problems", 99);
        
        // You can make methods that "send back" (output) information, the  
        // previous methods needed information (inputs) as parameters or empty
        // brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        // Overloaded methods are methods with the same name, BUT different
        // parameters / arguments
        
        output("Hello");
        output("Good-bye","Learning methods");
                
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
        // if you use the lightbulb to write the method, you often should
        // rewrite the name of that parameter
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
     * Gives you a random number
     * 
     * @return random number between 1 and 100
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
     * @return random number less than or equal to low and less than or
     * equal to the high number
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double number = (H - L + 1) * seed + L; 
        return (int)number;
    }

    /**
     * Displays text in a dialog
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Displays text in a dialog with a title at the top of the dialog
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
     * Learn the content of the arrays unit
     */
    private static void learnArrays() {
        System.out.println("Start Learning Arrays...");
        
        // Create (declare) a variable for comparison
        int variable  = 5;
        
        // E.g. in memory a variable could "look" like...
        //
        //          +-------+
        // variable |   5   | (type integer)
        //          +-------+
        
        // Now declare (create) an array:
        int array[] = new int[5];
        
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
        
        // Now we assign values to all indivisual spots (indices):
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
        // They would be "out of bounds" errors
        
        // Declare an array of NO size
        double a[];
        
        // In memory...
        //
        // a
        // 
        
        // Later on (in code) you can re-create (re-declare, re-dimension, or 
        // resize) using the same array now giving it some size (but empty)
        a = new double[3];
        
        // In memory....
        //
        //   +----------+----------+----------+
        // a |          |          |          | (now has size of 3, but empty)
        //   +----------+----------+----------+
        //        0          1          2
        
        // Now fill in the content
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;
        
        //   +----------+----------+----------+
        // a |   1.1    |   2.2    |   3.3    | (now it is filled with content)
        //   +----------+----------+----------+
        //        0          1          2
        
        // You can always re-dimension (resize) array multiple times, BUT 
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
        
        double[] coins = { 0.05 , 0.10 , 0.25 , 1.00 , 2.00 };
                
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
        
        // When using arrays, use individual elements (spots, index) of the 
        // array, we use them like regualar variables, for example...
        
        int[] numbers = new int[100];
        
        // Change (assign) a spot (index)
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
        
        // To work with, and to travel (means "visit" every spot) the array,
        // we use a "for" loop (for loops were built perfectly for arrays)        
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
        // The for loop is perfect because it automatically (when I type "for"
        // and TAB) starts at 0, goes up by 1, is "less than" then ending 
        // number (which can be the length)
        
        // When using the for loop, it is even BETTER to use a built-in feature 
        // of arrays - all arrays have a ".length" built in, for example... 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = " + numbers[i]);
        }
        // Tip: if type "for" TAB, then TAB AGAIN it jump to the ending value
        // So if the array size changes, the loop adapts to it
        
        // Array can easily work with methods, the arrays can be sent into a 
        // method (as one of multiple parameters, or the only parameter), and 
        // arrays can be outputted (returned) from a method - in other words:
        // Arrays can be INPUT(s) or OUTPUT from a method
        
        output(array);    // Send an array to the method as a parameter
        output(numbers);  // Call the method with a different argument
        output(coins);    // Overload the "output" method again
        
        int[] randoms = random(1,10,50);    // Overload "random" method
        output(randoms);
        
        // Multi-dimensional array (also known as a "array of arrays", or a 
        // array filled with other arrays, 2D, etc.) - and also know as a MATRIX
        
        // Create some constants to use when building the matrix (these are
        // not needed to declare a matrix, but they might help in understanding 
        // it) - we make contants as a way to "visualize" what we are building
        
        final int ROWS    = 3; // "dimension" going "down" (also like "y" axis)
        final int COLUMNS = 4; // "dimension" going "across" (like "x" axis)
        
        // We create (declare) a matrix, by adding multiple sets of square 
        // brackets (a set for each dimension)
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
        
        final char LOW = 'a';
        final char HIGH = 'z';
        
        // Test that method first...
        char character = random(LOW,HIGH);
        System.out.println("Random character (between a-z) = " + character);
        
        // Fill our matrix (meaning put content in every location/index/spot
        // in the matrix) by traversing (travelling, 'visit' every spot) the
        // matrix and adding random characters (our method) - when traversing
        // matricies (plural of matrix) we use multiple nested for loops
        
        // We might rename looping variables to better understand what the 
        // nested for loops are refering to (e.g. like row, colum, x, y)
        // With Netbeans, when you rename a loop variable it renames all 3
        
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random(LOW, HIGH);
            }
        }
        
        // Output the matrix, by turning it into a single string (using a 
        // new method)
        String text1 = toString(matrix);
        System.out.println(text1);
        
        // Matrices can also be made with pre-set values (liekk regular arrays)
        final char[][] TIC_TAC_TOE = 
        {
            { 'X', 'O', 'X' },
            { 'O', 'X', 'O' },
            { 'X', 'O', 'X' }
        };
        
        String text2 = toString(TIC_TAC_TOE);
        System.out.println(text2);
        
        // Optional graphical code...        
        // Use JOptionPane dialogs but with graphics
        message(text1);
        message(text2);
        
        System.out.println("Learing Arrays Complete!");
    }

    /**
     * Outputs an array of integer numbers in a dialog
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        // Arrays can be a parameter (or one of the parameters)
        String text = "Array [";                    // Create string to fill up
        for (int i = 0; i < array.length; i++) {    // Travel (traverse) array
            text = text + array[i] + ",";           // Add to the string
        }        
        text = text + "]";                          // Adding an ending symbol
        output(text);                               // Output that string
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
        for (int i = 0; i < a.length; i++) {  // Traverse array
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
        String text = "";   // Create string variable to store all the values
        // Use the nested for loops (with simplier variable names) and use 
        // '.length' but also in the nested loop, we use '.length' of that 
        // particular array..
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                text = text + matrix[r][c] + " ";       // Add content to string         
            }            
            text = text + "\n";             // Add a new line after each row
        }
        return text;                                // Return the filled string
    }

    /**
     * 
     * @param text 
     */
    private static void message(String text) {
        
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
// (13) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (14) To autoformat code (fixes indents, extra spaces, etc.) select code with
//      mouse or keyboard (or it will format all if none is selected) and press
//      ALT + SHIFT + F  (you should do this before hand in!)
// (15) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 14) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (16) If you have to rename a variable or a method, select the
//      word and then press CTRL + R, then type in a new name
// (17) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (18) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 11) will help you write it
// (19) If you hold down the CTRL key, methods calls become links with the 
//      mouse to the method (even ones we don't write)
// (20) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (21) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make
// (22) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line

// </editor-fold>

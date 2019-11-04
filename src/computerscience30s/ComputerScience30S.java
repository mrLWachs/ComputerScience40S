/** required package class namespace - the line below is put in
 * automatically, and connects file to the project */
package computerscience30s;

/** required imports for the project - the lines below are added when your
  * code needs to connect to another library (API) of code */
import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course
 *
 * @author Mr. Wachs
 * @since 09-Feb-2019
 * @instructor Mr. Wachs
 */
public class ComputerScience30S {   // Curly brackets DO NOT remove

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
//        learnBasicJava();        
//        learnMethods();   
        learnArrays();
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnBasicJava() {   
        System.out.println("\nJava basics started...\n");
                
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // A single line comment
        
        /*
            Multiple line comments, covers as many lines as you want
            starting with "slash star" until it sees the closing "star slash"
        */
        
        // Basic output
        System.out.print("Hello World");    // comments can also go after code
        
        // Words starting with captial letters are powerful, they are a "class"
        
        // TIP: type "sout" and press TAB        
        System.out.println("I'm in the world");
        System.out.println("Good-bye world");
        
        // Output "special" characters
        System.out.println("Quote \" " );
        System.out.println("\tMake a tab");
        System.out.println("\\Slash");
        System.out.println("New\n\nLine");
                
        // TIP: if your want intellisense to appear at any time press:
        // "CTRL" + "SPACE"        
        // TIP: "null" is a placeholder for code you don't actually want
        
        // Create "fancy" ouptut using a dialog
        JOptionPane.showMessageDialog(null, "Hi");
        
        // Optional versions of output dialogs:
        
        JOptionPane.showMessageDialog(null, 
                "Information dialog icon is i",
                "Information Title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Question dialog icon is ?",
                "Question Title",
                JOptionPane.QUESTION_MESSAGE);
                
        JOptionPane.showMessageDialog(null, 
                "Warning dialog icon is !",
                "Warning Title",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, 
                "Plain dialog has no icon",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE);
        
        // dialog for inputs
        
        JOptionPane.showInputDialog("Enter something");
        
        // some optional versions of input dialog
        
        JOptionPane.showInputDialog(null, 
                "Information dialog icon is i",
                "Information Title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog(null, 
                "Question dialog icon is ?",
                "Question Title",
                JOptionPane.QUESTION_MESSAGE);
                
        JOptionPane.showInputDialog(null, 
                "Warning dialog icon is !",
                "Warning Title",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(null, 
                "Plain dialog has no icon",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE);
        
        // optional confirm dialog:
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        
        // more optional examples of confirm dialog
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 1",
                "Information",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 2",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 3",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 4",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // simple variables
        
        boolean a = true;
        // type name = value
        // when you "create" declare a variable
        
        int    b = 0;
        double c = 0.0;
        
        // variables can change (vary)
        a = false;
        b = 1;
        c = 1.2;
        
        // variable always goes on the LHS (left hand side) and the value 
        // going in it goes on the RHS (right hand side)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        // TIP: on the lower toolbar at the end, are 2 buttons to comment an 
        // uncomment code you have selected
        
        char d = '*';
        System.out.println("d = " + d);
        
        // more "complex" data type
        String e = "cats";
        System.out.println("e = " + e);
        
        // in java words that start with a capital letter, are more "powerful" 
        // which means they have built-in actions (they are a class)
        
        // manipulate, change the variables
        
        int x = 10;
        System.out.println("x = " + x); // 10
        x = 20;
        System.out.println("x = " + x); // 20
        int y = x + 10;
        System.out.println("y = " + y); // 30
        // optional shorthand...
        y++;
        // means the same as y = y + 1
        y--;        // means y = y - 1
        // even more optional....
        y += 10;    // same as y = y + 10
        System.out.println("y = " + y); // 40
        
        y -= 20;    // same as y = y - 20
        y *= 2;     // same as y = y * 2
        y /= 10;    // same as y = y / 10
        
        System.out.println("y = " + y); // 4
        
        // modulus (mod) gives you the remainder of a division, uses %
        
        x     = 28;
        y     = x / 5;
        int z = x % 5;
        
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 
        System.out.println("z = " + z); 
        
        // constants are variables that don't change, and constants are written 
        // in ALL CAPITAL LETTERS and use underscore _ to seperate words
        
        final double  PI           = 3.14159265;
        final int     PROBLEMS     = 99;
        final char    YES          = 'y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI + " and " +
                           PROBLEMS + " and " +
                           YES + " and " +
                           FOUND + " and " +
                           TEACHER_NAME);
        
        // converting between data types...
        
        int    f = 15;
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        int h = (int) g;
        // "casting" converts by ignoring the decimal portion
        
        System.out.println("h = " + h);
        
        double k = 2.9999999999;
        int    l = (int)k;
        double m = (double)l;
        
        // casting can happen both ways
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        
        // casting can also work with char
        
        char n = 'A';
        int  o = (int)n;
        
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        
        o = 42;
        n = (char)o;
        
        System.out.println("o = " + o);
        System.out.println("n = " + n);
        
        // use input dialog with variables
        
        String p = JOptionPane.showInputDialog("string");
        JOptionPane.showMessageDialog(null, p);
        
        // like Convert.toInt32()... in C# uses something called "parsing"
        // which means "reading"
        
        String q = JOptionPane.showInputDialog("int");
        int r = Integer.parseInt(q);
        JOptionPane.showMessageDialog(null, r);
        
        // do this with doubles        
        String s = JOptionPane.showInputDialog("double");
        double t = Double.parseDouble(s);
        JOptionPane.showMessageDialog(null, t);
        
        // dialogs with char
        String u = JOptionPane.showInputDialog("char");
        char v = u.charAt(0);
        JOptionPane.showMessageDialog(null, v);
        // numbering usually starts at 0
        
        // built-in actions (functions, methods) for strings
        
        String word = "quizzaciously";
        int count = word.length();
        System.out.println(word +  " length is " + count);
        // numbering starts at 0
        char letter = word.charAt(0);
        System.out.println("Letter 0 = " + letter);  
        // one more, many more to explore
        word = word.toUpperCase();
        System.out.println("word is " + word);
        
        // built-in math functions (methods)
        
        double answer1 = Math.PI;
        double answer2 = Math.abs(-1);
        double answer3 = Math.cos(0.5);
        double answer4 = Math.log(0.5);
        double answer5 = Math.pow(5,3);
        double answer6 = Math.sqrt(9);
        
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);
        
        // math "library" does random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        System.out.println("seed = " + seed);
        // formula for generating randoms in range between high and low number
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        double number = (HIGH - LOW + 1) * seed + LOW;
        int value = (int)number;
        System.out.println("value = " + value);
                
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // simple if, use it when something is true, checks for 1 thing
        
        int value1 = 10, value2 = 10;        
        if (value1 == value2) {
            System.out.println("equal");
        }
                
        // if with else, for both true and false, checks 2 things
        
        double value3 = 1.45, value4 = 1.5;
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
        
        // use chars and some shorthand, not usually recommended (except 
        // in certain situations) used when the code between { } (block)
        // is only 1 line of code, you don't need the { }
        
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // use "else if" for multiple case of more than 2 things (same as 
        // the "switch" statement - which I do not use!)        
        // use strings (more complicated), with string NEVER use ==
        // instead use .equals()...
        
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
        
        // combine logic using:
        // "and" "or" "not"
        //  &&    ||    !
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 1.0) {
            System.out.println("get in");
        }
        else if (age >= 18 || iq > 1.0) {
            System.out.println("keep trying");
        }
        else {
            System.out.println("get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////

        // simple loop
        
        int counter = 1;
        while (counter <= 50) {
            System.out.println("counter = " + counter);
            counter++;
        }

        // while loop with a string
        String password = JOptionPane.showInputDialog("Create"
                + " a password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Invalid!");
            password = JOptionPane.showInputDialog("Create"
                + " a password");
        }
        
        // the second type of while loop, more rarely used,
        // it tests for T/F at the bottom of the loop, not
        // the top, you use ti when you want the body of the 
        // loop (block) to run at least once!
        
        // the do while loop
        
        String choice = "";        
        do {            
            choice = JOptionPane.showInputDialog(
                    "Enter password");
        } while (choice.equalsIgnoreCase(password) == false);

        // TIP: code shortcuts can autocomplete code, the full
        // list of all of these can be found by clicking:
        // Help -> Keyboard Shortcuts Card...

        // the for loop is specificially for counting
        // (and is also use with the concept of arrays)
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // variation on the for loop that:
            // count down (not up)
            // start at 100
            // stop at zero (includes zero)
            // count by 10s
        
       for (int i = 100; i >= 0; i-=10) {
            System.out.println("i = " + i);
        } 

        ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // welcoming the user to this program
        JOptionPane.showMessageDialog(null, "Welcome to dog age convertor");
        // ask the user for there human age
        String userInput = JOptionPane.showInputDialog("Enter human age");
        int humanAge = Integer.parseInt(userInput);
        // take that number multiply it by 7
        int dogAge = humanAge * 7;
        // show the user there dog age
        JOptionPane.showMessageDialog(null, "Your dog age is " + dogAge);
        // say good-bye
        JOptionPane.showMessageDialog(null, "Good-bye!");
        
        // TIP: Alt + Shift + F will CLEAN your code for you
        
        // NetBeans Templates: go to Tools -> Templates, scroll down 
        // to "Java" and click the plus "+" sign to expand, then select
        // "Java Main Class" and then "Open in Editor"
        // Then modify the template and save like this:        
        //   /**
        //     * ${name}.java - 
        //     *
        //     * @author Mr. Wachs 
        //     * @since ${date} 
        //     */
        //    public class ${name} 
        //    { .... etc .....        
             
        System.out.println("\nJava basics completed!\n");
    }

    /**
     * Learn the content of the methods unit
     */
    private static void learnMethods() {
        System.out.println("\nStart Learing Methods...\n");
        
        // methods (functions, procedures) are named like variables, but use 
        // verb type words starting with lowercase then using camel casing
        // the round braces ( ) indicate a method
        
        
        // NetBeans tips:
        // (1) The + and - signs and grey lines along the side in NetBeans 
        //     help "expand" and "collapse" the method body (block)        
        // (2) On the left side window, the Navigator window helps find and 
        //     jump to methods        
        // (3) Using the keys CTRL + SHIFT and "+" or "-" also expands and 
        //     collapses methods
        // (4) You can call a method that does not yet exist, and netbeans 
        //     will help you write it with the lightbulb icon (you click on)
        // (5) You can jump to a method (even ones you don't write) by holding 
        //     down CTRL and clicking on the method call
        // (6) If you type /** before the method signature line it will 
        //     automate which JavaDoc comments you should make
        
        // code to "jump" to our method, "calling" the method 
        drawStar(); // a call to the method
        
        // if you hold CTRL key the method call becomes
        // a link to the method
        
        draw("ukulele");
        draw("tamborine");
        // calling a method with a parameter the item you "pass" is called the
        // argument
        
        // multiple arguments/parameter are seperated with a commas
        draws("dalmations",101);            // multiple arguments
        draws("problems",99);               // seperate with commas  
        
        int number = giveMeNumber();
        draw("Number is " + number);
        
        // overloaded methods are methods with the same name but different 
        // parameters
        output("Hi");        
        output("Hello","Overload example");        
        
        System.out.println("\nLearning Methods Complete!\n");
    }

    /**
     * draws a star on the screen
     */
    private static void drawStar() {
        System.out.println("*");
    }

    /**
     * draws a thing on the screen
     * 
     * @param thing the thing to draw
     */
    private static void draw(String thing) {
        // information "passed" to a method is called a parameter
        System.out.println(thing);
    }
        
    /**
     * draws multiple things on the screen
     * 
     * @param thing the thing to draw
     * @param amount the amount to draw
     */
    private static void draws(String thing, int amount) {
        // "guts" body of the method
        for (int i = 0; i < amount; i++) {
            draw(thing);
        }
    }

    /**
     * gives you a number
     * 
     * @return a random integer
     */
    private static int giveMeNumber() {
        final int MIN = Integer.MIN_VALUE;
        final int MID = 0;
        final int MAX = Integer.MAX_VALUE;
        int low       = random(MIN, MID);
        int high      = random(MID, MAX);
        return random(low,high);
    }

    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    private static int random(int low, int high) {
        double seed  = Math.random();
        double L     = (double)low;
        double H     = (double)high;
        double value = (H - L + 1) * seed + L;
        return (int)value;        
    }

    /**
     * Outputs text in a dialog
     * 
     * @param text the text to output
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(
                null, 
                text, 
                "", 
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Outputs text in a dialog
     * 
     * @param text the text to output
     * @param title the title for the dialog
     */
    private static void output(String text, String title) {
        JOptionPane.showMessageDialog(
                null, 
                text, 
                title, 
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Learn the content of the arrays unit
     */
    private static void learnArrays() {
        System.out.println("Start learn arrays...");
        
        // create (declare) a variable for comparison:        
        int size = 5;
        
        // declare an array:        
        int array[] = new int[size];        
        // assume the "spots", "subscripts", "elements", "indices" as unknown
        
        // assign values to the individual indices:        
        array[0] = 25;
        array[1] = 18;
        array[2] = -21;
        array[3] = 621;
        array[4] = 1234567890;
        
        // the next line would be a "out of bounds" or "range" error         
        // array[5] = 99;
        
        // other index numbers that would be a range error:        
        // array[2.5] = 10;
        // array[-1] = 10;
        
        // declare an array of no size:        
        double[] a;
        
        // later on, you can re-create (re-dimension) the same array        
        a = new double[3];
        
        // now put content into the array
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;
        
        // you can re-dimension multiple times, but every time it wipes out 
        // any content stored inside the array
        a = new double[500];
        
        // another way to create arrays, but with pre-filled values        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
                
        // you can also do this and make the array a constant                        
        final String[] OPTIONS = {
            "New game",
            "Save game",
            "Quit"
        };
        
        // using an array like variables        
        int[] numbers = new int[100];
        // names for arrays should be plural words
        numbers[99] = 99;
        // output array index like a variable
        System.out.println(numbers[99]);    
        // perform equations with array indices like variables
        numbers[0] = numbers[99] + numbers[99];
        
        // to travel (go through) the entire array, use a for loop         
        for (int i = 0; i < 100; i++) {
            numbers[i] = 99;
        }
        
        // output the entire array, by traversing the array and using a 
        // built-in feature that all arrays have called the ".length" feature 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // arrays with methods, arrays can be sent to a method
        // parameter, and arrays can be returned from methods
        // in other words, arrays can be inputs and outputs
        // from methods        
        output(numbers);        
        output(coins);
        int[] randoms = random(1,10,50);
        output(randoms);
        
        
        // multi-dimensional array, means an array
        // of arrays, filled with arrays... etc
        // 2D, 3D, 4D etc as a way to visualize it
        // also know as a matrix

        final int  ROWS    = 30;
        final int  COLUMNS = 40;
        final char LOW     = 'a';
        final char HIGH    = 'z';
        
        // create (declare) a matrix        
        char[][] matrix = new char[ROWS][COLUMNS];
        
        // fill the matrix by traversing and adding
        // in a random character, using nested for loops

        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random(LOW,HIGH);
            }
        }
        output(matrix);
        
        
        System.out.println("Completed learning arrays!");
    }
    
    /**
     * Outputs an array of integer values
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        String text = "Array = [";        
        for (int i = 0; i < array.length; i++) {
            text += array[i] + ",";
        }        
        text = text + "]";
        output(text);
    }

    /**
     * Outputs an array of double values
     * 
     * @param array the array of doubles
     */
    private static void output(double[] array) {
        int[] a = convert(array);
        output(a);
    }

    /**
     * Converts an array of doubles into an array of integers
     * 
     * @param array the double array to convert
     * @return an array of integers
     */
    private static int[] convert(double[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = (int)array[i];
        }
        return a;
    }

    /**
     * Generates an array of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    private static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random(low,high);
        }
        return numbers;
    }
    
    private static char random(char low, char high) {
        return (char)random((int)low,(int)high);
    }

    private static void output(char[][] m) {
        String text = "";
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                text = text + m[r][c] + " ";
            }
            text = text + "\n";
        }
        
        output(text);
    }
        
}

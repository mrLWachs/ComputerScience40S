/** required package class namespace */
package computerscience30s;

/** required imports */
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/**
 * ComputerScience30S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since Feb 20, 2018 
 * @instructor Mr. Wachs
 */
public class ComputerScience30S
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nComputer Science 30S Example started...\n");               
//        unit1();    // introduction to java programming
//        unit2();    // methods in java
//        unit3();    // arrays in java
        unit4();    // classes in java
        System.out.println("\nComputer Science 30S Example completed!\n");
    }
    
    /**
     * The example code for this unit
     */
    public static void unit1() {        
        //////////////////////////////////////////////////////////////////////
        // JAVA BASICS:
        //////////////////////////////////////////////////////////////////////
        
        // This is a comment, anything after // is a comment
        
        /* 
            This is another way to comment, but it opens a multiple line 
            comment that continues until a star and a slash is reached
        */        
        System.out.println("Java basics started...");
        
        System.out.print("Hello World..."); // simple output
        
        System.out.println("Goodbye world");
        // sout and tab autocompleted this code
        
        // examples of "special" output characters:        
        System.out.println("Make a quote, \" is a quote");
        System.out.println("Make a tab, \t is a tab");
        System.out.println("Make a slash, \\ is a slash");
        System.out.println("Make a new line, \n is newline");
        
        // fancy dialog boxes for outputs ........ 
        
        // message dialog (shows user a message)        
        JOptionPane.showMessageDialog(null, "Hi there!");
        
        // variations on the message dialog (not needed for assignments)        
        JOptionPane.showMessageDialog(null,
                "Message 2, change to a i icon",
                "Information Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 3, change to a ? icon",
                "Question Dialog",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 4, change to a ! icon",
                "Warning Dialog",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Message 5, change to no icon",
                "Plain Dialog",
                JOptionPane.PLAIN_MESSAGE);
        
        // input dialog box (used to get user input information)        
        JOptionPane.showInputDialog("Enter something");
        
        // variations on input dialog (not needed for assignments)        
        JOptionPane.showInputDialog(null,
                "Input dialog 2, change to a i icon",
                "Information Input dialog",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input dialog 3, change to a ? icon",
                "Question Input dialog",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input dialog 4, change to a ! icon",
                "Warning Input dialog",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Input dialog 5, change to no icon",
                "Plain Input dialog",
                JOptionPane.PLAIN_MESSAGE);
        
        // input dialog where you set the text
        JOptionPane.showInputDialog(null,
                "Input dialog 6, setting the text area",
                "Set the text area");
        
        // confirm dialog (you may never need this)        
        JOptionPane.showConfirmDialog(null, "Confirm dialog");
        
        // variations on confirm dialog (not needed for assignments)        
        JOptionPane.showConfirmDialog(null,
                "Confirm 2, change to a i icon",
                "Information Confirm dialog",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Confirm 3, change to a ? icon",
                "Question Confirm dialog",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Confirm 4, change to a ! icon",
                "Warning Confirm dialog",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Confirm 5, change to no icon",
                "Plain Confirm dialog",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        //////////////////////////////////////////////////////////////////////
        // VARIABLES:
        //////////////////////////////////////////////////////////////////////
        
        // simpliest variable
        boolean a = true;                   // declares the variable
        a = false;                          // changes (varies) the variable
        // booleans store only true or false
        
        // number data types:
        int    b = 0;                       // whole #s, no decimals
        double c = 0.0;                     // allows for decimals
                
        // character data type:
        char d = '$';
        
        // more complex data type:
        String e = "words";
        
        // output the variables:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        // manipluate (change) variabes
        int x = 10;
        System.out.println("x = " + x);
        x = 20;
        System.out.println("x = " + x);
        int y = x + 10;
        System.out.println("y = " + y);
        // shorthand (not needed)
        y++;                                // same as y = y + 1
        System.out.println("y = " + y);
        y--;                                // same as y = y - 1
        System.out.println("y = " + y);
        y = y + 10;
        System.out.println("y = " + y);
        
        // more shorthand, really not needed
        y += 10;                            // same as y = y + 10
        y -= 10;                            // same as y = y - 10
        y *= 2;                             // same as y = y * 2
        y /= 10;                            // same as y = y / 10;        
        System.out.println("y = " + y);
        
        // modulus division, gives the remainder
        x = 28;
        y = x % 5;
        System.out.println("y = " + y);
        
        // constants, variables that never change typed in ALL CAPITAL LETTERS
        final double  PI           = 3.14;
        final int     PROBLEMS     = 99;
        final char    YES          = 'y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        // underscore seperates words in constants        
        System.out.println(PI + " and " +
                PROBLEMS + " and " +
                YES + " and " +
                FOUND + " and " +
                TEACHER_NAME);
        
        // converting between data types:        
        int    f = 15;
        double g = f;
        g = 15.8;
        int    h = (int) g;
        // casting means it "pretends" to be an int this just ignores 
        // (truncates or cuts off) the decimal part
        double k = 2.99999999999;
        int    l = (int)k;
        double m = (double)l;        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        
        // cast characters into numbers:
        char n = 'a';
        int o = (int)n;
        System.out.println("o = " + o);
        o++;
        char p = (char)o;
        System.out.println("p = " + p);
        // stores the values in the ASCII table
        
        // use input dialog with a string        
        String q = JOptionPane.showInputDialog("Enter something");
        JOptionPane.showMessageDialog(null, q);
       
        // convert strings into numbers use parsing (reading)         
        String r = JOptionPane.showInputDialog("Enter int");
        int s = Integer.parseInt(r);
        JOptionPane.showMessageDialog(null, s);
        
        // with a double
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);

        // built-in string actions (functions, methods)        
        String word = "superman";
        int count = word.length();
        // the length of the characters in the string
        char letter = word.charAt(3);
        System.out.println("Letter at 3 is " + letter);
        // gets 1 character from the string at the specified index number, 
        // which starts at zero
        
        // in Java words that start with a capital letter have built-in 
        // actions because they are powerful, because they are "classes" 
        // (covered in more detail in a later unit)
        
        // built-in Math library of code:        
        double answer1 = Math.abs(-1);      // absolute value
        double answer2 = Math.PI;           // the value of Pi
        double answer3 = Math.cos(0.5);     // cosine (sin, tan, and arcs also)
        double answer4 = Math.log(0.5);     // logarithms
        double answer5 = Math.pow(5, 3);    // 5 to the power of 3
        double answer6 = Math.sqrt(9);      // square root
        System.out.println("answer 1 = " + answer1);
        System.out.println("answer 2 = " + answer2);
        System.out.println("answer 3 = " + answer3);
        System.out.println("answer 4 = " + answer4);
        System.out.println("answer 5 = " + answer5);
        System.out.println("answer 6 = " + answer6);
        
        // the Math library and random numbers:
        double seed   = Math.random();
        double low    = 1.0;
        double high   = 10.0;
        double random = (high - low + 1.0) * seed + low;
        // random number formula 
        System.out.println("Random = " + random);
        // then convert the number
        int value = (int)random;
        System.out.println("Value = " + value);
        
        //////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS:
        //////////////////////////////////////////////////////////////////////
        
        int value1 = 10, value2 = 10;
        // a option for making 2 variables on 1 line
        
        // simple if statement, when something is true, it checks 1 thing
        if (value1 == value2) {
            System.out.println("Equal");
        }

        // if with an else, when something is both true and false, it 
        // checks 2 things        
        double value3 = 1.45, value4 = 1.5;        
        if (value3 < value4) {
            System.out.println("Less than");
        }
        else {
            System.out.println("Greater than, or equal");
        }
        
        // use chars and some shorthand for conditional statements (not 
        // recommended), means when the code is one line, you don't need 
        // the { } brackets        
        char value5 = 'A', value6 = 'a';        
        if (value5 != value6) System.out.println("Not equal");
        
        // use the else if for multiple cases of more than 2 things. Same as 
        // a switch statement (which I do not recommend) using strings        
        String word1 = "cat";
        String word2 = "cAt";
        // equals is more complicated with strings
        if (word1.equals(word2)) {
            System.out.println("Equal, same case");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Equal, different cases");
        }
        else {
            System.out.println("Not equal");
        }
        
        // optional (shorthand) for combining logic using "and" "or"        
        int    age = 20;
        double iq  = 0.6;        
        if (age >= 15 && iq >= 0.5) {       // && means "and"
            System.out.println("Get in");
        }
        else if (age >= 15 || iq >= 0.5) {  // || means "or"
            System.out.println("Try again later");
        }
        else {
            System.out.println("Get out");
        }
        
        //////////////////////////////////////////////////////////////////////
        // LOOPING:
        //////////////////////////////////////////////////////////////////////
                        
        // simple "while" loop
        int counter = 1;
        while (counter <= 50) {
            System.out.println("counter = " + counter);
            counter++;
        }
        
        // while loop with a string
        String password = JOptionPane.showInputDialog("Enter password");        
        while (password.equals("1234")) {
            System.out.println("Cannot use this!");
            password = JOptionPane.showInputDialog("Enter password");
        }
        
        // second version of the while loop, very rarely used, tests at the 
        // bottom of the loop, this loop always runs at least once        
        do {
            password = JOptionPane.showInputDialog("Enter password");
        } while(password.equals("qwerty") == false);
        
        // the "for" loop, designed for counting        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // second loop with variations
        for (int j = 10; j <= 100; j=j+5) {
            System.out.println("j = " + j);
        }
        
        // for loop that counts down
        for (int i = 100; i >= 0; i--) {
            System.out.println("i = " + i);
        }
        
        //////////////////////////////////////////////////////////////////////
        // ASSIGNMENT EXAMPLE:
        //////////////////////////////////////////////////////////////////////
         
        // show a starting screen to welcome the user
        JOptionPane.showMessageDialog(null, "Welcome to the"
                + " dog age convertor!");
        // get the human age from the user (ask them)
        String userInput = JOptionPane.showInputDialog("Enter "
                + "your human age:");
        // convert that string into a number
        int humanAge = Integer.parseInt(userInput);
        // use a math formula to change it to dog years
        int dogAge = humanAge * 7;
        // show the answer to the user
        JOptionPane.showMessageDialog(null, "Your dog age is " + dogAge);
        // show a ending screen (dialog)
        JOptionPane.showMessageDialog(null, "Thanks for using the"
                + " dog age convertor!");

        System.out.println("Java basics completed!");
    }

    /**
     * The example code for this unit
     */
    private static void unit2() {
        System.out.println("Methods unit started...");        
        // code to "jump" to our method, "calling" the method 
        drawStar();         // calling a method with no parameters        
        // In NetBeans, you can write the call to a method first and NetBeans 
        // will help you write the method signature 
        draw("$");          // calling a method with 1 parameter
        draw("@");          // calling same method, with a different argument        
        draws("dalmations",101);            // multiple arguments
        draws("problems",99);               // seperate with commas        
        int number = giveMeNumber();        // method returning       
        draw("number is " + number);        
        output("Hello");            // overloaded methods are methods with the
        output("Hi","Example");     // same name but different parameters
        System.out.println("Methods unit completed!");
    }

    /**
     * Draws a star
     */
    private static void drawStar() {
        draw("*");
    }

    /**
     * Draws an item 
     * @param item the item to draw
     */
    private static void draw(String item) {
        System.out.println(item);
    }

    /**
     * Draws an item on the screen multiple times
     * 
     * @param item the item to draw
     * @param times the number of times to draw the item
     */
    private static void draws(String item, int times) {
        for (int i = 0; i < times; i++) {
            draw(item);
        }
    }

    /**
     * Gives a random number
     * 
     * @return a random number between 1 - 100
     */
    private static int giveMeNumber() {
        return random(random(1,10),random(10,100));
    }
    
    /**
     * Generates a random number
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return the generated number
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double number = (H - L + 1) * seed + L;
        int    answer = (int)number;
        return answer;
    }

    /**
     * Display the text in a dialog box
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Display the text in a dialog box with a title
     * 
     * @param text the text to display
     * @param title the title at the top of the dialog
     */
    private static void output(String text, String title) {
        JOptionPane.showMessageDialog(null, text,
                title,JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * The example code for this unit
     */
    private static void unit3() {
        System.out.println("Arrays example started...");
        
        // creating a variable for comparison
        int size = 5;
        
        // create an array with 10 spots and it automatically indexes each spot
        // starting with index 0, and each spot has undefined contents
        int[] array = new int[size];        
        
        // put content into the individual elements:        
        array[0] = 5;
        array[1] = -5;
        array[2] = 0;
        array[3] = 55;
        array[4] = 555; 
        // intentional errors, outside the bounds of the array
        // array[6] = 5555;        
        // array[-1] = 5555;
        
        // create an array with no size
        double[] a;        
        // then give it a size
        a = new double[3];        
        // put in some content
        a[1] = 3.14;        
        // you can keep resizing (de-dimensioning) the array        
        a = new double[5];        
        // every time the array is resized, the content
        // is destroyed (lost)
        
        // create "pre-filled" arrays        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
        
        // arrays can also be constants
        final String[] OPTIONS = {
            "New Game",
            "Save game",
            "Quit"        
        };
        
        // create an emtpy array
        int[] numbers = new int[100];
        // go through the entire array 
        // using a for loop
        for (int i = 0; i < 100; i++) {
            numbers[i] = 25;
        }
        
        // change indivual indices of an array
        // just regular variables
        numbers[49] = 13;
        System.out.println(numbers[77]);
                
        // loop again (traverse), and using
        // a built in feature of arrays
        // called the length        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = " +
                    numbers[i]);
        }
        
        // arrays working with methods:
        
        // method that takes a array as a parameter        
        output(coins);
        // tested with a different array
        double[] percents = { 0.0, 0.25, 0.50, 0.75, 1.00 };        
        output(percents);
        // this array is a different type, so the method needs to be overloaded
        output(numbers);        
        // returning arrays from methods
        int[] cards = random(2, 14, 52);
        output(cards);
        
        // create a 2 dimensional (2D) array also known as a matrix using some 
        // constants to help "visualize" the array in memory
        final int ROWS    = 50;
        final int COLUMNS = 45;
        // create matrix
        char[][] matrix = new char[ROWS][COLUMNS];
        // now fill the matrix with values        
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random('!', '~');
            }
        }
        // create a method for 2D matrix
        output(matrix);
        
        System.out.println("Arrays example complete!");
    }
    
    /**
     * Display the array in a dialog box
     * 
     * @param a the array to display
     */
    private static void output(double[] a) {
        String text = "Array: \n";
        for (int i = 0; i < a.length; i++) {
            text += "(" + i + ")    " + a[i] + "\n";
        }
        output(text);
    }

    /**
     * Display the array in a dialog box
     * 
     * @param a the array to display
     */
    private static void output(int[] a) {
        double[] array = convertTo(a);
        output(array);
    }

    /**
     * Converts an array of integers into a array of doubles
     * 
     * @param a the array to convert
     * @return an array of doubles
     */
    private static double[] convertTo(int[] a) {
        double[] array = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = (double)a[i];
        }
        return array;
    }
    
    /**
     * Generates a random double
     * 
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return the generated number
     */
    private static double random(double low, double high) {
        return (high - low + 1) * Math.random() + low;
    }
    
    /**
     * Generates a random character
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @return the generated character
     */
    private static char random(char low, char high) {
        return (char)(random( (int)low, (int)high ));
    }
    
    /**
     * Generates a random array of integers
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size of the array to generate
     * @return the generated array of integers
     */
    private static int[] random(int low, int high, int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random(low, high);
        }
        return a;
    }

    /**
     * Display the matrix in a dialog box
     * 
     * @param matrix the matrix to display
     */
    private static void output(char[][] matrix) {
        String text = "";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                text += matrix[r][c] + " ";
            }
            text += "\n";
        }
        display(text);
    }

    /**
     * Displays text in a fancy dialog box with formatting
     * 
     * @param text the text to display
     */
    private static void display(String text) {        
        // create a "fancy" display area
        JTextArea area = new JTextArea();
        // put the text into the area
        area.setText(text);
        // create 2 colors
        Color background = new Color(0,0,0);
        Color foreground = new Color(0,255,0);
        // put the colors in the area
        area.setBackground(background);
        area.setForeground(foreground);
        // create a font        
        Font font = new Font("Consolas",Font.PLAIN,20);
        // put the font in the area
        area.setFont(font);        
        // creating images, using the full path and the full
        // name of the image file
        Icon icon = new ImageIcon("C:\\Users\\lawrence.wachs"
                + "\\Desktop\\matrix.gif");
        // display in a message box
        JOptionPane.showMessageDialog(
                null,
                area,
                "",
                JOptionPane.PLAIN_MESSAGE,
                icon);
    }

    /**
     * The example code for this unit
     */
    private static void unit4() {
        System.out.println("\nClasses example started...\n");
        
        // create (instantiate) an object for the class
        Person bobby = new Person();
        bobby.talk();                           // call a class method        
        bobby.name = "Roberta Shapiro";         // modify properties
        bobby.birthday(18);                     // call methods
        bobby.talk(); 
        
        Person ben = new Person("Ben Shapiro"); // another object
        ben.talk();                             // with new constructor
                
        // another instance of a person with the 3rd constructor
        Person sam = new Person("Samatha Bee",45,false);
        sam.talk();
        sam.identify();
        sam.birthday();
        sam.name = "Sammy Bee";
        sam.talk();
        sam.die();
        sam.talk();
        
        
        // code continues next class.......................................
        
                
        System.out.println("\nClasses example complete!\n");
    }
       
}
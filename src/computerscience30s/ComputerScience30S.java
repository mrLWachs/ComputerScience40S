
/** required package class namespace - the line below is put in 
 * automatically, and connects file to the project*/
package computerscience30s;

/** required imports for the project - the lines below are added when your
  * code needs to connect to another library (API) of code */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * ComputerScience30S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since 09-Feb-2019 
 * @instructor Mr. Wachs
 */
public class ComputerScience30S 
{   // Curly brackets DO NOT remove
    
    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        System.out.println("\nComputer Science 30S Example started...\n"); 
        
//        learnBasicJava();        
//        learnMethods();     
        learnArrays();
        
        System.out.println("\nComputer Science 30S Example completed!\n");
    }

    /**
     * Goes over the content of this unit
     */
    private static void learnBasicJava() {
        System.out.println("\nJava basics started...\n");
        
        // methods (functions, procedures) 
        // are named like variables, but use 
        // verb type words starting with 
        // lowercase then using camel casing
        // the round braces ( ) indicate a method
        
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
        
        JOptionPane.showConfirmDialog(null,
                "Example 1",
                "Information",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 2",
                "Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 3",
                "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 4",
                "Plain",
                JOptionPane.OK_CANCEL_OPTION,
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
        
        // constants are variables that never change
        // constants are written in ALL CAPS
        final double  PI           = 3.14159265;
        final int     PROBLEMS     = 99;
        final char    YES          = 'y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(
                PI + " and " + 
                PROBLEMS + " and " + 
                YES + " and " + 
                FOUND + " and " + 
                TEACHER_NAME);
        
        // converting between data types
        
        int    f = 15;
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        // we use "casting" to convert
        int h = (int)g;
        // "ignores" or removes (concatinate) the decimal portion
        System.out.println("h = " + h);
        
        double k = 2.9999999999;
        int    l = (int)k;
        double m = (double)l;
        // casting can go both ways, and other ways...
        
        char n = '&';
        int  o = (int)n;
        System.out.println("o = " + o);
        
        o = 42;
        n = (char)o;
        System.out.println("n = " + n);
        
        // use of input dialog with variables
        
        String p = JOptionPane.showInputDialog("Anything");
        JOptionPane.showMessageDialog(null, p);
        
        // using "parsing" to convert strings to numbers
        // parsing means "reading"
        String q = JOptionPane.showInputDialog("Number");
        int r = Integer.parseInt(q);
        // like Convert.toInt32()...
        JOptionPane.showMessageDialog(null, r);
        
        // parsing with doubles
        String s = JOptionPane.showInputDialog("Decimal");
        double t = Double.parseDouble(s);
        JOptionPane.showMessageDialog(null, t);
        
        // dialog with a char
        String u = JOptionPane.showInputDialog("Character");
        char v = u.charAt(0);
        JOptionPane.showMessageDialog(null, v);
        
        // built-in actions (functions, methods) with strings
        
        String word = "napolean";
        int count = word.length();  // total number of characters
        System.out.println(word + " = " + count);
        // numbering starts at 0
        char letter = word.charAt(0);
        System.out.println("Letter 0 = " + letter);        
        // one more, many more to explore...
        word = word.toUpperCase();
        System.out.println(word);
        
        // built-in math functions (methods)
        
        double answer1 = Math.PI;
        double answer2 = Math.abs(-1);
        double answer3 = Math.cos(0.5);
        double answer4 = Math.log(0.5);
        double answer5 = Math.pow(5,3);
        double answer6 = Math.sqrt(9);
                
        System.out.println("Answer 1 = " + answer1);
        System.out.println("Answer 2 = " + answer2);
        System.out.println("Answer 3 = " + answer3);
        System.out.println("Answer 4 = " + answer4);
        System.out.println("Answer 5 = " + answer5);
        System.out.println("Answer 6 = " + answer6);
        
        // math "library" does random numbers        
        // like Random random = new Random();
        
        double seed = Math.random();
        double low  = 1.0;
        double high = 10.0;
        double number = (high - low + 1) * seed + low;
        // formula for random numbers
        System.out.println("Random # between " +
                low + " and " + high + " = " +
                number);
        int value = (int)number;
        System.out.println("Random # = " + value);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        int value1 = 10, value2 = 10;
        // simple if statement, when something is true, checks for that 1 thing
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with else, for both true and false, checks for 2 things
        double value3 = 1.45, value4 = 1.5;
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
                
        // use chars and some shorthand, means when the code inside the { } 
        // is only one line, you don't need the { }
        
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");

        // above style is NOT recommended, except in certain situations

        // use "else if" for multiple case of more than 2 things (same as 
        // switch statement which I don't recommend) 
        // use strings (more complicated)
        
        String word1 = "edgy";
        String word2 = "edGy";
        // with string use .equals() not ==
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
        // "And" "Or" "Not"
        //  &&    ||    !
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 1.0) {
            System.out.println("Get in");
        }
        else if (age >= 21 || iq > 1.0) {
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // simple loop
        
        int counter = 1;
        while (counter <= 50) {
            System.out.println("Counter = " + counter);
            counter++;
        }
        
        // while loop with a string
        String password = JOptionPane.showInputDialog("Make a password");
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Invalid!");
            password = JOptionPane.showInputDialog("Make a password");
        }
        
        // the second type of while loop more rarely used, test at the 
        // bottom of the loop not the top, used when you want the body of 
        // the loop (block) to run at least once!
        
        String choice = "";
        do {            
            choice = JOptionPane.showInputDialog("Password");
        } while (choice.equalsIgnoreCase(password) == false);
        
        // TIP: code shortcuts can autocomplete code, the full list of all of 
        // these can be found by clicking : Help -> Keyboard Shortcuts Card
        
        
        // the for loop is specific to counting (and the concept of arrays)
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // variation on the for loop: count down loop, from 100 down to 0, 
        // counting by 10s
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
     * Goes over the content of this unit
     */
    private static void learnMethods() {
        System.out.println("\nMethods unit starting...\n");
        
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
        drawStar();         // calling a method with no parameters        
        // calling a method with a parameter the item you "pass" is called the
        // argument
        drawStars(5);          // calling a method with 1 parameter
        
        // In NetBeans, you can write the call to a method first and NetBeans 
        // will help you write the method signature 
        
        // multiple arguments/parameter are seperated with a commas
        draw(101,"dalmations");            // multiple arguments
        draw(99,"problems");               // seperate with commas        
        int number = giveMeNumber();        // method returning       
        output("number is " + number);        
        output("Hello");            
        output("Hi","Example");     
        // overloaded methods are methods with the same name but different 
        // parameters
        
        System.out.println("\nMethods unit completed!\n");
    }

    /**
     * Draws a star for all of you 
     */
    private static void drawStar() {
        System.out.println("*");
    }

    /**
     * Draws several stars
     * 
     * @param howMany how many stars to draw
     */
    private static void drawStars(int howMany) {
        // information "passed" to a method is called a parameter
        for (int i = 0; i < howMany; i++) {
            drawStar();
        }
    }

    /**
     * Draws many things on the screen
     * 
     * @param howMany how many things to draw
     * @param thing the item to draw
     */
    private static void draw(int howMany, String thing) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(thing);
        }
    }

    /**
     * Gives a random number 
     * 
     * @return a random number
     */
    private static int giveMeNumber() {
        final int LOW = Integer.MIN_VALUE;
        final int MID = 0;
        final int MAX = Integer.MAX_VALUE;
        return random(random(LOW,MID),random(MID,MAX));
    }

    /**
     * Generates a random number
     * 
     * @param low lowest number in the range
     * @param high highest number in the range
     * @return random number in range
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double value  = (H - L + 1) * seed + L;
        int    answer = (int)value;
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
                title,JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Goes over the content of this unit
     */
    private static void learnArrays() {
        System.out.println("Learn Arrays...");
        
        // create (declare) a variable for comparison        
        int size = 10;
        
        // declare an array        
        int array[] = new int[size];
        
        // assign values to the individual indices (spots, subscripts, etc.)        
        array[0] = 92;
        array[1] = 8;
        array[2] = -3;
        array[3] = 0;
        array[4] = 123456789;
        
        // array[10] = 15; out of bounds error
        // array[-1] also be out of bounds
        
        // declare an array of no size        
        double[] a;        
        
        // later on, you can re-create (re-dimension) the same array        
        a = new double[3];
        
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;
        
        // you can re-dimension multiple times, but every time it wipes out 
        // any content stored inside the array        
        a = new double[500];
        
        // can create arrays with prefilled values        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
        
        // you can also do this and make the array a constant        
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Quit"
        };
        
        // make a empty array
        int[] numbers = new int[100];
        
        // to travel (go through), traverse an entire array, use a for loop        
        for (int i = 0; i < 100; i++) {
            numbers[i] = 99;
        }
        
        // output the entire array, using a feature called the ".length"        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // pass the array to a method as a parameter
        output(coins);
        
        // make another array and test the method again
        double[] percents = { 0.0, 0.25, 0.50, 0.75, 1.00 };        
        output(percents);
        
        // method that returns an array
        int[] randoms = randomGenerate(100,1,10);
        
        // overloaded version of the other method
        output(randoms);
        
        // method that takes an array as a parameter and returns an array
        int[] wholes = convert(percents);
        output(wholes);
        
        // declared a 2D array (or matrix)
        final int ROWS    = 80;
        final int COLUMNS = 65;        
        char[][] matrix = new char[ROWS][COLUMNS];        
        // fill the matrix with randoms
        // with 2D array, use nested for loops
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random('!','~');
            }
        }
        output(matrix);
        
        // matrices can also be made with pre-set values
        final char[][] TIC_TAC_TOE = 
        {
            {'X','O','X'},
            {'O','X','O'},
            {'X','O','X'}
        };
        output(TIC_TAC_TOE);
        
        System.out.println("Arrays complete!");
    }
    
    /**
     * Generates an array of random integers in 
     * the range between low and high
     * 
     * @param size the size to make the array
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return an array of random integers
     */
    private static int[] randomGenerate(int size, int low, int high) {
        int[] a = new int[size];            // create array of passed size
        for (int i = 0; i < size; i++) {    // traverse array
            a[i] = random(low, high);       // fill with random value
        }
        return a;                           // return completed array
    }

    /**
     * Converts an array of doubles into an array of integers
     * 
     * @param array the double array to convert
     * @return an array of integers
     */
    private static int[] convert(double[] array) {
        int[] a = new int[array.length];        // make array of same size
        for (int i = 0; i < a.length; i++) {    // traverse array
            a[i] = (int)array[i];               // copy over cast data
        }
        return a;                               // return new array
    }
    
    /**
     * Outputs an array of integer values
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        String text = "Array = [";                  // start text variable
        for (int i = 0; i < array.length; i++) {    // traverse array
            text += array[i] + ",";                 // add to text
        }
        text = text + "]";                          // complete text
        output(text);                               // output the text
    }

    /**
     * Outputs an array of double values
     * 
     * @param array the array of doubles
     */
    private static void output(double[] array) {
        int[] a = convert(array);           // converts the doubles to ints
        output(a);                          // then outputs the array
    }

    /**
     * Outputs an array of character values
     * 
     * @param array the array of characters
     */
    private static void output(char[][] m) {
        String text = "";
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                text = text + m[r][c] + " ";
            }
            text = text + "\n";
        }
        
        Color background = new Color(0,0,0);
        Color foreground = new Color(0,255,0);
        
        output(text,"Consolas",20,
                background,foreground);
    }
    
    /**
     * Generates a random character
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    private static char random(char low, char high) {
        return (char)(random((int)low, (int)high));
    }

    /**
     * 
     * @param text
     * @param fontName
     * @param fontSize
     * @param background
     * @param foreground 
     */
    private static void output(
            String text, 
            String fontName, 
            int fontSize, 
            Color background, 
            Color foreground) {
        // create a graphics object to display
        // all the graphical options...        
        JTextArea area = new JTextArea();
        // build a font for the area
        Font font = new Font(fontName,
                Font.PLAIN,fontSize);
        // assign the font and other things to the area
        area.setFont(font);
        area.setBackground(background);
        area.setForeground(foreground);
        area.setText(text);
        // passed the area to the dialog
        JOptionPane.showMessageDialog(null, area);
    }
     
}

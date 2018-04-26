
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
//        unit1();
//        unit2();   
//        unit3();
        unit4();
//        experiments();
    }

    /**
     * The introduction to Java unit
     */
    private static void unit1() {
        /* the slash and star opens a really big comment area, it closes 
        with a star and a slash */

        // comments can go at the end of code
        System.out.println("Hello World"); // commment
        // the ln after print makes a new line break
        System.out.print("Good-bye world");

        // output tips:  
        System.out.println("");
        System.out.println("Hey \n you");
        // \n makes a new line inside of quotes        
        System.out.println("Hey \n\n\n\n\n what's up");
        System.out.println("forest \t beluga");
        // \t makes a tab        
        System.out.println("random random \"equals\" new random");
        // \" is how you makes quotes

        // GRAPHICAL INPUT AND OUTPUT DIALOG BOXES
        
        // Words that start with a capital letter are powerful meaning they 
        // are classes, which means they have built-in functions (things 
        // they can do!)
        JOptionPane.showMessageDialog(null, "Version 1");

        // ways to vary this output dialog box:        
        JOptionPane.showMessageDialog(null,
                "Version 2",
                "title",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Version 3",
                "title",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Version 4",
                "title",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Version 5",
                "title",
                JOptionPane.PLAIN_MESSAGE);

        // input dialog box
        JOptionPane.showInputDialog("Input 1");

        // I can vary the input the same as I can with the message box
        JOptionPane.showInputDialog(null,
                "Input 2",
                "Title",
                JOptionPane.INFORMATION_MESSAGE);

        // confirm dialog boxes
        JOptionPane.showConfirmDialog(null, "Confirm 1");

        JOptionPane.showConfirmDialog(null,
                "Confirm 2",
                "Title",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        // VARIABLES:
        
        boolean a = true;
        // simplest data type remembers true or false        
        System.out.println("a = " + a);
        // simple number type
        int b = 10;
        // more complex number
        double c = 3.14;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // stores a single character
        char d = '$';
        System.out.println("d = " + d);

        // string of characters:        
        String e = "sponge";
        System.out.println("e = " + e);

        // manipulate the variables:        
        int x = 10;
        System.out.println("x = " + x);
        x = 20;
        System.out.println("x = " + x);
        x = x + 5;
        System.out.println("x = " + x);

        // shorthand:       
        x++; // adds one
        x--; // subtracts one
        System.out.println("x = " + x);

        // less used, not recommended:        
        x += 10;
        // same as x = x + 10

        x *= 3;   // more shorthand
        x /= 4;
        x -= 50;
        System.out.println("x = " + x);

        // constants (variables that don't change)
        final double PI = 3.14159265;
        // write constants in ALL UPPERCASE        
        final int PROBLEMS = 99;
        final char YES = 'y';
        final boolean FOUND = true;
        final String TEACHER = "Wachs";

        System.out.println(PI + ","
                + PROBLEMS + ","
                + YES + ","
                + FOUND + ","
                + TEACHER);

        // convert between data types:
        // casting can be done with number types
        double f = 3.89;
        int g = (int) f;
        double h = (double) g;

        // even can be done with characters
        char r = 'a';
        int j = (int) r;
        System.out.println("j = " + j);

        // use a string with a input dialog
        // simple input output
        String k = JOptionPane.showInputDialog("Enter");
        JOptionPane.showMessageDialog(null, k);

        // input output with a number
        String l = JOptionPane.showInputDialog("Enter integer");
        // convert a string into a int        
        int m = Integer.parseInt(l);
        System.out.println("int m = " + m);

        String n = JOptionPane.showInputDialog("Enter double");
        double o = Double.parseDouble(n);
        System.out.println("double o = " + o);

        // built in math calculator functions
        double answer1 = Math.abs(-1);
        double answer2 = Math.PI;
        double answer3 = Math.cos(0.5);
        double answer4 = Math.log(0.5);
        double answer5 = Math.pow(5, 3);
        double answer6 = Math.sqrt(100);

        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);

        // making random numbers:
        // randoms come from doubles
        double seed = Math.random();
        System.out.println("seed = " + seed);

        // but you can use a formula:        
        final double HIGH = 6.0;
        final double LOW = 1.0;
        double random = (HIGH - LOW + 1) * seed + LOW;
        System.out.println("random = " + random);
        int number = (int) random;
        System.out.println("number = " + number);

        // another more practical example:        
        int die = (int) (6 * Math.random() + 1);
        System.out.println("die = " + die);

        // Strings and built in functions:
        String word = "depressed";
        int count = word.length();
        System.out.println(word + " = " + count);
        char letter = word.charAt(1);
        System.out.println("letter is " + letter);
        String newWord = word.toUpperCase();
        System.out.println("new word = " + newWord);

        // CONDITIONAL STATEMENTS:
        
        // basic if, decides 1 thing
        int value1 = 10;
        int value2 = 10;
        if (value1 == value2) {
            System.out.println("equal");
        }

        // if with else, decides 2 things
        double number1 = 3.25;
        double number2 = 1.99;
        if (number1 < number2) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }

        // another option, use else if with another test for deciding anything 
        // more than 2 things
        char letter1 = 'a';
        char letter2 = 'a';
        if (letter1 > letter2) {
            System.out.println("greater");
        }
        else if (letter1 < letter2) {
            System.out.println("less");
        }
        else {
            System.out.println("equal");
        }

        // strings are a little different with equals
        String word1 = "cat";
        String word2 = "Cat";
        if (word1.equals(word2)) {
            System.out.println("==");
        }
        else {
            System.out.println("not");
            System.out.println("really not");
            System.out.println("not kidding");
        }

        // combine logic using "and" "or"
        int age = 20;
        double iq = 0.95;
        if (age >= 15 && iq >= 0.75) {
            System.out.println("get in");
        }
        else if (age >= 15 || iq >= 0.75) {
            System.out.println("try again");
        }
        else {
            System.out.println("get out");
        }

        // LOOPS:
        
        // simple while loop        
        int counter = 1;
        while (counter <= 50) {
            System.out.println("counter = " + counter);
            counter++;
        }

        // loop with a string
        String password = JOptionPane.showInputDialog("Enter Password");
        while (password.equals("1234")) {
            System.out.println("NO");
            password = JOptionPane.showInputDialog("Enter Password");
        }

        // rarely used loop (may never use?) while loop that tests at the 
        // bottom of the loop and uses the other word "do" this loop is used 
        // when you want the inside of the loop to run at least once!
        do {
            password = JOptionPane.showInputDialog("Enter Password");
        } 
        while (password.equals("qwerty") == false);

        // the for loop
        // looks fancy, but it's just for counting
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 100; i >= 0; i = i - 5) {
            System.out.println("i = " + i);
        }

    }

    /**
     * The methods (functions, procedures) unit
     */
    private static void unit2() {
        System.out.println("Let's learn about methods");
        String something = "flaburgasted";
        draw(something); // calling the method
        draw("cat");     // cat is the arguement        
        draws("dalmation", 101);     // mulitple arguments 
        int number = giveMeNumber();   // returning from a method     
        draw("Your number was " + number);
        output("Hi");
        output("Hello", "My Method");
        output("Good-bye", 3);
        System.out.println("We're done learning about methods");
    }

    /**
     * Draws on the screen
     *
     * @param something the thing to draw
     */
    private static void draw(String something) {
        // something is called the parameter
        System.out.println(something);
    }

    /**
     * Draws multiple things on the screen
     * 
     * @param text the thing to draw
     * @param times how many times to draw it
     */
    private static void draws(String text, int times) {
        for (int i = 0; i < times; i++) {
            draw(text);
        }
    }

    /**
     * Gives you a number
     *
     * @return gives a random number
     */
    private static int giveMeNumber() {
        return random(1, 10);
    }

    /**
     * Generates a random number
     *
     * @param low lowest possible number
     * @param high highest possible number
     * @return random number in the range
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double value = (H - L + 1) * seed + L;
        int answer = (int) value;
        return answer;
    }

    /**
     * Displays text in a dialog box
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Displays text in a dialog box with a title
     * 
     * @param text the text to display
     * @param title the title to display
     */
    private static void output(String text, String title) {
        JOptionPane.showMessageDialog(null, text,
                title, JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Displays text in a dialog box multiple times
     * 
     * @param text the text to display
     * @param times how many dialogs to display
     */
    private static void output(String text, int times) {
        for (int i = 0; i < times; i++) {
            output(text);
        }
    }

    /**
     * The arrays unit
     */
    private static void unit3() {
        System.out.println("Let's learn arrays");

        // regular variable for comparison
        int size = 10;

        // create (declare) an array
        int[] numbers = new int[5];

        // creates an array of 5 slots, all which can hold integers
        numbers[0] = 50;
        numbers[1] = -60;
        numbers[2] = 77;
        numbers[3] = 0;
        numbers[4] = 10000004;
        //numbers[5] = 99;
        // out of bounds error
        //numbers[-1] = 98;

        double[] a;
        // you can create an empty array

        // later give it a size
        a = new double[2];
        a[0] = 3.14;
        a[1] = 7.89;

        // you can later resize it again
        a = new double[5];
        // when resized, all content is erased

        // another way to make arrays
        double[] coins = {0.05, 0.10, 0.25, 1.00, 2.00};

        // arrays can also be constants
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Quit"
        };

        int[] values = new int[100];
        // when working with an entire array, use a loop (for loop)        
        for (int i = 0; i < 100; i++) {
            values[i] = 25;
        }

        // display the array use .length to always get the size of the array
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // using a method with arrays
        
        // array as a parameter
        output(coins);
        output(values);

        // return arrays from methods
        int[] dice = random(10, 1, 6);
        output(dice);

        // multi dimensional array (matrix)
        final int X = 10; // means columns, length
        final int Y = 20; // means rows, height

        char[][] matrix = new char[X][Y];

        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                int low = (int) 'A';
                int high = (int) 'Z';
                int r = random(low, high);
                matrix[x][y] = (char) r;
            }
        }

        output(matrix);

    }

    /**
     * Displays a double array on the screen
     * 
     * @param array the array to display
     */
    private static void output(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("");
    }

    /**
     * Displays a integer array on the screen
     * 
     * @param array the array to display
     */
    private static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("");
    }

    /**
     * Generates an array of set size with random values in a range
     * @param size the size of the array to create
     * @param low the lowest random number in the range
     * @param high the highest random number in the range
     * @return the array of random integers
     */
    private static int[] random(int size, int low, int high) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random(low, high);
        }
        return a;
    }

    /**
     * Display a matrix (2D array) of chars in a formatted dialog box
     * 
     * @param matrix the 2D array of chars to display
     */
    private static void output(char[][] matrix) {
        String text = "";
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                text = text + matrix[c][r];
            }
            text = text + "\n";
        }

        // fancy output in a dialog......
        // create fancy graphics objects:
        Font font = new Font("Courier New",Font.BOLD,34);
        Color background = new Color(0, 0, 0);
        Color foreground = new Color(0, 255, 0);
        JTextArea area = new JTextArea();

        // change the display area:
        area.setFont(font);
        area.setBackground(background);
        area.setForeground(foreground);
        area.setText(text);

        // create a "image" object:
        Icon image = new ImageIcon("matrix.gif");

        JOptionPane.showMessageDialog(null, area,"", 
                JOptionPane.PLAIN_MESSAGE, image);
    }

    /**
     * Several in class code experiments during work classes 
     * that students requested to help with programming assignments
     */
    private static void experiments() {
        // method to get numbers, and not letters, 
        // words, etc
        String text = "Enter a number";
        String title = "Input of an integer";
        int number = getInteger(text, title);
        System.out.println("Number = " + number);
        // an example of a method that gives a fancy "drop down" input 
        // dialog for the user
        text  = "Pick a color";
        title = "Favorite color?";
        String[] options = { "Blue","Red","Green","Purple" };                
        String user = dropdown(text,title,options);        
        System.out.println("user selected = " + user);   
        // example of the JOptionPane dialog with custom buttons options
        text  = "Choose your fighter!";
        title = "Mortal Kombat";
        String[] buttons = {
            "Zena the Warrior Princess",
            "Wizard",
            "Shaman",
            "Necromancer",
        };        
        int choice = JOptionPane.showOptionDialog(null, text, title, 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, null, buttons, null);
        System.out.println("User picked button " + choice);        
    }
    
    /**
     * Gets user input as a integer with dialog box with error checking
     * 
     * @param text the text to display in the dialog
     * @param title the title of the dialog
     * @return the integer the user entered
     */
    private static int getInteger(String text, String title) {
        String error = "";
        while (true) {            
            // get the initial user input
            String user = JOptionPane.showInputDialog(null,
                    error + text, title, JOptionPane.PLAIN_MESSAGE);     
            if (user == null) { // hit cancel or red X
                error = "Please enter a proper number\n";
            }
            else if (user.equals("")) { // hit ok without typing
                error = "Please enter something\n";
            }
            else { // typed in something other than a valid int
                boolean valid = true;
                for (int i = 0; i < user.length(); i++) {
                    // travel through characters in string, get each 
                    char character = user.charAt(i);
                    if (Character.isDigit(character) == false) {
                        error = "Please do not enter non numeric "
                                + "characters\n";
                        i = user.length();
                        valid = false;
                    }
                }
                if (valid == true) { // passes all checks:
                    int number = Integer.parseInt(user);
                    return number;    
                }
            }
        }
    }

    /**
     * Dialog with a drop down display for the user to select from
     * 
     * @param text the text to display in the dialog
     * @param title the title of the dialog
     * @param options all the options to show in the drop down
     * @return the drop down option the user selects
     */
    private static String dropdown(String text, String title, 
                                   String[] options) { 
        Object object = JOptionPane.showInputDialog(null,text,title,
                JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        while (object == null) {
            object = JOptionPane.showInputDialog(null,text,title,
                    JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        }
        return object.toString();
    }

    /**
     * The classes unit
     */
    private static void unit4() {
        System.out.println("\nLet's learn about classes...\n");
        
        // create a person object from the Person class
        Person person = new Person();        
        // similar to old code like: Random random = new Random();
        
        
        
        System.out.println("\nClasses unit learning complete!\n");
    }

}


/** 
 * Required package class namespace - the line below is put in automatically,
 * and connects file to the project 
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
 * @since Feb. 5, 2020, 1:50:54 p.m.
 */
public class ComputerScience30S {       // Curly brackets DO NOT remove

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        learnIntroToJava();
        learnMethods();
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnIntroToJava() {
        // TODO code application logic here
                
        // anything following 2 slashes is a comment, until the end of the line

        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
                
        // Basic output
        System.out.print("Hello World...");
        
        // If you use println, it adds a line break at the end
        System.out.println("I'm in the world");
        
        // Additional output tips.... (these are "special" characters):        
        System.out.println("Quote \" ");
        System.out.println("Make a \t tab");
        System.out.println("Slash \\ ");
        System.out.println("New \n Line");
        
        // Make a "dialog" box appear        
        JOptionPane.showMessageDialog(null, "Hi");
        
        // Optional (does not "need" to be in assignments) dialog boxes:
        JOptionPane.showMessageDialog(null,
                "Information dialog icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE);
        // You can hit "enter" in some lines of code at certain places to 
        // drop the code to the next line and save having too long of a line
        
        JOptionPane.showMessageDialog(null,
                "Question dialog icon is ?",
                "Question title",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Warning dialog icon is !",
                "Warning title",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Plain dialog icon is !",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE);
        
        // dialogs for inputs
        
        // the simpliest version is the one you have to use        
        JOptionPane.showInputDialog("Enter something");
        
        // some optional versions of input dialogs
        JOptionPane.showInputDialog(null,
                "Information dialog icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Question dialog icon is ?",
                "Question title",
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Warning dialog icon is !",
                "Warning title",
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(null,
                "Plain dialog icon is !",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE);
        
        // NOTE: these examples above are NOT being used properly if used in
        // a assignment, correct way comes up later in this code...
        
        // an optional type of dialog (may not be needed)
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        // more different versions...
        
        JOptionPane.showConfirmDialog(null,
                "Example 1",
                "Information",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 2",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 3",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(null,
                "Example 4",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // the simpliest of variable types
        
        boolean a = true;
        // type name = value ;
        // how to create "declare" a variable 
        
        int b = 0;
        
        double c = 0.0;
        
        // variables can change (vary)
        a = false;
        b = 1;
        c = 1.2;
        
        // variable always goes on the LHS (left hand side) of the equals 
        // sign (=) and the value going into the variable always goes on the 
        // RHS (right hand side)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        System.out.println("d = " + d);
        
        // The boolean, int, double and char are all simple (primitive) data 
        // type, now a complex data type....
        
        String e = "banana";
        System.out.println("e = " + e);
        
        // manipulate (change) the varaibles...
        
        int x = 10;        
        System.out.println("x = " + x); // 10
        x = 20;
        System.out.println("x = " + x); // 20
        int y = x + 10;
        System.out.println("y = " + y); // 30
        
        // optional shorthand
        
        y++;    // means y = y + 1
        y--;    // means y = y - 1
        
        // even more optional 
        
        y += 10;  // means y = y + 10;
        y -= 10;  // means y = y - 10;
        y *= 10;  // means y = y * 10;
        y /= 10;  // means y = y / 10;
        
        System.out.println("y = " + y);
        
        // modulus (mod) gives you the remainder of a division, java 
        // uses the % symbol
        
        x = 28;
        y = x / 5;
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // constants are varaibles that don't change, and constants are 
        // written ALL_CAPS with underscores separating words
        
        final double  PI           = 3.14159265;
        final int     PROBLEMS     = 99;
        final char    YES          = 'Y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI + " and " +
                           PROBLEMS + " and " +
                           YES + " and " +
                           FOUND + " and " +
                           TEACHER_NAME);
        
        // convert one type to another...
        
        int    f = 25;
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        // use casting, it "ignores" any decimal places        
        int h = (int)g;
        
        System.out.println("h = " + h);
        
        double k = 2.999999999999;
        int    l = (int)k;
        double m = (double)l;
        
        // casting can happen with lots of types
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)63;
                
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // using input dialog boxes with variables
        
        String q = JOptionPane.showInputDialog("Enter string");
        JOptionPane.showMessageDialog(null,q);
        
        // use dialog input with numbers...
        
        // with numbers, you have to start off with a string and then convert
        // it to a number
        
        String r = JOptionPane.showInputDialog("Enter int");
        // now convert it, in a way like: Convert.toInt32()....
        // in C# uses something called "parsing" (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null,s);
        
        // same example with doubles:        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null,u);
                
        // example with char:
        String v = JOptionPane.showInputDialog("Enter char");
        char w = v.charAt(0);
        // strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        JOptionPane.showMessageDialog(null,w);
        
        // Strings have many built-in actions (functions, methods)        
        String word = "hippopotomonsprosesquippedaiophobia";        
        int length = word.length();        
        System.out.println(word + " is length " + length);        
        word = word.toUpperCase();        
        System.out.println(word);        
        // many more can be explored
        
        // also built-in to Java is a "Math" "library" of code
        
        double answer1 = Math.PI;
        double answer2 = Math.abs(-1);
        double answer3 = Math.cos(0.5);
        double answer4 = Math.log(0.5);
        double answer5 = Math.pow(5, 3);
        double answer6 = Math.sqrt(9);
        
        System.out.println("answer 1 = " + answer1);
        System.out.println("answer 2 = " + answer2);
        System.out.println("answer 3 = " + answer3);
        System.out.println("answer 4 = " + answer4);
        System.out.println("answer 5 = " + answer5);
        System.out.println("answer 6 = " + answer6);
        
        // math "library" does random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        System.out.println("seed = " + seed);
        
        // you can use a formula for generating random numbers in a range 
        // between a low and a high number:
        
        // eg. between 1 and 10 and make it an int
        
        // start with the constants defining the highest and lowest
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        // now a formula to generate in that range
        double number = (HIGH - LOW + 1) * seed + LOW;
        // now cast it to an integer
        int value = (int)number;
        // and display it
        System.out.println("random value = " + value);
        
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
                
        // simple if, use it when something is true, checks for 1 thing
        
        int value1 = 10, value2 = 10;
        
        // ifs use both () round and {} curly brackets and the code inside of
        // the curley brackets is said to be in a "block" of code, and that 
        // block only runs when the test is true it also indents the code  
        // inside a block
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with else, for both true and false, checks 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.println("Less than");
        }
        else {
            System.out.println("Greater than");
        }
        
        // use chars and some shorthand, not usually recommended (except in
        // certain situations) used when the code between { } (block) is only
        // one line of code! Then, you don't need the { }
        
        char value5 = 'A', value6 = 'a';
        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        
        // use "else if" for multiple cases of more than 2 things (same as a 
        // "switch" statement - which I do not use!) use string for this 
        // example which are more complex (because they are capital letters),
        // with string NEVER use == instead use .equals()...
        
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
        // using symbols:
        //  &&    ||    !
        
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

        // simple loop
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create "
                + "a password");        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Invalid,"
                    + " please try again!");            
            password = JOptionPane.showInputDialog("Create "
                + "a password");
        }
                
        // The next type of loop, more rarely used (you may never need it!), it
        // test for true/false at the bottom of the loop, you use it when you
        // want the body (block) of the loop to run at least once!        
        
        // the do while loop...
        
        String choice = "";        
        do {                        
            choice = JOptionPane.showInputDialog(
                     "Enter password");            
        } while (choice.equalsIgnoreCase(password) == false);
        
        // The for loop is used for counting (and for the upcoming unit of 
        // arrays)
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // variations on the for loop:
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
        System.out.println("\n Start Learning Methods... \n");
        
        // methods (functions, procedures) are named like variables, but use 
        // verb type words starting with lowercase then using camel casing
        // the round braces ( ) indicate a method
        
        // code to "jump" to our method, is "calling" the method
        drawStar(); // the method call
        
        // if you hold down the CTRL key, methods calls become links with the
        // mouse to the method
        
        draw("potato");
        draw("zebra");
        draw("tamborine");
        
        // calling a method with an argument (which is the "data" items) is
        // "passed" to the method itself into the parameter
        
        // you can have multiple parameters/arguments which are seperated 
        // with commas  
        
        draws("dalmations",101);
        draws("problems",99);
        
        // you can methods that "send back"
        // information from the method
        
        int number = giveMeNumber();
        draw("Number is " + number);
        
        // overloaded methods are methods with the same name but different 
        // parameters        
        output("Hi");
        output("Hello","OverLoad Example");
                
        System.out.println("\n Learning Methods complete! \n");
    }
            
    /**
     * Draws a star on the screen
     */
    private static void drawStar() {
        System.out.println("*");
    }
  
    /**
     * Draws a thing on screen
     * 
     * @param thing the thing to draw
     */    
    private static void draw(String thing) {
        // information (data) "passed" to this method is called the parameter
        // if you use the lightbulb to write the method, you often should
        // rewrite the name of that parameter
        System.out.println(thing);        
    }

    /**
     * Draws a thing on the screen multiple times
     * 
     * @param thing the thing to draw
     * @param times how many time to draw it
     */    
    private static void draws(String thing, int times) {
        // one method can call another method
        for (int i = 0; i < times; i++) {
            draw(thing);
        }
    }

    /**
     * Gives you a number
     * 
     * @return random number between 1 and 52
     */
    private static int giveMeNumber() {
        // the key word to "give back" is "return"
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
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double number = (H - L + 1) * seed + L;
        return (int)number;
    }

    /**
     * Outputs text in a dialog
     * 
     * @param text the text to output
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Outputs text in a dialog
     * 
     * @param text the text to output
     * @param title the title for the dialog
     */
    private static void output(String text, String title) {
        JOptionPane.showMessageDialog(null, text, 
                title, JOptionPane.PLAIN_MESSAGE);
    }
        
}


// NETBEANS TIPS:
// ==============
// (1)  Hold Alt + scroll mouse to zoom in and out on code
// (2)  Double click the top of a tab of code to make bigger or smaller
// (3)  Type in lowercase "sout" and hit TAB to write System.out....
// (4)  Words in capital letters and in blue are IMPORTANT code words, the words
//      in captial letters are powerful, they are a "class"
// (5)  Intellisense (autocomplete) can appear if you press "CTRL + SPACE"
// (6)  The word "null" means "nothing" and can act as a placeholder for code 
//      you don't actually want
// (7)  To "comment out" some code, select the code (with your mouse) and 
//      click on the two buttons under the code tab (at the right end)
// (8)  A red squiggily line and/or a "lightbulb" in NetBeans means a potential 
//      error and a potential fix (if you click on the lightbulb)
// (9)  You can get more NetBeans tips and autocompletes by selecting 
//      Help -> Keyboard Shortcuts Card
// (10) To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (11) Go to Tools -> Templates, scroll down and click on the "+" beside 
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
// (12) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (13) To autoformat code (fixes indents, extra spaces, etc.) select code with
//      mouse or keyboard (or it will format all if none is selected) and press
//      ALT + SHIFT + F  (you should do this before hand in!)
// (14) When handing in multiple Java class files, step 1: make sure they are 
//      all open in tabs, Step 2: use the mouse (and the keyboard, holding 
//      down the "CTRL" key) to select all the class files in the Projects 
//      window, Step 3: Go to File -> Print
// (15) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (16) If you have to rename a variable or a method, select the
//      word and then press CTRL + R, then type in a new name
// (17) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (18) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 8) will help you write it
// (19) If you hold down the CTRL key, methods calls become links with the 
//      mouse to the method (even ones we don't write)
// (20) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (21) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make


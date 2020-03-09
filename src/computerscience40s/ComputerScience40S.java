
/** required package class namespace */
package computerscience40s;

/** required imports */
import testing.Tester;


/**
 * ComputerScience40S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since 7-Sep-2018 
 */
public class ComputerScience40S 
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nComputer Science 40S starting...\n");
        
        Tester tester = new Tester();
        
        System.out.println("\nComputer Science 40S complete!\n");
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
// (22) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line
// (23) Go to Tools -> Templates, scroll down and click on the "+" beside 
//      "Java", select "Java Class", and "Open in Editor" and the enter 
//      all the code below into the template (but uncomment it first using the 
//      button from tip 7) to replace all the code already in the template
//      then change the @author to your name. NOTE: This can also be used (the 
//      first part of this) in the interface template as well
//
///** required package class namespace */
//<#if package?? && package != "">
//package ${package};
//
//</#if>
// 
///**
// * ${name}.java - description
// *
// * @author Mr. Wachs
// * @since ${date}, ${time}
// */
//public class ${name} 
//{
//
//    /**
//     * Default constructor, set class properties
//     */
//    public ${name}() {
//        
//    }
//     
//    /**
//     * String representation of this object
//     *
//     * @return The object represented as a String
//     */
//    @Override
//    public String toString() {
//        return "${name}: " + super.toString();
//    }
//   
//    /**
//     * Deep comparison, determines if two objects are "equal" in this context
//     *
//     * @param object the object to compare to
//     * @return the objects are "equal" (true) or not (false)
//     */
//    @Override
//    public boolean equals(Object object) {
//        return super.equals(object);
//    }
//       
//    /**
//     * a Deep clone, creates a duplicate object using new memory
//     *
//     * @return a "clone" of the object using new memory
//     */
//    @Override
//    public ${name} clone() {
//        return this;
//    }
//    
//}
//

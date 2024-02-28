
/** Required package class namespace */
package computerscience40s;

/** Required imports */
import testing.Tester;


/**
 * ComputerScience40S.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit 
 * along with any in class requests for code examples that might come up 
 * over the course
 *
 * @author Mr. Wachs 
 * @since February 28, 2024
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
// (13) When printing code for hand in, when in NetBeans (after the code is 
//      cleaned up and ready - see tip 13) go to File -> Print to HTML... and 
//      then use the dialog box that appears to select a location you can find 
//      the HTML file, and give the file you are saving a good name (with your 
//      name in the file name). Then use the hand in page to hand in the files
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
// (23) To modify the template of all new classes, Tools -> Templates, scroll 
//      down and click on the "+" beside "Java", select "Java Class" and use 
//      ALL the code (uncommented) below:
//
///** Required package class namespace */
//package ${package};
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

// </editor-fold>

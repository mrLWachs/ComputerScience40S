
// anything following the 2 slashes is a comment, until the end of the line

/*  
    This is for multiple line comments until it sees a star and a slash.
    So anything between slash star and start slash is considered a commment.
*/

// TIPS:
// (1) Hold Alt + scroll mouse to zoom in and out on code
// (2) Double click the top of a tab of code to make bigger or smaller
// (3) Type in lowercase "sout" and hit TAB to write System.out....
// (4) Words in capital letters and in blue are IMPORTANT code words
// (5) Intellisense (autocomplete) can appear if you press CTRL + SPACE
// (6) The word "null" means "nothing" can be a substitute code some code


/** required package class namespace - the line below is put in
 * automatically, and connects file to the project */
package computerscience30s;

import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course
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
        // TODO code application logic here
        
        // Basic output
        System.out.print("Hello World");
        
        // if you use println, it adds a line break at the end
        System.out.println("I'm in the world");
        
        // additional output tips....
        
        // these are "special" characters:        
        System.out.println("Quote \" ");
        System.out.println("Make a \t tab");
        System.out.println("Slash \\ ");
        System.out.println("New \n Line");
        
        // make a "dialog" box appear        
        JOptionPane.showMessageDialog(null, "Hi");
        
        // optional (does not "need" to be in assignments)
        // dialog boxes
        
        // you can hit "enter" in some lines of code
        // to save going to long of a line
        JOptionPane.showMessageDialog(null,
                "Information dialog icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
                "Question dialog icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE);
        
        
        
        
        
        System.out.println("Good-bye World!");
        
        
        
        
        
    }

}

// line below, put in automatically
// connects this file to the project
package computerscience30s;

// the name of the file matching it in code

import javax.swing.JOptionPane;

// defining a class (learn more about later)
public class ComputerScience30S 
{   // curly brackets DO NOT remove
    
    // a method (which we learn in next unit)
    public static void main(String[] args) {
        
        // JAVA BASIC INPUT AND OUTPUTS
        
        // a 1 line comment
        
        /*
            multiple line comment
            covers as many lines as you want
            until it sees the closing
        */
        
        // basic output
        System.out.print("Hello World");
        
        // words starting with captial letters
        // are powerful, they are a "class"
        
        // type "sout" and press TAB        
        System.out.println("I'm in the world");
        System.out.println("Good-bye world");
        
        // output "special" characters
        System.out.println("Quote \" " );
        System.out.println("\tMake a tab");
        System.out.println("\\Slash");
        System.out.println("New\n\nLine");
        
        
        // TIP: if your want intellisense
        // to appear at any time press:
        // "CTRL" + "SPACE"
        
        // "null" is a placeholder for code you 
        // don't actually want
        
        // "fancy" ouptut using a dialog
        JOptionPane.showMessageDialog(null, "Hi");
        
        // optional versions of output dialogs
        
        JOptionPane.showMessageDialog(null, 
                "Information dialog icon is i");
        
        
        
        
    }

}

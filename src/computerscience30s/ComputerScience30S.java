
// The line below is put in automatically, and connects file to the project
package computerscience30s;

import javax.swing.JOptionPane;

// Name of the file matching it in code defining a class (learn more later)
public class ComputerScience30S 
{   // Curly brackets DO NOT remove
    
    // A method (which we learn in next unit)
    public static void main(String[] args) {
        
        // JAVA BASIC INPUT AND OUTPUTS
        
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}

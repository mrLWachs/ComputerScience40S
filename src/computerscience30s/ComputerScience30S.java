/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscience30s;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.wachs
 */
public class ComputerScience30S {       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here        
//        // This is a comment all typing after "//" until the line ends        
//        // Commments are not code, so you can write what you want        
//        // Curly brackets (braces, parenthesis) { and } are important        
//        // All code right now goes between these two brackets
//        
//        /*  
//            This is for multiple line comments, as it covers as many lines as
//            you want starting with "slash star" until it sees the closing 
//            "star slash"
//        */
//        
//        ///////////////////////////////////////////////////////////////////////
//        // JAVA BASIC INPUT AND OUTPUTS
//        ///////////////////////////////////////////////////////////////////////
//                
//        // Basic output
//        System.out.println("Hello World...");
//        // Use print without the "ln", does not add a line break at the end
//        System.out.println("I'm in the world");
//        
//        System.out.println("Good-bye world!");
//                
//        // Additional output tips... (these are "special" characters)
//        
//        System.out.println("Make a quote \" ");
//        System.out.println("Make a slash \\ ");
//        System.out.println("Make a \t tab");
//        System.out.println("Make a \n new line");
//        
//        // Make a dialog box appear
//        JOptionPane.showMessageDialog(null, "Hello");
//        
//        // Above is the only one need for assignments, final projects, etc.
//        // Optional (not needed, but cool) dialog boxes below:
//        
//        JOptionPane.showMessageDialog(
//                null,
//                "Information icon is i",
//                "Information Title",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null,
//                "Question icon is ?",
//                "Question Title",
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null,
//                "Warning icon is !",
//                "Warning Title",
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null,
//                "Plain no no icon",
//                "Plain Title",
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // Dialogs for inputs....
//        
//        // The simpliest version is the one you have to use
//        JOptionPane.showInputDialog("Enter something");
//        
//        // Some optional input dialogs below:
//        JOptionPane.showInputDialog(
//                null, 
//                "Information dialog icon is i", 
//                "Information Title", 
//                JOptionPane.INFORMATION_MESSAGE);
//
//        JOptionPane.showInputDialog(
//                null, 
//                "Question dialog icon is ?", 
//                "Question Title", 
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Warning dialog icon is !", 
//                "Warning Title", 
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Plain dialog no icon", 
//                "Plain Title", 
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // More different (and optional) dialogs...
//        
//        JOptionPane.showConfirmDialog(null, "Confirm");
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 1",
//                "Information",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 2",
//                "Question",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 3",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null,
//                "Example 4",
//                "Plain",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
//        
//        ///////////////////////////////////////////////////////////////////////
//        // VARIABLES:
//        ///////////////////////////////////////////////////////////////////////
//        
//        // The simpliest variable (variables store "remember" data) type
//        
//        boolean a = true;
//        
//        // When you write a line of code to create (declare) a variable:
//        
//        // type name = value ;
//        
//        int b = 0;
//        
//        double c = 0.0;
//        
//        // Variables can change ("vary")
//        
//        a = false;
//        b = 1;
//        c = 1.2;
//        
//        // Variables always go on the left hand side (LHS) of the equals
//        // sign (=) and the value going into the variable always goes on the 
//        // right hand side (RHS) 
//        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        // The boolean, integer (int), double, character (char) are all simple
//        // data types (primitive), now a complex type...
//        
//        String e = "house";
//        
//        System.out.println("e = " + e);
//        
//        // Manipulate the variables...
//        
//        int x = 10;        
//        System.out.println("x = " + x);        
//        x = 20;        
//        System.out.println("x = " + x);        
//        int y = x + 10;        
//        System.out.println("y = " + y);
//        
//        // Optional shorthand...
//        
//        y++;    // means y = y + 1
//        y--;    // means y = y - 1
//        
//        // Even more optional shorthand...
//        
//        y += 10;    // means y = y + 10
//        y -= 10;    // means y = y - 10
//        y *= 10;    // means y = y * 10
//        y /= 10;    // means y = y / 10
//        
//        System.out.println("y = " + y);
//        
//        // modulus (mod) gives you the remainder of a division, java 
//        // uses the % symbol
//        
//        x = 28;
//        y = x / 5;
//        int z = x % 5;
//        
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        // constants are varaibles that don't change, and constants are 
//        // written ALL_CAPS with underscores separating words
//        
//        final double  PI           = 3.14159265;
//        final int     PROBLEMS     = 99;
//        final char    YES          = 'Y';
//        final boolean FOUND        = true;
//        final String  TEACHER_NAME = "Wachs";
//        
//        System.out.println(PI + " and " +
//                           PROBLEMS + " and " +
//                           YES + " and " +
//                           FOUND + " and " +
//                           TEACHER_NAME);
//        
//        // convert one type to another
//        
//        int    f = 25;
//        double g = f;
//        
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        
//        // Now change g..
//        
//        g = 25.999999999999;
//        
//        // uses "casting", it ignores any decimals
//        int h = (int)g;
//        
//        System.out.println("h = " + h);
//        
//        double k = 2.9999999999;
//        int    l = (int)k;
//        double m = (double)l;
//        
//        // casting can happen with other types
//        
//        char n = 'A';
//        int  o = (int)n;
//        int  p = 72;
//        char q = (char)p;
//        
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("o = " + o);
//        System.out.println("p = " + p);
//        System.out.println("q = " + q);
//        
//        // use input dialogs with variables
//        
//        // ALWAYS use a variable with an input dialog!
//        
//        String r = JOptionPane.showInputDialog("Enter");
//        JOptionPane.showMessageDialog(null, r);
//        
//        // with numbers, you have to start off as a string and then convert
//        // it to a number
//        
//        // like in C# remember Convert.ToInt32(text)....
//        
//        String s = JOptionPane.showInputDialog("Enter int");
//        
//        // now convert it using "parsing" (means "reading it")
//        
//        int t = Integer.parseInt(s);
//        
//        JOptionPane.showMessageDialog(null, t);
//        
//        // Same thing with a double:        
//        String u = JOptionPane.showInputDialog("Enter double");
//        double v = Double.parseDouble(u);
//        JOptionPane.showMessageDialog(null, v);
//        
//        // More rare, with a char:
//        String w = JOptionPane.showInputDialog("Enter char");
//        
//        char x1 = w.charAt(0);
//        
//        JOptionPane.showMessageDialog(null, x1);
        
        // Strings have built-in actions like "chatAt" to pull out a character
        // "at" location "0" which means the very first character (because
        // numbering in Computer Science usually starts at 0)
        
        // String have many built-in actions (functions, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        
        int length = word.length();
        
        System.out.println("Word " + word + " is length " + length);
        
        
        
        
    }
    
}


// NETBEANS TIPS:
// ==============
// (1) To zoom in and out on the code, hold ALT and roll the mouse
// (2) Double click the top of a tab to hide side windows or show them
// (3) The curly brackets (braces, parenthesis) are important "{" and "}"
// (4) Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5) Click the green triangle on the top toolbar to run code
// (6) Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7) The word "null" means nothing and can act as a placeholder for code
//     you don't actually need (right now)
// (8) To "comment out" chunks of code, select the code with your mouse or
//     keyboard, then click on the two buttons under the code tab









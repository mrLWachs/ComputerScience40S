
/** Required package class namespace */
package computerscience30s;

import javax.swing.JFrame;

/**
 * Graphics2.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since May 30, 2023
 */
public class Graphics2 extends JFrame
{

   public Graphics2() {
       // Add code (like the "initComponents() method that the designder writes)
       // to "set up" (or "initializes") the frame (form/container)
       this.setSize(500, 700);
       this.setTitle("Graphics 2");
       this.setResizable(false);
       this.setLocationRelativeTo(null);    // Centers the form on the screen
       // NOTE: this line above can not be done with the designer
       
       this.setVisible(true);
   }
    
}
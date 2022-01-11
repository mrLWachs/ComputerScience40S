/** Required package class namespace */
package computerscience30s;

import javax.swing.JFrame;

 
/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since 10-Jan-2022, 11:40:10 AM
 */
public class Graphics1 extends JFrame
{
    
    /**
     * Default class constructor, sets class properties - this method will be
     * called when a "Graphics1" object is created (instantiated)
     */
    public Graphics1() {
        // Use a reference to the object that will be created in the future
        // and use all the properties and call (invoke) all the methods
        // we inherited from the super-class (JFrame)
        this.setSize(680, 830);         // Sets the width and height
        this.setTitle("Graphics 1");    // Sets the title at top of form (frame)
        
        this.setVisible(true);          // make the frame (container) visible
    }
    
}
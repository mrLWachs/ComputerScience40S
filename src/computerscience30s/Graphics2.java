/** Required package class namespace */
package computerscience30s;

/** Required API imports */
import javax.swing.JFrame;


/**
 * Graphics2.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class Graphics2 extends JFrame
{

    /**
     * Default class constructor, sets class properties - this method will be
     * called when a "Graphics2" object is created (instantiated) - which is 
     * done in the "LearnGraphics" class constructor method
     */
    public Graphics2() {
        this.setSize(600, 600);
        
        // Reveal design to user (this should be done last in constructor)
        this.setVisible(true);          // Make the frame (container) visible
    }
        
}

/** required package class namespace */
package computerscience30s;

/** required imports */
import javax.swing.JFrame;


/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since December 10, 2018 
 * @instructor Mr. Wachs
 */
public class Graphics1 extends JFrame
{

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        this.setSize(800, 800);             // sets frame's width and height
        this.setVisible(true);              // makes the frame visible
    }  
   
}

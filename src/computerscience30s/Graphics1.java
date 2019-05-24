
/** required package class namespace */
package computerscience30s;

/** required imports */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since May 24, 2019 
 */
public class Graphics1 extends JFrame
{
    
    // properties (controls in my container)
        
    private JLabel     text;        // labels can be for text, images, or both
    private JLabel     picture;
    private JTextField textbox;     // a text box area
    private JButton    button;      // a command button

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        setFrame();
        setControls();        
        // reveal design to user (this should be done last in constructor)
        this.setVisible(true);                          // makes frame visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setFrame() {
        this.setSize(350, 450);                         // set width and height
        this.setTitle("Graphics One");                  // title at the top
    }

    /**
     * Setup all the controls to go in the container
     */
    private void setControls() {
        
    }
   
}

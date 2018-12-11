
/** required package class namespace */
package computerscience30s;

/** required imports */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
    // properties (controls in my container)
    
    private JButton button;     // a command button
    private JLabel text;        // labels can be for text, images, or both
    private JLabel picture;     
        

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        // set frame's (form) properties:
        this.setSize(800, 800);                         // set width and height
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   // when I hit the "X"
        this.setTitle("Graphics One");                  // title at the top
        this.setResizable(false);                       // cannot resize
        this.setLocationRelativeTo(null);               // center on screen

        // build (instantiate) my controls:        
        text = new JLabel("Hello World");               
        button = new JButton("Exit");
        
        
        
        // code continued next class..................        
                
        // reveal my design to the user
        this.setVisible(true);                          // makes frame visible
    }  
   
}

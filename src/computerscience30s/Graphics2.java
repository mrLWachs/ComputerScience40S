
/** required package class namespace */
package computerscience30s;

/** required imports */
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * Graphics2.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since December 19, 2019 
 */
class Graphics2 extends JFrame
{

    // controls for the container (which is the JFrame/Graphics2), also means: 
    // properties or "global variables" of this class
    
    private JLabel     text;        // labels can be for text, images, or both
    private JLabel     picture;
    private JTextField textbox;     // a text box area
    private JButton    button;      // a command button
    
    
    /**
     * Default class constructor, sets class properties
     */
    public Graphics2() {
        setContainer();
        setControls(); 
        setActions();
        // reveal design to user (this should be done last in constructor)
        this.setVisible(true);                          // makes frame visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setContainer() {
        this.setSize(294, 440);                         // set width and height
        this.setTitle("Graphics 2");                    // title at the top
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * Setup all the controls to go in the container
     */
    private void setControls() {
        // create (instantiate) the objects (controls)
        text    = new JLabel();
        picture = new JLabel();
        textbox = new JTextField(20);
        button  = new JButton("Exit");
        
        // change any properties of the controls
        text.setText("Hello World");
        // with images, little more code, so why not "take" (copy/paste) the 
        // code from a designer and then adapt it as you like
        final String FILE = "/computerscience30s/source.gif";
        picture.setIcon(new ImageIcon(getClass().getResource(FILE)));
        
        // set the container's layout manager to position all the controls
        Container container = this.getContentPane();
        container.setLayout(null);          // null means you position yourself
        
        // add the controls into the container
        container.add(text);
        container.add(picture);
        container.add(textbox);
        container.add(button);
        
        // position all controls using: x,y,width,height        
        text.setBounds(10, 11, 57, 14);
        picture.setBounds(10, 31, 256, 256);
        textbox.setBounds(10, 305, 256, 20);
        button.setBounds(10, 343, 256, 41);
        
    }

    /**
     * Adds the actions to the various controls
     */
    private void setActions() {
    
        // Action "listener" means it "listens" for specific actions to occur
        
        
    }    

}

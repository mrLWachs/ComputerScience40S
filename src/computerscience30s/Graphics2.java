/** Required package class namespace */
package computerscience30s;

/** Required imports */
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
 * @since 2-Jun-2022, 3:16:27 PM
 */
public class Graphics2 extends JFrame
{
    // Create some "global variables" or properties of this class ("things
    // about that class", descriptors, adjectives) which are the controls
    // (components, widgets, tools) for that container
    
    private JLabel     text;        // Label can be for text, images, or both
    private JButton    button;      // "Command button" in C#
    private JTextField textbox;     // A text box area
    private JLabel     picture;     // There are other ways to show images
    

    /**
     * Default class constructor, sets class properties - this method will be
     * called when a "Graphics1" object is created (instantiated) - which is 
     * done in the "LearnGraphics" class constructor method
     */
    public Graphics2() {
        // To have NetBeans automate writing a method for you, select the code
        // you want in the method with your mouse first, then press:
        // ALT + SHIFT + M and name the method
        setContainer();
        setControls();
        //setActions();
        
        // Reveal design to user (this should be done last in constructor)
        this.setVisible(true);          // Make the frame (container) visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setContainer() {
        // Use a reference to the object that will be created in the future
        // and use all the properties and call (invoke) all the methods
        // we inherited from the super-class (JFrame)
        this.setSize(680, 830);         // Sets the width and height
        this.setTitle("Graphics 1");    // Sets the title at top of form (frame)
        this.setResizable(false);       // Makes it so the user cannot resize
        this.setLocationRelativeTo(null);   // Centers the form on screen
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Means when the close this form (frame, window, app, program, 
        // container) the entire program (all forms) also close
    }

    /**
     * Setup all the controls to go in the container
     */
    private void setControls() {
        // Create (instantiate) the objects (controls)
        text    = new JLabel();        // Calls the JLabel constructor method
        button  = new JButton();
        textbox = new JTextField();
        picture = new JLabel();
        
        // Change any properties of the controls
        text.setText("Hello World");
        button.setText("EXIT");
        // With image, little more code, why not "take" (copy/paste) the
        // code from the designer and adapt it as you like
        final String FILE = "/computerscience30s/giphy.gif";
        picture.setIcon(new ImageIcon(getClass().getResource(FILE))); 
        
        // Set the container's layout manager to position all the controls
        Container container = this.getContentPane();
        container.setLayout(null);  // null means you will position yourself
        
        // Add the controls to the container
        container.add(text);
        container.add(button);
        container.add(textbox);
        container.add(picture);        
                
        // Position all controls using: x, y, width, height
        text.setBounds(10, 10, 650, 20);
        button.setBounds(10, 50, 650, 40);
        textbox.setBounds(10, 100, 650, 20);
        picture.setBounds(10, 110, 650, 650);        
    }
   
}
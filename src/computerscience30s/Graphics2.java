
/** Required package class namespace */
package computerscience30s;
 
/** Required API imports */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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
 * @since May 23, 2024, 8:57:03 a.m.
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
     * called when a "Graphics2" object is created (instantiated) - which is 
     * done in the "LearnGraphics" class constructor method
     */
    public Graphics2() {
        // To have NetBeans automate writing a method for you, select the code
        // you want in the method with your mouse first, then press:
        // ALT + SHIFT + M and name the method
        setContainer();
        setControls();
        setActions();        
        
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
        this.setSize(255, 380);
        this.setTitle("Graphics 2");    // Sets the title at top of form (frame)
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
        button.setText("Exit");
        // With image, little more code, why not "take" (copy/paste) the
        // code from the designer and adapt it as you like
        final String FILE = "/computerscience30s/dog.gif";
        picture.setIcon(new ImageIcon(getClass().getResource(FILE))); 
        
        // Set the container's layout manager to posiition all the controls
        Container container = this.getContentPane();
        container.setLayout(null);  // null means you will position yourself
        
        // Add the controls to the container
        container.add(text);
        container.add(picture);
        container.add(textbox);
        container.add(button);
        
        // Position all controls using: x, y, width, height
        text.setBounds(20, 10, 210, 40);
        picture.setBounds(20, 130, 200, 200);
        textbox.setBounds(20, 100, 200, 22);
        button.setBounds(20, 50, 200, 30);   
    }

    /**
     * Adds the actions to the various controls using an action listener. 
     * Action "listener" means it "listens" for specific actions to occur
     */
    private void setActions() {
        // Action events connected to controls (components, e.g. button) on 
        // our container (user interface, or frame, or form) have 3 parts:
        //  (1) Set up (in code) an "action listener" (like a mouse trap)
        //  (2) Connect that listener to an object (like putting the trap down)
        //  (3) Write an event connected to the listener (what do we do?)
        
        // (1) Create an action listener for the click of our button
        // use NetBeans autocomplete (CTRL + SPACE) to help write this code...
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // (3) The code for the action
                System.exit(0);
            }
        };
        // (2) then connect ("add") that listener to the control (button)
        button.addActionListener(buttonListener);
        
        // Do this all over again, but combine some steps (for shorter code)
        // we will create and add (connect) the action listener in one step
        // to the textbox - and we will listen for a different event keyboard
        // action event (again use autocomplete to help write the code)
        textbox.addKeyListener( new KeyListener() {
            public void keyTyped(KeyEvent e) {   }
            public void keyPressed(KeyEvent e) {
                text.setText("Key pressed was " + e.getKeyCode());
            }
            public void keyReleased(KeyEvent e) {  }
        });
        
        // Last time, now listening for "mouse events", add mouse action 
        // listener specifically for mouse actions, and call an "outside" 
        // method for the action (we will write)
        picture.addMouseMotionListener( new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {            }
            public void mouseMoved(MouseEvent e) {
                mouseMoving(e);
            }
        });
    }
    
    /**
     * When the mouse moves over the picture, it updates the label with 
     * information about where (coordinates) the mouse is
     * 
     * @param event the mouse event information from the mouse
     */
    private void mouseMoving(MouseEvent event) {
        text.setText("Mouse " + event.getX() + "," + event.getY());
    }
    
}

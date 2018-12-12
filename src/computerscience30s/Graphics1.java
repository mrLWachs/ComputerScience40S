
/** required package class namespace */
package computerscience30s;

/** required imports */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
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
 * @since December 10, 2018 
 * @instructor Mr. Wachs
 */
public class Graphics1 extends JFrame
{
    // properties (controls in my container)
    
    private JButton button;     // a command button
    private JLabel text;        // labels can be for text, images, or both
    private JLabel picture;
    private JTextField textbox; // a text box area
        

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        
        // set frame's (form) properties:
        this.setSize(350, 450);                         // set width and height
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   // when I hit the "X"
        this.setTitle("Graphics One");                  // title at the top
        this.setResizable(false);                       // cannot resize
        this.setLocationRelativeTo(null);               // center on screen

        // build (instantiate) my controls:        
        text = new JLabel("Hello World");           // constructor sets text
        button = new JButton("Exit");               // constructor sets text
        textbox = new JTextField(10);               // constructor sets width
        picture = new JLabel(new ImageIcon(
                "C:\\Users\\lawrence.wachs\\"
                + "Desktop\\Stuff\\Projects\\"
                + "Programming\\Java\\"
                + "ComputerScience30S\\"
                + "src\\computerscience30s\\"
                + "Tesseract.gif"));                // constructor builds image
        
        // setup the container
        this.getContentPane().setLayout(null);      // I will position things
        
        // add our controls to the container
        this.getContentPane().add(text);
        this.getContentPane().add(button);
        this.getContentPane().add(textbox);
        this.getContentPane().add(picture);
        
        // position all our controls
        text.setBounds(20, 5, 200, 25);
        textbox.setBounds(20, 35, 200, 25);
        button.setBounds(20, 65, 200, 50);
        picture.setBounds(20, 120, 300, 300);
        
        // add our actions
        addActions();
                
        // reveal my design to the user
        this.setVisible(true);                          // makes frame visible
    }  

    /**
     * Adds the actions to the various controls
     */
    private void addActions() {
        
        // create a click action listener for the button
        ActionListener buttonAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click();
            }
        };
        // connect the action listener to the button
        button.addActionListener(buttonAction);
        
        // create a key press action listener for the textbox
        KeyListener textboxAction = new KeyListener() {
            public void keyTyped(KeyEvent e)   { }
            public void keyPressed(KeyEvent e) {
                keypress();
            }
            public void keyReleased(KeyEvent e) { }
        };
        // connect the action listener to the textbox
        textbox.addKeyListener(textboxAction);
        
        // create a mouse over action listener for the picture
        MouseListener pictureAction = new MouseListener() {
            public void mouseClicked(MouseEvent e)  { }
            public void mousePressed(MouseEvent e)  { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) {
                mouseHover();
            }
            public void mouseExited(MouseEvent e)   { }
        };
        // connect the action listener to the picture
        picture.addMouseListener(pictureAction);
        
    }
        
    /**
     * The click action for the button
     */
    private void click() {
        System.exit(0);
    }
    
    /**
     * The key press action for the textbox
     */
    private void keypress() {
        text.setText("Typing in the textbox...");
    }
    
    /**
     * The mouse hover over action for the picture
     */
    private void mouseHover() {
        text.setText("Mouse is over the picture...");
    }
   
}

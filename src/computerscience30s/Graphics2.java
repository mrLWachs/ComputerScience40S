
package computerscience30s;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 

class Graphics2 extends JFrame
{
    
    // properties (controls in my container), "global variables"
    
    private JLabel     text;
    private JLabel     picture;
    private JTextField textbox;
    private JButton    button;
    
    public Graphics2() {
        setContainer();
        setControls();
        setActions();
        this.setVisible(true);
    }

    private void setContainer() {
        this.setSize(296, 435);
        this.setTitle("Graphics 2");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void setControls() {
        // create objects (instantiate the objects, controls)
        text    = new JLabel();
        picture = new JLabel();
        textbox = new JTextField(20);
        button  = new JButton("Exit");
        
        // set any properties of the controls
        text.setText("Hello World");
        // with images, a few more steps
        final String IMAGE_FILE = "/computerscience30s/source.gif";
        picture.setIcon(new ImageIcon(getClass().getResource(IMAGE_FILE)));
        
        // set container's layout manager 
        Container container = this.getContentPane();
        container.setLayout(null);
                
        // add the controls into the container
        container.add(text);
        container.add(picture);
        container.add(textbox);
        container.add(button);
        
        // position all the controls with x,y,width,height        
        text.setBounds(10, 11, 57, 14);
        picture.setBounds(10, 31, 256, 256);
        textbox.setBounds(10, 305, 256, 20);
        button.setBounds(10, 343, 256, 41);
        
    }

    private void setActions() {
        
    }

    
}

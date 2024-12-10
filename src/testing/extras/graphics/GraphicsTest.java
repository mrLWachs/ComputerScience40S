/** Required package class namespace */
package testing.extras.graphics;

/** Required API imports */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

 
/**
 * GraphicsTest.java - a bonus example of working with graphical objects (or
 * "graphics") and user interface (or "UI"). It starts with beginner concepts
 * and then advanced to more CS40S and beyond levels. Further resources for this 
 * topic can be found here:
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class GraphicsTest 
{

    /**
     * Default constructor method
     */
    public GraphicsTest() {
        // Most if not all "graphics things" involve 2 main concepts:
        // (1) Container object(s)
        // (2) Object(s) - or: tools, controls, widgets (inside the container)
        
        // (1) Containers can be called things like: app (application), game, 
        // frame, form, panel, etc.
        // (2) Controls can be called things like: buttons, images, text 
        // (labels), textboxes, etc.
        
        // Interactivity: meaning the user "uses" these things - the phrase
        // "User Interface" (UI), sometime worded as GUI (Graphical User
        // Interface)...
        
        // Simple example:
        // JOptionPane.showMessageDialog(null, "Hello World");
        
        // Here the "Dialog" is the container and the programmer provides the 
        // words through a method and it (meaning someone else's code) is 
        // building the container and the objects to display the text
        
        // So....
        
        // When using graphics or UIs, you will be using other code from
        // "libraries of code", API, frameworks - you will call the methods,
        // instantiate the objects, etc.
        
        // So most (if not all) graphics/UI code APIs must be imported
        JFrame jframe = new JFrame("The title of the frame");
        // And call the methods of the imported container object, these 
        // will change (modify, mutate) some of the properties of this
        // object (like the size, etc.)
        jframe.setSize(800, 500);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Other potential options could include:
        //jframe.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //jframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setVisible(true);
        
        // Now lets "build" (instantiate) some control objects
        JButton button = new JButton("EXIT");
        
        // To add the control object into the container, first the container
        // needs to know "how" to "postion" the controls inside - to do this
        // containers need a "method" and in this case it is known as the
        // "layout manager"
        
        jframe.getContentPane().setLayout(null);
        // a "null" layout means the container does not take control
        
        // Now add the control to the container
        jframe.getContentPane().add(button);
        
        // Now change the properties of the button to position it
        int x      = 250;
        int y      = 150;
        int width  = 100;
        int height = 40;
        
        button.setBounds(x, y, width, height);
        
        // This is the basics of making graphics/UI and changing properties
        // this process can also be "optimized" (or sped up) by letting a IDE
        // do some of the work for you....
        
        // Visual Studio is based on that, and NetBeans also allows for this:
        // When making a new file for a project, select "Swing GUI Forms"
        // and then "JFrame form"...
        
        // Then use the NetBeans visual designer, with "palettes" to add 
        // controls to the container, and a "properties" window to change
        // properties...
        
        UserInterface ui = new UserInterface();
        ui.setVisible(true);
        
        // This can take some work "off your plate" and make development 
        // time "faster"
        
        // This can also involve some level of "prototyping"
        
        // In a larger sense, this term in Computer Science is defined as: "A 
        // prototype in software development is a simulation of how a real 
        // software product will look, work, and feel. Typically built early 
        // in the software development process, prototypes are primarily for
        // design feedback and user testing." - but here we can use the 
        // NetBeans designer to get the code values we want and then write 
        // more of the code ourselves in a hybrid (mixed) manner
        
        
    }
    
}
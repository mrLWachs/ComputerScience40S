/** Required package class namespace */
package testing.extras.graphics;

import javax.swing.JOptionPane;

 
/**
 * GraphicsTest.java - description
 *
 * @author Mr. Wachs
 * @since Dec. 9, 2024
 */
public class GraphicsTest 
{

    /**
     * Default constructor, set class properties
     */
    public GraphicsTest() {
        // Most if not all "graphics things" involve 2 main concepts:
        // (1) container object
        // (2) objects (tools, controls, widgets) inside the container
        
        // Containers can be: app (application), game, frame, form, panel
        // Controls can be: button, images, text, textbox, etc.
        
        // Interactivity: meaning the user "uses" these things - the phrase
        // "User Interface" (UI), sometime worded as GUI (Graphical User
        // Interface)...
        
        // Simple example:
        JOptionPane.showMessageDialog(null, "Hello World");
        
        // Here the "Dialog" is the container and I provided the words 
        // through a method and it (meaning someone else's code) is building 
        // the container and the objects to display the text
        
        // So....
        
        // When using graphics or UI, you will be using other code from
        // "libraries of code", API, frameworks - you will call the methods,
        // instantiate the objects, etc.
        
        
        
        
        
        
    }
    
}
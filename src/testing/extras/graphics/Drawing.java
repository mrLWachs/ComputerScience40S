/** Required package class namespace */
package testing.extras.graphics;
 
/** Required API imports */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JPanel;


/**
 * Drawing.java - this class is specifically for drawing actions on the passed 
 * drawing panel object. Further resources for this topic can be found here:
 *      - Java Graphics 2D: 
 *             - https://bit.ly/3ZScK0Q
 *             - https://bit.ly/3ZBP2EB
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class Drawing 
{

    private JPanel surface;         // Associated panel object on the view class
    private Graphics graphics;              // Imported object for drawing in 2D
    
    /**
     * Default constructor, set class properties
     */
    public Drawing(JPanel surface) {
        this.surface = surface;                            // Create association
        graphics = surface.getGraphics();     // Instantiate graphics from panel
    }

    /**
     * Draw a set size (100 by 100) oval in the upper left corner of the panel
     */
    public void drawOval() {
        graphics.drawOval(0, 0, 100, 100);
    }

    /**
     * Draw a set size (100 by 100) rectangle in the upper left corner of the 
     * drawing panel
     */
    public void drawRectangle() {
        graphics.drawRect(0, 0, 100, 100);
    }
    
    /**
     * Draw a line in the drawing panel as the user drags the mouse across it
     * 
     * @param event the mouse dragging event
     */
    public void drawLine(MouseEvent event) {
        int x = event.getX();         // Access the mouse's current x coordinate
        int y = event.getY();         // Access the mouse's current y coordinate
        graphics.fillOval(x, y, 1, 1);                      // Draw a small oval
    }

    /**
     * Change colors of the background of the drawing panel as the user rolls 
     * the mouse wheel
     * 
     * @param event the mouse wheel event
     */
    public void drawColors(MouseWheelEvent event) {
        Color color = surface.getBackground();     // Get panel background color
        int green = color.getGreen();         // Get green value from that color
        if (event.getWheelRotation() < 0) {          // Wheel is rolling upwards
            green--;                                       // Reduce green value
            if (green < 0) green = 0;                   // Error check the value
        }
        else {                                     // Wheel is rolling downwards
            green++;                                     // Increase green value
            if (green > 255) green = 255;               // Error check the value
        }
        color = new Color(color.getRed(), green, color.getBlue());    // Rebuild
        surface.setBackground(color);               // And assign color to panel
    }
    
}
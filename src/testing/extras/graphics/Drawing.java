/** Required package class namespace */
package testing.extras.graphics;
 
/** Required API imports */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JPanel;

/**
 * Drawing.java - description
 *
 * @author Mr. Wachs
 * @since Dec 13, 2024, 11:23:12 a.m.
 */
public class Drawing 
{

    private JPanel surface;
    private Graphics graphics;
    
    /**
     * Default constructor, set class properties
     */
    public Drawing(JPanel surface) {
        this.surface = surface;
        graphics = surface.getGraphics();
    }

    public void drawOval() {
        graphics.drawOval(0, 0, 100, 100);
    }

    public void drawLine(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        graphics.fillOval(x, y, 10, 10);
    }

    public void drawColors(MouseWheelEvent event) {
        Color color = surface.getBackground();
        int green = color.getGreen();
        if (event.getWheelRotation() < 0) {
            green--;
            if (green < 0) green = 0;
        }
        else {
            green++;
            if (green > 255) green = 255;
        }
        color = new Color(color.getRed(), green, color.getBlue());
        surface.setBackground(color);
    }

    public void drawRectangle() {
        graphics.drawRect(0, 0, 100, 100);
    }
    
}
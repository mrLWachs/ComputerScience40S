/** Required package class namespace */
package testing.extras.more;

/** Required API imports */
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JPanel;
import testing.extras.utility.Dialogs;
import testing.extras.utility.Numbers;

 
/**
 * Point.java - description
 *
 * @author Mr. Wachs
 * @since Dec. 19, 2024
 */
public class Point implements Serializable
{

    private int x;
    private int y;
    
    private int minY;
    private int maxY;
    private int minX;
    private int maxX;
    
    final int SIZE = 10;
    
    private Numbers numbers;
    private Dialogs dialog;
    
    private String name;
    private Graphics graphics; 
    
    
    /**
     * Constructor method, sets class properties and connects parameters to 
     * class properties
     * 
     * @param pointsPanel 
     */
    public Point(JPanel pointsPanel) {
        numbers = new Numbers();
        dialog = new Dialogs();
        graphics = pointsPanel.getGraphics(); 
        minX = 0 + SIZE;
        maxX = pointsPanel.getWidth() - SIZE;
        minY = 0 + SIZE;
        maxY = pointsPanel.getHeight() - SIZE;        
        x = numbers.random(minX, maxX);
        y = numbers.random(minY, maxY);        
        name = dialog.input("Enter a name for this point");
        plot(pointsPanel);
    }

    public void plot(JPanel pointsPanel) {
        graphics.setColor(Color.red);
        graphics.fillOval(x, y, SIZE, SIZE);
    }
    
    public String toString() {
        return name + " at ( " + x + ", " + y + " )";
    }
    
}
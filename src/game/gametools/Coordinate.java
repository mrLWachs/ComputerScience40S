
/** required package class namespace */
package game.gametools;


/**
 * Coordinate.java - stores data on position and movement as well as methods 
 * to move those values
 *
 * @author Mr. Wachs 
 * @since 17-Dec-2018 
 */
public class Coordinate 
{
    
    /** 
     * Property data tracking an object's location and movement 
     */
    public int x, y, width, height, left, right, top, bottom, 
               centerX, centerY, amount, direction;

    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param x the x value coordinate
     * @param y the y value coordinate
     * @param width the width value coordinate
     * @param height the height value coordinate 
     * @param amount the starting amount of movement
     * @param direction the starting direction of movement
     */
    public Coordinate(int x, int y, int width, int height, 
                      int amount, int direction) {
        this.x         = x;
        this.y         = y;
        this.width     = width;
        this.height    = height;
        this.amount    = amount;
        this.direction = direction;
        recalculate();
    }

    /**
     * Recalculates needed movement data
     */
    public void recalculate() {
        left    = x;
        top     = y;
        right   = left + width;
        bottom  = top  + height;
        centerX = x    + (width  / 2);
        centerY = y    + (height / 2);
    }

}

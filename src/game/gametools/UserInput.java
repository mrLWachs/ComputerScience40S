
/** required package class namespace */
package game.gametools;

/** required imports */
import java.awt.event.KeyEvent;


/**
 * UserInput.java - methods to detect user inputs in various ways
 *
 * @author Mr. Wachs 
 * @since 18-Dec-2018 
 */
public class UserInput 
{

    private Coordinate source;
    private int numberOfDirections;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param source the coordinate data to assign to this class
     * @param numberOfDirections the number of movements in this game
     */
    public UserInput(Coordinate source, int numberOfDirections) {
        this.source             = source;
        this.numberOfDirections = numberOfDirections;        
    }
    
    /**
     * The user's keyboard event of pressing a key to respond to
     * 
     * @param event the keyboard event registered
     */
    public void keypress(KeyEvent event) {   
        int key = event.getKeyCode();
        if (numberOfDirections == Directions.TWO_DIRECTIONS) {
            if      (key == KeyEvent.VK_LEFT)  source.direction = Directions.LEFT;
            else if (key == KeyEvent.VK_RIGHT) source.direction = Directions.RIGHT;
            else                               source.direction = Directions.STOP;
        }
        else if (numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if      (key == KeyEvent.VK_LEFT)  source.direction = Directions.LEFT;
            else if (key == KeyEvent.VK_RIGHT) source.direction = Directions.RIGHT;
            else if (key == KeyEvent.VK_UP)    source.direction = Directions.UP;
            else if (key == KeyEvent.VK_DOWN)  source.direction = Directions.DOWN;
            else                               source.direction = Directions.STOP;
        }
        else if (numberOfDirections == Directions.EIGHT_DIRECTIONS) {
            if      (key == KeyEvent.VK_NUMPAD8) source.direction = Directions.NORTH;
            else if (key == KeyEvent.VK_NUMPAD9) source.direction = Directions.NORTH_EAST;            
            else if (key == KeyEvent.VK_NUMPAD6) source.direction = Directions.EAST;
            else if (key == KeyEvent.VK_NUMPAD3) source.direction = Directions.SOUTH_EAST;
            else if (key == KeyEvent.VK_NUMPAD2) source.direction = Directions.SOUTH;
            else if (key == KeyEvent.VK_NUMPAD1) source.direction = Directions.SOUTH_WEST;
            else if (key == KeyEvent.VK_NUMPAD4) source.direction = Directions.WEST;
            else if (key == KeyEvent.VK_NUMPAD7) source.direction = Directions.NORTH_WEST;
            else                                 source.direction = Directions.STOP;
        }
    }
    
}


/** required package class namespace */
package game;

/** required imports */
import javax.swing.JLabel;
import game.tools.GameObject;


/**
 * Wall.java - representation of a wall in pacman
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Wall extends GameObject
{

    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Wall(JLabel label) {
        super(label);
        sprite.setClear();
    }

}

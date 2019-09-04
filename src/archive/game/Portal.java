
/** required package class namespace */
package archive.game;

/** required imports */
import archive.game.tools.GameObject;
import javax.swing.JLabel;


/**
 * Portal.java - representation of a Portal in a game 
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Portal extends GameObject
{
 
    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Portal(JLabel label) {
        super(label);
        sprite.setClear();
    }
    
}


/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import javax.swing.JLabel;
import game.tools.Animation;
import game.tools.GameObject;


/**
 * Dot.java - representation of a dot in pacman
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Dot extends GameObject
{

    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Dot(JLabel label) {
        super(label);
        LinkedList<String> images = new LinkedList<>();
        images.add("/game/media/dot01.png");
        images.add("/game/media/dot02.png");        // list of image files
        int delay = 250;                            // animation delay
        LinkedList<Animation> animations = new LinkedList<>(); // animation
        animations.add(new Animation(label, images, delay, true));
        sprite.setAnimations(animations);           // set to the sprite
        sprite.animate(0);                          // start animation
    }

}

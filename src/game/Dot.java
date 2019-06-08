
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
        setAnimations(label);
    }

    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     */
    private void setAnimations(JLabel label) {
        String sheet = Constants.SPRITE_SHEET;
        int    delay = Constants.DOT_ANIMATION_DELAY; 
        LinkedList<Integer> imageX      = new LinkedList<>();
        LinkedList<Integer> imageY      = new LinkedList<>();
        LinkedList<Integer> imageWidth  = new LinkedList<>();
        LinkedList<Integer> imageHeight = new LinkedList<>();
        imageX.add(416);
        imageY.add(266);
        imageWidth.add(18);
        imageHeight.add(18); 
        
        imageX.add(533);
        imageY.add(600);
        imageWidth.add(30);
        imageHeight.add(30); 
        
        Animation dotAnimation = new Animation(label, sheet, imageX, imageY, 
                                       imageWidth, imageHeight, delay, true);                
        LinkedList<Animation> dotAnimations = new LinkedList<>(); // animation
        dotAnimations.add(dotAnimation);                
        sprite.setAnimations(dotAnimations);
        sprite.animate(0);                  // start animating
        
    }

    
}

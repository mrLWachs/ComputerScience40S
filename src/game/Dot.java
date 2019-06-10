
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
     * @param settings the list of animation settings
     */
    public Dot(JLabel label, LinkedList<String> settings) {
        super(label);
        setAnimations(label,settings);
    }

    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     * @param settings the list of animation settings
     */
    private void setAnimations(JLabel label, LinkedList<String> settings) {        
        String sheet = Constants.SPRITE_SHEET;
        int    delay = Constants.DOT_ANIMATION_DELAY; 
        String tag   = Constants.DOT_TAG;        
        Animation dotAnimation = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        LinkedList<Animation> dotAnimations = new LinkedList<>(); 
        dotAnimations.add(dotAnimation);                
        sprite.setAnimations(dotAnimations);                 
    }
    
}

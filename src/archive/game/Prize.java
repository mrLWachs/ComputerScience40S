
/** required package class namespace */
package archive.game;

/** required imports */
import archive.collections.LinkedList;
import javax.swing.JLabel;
import archive.game.tools.Animation;
import archive.game.tools.GameObject;


/**
 * Prize.java - representation of a prize in pacman
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Prize extends GameObject
{

    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Prize(JLabel label, LinkedList<String> settings) {
        super(label);
        setAnimations(label,settings);
    }
    
    /**
     * Set up all the animations for this character
     * 
     * @param label the label to associate the animation with
     */
    private void setAnimations(JLabel label, LinkedList<String> settings) {
        String sheet = Constants.SPRITE_SHEET;
        int    delay = Constants.PRIZE_ANIMATION_DELAY; 
        String tag   = Constants.PRIZE_TAG;        
        Animation prizeAnimation = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        LinkedList<Animation> prizeAnimations = new LinkedList<>(); 
        prizeAnimations.add(prizeAnimation);                
        sprite.setAnimations(prizeAnimations);
    }
    
}


/** required package class namespace */
package game;

/** required imports */
import collections.LinkedList;
import game.tools.Animation;
import game.tools.GameObject;
import javax.swing.JLabel;


/**
 * PowerDot.java - representation of a power dot in pacman
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class PowerDot extends GameObject
{
    
    public PowerDot(JLabel label, LinkedList<String> settings) {
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
        int    delay = Constants.POWER_DOT_ANIMATION_DELAY; 
        String tag   = Constants.POWER_DOT_TAG;        
        Animation powerDotAnimation = Animator.getAnimation(sheet, label, 
                                                       delay, settings, tag);
        LinkedList<Animation> powerDotAnimations = new LinkedList<>(); 
        powerDotAnimations.add(powerDotAnimation);                
        sprite.setAnimations(powerDotAnimations);
    }

}

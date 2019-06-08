
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
public class Prize extends GameObject
{

    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Prize(JLabel label) {
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
        int    delay = Constants.PRIZE_ANIMATION_DELAY; 
        LinkedList<Integer> imageX      = new LinkedList<>();
        LinkedList<Integer> imageY      = new LinkedList<>();
        LinkedList<Integer> imageWidth  = new LinkedList<>();
        LinkedList<Integer> imageHeight = new LinkedList<>();
        
        imageX.add(555);
        imageY.add(55);
        imageWidth.add(39);
        imageHeight.add(39); 
        
        imageX.add(602);
        imageY.add(53);
        imageWidth.add(47);
        imageHeight.add(42); 
        
        imageX.add(557);
        imageY.add(106);
        imageWidth.add(36);
        imageHeight.add(38); 
        
        imageX.add(606);
        imageY.add(104);
        imageWidth.add(37);
        imageHeight.add(42); 
        
        imageX.add(556);
        imageY.add(156);
        imageWidth.add(38);
        imageHeight.add(38); 
        
        imageX.add(608);
        imageY.add(152);
        imageWidth.add(33);
        imageHeight.add(45); 
        
        imageX.add(603);
        imageY.add(207);
        imageWidth.add(47);
        imageHeight.add(37); 
        
        imageX.add(602);
        imageY.add(258);
        imageWidth.add(48);
        imageHeight.add(34); 
        
        imageX.add(607);
        imageY.add(304);
        imageWidth.add(33);
        imageHeight.add(42); 
        
        imageX.add(608);
        imageY.add(352);
        imageWidth.add(33);
        imageHeight.add(45); 
                
        Animation prizeAnimation = new Animation(label, sheet, imageX, imageY, 
                                       imageWidth, imageHeight, delay, true);                
        LinkedList<Animation> prizeAnimations = new LinkedList<>(); // animation
        prizeAnimations.add(prizeAnimation);                
        sprite.setAnimations(prizeAnimations);
        sprite.animate(0);                  // start animating
        
    }
    
}

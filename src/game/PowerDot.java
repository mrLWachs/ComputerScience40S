
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
        LinkedList<Animation> powerDotAnimations = new LinkedList<>(); // animation
        powerDotAnimations.add(powerDotAnimation);                
        sprite.setAnimations(powerDotAnimations);
        sprite.animate(0);                  // start animating
        
        
//        LinkedList<Integer> imageX      = new LinkedList<>();
//        LinkedList<Integer> imageY      = new LinkedList<>();
//        LinkedList<Integer> imageWidth  = new LinkedList<>();
//        LinkedList<Integer> imageHeight = new LinkedList<>();
//        
//        int index = settings.firstIndexOf(Constants.POWER_DOT_TAG) + 1;
//        int total = Integer.parseInt(settings.get(index));
//        for (int i = 0; i < total; i++) {
//            index++;
//            String[] values = settings.get(index).split("[,]");
//            imageX.add(Integer.parseInt(values[0]));
//            imageY.add(Integer.parseInt(values[1]));
//            imageWidth.add(Integer.parseInt(values[2]));
//            imageHeight.add(Integer.parseInt(values[3]));            
//        }
        
        
//        imageX.add(533);
//        imageY.add(600);
//        imageWidth.add(30);
//        imageHeight.add(30); 
//        
//        imageX.add(567);
//        imageY.add(603);
//        imageWidth.add(30);
//        imageHeight.add(30); 
        
//        Animation dotAnimation = new Animation(label, sheet, imageX, imageY, 
//                                       imageWidth, imageHeight, delay, true);                
//        LinkedList<Animation> dotAnimations = new LinkedList<>(); // animation
//        dotAnimations.add(dotAnimation);                
//        sprite.setAnimations(dotAnimations);
//        sprite.animate(0);                  // start animating
        
    }

}

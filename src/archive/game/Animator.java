
/** required package class namespace */
package archive.game;

/** required imports */
import archive.collections.LinkedList;
import archive.game.tools.Animation;
import javax.swing.JLabel;

/**
 * Animator.java - useful methods to help with animating images
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Animator 
{
    
    /**
     * Gets a animation object by reading from a list of values and finding the
     * correct x, y, width, and height of the image from a sprite sheet image
     * 
     * @param sheet the sprite sheet image file
     * @param label the label to update the animation to
     * @param delay the animation timer delay value
     * @param settings the list of setting values for the images 
     * @param tag the tag name of the specific image animation to get
     * @return a animation object built from the settings
     */
    public static Animation getAnimation(String sheet,
                                         JLabel label, 
                                         int delay, 
                                         LinkedList<String> settings,
                                         String tag) {      
        final String DELIMITOR = "[,]";
        LinkedList<Integer> imageX      = new LinkedList<>();   // the lists
        LinkedList<Integer> imageY      = new LinkedList<>();
        LinkedList<Integer> imageWidth  = new LinkedList<>();
        LinkedList<Integer> imageHeight = new LinkedList<>();
        int index = settings.firstIndexOf(tag) + 1;     // start point in list
        int total = Integer.parseInt(settings.get(index));  // total animations
        for (int i = 0; i < total; i++) {               // traverse animations
            index++;                                    // advance index
            String[] values = settings.get(index).split(DELIMITOR); // values
            imageX.add(Integer.parseInt(values[0]));        // x coordinate
            imageY.add(Integer.parseInt(values[1]));        // y coordinate
            imageWidth.add(Integer.parseInt(values[2]));    // width coordinate
            imageHeight.add(Integer.parseInt(values[3]));   // height coordinate
        }        
        return new Animation(label, sheet, imageX, imageY, 
                             imageWidth, imageHeight, delay, true); // animation
    }
    
}

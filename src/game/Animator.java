
package game;

import collections.LinkedList;
import game.tools.Animation;
import javax.swing.JLabel;

/**
 *
 * @author Lawrence Wachs
 */
public class Animator 
{
    
    public static Animation getAnimation(String sheet,
                                         JLabel label, 
                                         int delay, 
                                         LinkedList<String> settings,
                                         String tag) {      
        LinkedList<Integer> imageX      = new LinkedList<>();
        LinkedList<Integer> imageY      = new LinkedList<>();
        LinkedList<Integer> imageWidth  = new LinkedList<>();
        LinkedList<Integer> imageHeight = new LinkedList<>();
        int index = settings.firstIndexOf(tag) + 1;
        int total = Integer.parseInt(settings.get(index));
        for (int i = 0; i < total; i++) {
            index++;
            String[] values = settings.get(index).split("[,]");
            imageX.add(Integer.parseInt(values[0]));
            imageY.add(Integer.parseInt(values[1]));
            imageWidth.add(Integer.parseInt(values[2]));
            imageHeight.add(Integer.parseInt(values[3]));            
        }        
        return new Animation(label, sheet, imageX, imageY, 
                             imageWidth, imageHeight, delay, true); 
    }
    
}

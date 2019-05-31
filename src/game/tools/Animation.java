
/** required package class namespace */
package game.tools;

import collections.LinkedList;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Animation.java - represents an animation of images (GameImage objects) with
 * useful methods 
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Animation 
{

    private JLabel                hitbox;    
    private LinkedList<GameImage> frames;    
    private Timer                 timer;
    private LinkedList<String>    imageFiles;
    private boolean               shouldLoop;
    private int                   delay;
    private int                   fps;
    private int                   currentFrame;    
    private int                   lastFrame;
    
    

}


/** required package class namespace */
package archive.game.tools;

/** requires imports */
import archive.collections.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private JLabel             label;    
    private LinkedList<Sprite> frames;     
    private Timer              timer;
    private boolean            shouldLoop;
    private int                delay;
    private int                fps;
    private int                currentFrame;    
    private int                lastFrame;
        
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label hitbox use to display the animation inside
     * @param imageFiles the list of relative image file names
     * @param delay the delay (in milliseconds) for the entire animation
     * @param shouldLoop should the animation loop (true) or not (false)
     */
    public Animation(JLabel label, 
                     LinkedList<String> imageFiles, 
                     int delay, 
                     boolean shouldLoop) {
        if (isValid(label,imageFiles)) {            // check objects for nulls       
            this.label = label;                     // parameter to property
            setDelay(delay);                        //set the delay
            setLoop(shouldLoop);                    // determine if looping
            setImageFiles(imageFiles);              // set all image files
        }
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param label the label hitbox use to display the animation inside
     * @param spriteSheet the sprite sheet image file
     * @param imageX the list of all frames x coordinates for the frames
     * @param imageY the list of all frames y coordinates for the frames
     * @param imageWidth the list of all frames widths for the frames
     * @param imageHeight the list of all frames heights for the frames
     * @param delay the delay (in milliseconds) for the entire animation
     * @param shouldLoop should the animation loop (true) or not (false)
     */
    public Animation(JLabel label, 
                     String spriteSheet,
                     LinkedList<Integer> imageX,
                     LinkedList<Integer> imageY,
                     LinkedList<Integer> imageWidth,
                     LinkedList<Integer> imageHeight,
                     int delay, 
                     boolean shouldLoop) {
        if (isValid(label,imageX, imageY, imageWidth, imageHeight)) {
            this.label = label;                     // parameter to property
            setDelay(delay);                        //set the delay
            setLoop(shouldLoop);                    // determine if looping
            setImageFiles(spriteSheet, imageX, imageY, imageWidth, imageHeight);
        }
    }
        
    /** Run the animation */
    public void run() {
        timer.start();                              // internal timer starts
    }
    
    /** Stop the animation */
    public void stop() {
        timer.stop();                               // internal timer stops
    }
    
    /** Restart the animation back to the first frame */
    public void restart() {
        stop();                                     // stop animation
        frames.get(currentFrame).hide();            // hide curent image
        currentFrame = 0;                           // reset back to first frame
        frames.get(currentFrame).show();            // show this frame
        run();                                      // restart animation
    }
    
    /**
     * Sets the animation to loop (repeat from the last frame back to the first
     * frame) or not
     * 
     * @param shouldLoop should the animation loop (true) or not (false)
     */
    public void setLoop(boolean shouldLoop) {
        this.shouldLoop = shouldLoop;
    }
    
    /**
     * Set the delay (in milliseconds) for the entire animation
     * 
     * @param delay the delay (in milliseconds) for the entire animation
     */
    public void setDelay(int delay) {
        this.delay = delay;             // set parameter to property
        if (timer != null) setTimer();  // set timer if timer is instantiated
    }
    
    /**
     * Sets all the frame image files for the entire animation
     * 
     * @param imageFiles the list of relative image file names
     */
    public void setImageFiles(LinkedList<String> imageFiles) {
        setFrames(imageFiles);                  // set all the frames
        setTimer();                             // set the timer
    }
    
    /**
     * Sets all the frame image files for the entire animation
     * 
     * @param spriteSheet the sprite sheet image file
     * @param imageX the list of all frames x coordinates for the frames
     * @param imageY the list of all frames y coordinates for the frames
     * @param imageWidth the list of all frames widths for the frames
     * @param imageHeight the list of all frames heights for the frames
     */
    public void setImageFiles(String spriteSheet,
                              LinkedList<Integer> imageX,
                              LinkedList<Integer> imageY,
                              LinkedList<Integer> imageWidth,
                              LinkedList<Integer> imageHeight) {
        setFrames(spriteSheet, imageX, imageY, imageWidth, imageHeight);  
        setTimer();                                           // set the timer
    }
    
    /**
     * Resizes the image for all animation frames
     * 
     * @param width the new width to set to
     * @param height the new height to set to 
     */
    public void resize(int width, int height) {
        for (int i = 0; i < frames.size(); i++) {       // traverse frames
            frames.get(i).resize(width, height);        // resize each frame
        }
        resizeToContainer();                            // resize images
    }
    
    /** Resizes image for all animation frames to the hitbox container */
    public void resizeToContainer() {
        for (int i = 0; i < frames.size(); i++) {       // traverse frames
            frames.get(i).resizeToContainer();          // resize each frame
        }
    }
    
    /**
     * Get the frames per second value (FPS) for the animation
     * 
     * @return the frames per second value
     */
    public int getFPS() {
        return fps;
    }
    
    /**
     * Determines if the animation is running (true) or not (false)
     * 
     * @return the animation is running (true) or not (false)
     */
    public boolean isRunning() {
        return timer.isRunning();               // check internal timer property
    }
        
    /** The timer tick action */
    private void tick() {
        frames.get(currentFrame).hide();                    // hide current
        if (currentFrame < lastFrame)  currentFrame++;      // cycle through
        else {
            if (shouldLoop)            currentFrame = 0;    // restart frames
            else                       stop();              // stop animation
        }
        frames.get(currentFrame).show();                    // show new current
    }

    /** Sets the timer and the FPS value from the delay value */
    private void setTimer() {
        fps = delay / frames.size();    // divides the frame rate from the delay
        timer = new Timer(fps, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tick();
            }
        });                             // instatiate timer with the frame rate
    }

    /**
     * Sets all the frames for the animation from the image files, sets the 
     * first frame to visible
     */
    private void setFrames(LinkedList<String> imageFiles) {
        frames = new LinkedList<>();                        // create list
        for (int i = 0; i < imageFiles.size(); i++) {       // traverse list
            frames.add(new Sprite(label, imageFiles.get(i)));  // add frame
            frames.get(i).hide();                           // hide frame
        }
        lastFrame = frames.size() - 1;                      // track laast frame
        currentFrame = 0;                                   // set first frame
        frames.get(currentFrame).show();                    // show first frame
    }

    /**
     * Sets all the frames for the animation from the sprite sheet and all
     * the coordinates locations, then sets the first frame to visible
     * 
     * @param spriteSheet the sprite sheet image file
     * @param imageX the array of all frames x coordinates for the frames
     * @param imageY the array of all frames y coordinates for the frames
     * @param imageWidth the array of all frames widths for the frames
     * @param imageHeight the array of all frames heights for the frames 
     */
    private void setFrames(String spriteSheet,
                           LinkedList<Integer> imageX,
                           LinkedList<Integer> imageY,
                           LinkedList<Integer> imageWidth,
                           LinkedList<Integer> imageHeight) {
        frames = new LinkedList<>();                        // create list
        for (int i = 0; i < imageX.size(); i++) {           // traverse list
            int x = imageX.get(i);
            int y = imageY.get(i);
            int w = imageWidth.get(i);
            int h = imageHeight.get(i);
            frames.add(new Sprite(label, spriteSheet, x, y, h, h));
            frames.get(i).hide();                           // hide frame
        }
        lastFrame = frames.size() - 1;                      // track laast frame
        currentFrame = 0;                                   // set first frame
        frames.get(currentFrame).show();                    // show first frame
    }
    
    /**
     * Checks the various objects from the constructor to make sure they are
     * valid objects to continue the construction
     * 
     * @param hitbox the label hitbox use to display the animation inside
     * @param imageFiles the list of relative image file names
     * @return the objects are valid (true) or not (false)
     */
    private boolean isValid(JLabel hitbox, LinkedList<String> imageFiles) {
        if (hitbox == null) {
            System.out.println("Animation not created, Label null!");
            return false;
        }
        if (imageFiles == null) {
            System.out.println("Animation not created, imageFiles null!");
            return false;
        }
        if (imageFiles.size() == 0) {
            System.out.println("Animation not created, imageFiles size 0!");
            return false;
        }
        return true;
    }
    
    /**
     * Checks the various objects from the constructor to make sure they are
     * valid objects to continue the construction
     * 
     * @param label the label hitbox use to display the animation inside
     * @param imageX the array of all frames x coordinates for the frames
     * @param imageY the array of all frames y coordinates for the frames
     * @param imageWidth the array of all frames widths for the frames
     * @param imageHeight the array of all frames heights for the frames
     * @return the objects are valid (true) or not (false)
     */
    private boolean isValid(JLabel label, 
                            LinkedList<Integer> imageX,
                            LinkedList<Integer> imageY,
                            LinkedList<Integer> imageWidth,
                            LinkedList<Integer> imageHeight) {
        if (label == null) {
            System.out.println("Animation not created, Label null!");
            return false;
        }
        if (imageX == null || imageY == null || 
            imageWidth == null || imageHeight == null) {
            System.out.println("Animation not created, a list is null!");
            return false;
        }
        if (imageX.size() == 0 || imageY.size() == 0 || 
            imageWidth.size() == 0 || imageHeight.size() == 0) {
            System.out.println("Animation not created, a list is size 0!");
            return false;
        }
        return true;
    }
    
}


/** required package class namespace */
package game.tools;

/** requires imports */
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

    private JLabel      hitbox;    
    private GameImage[] frames;    
    private Timer       timer;
    private String[]    imageFiles;
    private boolean     shouldLoop;
    private int         delay;
    private int         fps;
    private int         currentFrame;    
    private int         lastFrame;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param hitbox the label hitbox use to display the animation inside
     * @param imageFiles the array of relative image file names
     * @param delay the delay (in milliseconds) for the entire animation
     * @param shouldLoop should the animation loop (true) or not (false)
     */
    public Animation(JLabel hitbox, 
                     String[] imageFiles, 
                     int delay, 
                     boolean shouldLoop) {
        if (isValid(hitbox,imageFiles)) {           // check objects for nulls       
            this.hitbox = hitbox;                   // parameter to property
            setDelay(delay);                        //set the delay
            setLoop(shouldLoop);                    // determine if looping
            setImageFiles(imageFiles);              // set all image files
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
        frames[currentFrame].hide();                // hide curent image
        currentFrame = 0;                           // reset back to first frame
        frames[currentFrame].show();                // show this frame
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
     * @param imageFiles the array of relative image file names
     */
    public void setImageFiles(String[] imageFiles) {
        this.imageFiles = imageFiles;           // set parameter to property
        setFrames();                            // set all the frames
        setTimer();                             // set the timer
    }
    
    /**
     * Resizes the picturebox for all animation frames
     * 
     * @param width the new width to set to
     * @param height the new height to set to 
     */
    public void resize(int width, int height) {
        for (int i = 0; i < frames.length; i++) {       // traverse frames
            frames[i].resize(width, height);            // resize each frame
        }
        resizeToContainer();                            // resize images
    }
    
    /** Resizes picturebox for all animation frames to the hitbox container */
    public void resizeToContainer() {
        for (int i = 0; i < frames.length; i++) {       // traverse frames
            frames[i].resizeToContainer();              // resize each frame
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
        frames[currentFrame].hide();                        // hide current
        if (currentFrame < lastFrame)  currentFrame++;      // cycle through
        else {
            if (shouldLoop)            currentFrame = 0;    // restart frames
            else                       stop();              // stop animation
        }
        frames[currentFrame].show();                        // show new current
    }

    /** Sets the timer and the FPS value from the delay value */
    private void setTimer() {
        fps = delay / frames.length;    // divides the frame rate from the delay
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
    private void setFrames() {
        frames = new GameImage[imageFiles.length];         // create array
        for (int i = 0; i < frames.length; i++) {           // traverse array
            frames[i] = new GameImage(hitbox, imageFiles[i]);  // create frame
            frames[i].hide();                               // hide frame
        }
        lastFrame = frames.length - 1;                      // track laast frame
        currentFrame = 0;                                   // set first frame
        frames[currentFrame].show();                        // show first frame
    }

    /**
     * Checks the various objects from the constructor to make sure they are
     * valid objects to continue the construction
     * 
     * @param hitbox the label hitbox use to display the animation inside
     * @param imageFiles the array of relative image file names
     * @return the objects are valid (true) or not (false)
     */
    private boolean isValid(JLabel hitbox, String[] imageFiles) {
        if (hitbox == null) {
            System.out.println("Animation not created, Label null!");
            return false;
        }
        if (imageFiles == null) {
            System.out.println("Animation not created, imageFiles[] null!");
            return false;
        }
        if (imageFiles.length == 0) {
            System.out.println("Animation not created, imageFiles[] size 0!");
            return false;
        }
        return true;
    }
    
}

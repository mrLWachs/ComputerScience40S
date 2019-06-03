
/** required package class namespace */
package game.tools;

/** required imports */
import java.awt.Color;
import javax.swing.JLabel;


/**
 * GameSprite.java - represents an image, or multiple animations of images,
 * in a game including the ability to animate 
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class GameSprite
{
    
    private Animation[] animations;
    private GameImage   gameImage;
    private int         currentIndex;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param hitbox the label hitbox used to display the image
     * @param animations the animations associated with the object
     */
    public GameSprite(JLabel hitbox, Animation[] animations) {
        gameImage  = new GameImage(hitbox);                 // set picturebox
        if (animations != null) setAnimations(animations);  // set animations
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param hitbox the label hitbox use to display the image
     * @param imageFile the relative image filename to display
     */
    public GameSprite(JLabel hitbox, String imageFile) {
        gameImage = new GameImage(hitbox,imageFile);     // set picturebox
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param hitbox the label hitbox use to display the image
     * @param text the text inside the hitbox 
     * @param background the background color of the hitbox
     */
    public GameSprite(JLabel hitbox, String text, Color background) {
        gameImage = new GameImage(hitbox, text, background);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param hitbox the label hitbox use to display the image
     */
    public GameSprite(JLabel hitbox) {
        gameImage  = new GameImage(hitbox);               // set picturebox
    }
    
    /**
     * Sets the animations from the passed data
     * 
     * @param animations the animation objects for this game image
     */
    public void setAnimations(Animation[] animations) {
        this.animations = animations;                   // assign to property
        for (int i = 0; i < animations.length; i++) {   // traverse array
            animations[i].stop();                       // stop each animation
        }   
        run();                                          // run first animation
    }
    
    /**
     * Animate the passed index value
     * 
     * @param index the index of the animation to run
     */
    public void animate(int index) {
        animations[currentIndex].stop();    // stop current animation
        run(index);                         // run passed animation index
        currentIndex = index;               // remember passed index
    }
    
    /**
     * Update the coordinates of the game images current location data
     * 
     * @param coordinates the coordinates object to update
     */
    public void update(Coordinates coordinates) {
        if (coordinates == null) coordinates = new Coordinates();
        gameImage.update(coordinates);
    }

    /**
     * Re-positions game image in it's container based on coordinate data 
     * 
     * @param coordinates the coordinates object to re-position to
     */
    public void redraw(Coordinates coordinates) {
        gameImage.redraw(coordinates);
    }
    
    /** 
     * Hides (makes invisible) the game image in the container and stops any 
     * running animations
     */
    public void hide() {
        stop();
        gameImage.hide();
    }

    /** 
     * Shows (makes visible) the game image in the container and runs the first 
     * animation
     */
    public void show() {
        run();
        gameImage.show();
    }
    
    /**
     * Resizes the image files for the gameImage and any animations
     * 
     * @param width the new width to set to
     * @param height the new height to set to 
     */
    public void resize(int width, int height) {
        gameImage.resize(width, height);               // resize the picturebox
        if (animations == null) return;                 // error trap
        for (int i = 0; i < animations.length; i++) {   // traverse animations
            animations[i].resize(width,height);         // resize each animation
        }
        resizeToContainer();                            // resize images
    }
    
    /** Resizes all the images and animations to the hitbox container */
    public void resizeToContainer() {
        gameImage.resizeToContainer();                 // resize image
        if (animations == null) return;                 // error trap
        for (int i = 0; i < animations.length; i++) {   // traverse animations
            animations[i].resizeToContainer();          // resize images
        }
    }
    
    /**
     * Sets the image in the game image gameImage
     * 
     * @param imageFile 
     */
    public void setImage(String imageFile) {
        gameImage.setImage(imageFile);
    }
    
    /**
     * Debug mode for the game image only displaying text and a background
     * color
     * 
     * @param text the text inside the hitbox 
     * @param background the background color of the hitbox
     */
    public void debug(String text, Color background) {
        gameImage.setDebug(text, background);
    }
    
    /** Stops all animations */
    public void stop() {
        if (animations == null) return;                 // error trap
        for (int i = 0; i < animations.length; i++) {   // traverse animations
            stop(i);                                    // stop animation
        }
    }
    
    /**
     * Stops the passed animation
     * 
     * @param index the animation index to stop
     */
    public void stop(int index) {
        if (animations == null) return;                 // error trap
        animations[index].stop();                       // stop animation
    }
    
    /**
     * Runs the passed animation
     * 
     * @param index the animation index to run
     */
    public void run(int index) {
        if (animations == null) return;                 // error trap
        animations[index].run();                        // run animation
    }
    
    /** Runs the first animation */
    public void run() {
        if (animations == null) return;                 // error trap
        currentIndex = 0;                               // set first animation 
        run(currentIndex);                              // run first animation
    }
        
    /**
     * Restarts the passed animation back to the first frame
     * 
     * @param index the animation to restart
     */
    public void restart(int index) {
        animations[index].restart();
    }
    
    /** Restarts all animations back to the first frame  */
    public void restart() {
        stop();                                 // stops all animations
        restart(0);                             // restarts first animation
    }
    
    /**
     * Sets the passed animation to loop (repeat from the last frame back to 
     * the first frame) or not
     * 
     * @param index the animation to set the loop to
     * @param shouldLoop should the animation loop (true) or not (false)
     */
    public void setLoop(int index, boolean shouldLoop) {
        animations[index].setLoop(shouldLoop);
    }
    
    /**
     * Sets all animations to loop (repeat from the last frame back to 
     * the first frame) or not
     * 
     * @param shouldLoop should all animations loop (true) or not (false)
     */
    public void setLoop(boolean shouldLoop) {
        for (int i = 0; i < animations.length; i++) {   // traverse animations
            setLoop(i,shouldLoop);                      // set animation loop
        }
    }
    
    /**
     * Set the delay (in milliseconds) for the passed animation
     * 
     * @param index the animation to set the loop to
     * @param delay the delay (in milliseconds) for the passed animation
     */
    public void setDelay(int index, int delay) {
        animations[index].setDelay(delay);
    }
    
    /**
     * Set all delays (in milliseconds) for all animations
     * 
     * @param delay the delay (in milliseconds) for all animations
     */
    public void setDelay(int delay) {
        for (int i = 0; i < animations.length; i++) {   // traverse animations
            setDelay(i,delay);                          // set animation delay
        }
    }
    
    /**
     * Sets all the frame image files for the passed animation
     * 
     * @param index the animation to set the image files to
     * @param imageFiles the array of relative image file names
     */
    private void setImageFiles(int index, String[] imageFiles) {
        animations[index].setImageFiles(imageFiles);
    }
    
    /**
     * Gets the frames per second (FPS) for the passed animation
     * 
     * @param index the animation to get the FPS from
     * @return the frames per second (FPS) for the passed animation
     */
    public int getFPS(int index) {
        return animations[index].getFPS();
    }
    
    /**
     * Determines if the passed animation is running (true) or not (false)
     * 
     * @param index the animation to determine if running
     * @return the passed animation is running (true) or not (false)
     */
    public boolean isRunning(int index) {
        return animations[index].isRunning();
    }

    /**
     * Sets the background color of the label (no animations)
     * 
     * @param color the color to set to
     */
    public void setColor(Color color) {
        stop();
        gameImage.setColor(color);
    }
        
}
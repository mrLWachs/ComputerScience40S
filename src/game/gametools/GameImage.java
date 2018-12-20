
/** required package class namespace */
package game.gametools;

/** required imports */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;


/**
 * GameImage.java - represents an image in a game including the ability to
 * animate 
 *
 * @author Mr. Wachs 
 * @since 17-Dec-2018 
 */
public class GameImage 
{

    /** the swing label object used to place the image(s) in a container */
    public JLabel image;
    
    private ImageIcon[] frames;
    private int         currentFrame;
    private Timer       timer;
        

    /**
     * Constructor for the class, sets class properties
     * 
     * @param image the swing label object
     */
    public GameImage(JLabel image) {
        this(image,null,0);
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param image the swing label object
     * @param frames the various images for the animation
     * @param timeFrame the amount of time (in milliseconds) to animate over
     */
    public GameImage(JLabel image, ImageIcon[] frames, int timeFrame) {
        this.image = image;  
        if (frames != null) setAnimations(frames,timeFrame);
        image.setOpaque(false);
        image.setText("");   
        image.setBorder(null); 
    }   
    
    /**
     * Sets the game image for a set of frames over a time frame to animate
     * using a timer
     * @param frames the various images for the animation
     * @param timeFrame the amount of time (in milliseconds) to animate over
     */
    private void setAnimations(ImageIcon[] frames, int timeFrame) {
        this.frames = frames;                       // assign to global array
        currentFrame = 0;                           // starting frame
        int duration = timeFrame / frames.length;   // calculate frame time
        timer = new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animate();                                  // timer action
            }
        });
        timer.start();                                      // start timer
    }
        
    /**
     * The image animation that cycles through the frames of the animation
     */
    private void animate() {        
        if (currentFrame < frames.length-1) currentFrame++; // cycle through
        else currentFrame = 0;                              // restart frames
        image.setIcon(frames[currentFrame]);                // draw in image
    }
        
    /**
     * Sets the image to debug mode, meaning it removes any graphics and
     * changes to a colored rectangle with text
     * 
     * @param text the text to display in the image
     * @param background the background color of the image
     */
    public void debug(String text, Color background) {
        image.setBorder(BorderFactory.createEtchedBorder());        
        image.setIcon(null);
        image.setOpaque(true);
        image.setBackground(background);
        image.setForeground(Color.white);
        image.setHorizontalAlignment(SwingConstants.CENTER);
        image.setFont(new Font("Arial Narrow",Font.BOLD,8));
        image.setText(text);    
    }
        
}

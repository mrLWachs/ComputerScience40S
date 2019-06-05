
/** required package class namespace */
package game.tools;

/** required imports */
import javax.swing.JLabel;


/**
 * GameObject.java - represents a typical object in a game
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class GameObject 
{
    
    /** Coordinates to store data on position and movement */    
    public Coordinates coordinates;
    /** The image used for this game object */
    public Sprite sprite;
    /** Various methods to move the game object */
    public Mover mover;
    /** Various methods to detect collision for the game object */
    public Detector detector;
    /** Various methods to react to collision for the game object */
    public Reactor reactor;    
    /** Flag determines if this object is alive in a game */
    public boolean isAlive;
    
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param image picture image used on a user interface
     */
    public GameObject(JLabel image) {
        this(image,0,Directions.STOP,0);
    }
    
    /**
     * Constructor for the class, sets class property data
     * 
     * @param image picture image used on a user interface
     * @param amount the amount the game character will move
     * @param direction the direction the game character will move
     * @param numberOfDirections the number of directions defined
     */
    public GameObject(JLabel image, 
                      int amount, 
                      int direction, 
                      int numberOfDirections) {
        coordinates = new Coordinates(amount, direction);        
        sprite  = new Sprite(image);
        sprite.update(coordinates);
        mover       = new Mover(coordinates,numberOfDirections);
        detector    = new Detector(coordinates);
        reactor     = new Reactor(coordinates,numberOfDirections,detector); 
        spawn();
    } 
        
    /** Updates the current location of the coordinates for the image */
    public void update() {
        sprite.update(coordinates);
    }
    
    /** Re-positions image in it's container based on game character's data */
    public void redraw() {
        sprite.redraw(coordinates);
    }
    
    /** Spawns the game object, makes it alive and visible */
    public void spawn() {
        isAlive = true;
        sprite.show();
    }
    
    /** De-spawns the game object, makes it not alive and invisible */
    public void despawn() {
        isAlive = false;
        sprite.hide();
    }
    
}
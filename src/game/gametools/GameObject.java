
/** required package class namespace */
package game.gametools;

/** required imports */
import javax.swing.JLabel;


/**
 * GameObject.java - represents a typical object in a game
 *
 * @author Mr. Wachs 
 * @since 17-Dec-2018 
 */
public class GameObject 
{

    /** The image used for this game object */
    public GameImage gameImage;    
    /** Flag determines if this object is alive in a game */
    public boolean isAlive;
    /** Coordinates to store data on position and movement */    
    public Coordinate coordinates;
    /** Various methods to move the game object */
    public Mover mover;
    /** Various methods to detect collision for the game object */
    public Detector detector;
    /** Various methods to react to collision for the game object */
    public Reactor reactor;
    
        
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
    public GameObject(JLabel image, int amount, int direction, 
                  int numberOfDirections) {
        gameImage   = new GameImage(image);
        coordinates = new Coordinate(image.getX(), image.getY(),
                                      image.getWidth(), image.getHeight(), 
                                      amount, direction);
        mover       = new Mover(coordinates,numberOfDirections);
        detector    = new Detector(coordinates);
        reactor     = new Reactor(coordinates,numberOfDirections,detector); 
        spawn();
    } 
        
    /**
     * Updates the current location of the coordinates for the image
     */
    public void update() {
        coordinates.x      = gameImage.image.getX();
        coordinates.y      = gameImage.image.getY();
        coordinates.width  = gameImage.image.getWidth();
        coordinates.height = gameImage.image.getHeight();
        coordinates.recalculate();
    }
    
    /**
     * Re-positions the image in it's container based on game character's data
     */
    public void redraw() {
        gameImage.image.setBounds(coordinates.x, coordinates.y, 
                               coordinates.width, coordinates.height);
    }
    
    /**
     * Spawns the game object, makes it alive and visible
     */
    public void spawn() {
        isAlive = true;
        gameImage.image.setVisible(isAlive);
    }
    
    /**
     * De-spawns the game object, makes it not alive and invisible
     */
    public void despawn() {
        isAlive = false;
        gameImage.image.setVisible(isAlive);
    }
   
}

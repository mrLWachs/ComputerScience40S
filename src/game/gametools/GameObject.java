

/** required package class namespace */
package game.gametools;



/**
 * GameObject.java - represents a typical object in a game
 *
 * @author Mr. Wachs 
 * @since 19-Dec-2018 
 */
public class GameObject 
{
    
    /** The image used for this game object */
    public GameImage  gameImage;  
    /** Coordinates to store data on position and movement */    
    public Coordinate coordinates;
    /** Various methods to move the game object */
    public Mover      mover;
    /** Various methods to detect collision for the game object */
    public Detector   detector;
    /** Various methods to react to collision for the game object */
    public Reactor    reactor;
    
    
    
}

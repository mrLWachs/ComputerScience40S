
/** required package class namespace */
package archive.game.tools;


/**
 * Mover.java - methods to move a game object in various ways
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Mover 
{
    
    private Coordinates source; 
    private int numberOfDirections;

    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param coordinates the coordinate data to assign to this class
     * @param numberOfDirections the number of movements in this game
     */
    public Mover(Coordinates coordinates, int numberOfDirections) {
        this.source             = coordinates;
        this.numberOfDirections = numberOfDirections;
    }
    
    /**
     * Moves the game object based on the remembered direction
     */
    public void move() {
        if (source.direction == Directions.STOP) return;
        if (numberOfDirections == Directions.TWO_DIRECTIONS ||
            numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if      (source.direction == Directions.UP)    moveUp();
            else if (source.direction == Directions.DOWN)  moveDown();
            else if (source.direction == Directions.LEFT)  moveLeft();
            else if (source.direction == Directions.RIGHT) moveRight();
        }
        else if (numberOfDirections == Directions.EIGHT_DIRECTIONS) {
            if      (source.direction == Directions.NORTH)      moveNorth();
            else if (source.direction == Directions.NORTH_EAST) moveNorthEast();
            else if (source.direction == Directions.EAST)       moveEast();
            else if (source.direction == Directions.SOUTH_EAST) moveSouthEast();
            else if (source.direction == Directions.SOUTH)      moveSouth();
            else if (source.direction == Directions.SOUTH_WEST) moveSouthWest();
            else if (source.direction == Directions.WEST)       moveWest();
            else if (source.direction == Directions.NORTH_WEST) moveNorthWest();
        }
        else if (numberOfDirections == Directions.SIXTEEN_DIRECTIONS) {
            if      (source.direction == Directions.NORTH)            moveNorth();            
            else if (source.direction == Directions.NORTH_NORTH_EAST) moveNorthNorthEast();            
            else if (source.direction == Directions.NORTH_EAST)       moveNorthEast();            
            else if (source.direction == Directions.EAST_NORTH_EAST)  moveEastNorthEast();            
            else if (source.direction == Directions.EAST)             moveEast();            
            else if (source.direction == Directions.EAST_SOUTH_EAST)  moveEastSouthEast();            
            else if (source.direction == Directions.SOUTH_EAST)       moveSouthEast();            
            else if (source.direction == Directions.SOUTH_SOUTH_EAST) moveSouthSouthEast();            
            else if (source.direction == Directions.SOUTH)            moveSouth();            
            else if (source.direction == Directions.SOUTH_SOUTH_WEST) moveSouthSouthWest();            
            else if (source.direction == Directions.SOUTH_WEST)       moveSouthWest();            
            else if (source.direction == Directions.WEST_SOUTH_WEST)  moveWestSouthWest();            
            else if (source.direction == Directions.WEST)             moveWest();            
            else if (source.direction == Directions.WEST_NORTH_WEST)  moveWestNorthWest();            
            else if (source.direction == Directions.NORTH_WEST)       moveNorthWest();
            else if (source.direction == Directions.NORTH_NORTH_WEST) moveNorthNorthWest();            
        }
    }
    
    /** Stops all movement */
    public void stop() {
        source.direction = Directions.STOP;
    }
    
    /** moves the game object up */
    public void moveUp() {        
        source.y = source.y - source.amount;
        source.recalculate();
        source.direction = Directions.UP;
    }
    
    /** moves the game object down */
    public void moveDown() {        
        source.y = source.y + source.amount;
        source.recalculate();
        source.direction = Directions.DOWN;
    }
    
    /** moves the game object left */
    public void moveLeft() {        
        source.x = source.x - source.amount;
        source.recalculate();
        source.direction = Directions.LEFT;
    }
    
    /** moves the game object right */
    public void moveRight() {        
        source.x = source.x + source.amount;
        source.recalculate();
        source.direction = Directions.RIGHT;
    }
    
    /** moves the game object north */
    public void moveNorth() {
        moveUp();
        source.direction = Directions.NORTH;
    }
    
    /** moves the game object south */
    public void moveSouth() {
        moveDown();
        source.direction = Directions.SOUTH;
    }
    
    /** moves the game object east */
    public void moveEast() {
        moveRight();
        source.direction = Directions.EAST;
    }
    
    /** moves the game object west */
    public void moveWest() {
        moveLeft();
        source.direction = Directions.WEST;
    }
    
    /** moves the game object north east */
    public void moveNorthEast() {
        moveNorth();
        moveEast();
        source.direction = Directions.NORTH_EAST;
    }
    
    /** moves the game object south east */
    public void moveSouthEast() {
        moveSouth();
        moveEast();
        source.direction = Directions.SOUTH_EAST;
    }
    
    /** moves the game object south west */
    public void moveSouthWest() {
        moveSouth();
        moveWest();
        source.direction = Directions.SOUTH_WEST;
    }
    
    /** moves the game object west */
    public void moveNorthWest() {
        moveNorth();
        moveWest();
        source.direction = Directions.NORTH_WEST;
    }
    
    /** moves the game object north north east */
    public void moveNorthNorthEast() {
        moveNorth();
        moveNorth();
        moveEast();
        source.direction = Directions.NORTH_NORTH_EAST;
    }
    
    /** moves the game object east north east */
    public void moveEastNorthEast() {
        moveEast();
        moveNorth();
        moveEast();
        source.direction = Directions.EAST_NORTH_EAST;
    }
    
    /** moves the game object east south east */
    public void moveEastSouthEast() {
        moveEast();
        moveSouth();
        moveEast();
        source.direction = Directions.EAST_SOUTH_EAST;
    }
    
    /** moves the game object south south east */
    public void moveSouthSouthEast() {
        moveSouth();
        moveSouth();
        moveEast();
        source.direction = Directions.SOUTH_SOUTH_EAST;
    }
    
    /** moves the game object south south west */
    public void moveSouthSouthWest() {
        moveSouth();
        moveSouth();
        moveWest();
        source.direction = Directions.SOUTH_SOUTH_WEST;
    }
    
    /** moves the game object west south west */
    public void moveWestSouthWest() {
        moveWest();
        moveSouth();
        moveWest();
        source.direction = Directions.WEST_SOUTH_WEST;
    }
    
    /** moves the game object west north west */
    public void moveWestNorthWest() {
        moveWest();
        moveNorth();
        moveWest();
        source.direction = Directions.WEST_NORTH_WEST;
    }
    
    /** moves the game object north north west */
    public void moveNorthNorthWest() {
        moveNorth();
        moveNorth();
        moveWest();
        source.direction = Directions.NORTH_NORTH_WEST;
    }
        
    /**
     * Move the game object a random direction based on the total number of
     * directions in the game
     */
    public void randomDirection() {
        source.direction = (int)((numberOfDirections - 1d + 1d) * Math.random() + 1d);
    }
    
}

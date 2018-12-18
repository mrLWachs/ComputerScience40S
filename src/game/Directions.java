
/** required package class namespace */
package game;


/**
 * Directions.java - directional constants for movement
 *
 * @author Mr. Wachs 
 * @since 17-Dec-2018 
 */
public class Directions 
{
    
    // type of game movements
    public static final int TWO_DIRECTIONS     = 2;
    public static final int FOUR_DIRECTIONS    = 4;
    public static final int EIGHT_DIRECTIONS   = 8;
    public static final int SIXTEEN_DIRECTIONS = 16;
    
    // no directional movement
    public static final int STOP = 0;
    
    // 16 or 8 directional game constants
    public static final int NORTH            = 1;
    public static final int NORTH_NORTH_EAST = 2;    
    public static final int NORTH_EAST       = 3;
    public static final int EAST_NORTH_EAST  = 4;    
    public static final int EAST             = 5;
    public static final int EAST_SOUTH_EAST  = 6;    
    public static final int SOUTH_EAST       = 7;
    public static final int SOUTH_SOUTH_EAST = 8;    
    public static final int SOUTH            = 9;
    public static final int SOUTH_SOUTH_WEST = 10;    
    public static final int SOUTH_WEST       = 11;
    public static final int WEST_SOUTH_WEST  = 12;    
    public static final int WEST             = 13;
    public static final int WEST_NORTH_WEST  = 14;    
    public static final int NORTH_WEST       = 15;
    public static final int NORTH_NORTH_WEST = 16;
    
    // 4 or 2 directional game constants
    public static final int UP    = NORTH;
    public static final int DOWN  = SOUTH;
    public static final int LEFT  = WEST;
    public static final int RIGHT = EAST;    
    
}

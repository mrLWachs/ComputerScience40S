
/** required package class namespace */
package archive.game.tools;


/**
 * Directions.java - directional constants for movement
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
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
    
    // 8 directional game constants
    public static final int WEST             = 1;
    public static final int EAST             = 2;
    public static final int NORTH            = 3;
    public static final int SOUTH            = 4;
    
    public static final int NORTH_EAST       = 5;    
    public static final int SOUTH_EAST       = 6;    
    public static final int SOUTH_WEST       = 7;    
    public static final int NORTH_WEST       = 8;
    
    // 16 directional game constants
    public static final int WEST_NORTH_WEST  = 9;
    public static final int WEST_SOUTH_WEST  = 10;
    public static final int SOUTH_SOUTH_WEST = 11;
    public static final int SOUTH_SOUTH_EAST = 12;
    public static final int EAST_SOUTH_EAST  = 13;
    public static final int EAST_NORTH_EAST  = 14;
    public static final int NORTH_NORTH_EAST = 15; 
    public static final int NORTH_NORTH_WEST = 16;
    
    // 4 or 2 directional game constants
    public static final int LEFT  = WEST;
    public static final int RIGHT = EAST;
    public static final int UP    = NORTH;
    public static final int DOWN  = SOUTH;
            
}

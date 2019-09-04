
/** required package class namespace */
package archive.game.tools;


/**
 * Reactor.java - methods to react to collisions in various ways
 *
 * @author Mr. Wachs 
 * @since 14-May-2019
 */
public class Reactor 
{
    
    private Coordinates source;
    private Coordinates target;
    private int         numberOfDirections;
    private Detector    detector;
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param coordinates the coordinate data to assign to this class
     * @param numberOfDirections the number of movements in this game
     */
    public Reactor(Coordinates coordinates, 
                   int numberOfDirections, 
                   Detector detector) {
        this.source             = coordinates;
        this.numberOfDirections = numberOfDirections;
        this.detector           = detector;
    }

    /**
     * Positions the coordinate data correctly against (sticks to) the target
     * coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void stickTo(GameObject hitbox) {
        if (numberOfDirections == Directions.TWO_DIRECTIONS ||
            numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if      (source.direction == Directions.LEFT)  stickToRight(hitbox);
            else if (source.direction == Directions.RIGHT) stickToLeft(hitbox);
            else if (source.direction == Directions.UP)    stickToBottom(hitbox);
            else if (source.direction == Directions.DOWN)  stickToTop(hitbox);            
        }     
        else if (numberOfDirections == Directions.EIGHT_DIRECTIONS) {
            if      (source.direction == Directions.NORTH) stickToBottom(hitbox);
            else if (source.direction == Directions.SOUTH) stickToTop(hitbox);
            else if (source.direction == Directions.EAST)  stickToLeft(hitbox);
            else if (source.direction == Directions.WEST)  stickToRight(hitbox);
            else if (source.direction == Directions.NORTH_EAST) {
                if      (detector.isBelow(hitbox))         stickToBottom(hitbox);
                else if (detector.isLeftOf(hitbox))        stickToLeft(hitbox);                
            }
            else if (source.direction == Directions.SOUTH_EAST) {
                if      (detector.isAbove(hitbox))         stickToTop(hitbox);
                else if (detector.isLeftOf(hitbox))        stickToLeft(hitbox);
            }
            else if (source.direction == Directions.SOUTH_WEST) {
                if      (detector.isAbove(hitbox))          stickToTop(hitbox);
                else if (detector.isRightOf(hitbox))        stickToRight(hitbox);
            }
            else if (source.direction == Directions.NORTH_WEST) {
                if      (detector.isBelow(hitbox))          stickToBottom(hitbox);
                else if (detector.isRightOf(hitbox))        stickToRight(hitbox);
            }        
        }
    }
    
    /**
     * Positions the coordinate data correctly against (sticks to) the targets
     * bottom edge coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void stickToBottom(GameObject hitbox) {
        target = hitbox.coordinates;
        source.y = target.bottom + 1;
        source.recalculate();
    }
    
    /**
     * Positions the coordinate data correctly against (sticks to) the targets
     * top edge coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void stickToTop(GameObject hitbox) {
        target = hitbox.coordinates;
        source.y = target.top - source.height - 1;
        source.recalculate();
    }

    /**
     * Positions the coordinate data correctly against (sticks to) the targets
     * left edge coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void stickToLeft(GameObject hitbox) {
        target = hitbox.coordinates;
        source.x = target.left - source.width  - 1;
        source.recalculate();
    }

    /**
     * Positions the coordinate data correctly against (sticks to) the targets
     * right edge coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void stickToRight(GameObject hitbox) {
        target = hitbox.coordinates;
        source.x = target.right + 1;
        source.recalculate();
    }
    
    /**
     * Changes current direction and bounces off the target coordinate data
     * 
     * @param hitbox the other game object to stick to
     */
    public void bounceOff(GameObject hitbox) {
        stickTo(hitbox);
        if (numberOfDirections == Directions.TWO_DIRECTIONS ||
            numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if      (source.direction == Directions.LEFT)  source.direction = Directions.RIGHT;
            else if (source.direction == Directions.RIGHT) source.direction = Directions.LEFT;
            else if (source.direction == Directions.UP)    source.direction = Directions.DOWN;
            else if (source.direction == Directions.DOWN)  source.direction = Directions.UP;
        }
        else if (numberOfDirections == Directions.EIGHT_DIRECTIONS) {
            if      (source.direction == Directions.NORTH) source.direction = Directions.SOUTH;
            else if (source.direction == Directions.SOUTH) source.direction = Directions.NORTH;
            else if (source.direction == Directions.EAST)  source.direction = Directions.WEST;
            else if (source.direction == Directions.WEST)  source.direction = Directions.EAST;
            else if (source.direction == Directions.NORTH_EAST) {
                if      (detector.isBelow(hitbox))         source.direction = Directions.SOUTH_EAST;
                else if (detector.isLeftOf(hitbox))        source.direction = Directions.NORTH_WEST;               
            }
            else if (source.direction == Directions.SOUTH_EAST) {
                if      (detector.isAbove(hitbox))         source.direction = Directions.NORTH_EAST;
                else if (detector.isLeftOf(hitbox))        source.direction = Directions.SOUTH_WEST;
            }
            else if (source.direction == Directions.SOUTH_WEST) {
                if      (detector.isAbove(hitbox))          source.direction = Directions.NORTH_WEST;
                else if (detector.isRightOf(hitbox))        source.direction = Directions.SOUTH_EAST;
            }
            else if (source.direction == Directions.NORTH_WEST) {
                if      (detector.isBelow(hitbox))          source.direction = Directions.SOUTH_WEST;
                else if (detector.isRightOf(hitbox))        source.direction = Directions.NORTH_EAST;
            }      
        }
    }

    /**
     * Puts this object's position in the middle both horizontally and 
     * vertically to the target
     * 
     * @param hitbox the other game object to stick to
     */
    public void centerOn(GameObject hitbox) {
        target = hitbox.coordinates;
        if      (target.width  > source.width)  source.x = target.centerX - (source.width  / 2);
        else if (source.width  > target.width)  source.x = target.centerX + (source.width  / 2);
        if      (target.height > source.height) source.y = target.centerY - (source.height / 2);
        else if (source.height > target.height) source.y = target.centerY + (source.height / 2);
        source.recalculate();
    }

    /**
     * Centers this object's position in the center and above the top of 
     * the target
     * 
     * @param hitbox the other game object to stick to
     */
    public void centerOnTop(GameObject hitbox) {
        target = hitbox.coordinates;
        centerOn(hitbox);
        source.y = target.top - source.height - 1;
        source.recalculate();
    }

    /**
     * Centers this object's position in the center and below the bottom of 
     * the target
     * 
     * @param hitbox the other game object to stick to
     */
    public void centerOnBottom(GameObject hitbox) {
        target = hitbox.coordinates;
        centerOn(hitbox);
        source.y = target.bottom + 1;
        source.recalculate();
    }

    /**
     * Centers this object's position in the center and to the left of the 
     * target
     * 
     * @param hitbox the other game object to stick to
     */
    public void centerOnLeft(GameObject hitbox) {
        target = hitbox.coordinates;
        centerOn(hitbox);
        source.x = target.left - source.width - 1;
        source.recalculate();
    }

    /**
     * Centers this object's position in the center and to the right of the 
     * target
     * 
     * @param hitbox the other game object to stick to
     */
    public void centerOnRight(GameObject hitbox) {
        target = hitbox.coordinates;
        centerOn(hitbox);
        source.x = target.right + 1;
        source.recalculate();
    }
    
}


/** required package class namespace */
package game.gametools;


/**
 * Detector.java - methods to detect collision detection in various ways
 *
 * @author Mr. Wachs 
 * @since 17-Dec-2018 
 */
public class Detector 
{

    private Coordinate source;    
    private Coordinate target;
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param coordinates the coordinate data to assign to this class
     */
    public Detector(Coordinate coordinates) {
        this.source = coordinates;
    }
    
    /**
     * Determines if overlapping with another game object (the target)
     * 
     * @param target the other game object to check against
     * @return is overlapping (true) or not (false)
     */
    public boolean isOverLapping(GameObject target) {
        if (isOverLappingVertically(target) && isOverLappingHorizontally(target)) return true;
        else                                                                      return false;
    }

    /**
     * Determines if overlapping vertically with another game object (target)
     * 
     * @param gameObject the other game object to check against
     * @return is overlapping (true) or not (false) 
     */
    public boolean isOverLappingVertically(GameObject gameObject) {
        target = gameObject.coordinates;
        if      (source.left  >= target.left && source.left  <= target.right) return true;
        else if (source.right >= target.left && source.right <= target.right) return true;
        else if (target.left  >= source.left && target.left  <= source.right) return true;
        else if (target.right >= source.left && target.right <= source.right) return true;
        else                                                                  return false;
    }

    /**
     * Determines if overlapping horizontally with another game object (target)
     * 
     * @param gameObject the other game object to check against
     * @return is overlapping (true) or not (false) 
     */
    public boolean isOverLappingHorizontally(GameObject gameObject) {
        target = gameObject.coordinates;
        if      (source.top    >= target.top && source.top    <= target.bottom) return true;
        else if (source.bottom >= target.top && source.bottom <= target.bottom) return true;
        else if (target.top    >= source.top && target.top    <= source.bottom) return true;
        else if (target.bottom >= source.top && target.bottom <= source.bottom) return true;
        else                                                                    return false;
    }

    /**
     * Determines if this object is above another game object
     * 
     * @param gameObject the other game object to check against
     * @return is above the other object (true) or not (false) 
     */
    public boolean isAbove(GameObject gameObject) {
        target = gameObject.coordinates;
        int adjustedBottom = source.top - source.amount;
        if (adjustedBottom < target.top) return true;
        else                             return false;
    }

    /**
     * Determines if this object is below another game object
     * 
     * @param gameObject the other game object to check against
     * @return is below the other object (true) or not (false) 
     */
    public boolean isBelow(GameObject gameObject) {
        target = gameObject.coordinates;
        int adjustedTop = source.top + source.amount;
        if (adjustedTop > target.bottom) return true;
        else                             return false;
    }

    /**
     * Determines if this object is left of another game object
     * 
     * @param gameObject the other game object to check against
     * @return is left of the other object (true) or not (false) 
     */
    public boolean isLeftOf(GameObject gameObject) {
        target = gameObject.coordinates;
        int adjustedRight = source.right - source.amount;
        if (adjustedRight < target.left) return true;
        else                             return false;
    }

    /**
     * Determines if this object is right of another game object
     * 
     * @param gameObject the other game object to check against
     * @return is right of the other object (true) or not (false) 
     */
    public boolean isRightOf(GameObject gameObject) {
        target = gameObject.coordinates;
        int adjustedLeft = source.right + source.amount;
        if (adjustedLeft > target.right) return true;
        else                             return false;
    }

}

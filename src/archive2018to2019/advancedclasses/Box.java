
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Box.java - represents a box that can hold anything
 *
 * @author Mr. Wachs 
 * @param <T> the generic type for the box contents
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Box <T> 
{

    private T thing;
    
    /**
     * Puts an item into the box
     * @param thing the thing to put in the box 
     */
    public void putIn(T thing) {
        this.thing = thing;
    }
    
    /**
     * Opens the box and returns the contents
     * @return the thing in the box
     */
    public T open() {
        return thing;
    }
    
}

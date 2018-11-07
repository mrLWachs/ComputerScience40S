
/** required package class namespace */
package testing.advancedclasses;


/**
 * Box.java - represents a box that can hold anything
 *
 * @author Mr. Wachs 
 * @param <T> the generic type for the box contents
 * @since 7-Nov-2018 
 */
public class Box  <T>
{

    private T item;
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param item the contents of the box
     */
    public Box(T item) {
        this.item = item;
    }

    /**
     * Opens the box and returns the contents
     * 
     * @return the item in the box
     */
    public T open() {
        return item;
    }
    
    /**
     * Looks (peeks) in the box and outputs contents
     */
    public void peek() {
        System.out.println(item.toString());
    }
    
}


/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Box.java - represents a box that can hold anything 
 *
 * @author Mr. Wachs 
 * @param <T> the generic type for the box contents 
 * @since 22-Apr-2019 
 */
public class Box <T>
{

    private T item;
    
    /**
     * Default constructor for the class, sets class properties
     * 
     * @param item the thing to put in the box 
     */
    public Box(T item) {
        this.item = item;
    }

    /**
     * Opens the box and returns the contents
     * 
     * @return the thing in the box
     */
    public T open() {
        return item;
    }
    
    /**
     * Does a "peek" in the box and outputs the contents
     */
    public void peek() {
        System.out.println(item.toString());
    }    
    
}

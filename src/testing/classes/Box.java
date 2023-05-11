/** Required package class namespace */
package testing.classes;

 
/**
 * Box.java - represents a box that can hold anything. This
 * class uses a 'generic' object as a property of the class.
 * When a generic data type is used anywhere in the class, the
 * angle brackets "< >" are used with a single letter in the
 * class signature line. Then that letter can be used throughout
 * the class and the data type is substituted in later when the
 * class is instantiated.
 *
 * @author Mr. Wachs
 * @param <T> the generic type for the box's contents
 * @since 11-May-2023, 1:18:36 PM
 */
public class Box <T>
{

    /**
     * The generic property of this class which uses a data type
     * that will be defined when this class is instantiated
     */
    private T present;
    
    
    /**
     * Constructor, set class properties
     * 
     * @param present the generic thing to put in the box 
     */
    public Box(T present) {
        this.present = present;
    }
    
    /**
     * Opens the box and returns the contents
     * 
     * @return the generic thing in the box
     */
    public T open() {
        return present;
    }
     
    /**
     * Does a "peek" in the box and outputs the contents
     */
    public void peek() {
        System.out.println("Peeking at " + present.toString());
    }
    
}
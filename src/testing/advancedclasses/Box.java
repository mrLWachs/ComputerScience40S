
/** Required package class namespace */
package testing.advancedclasses;

 
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
 * @param <T> the generic type for the box contents
 * @since Nov. 6, 2019, 11:38:39 a.m.
 */
public class Box <T>
{

    /**
     * The generic property of this class which uses a data type
     * that will be defined when this class is instantiated
     */
    private T present;
    
    /**
     * Default constructor for the class, sets class properties
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
        System.out.println(present.toString());
    }
     
}
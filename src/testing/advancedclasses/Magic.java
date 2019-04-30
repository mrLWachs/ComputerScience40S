/** required package class namespace */
package testing.advancedclasses;


/**
 * Magic.java - represents "magic"
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public class Magic 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Magic() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Magic " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Magic clone() {
        return this;
    }

}

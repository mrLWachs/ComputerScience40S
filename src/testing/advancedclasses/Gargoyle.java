
/** required package class namespace */
package testing.advancedclasses;


/**
 * Gargoyle.java - represents a gargoyle monster
 *
 * @author Mr. Wachs 
 * @since 30-Oct-2018 
 */
public class Gargoyle extends Monster
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Gargoyle() {
        super();
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Gargoyle " + super.toString();
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
    public Gargoyle clone() {
        return this;
    }

}


/** required package class namespace */
package testing.advancedclasses;


/**
 * Monster.java - represents a monster
 *
 * @author Mr. Wachs 
 * @since 30-Oct-2018 
 */
public class Monster 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Monster() {
        super();
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Monster " + super.toString();
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
    public Monster clone() {
        return this;
    }

}

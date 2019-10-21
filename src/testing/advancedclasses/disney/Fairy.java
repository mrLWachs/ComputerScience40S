
/** required package class namespace */
package testing.advancedclasses.disney;

 
/**
 * Fairy.java - represents a fairy creature
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 10:41:23 a.m.
 */
public class Fairy extends Creatures
{

    /**
     * Default constructor, set class properties
     */
    public Fairy() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Fairy: " + super.toString();
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Fairy clone() {
        return this;
    }

}



/** required package class namespace */
package testing.advancedclasses.disney;

 
/**
 * Prince.java - represents a prince king royalty person
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 10:40:50 a.m.
 */
public class Prince extends Royalty
{

    /**
     * Default constructor, set class properties
     */
    public Prince() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Prince: " + super.toString();
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
    public Prince clone() {
        return this;
    }

}

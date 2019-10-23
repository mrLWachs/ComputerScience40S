
/** required package class namespace */
package testing.advancedclasses.disney;

 
/**
 * Hercules.java - represents a Hercules prince king royalty person
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 10:40:57 a.m.
 */
public class Hercules extends Prince
{

    private Magic immortality;          // associated object 
    
    /**
     * Default constructor, set class properties
     */
    public Hercules() {
        immortality = new Magic();      // instantiate object
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Hercules: " + super.toString() + " " + immortality.toString();
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
    public Hercules clone() {
        return this;
    }

}

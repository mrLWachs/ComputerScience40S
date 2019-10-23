
/** required package class namespace */
package testing.advancedclasses.disney;

 
/**
 * Creatures.java - represents a creature
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 10:41:11 a.m.
 */
public class Creatures 
{
    
    public Magic magic;             // associated object 

    /**
     * Default constructor, set class properties
     */
    public Creatures() {
        magic = new Magic();        // instantiate object
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Creatures: " + super.toString() + " " + magic.toString();
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
    public Creatures clone() {
        return this;
    }

}

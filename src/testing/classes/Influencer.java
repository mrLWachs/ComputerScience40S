/** Required package class namespace */
package testing.classes;
 
/**
 * Influencer.java - represents a Influencer Person
 *
 * @author Mr. Wachs
 * @since Oct 24, 2024, 11:54:31 a.m.
 */
public class Influencer extends Person
{

    /**
     * Default constructor, set class properties
     */
    public Influencer() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Influencer: " + super.toString();
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
    public Influencer clone() {
        return this;
    }
    
}
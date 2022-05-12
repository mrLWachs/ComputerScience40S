/** Required package class namespace */
package testing.unit3;

 
/**
 * Plumber.java - represents a plumber person
 *
 * @author Mr. Wachs
 * @since 6-May-2022, 3:13:03 PM
 */
public class Plumber extends Person
{

    /**
     * Default constructor, set class properties
     */
    public Plumber() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Plumber: " + super.toString();
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
    public Plumber clone() {
        return this;
    }
    
}
/** Required package class namespace */
package testing.classes;
 
/**
 * Athlete.java - description
 *
 * @author YOUR NAME
 * @since Nov 19, 2025, 8:58:49 AM
 */
public class Athlete extends Husky
{

    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete: " + super.toString();
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
    public Athlete clone() {
        return this;
    }
    
}
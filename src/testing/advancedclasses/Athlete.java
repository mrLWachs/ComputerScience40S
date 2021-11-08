/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person
 *
 * @author Mr. Wachs
 * @since 8-Nov-2021, 11:31:12 AM
 */
public class Athlete extends Husky
{

    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        super();
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
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * HighSchool.java - description
 *
 * @author Mr. Wachs
 * @since 5-Nov-2021, 11:15:41 AM
 */
public class HighSchool extends Student
{

    /**
     * Default constructor, set class properties
     */
    public HighSchool() {
        super("Smelly Teenager",15);
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
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
    public HighSchool clone() {
        return this;
    }
    
}
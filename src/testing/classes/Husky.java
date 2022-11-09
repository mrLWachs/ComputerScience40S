
/** Required package class namespace */
package testing.classes;

 
/**
 * Husky.java - represents a Husky HighSchool Student Person
 *
 * @author Mr. Wachs
 * @since 9-Nov-2022, 11:28:13 AM
 */
public class Husky extends HighSchool
{

    // Without writing a default constructor, Java writes one for me - this
    // means it will call the default constructor of the parent class 
    // (HighSchool) which may call other constructors...
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Husky: " + super.toString();
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
    public Husky clone() {
        return this;
    }
    
}
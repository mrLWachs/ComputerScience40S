
/** Required package class namespace */
package testing.classes;

 
/**
 * Doctor.java - represents a Doctor Person
 *
 * @author Mr. Wachs
 * @since Nov 21, 2023, 11:57:09 a.m.
 */
public class Doctor extends Person
{

    /**
     * Default constructor, set class properties
     */
    public Doctor() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Doctor: " + super.toString();
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
    public Doctor clone() {
        return this;
    }
    
}

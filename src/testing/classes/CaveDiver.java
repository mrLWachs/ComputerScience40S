/** Required package class namespace */
package testing.classes;
 
/**
 * CaveDiver.java - description
 *
 * @author YOUR NAME
 * @since Apr 16, 2026, 9:14:03 AM
 */
public class CaveDiver extends Person
{

    /**
     * Default constructor, set class properties
     */
    public CaveDiver() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "CaveDiver: " + super.toString();
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
    public CaveDiver clone() {
        return this;
    }
    
}
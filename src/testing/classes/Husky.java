/** Required package class namespace */
package testing.classes;
 
/**
 * Husky.java - description
 *
 * @author YOUR NAME
 * @since Apr 29, 2024, 9:24:18 a.m.
 */
public class Husky 
{

    /**
     * Default constructor, set class properties
     */
    public Husky() {
        
    }
     
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
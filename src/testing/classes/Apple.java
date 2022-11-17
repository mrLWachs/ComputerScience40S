
/** Required package class namespace */
package testing.classes;

 
/**
 * Apple.java - description
 *
 * @author Mr. Wachs
 * @since 17-Nov-2022, 11:35:39 AM
 */
public class Apple 
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Apple: " + super.toString();
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
    public Apple clone() {
        return this;
    }
    
}
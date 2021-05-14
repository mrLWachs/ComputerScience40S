
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Baker.java - represents a baker person
 *
 * @author Mr. Wachs
 * @since May 14, 2021, 11:40:29 a.m.
 */
public class Baker 
{

    /**
     * Default constructor, set class properties
     */
    public Baker() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Baker: " + super.toString();
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
    public Baker clone() {
        return this;
    }
    
}
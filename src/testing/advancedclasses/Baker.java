/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Baker.java - represents a Baker Person
 *
 * @author Mr. Wachs
 * @since 8-Nov-2021, 11:30:24 AM
 */
public class Baker extends Person
{

    /**
     * Default constructor, set class properties
     */
    public Baker() {
        super();
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
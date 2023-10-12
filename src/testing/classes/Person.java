
/** Required package class namespace */
package testing.classes;

 
/**
 * Person.java - description
 *
 * @author Mr. Wachs
 * @since Oct 11, 2023, 11:55:41 a.m.
 */
public class Person 
{

    /**
     * Default constructor, set class properties
     */
    public Person() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person: " + super.toString();
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
    public Person clone() {
        return this;
    }
    
}

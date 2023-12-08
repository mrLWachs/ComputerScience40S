
/** Required package class namespace */
package collections;

 
/**
 * LinkedList.java - description
 *
 * @author Mr. Wachs
 * @since Dec 6, 2023, 10:38:11 a.m.
 */
public class LinkedList 
{

    /**
     * Default constructor, set class properties
     */
    public LinkedList() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "LinkedList: " + super.toString();
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
    public LinkedList clone() {
        return this;
    }
    
}

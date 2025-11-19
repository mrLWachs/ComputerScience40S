/** Required package class namespace */
package testing.classes;
 
/**
 * DragQueen.java - represents a Drag Queen Person
 *
 * @author Mr. Wachs
 * @since Nov 19, 2025, 9:01:48 AM
 */
public class DragQueen extends Person
{

    /**
     * Default constructor, set class properties
     */
    public DragQueen() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "DragQueen: " + super.toString();
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
    public DragQueen clone() {
        return this;
    }
    
}
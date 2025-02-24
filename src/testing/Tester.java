/** Required package class namespace */
package testing;
 
/**
 * Tester.java - description
 *
 * @author Mr. Wachs
 * @since Feb 24, 2025, 11:03:28 a.m.
 */
public class Tester 
{

    /**
     * Default constructor, set class properties
     */
    public Tester() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Tester: " + super.toString();
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
    public Tester clone() {
        return this;
    }
    
}
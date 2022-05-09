/** Required package class namespace */
package testing.unit3;

 
/**
 * Leopard.java - description
 *
 * @author Mr. Wachs
 * @since 9-May-2022, 3:19:49 PM
 */
public class Leopard extends HighSchool
{

    /**
     * Default constructor, set class properties
     */
    public Leopard() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Leopard: " + super.toString();
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
    public Leopard clone() {
        return this;
    }
    
}
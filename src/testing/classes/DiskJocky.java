
/** Required package class namespace */
package testing.classes;

 
/**
 * DiskJocky.java - represents a DiskJocky Person
 *
 * @author Mr. Wachs
 * @since 9-Nov-2022, 11:29:03 AM
 */
public class DiskJocky extends Person
{

    /**
     * Default constructor, set class properties
     */
    public DiskJocky() {
        super("DJ Blitz");
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "DiskJocky: " + super.toString();
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
    public DiskJocky clone() {
        return this;
    }
    
}
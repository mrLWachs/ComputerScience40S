
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * MrWachs.java - represents a MrWachs CS teacher person
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:10:31 PM
 */
public class MrWachs extends CSTeacher
{

    /**
     * Default constructor, set class properties
     * 
     * @param name the name for this teacher
     */
    public MrWachs(String name) {
        super(name);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "MrWachs: " + super.toString();
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
    public MrWachs clone() {
        return this;
    }
    
}


/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * MrWachs.java - represents a Mr. Wachs teacher person
 *
 * @author Mr. Wachs
 * @since May 14, 2021, 11:41:06 a.m.
 */
public class MrWachs extends Teacher
{

    /**
     * Class constructor, sets class properties
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
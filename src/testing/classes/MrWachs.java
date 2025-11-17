/** Required package class namespace */
package testing.classes;
 
/**
 * MrWachs.java - represents a MrWachs Teacher Person 
 *
 * @author Mr. Wachs
 * @since Oct 31, 2025, 9:14:28 AM
 */
public class MrWachs extends Teacher
{

    public MrWachs(String name) {
        super(name);
        
        // From classes, related through inheritance (MrWachs "is a" Teacher, 
        // and Teacher "is a" Person - chained inheritance) we CAN access
        // "protected" level properties (and methods)
        super.alive = false;
        
        // Methods that are static can only be called from classes that are 
        // related through inheritance
        super.yelling();
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
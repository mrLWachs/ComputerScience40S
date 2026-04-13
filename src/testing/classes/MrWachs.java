
/** Required package class namespace */
package testing.classes;
 
/**
 * MrWachs.java - represents a MrWachs Teacher Person 
 *
 * @author Mr. Wachs
 * @since Apr 13, 2026, 9:28:26 AM
 */
public class MrWachs extends Teacher
{

    /**
     * NOTE: when we created this class (using our template), and then added the
     * class modifier to have it inherit ("is a") from the "Teacher" class, the
     * default constructor the template wrote for us was causing an error. We 
     * corrected this by adding a call to the "super-constructor" inside the
     * default constructor and pass the argument "Mr. Wachs"
     */
    public MrWachs() {
        super("Mr. Wachs");
        // Here the "MrWachs" class default constructor is calling the parent
        // (super) class super-constructor (and since no default constructor
        // option is available in the super class) and passes the appropriate
        // argument to that constructor's parameter
        
        // From classes, related through inheritance (MrWachs "is a" Teacher, 
        // and Teacher "is a" Person - chained inheritance) we CAN access
        // "protected" level properties (and methods)
        super.alive = false;                   // After all, he is "dead inside"
        
        // Methods that are static can only be called from classes that are 
        // related through inheritance
        super.yelling();                   // I mean what else does he really do
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
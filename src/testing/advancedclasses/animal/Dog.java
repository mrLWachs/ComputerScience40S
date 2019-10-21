
/** required package class namespace */
package testing.advancedclasses.animal;

 
/**
 * Dog.java - represents a dog pets animals
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 11:43:10 a.m.
 */
public class Dog extends Pets
{

    /**
     * Default constructor, set class properties
     */
    public Dog() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Dog: " + super.toString();
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
    public Dog clone() {
        return this;
    }

}

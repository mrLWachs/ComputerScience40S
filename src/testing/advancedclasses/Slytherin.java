
/** required package class namespace */
package testing.advancedclasses;


/**
 * Slytherin.java - represents the fictional character of Slytherin
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public class Slytherin extends Wizard
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Slytherin() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Slytherin " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Slytherin clone() {
        return this;
    }

    @Override
    public void wearTie() {
        System.out.println("Wear green");
    }

}


/** required package class namespace */
package testing.advancedclasses;


/**
 * Wizard.java - represents the fictional character of a wizard, this
 * is an example of an abstract class (which means it cannot be instantiated)
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public abstract class Wizard extends Person
{

    // the "has a" relationship (composition) here between the classes
    protected static Magic magic;
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Wizard() {
        magic = new Magic();
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Wizzard " + super.toString();
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
    public Wizard clone() {
        return this;
    }
    
    /**
     * Casts a spell (a static method)
     */
    public static void castSpell() {
        System.out.println(magic.toString());
    }
    
}

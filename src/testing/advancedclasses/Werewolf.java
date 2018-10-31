
/** required package class namespace */
package testing.advancedclasses;



/**
 * Werewolf.java - represents a werewolf meta-human
 *
 * @author Mr. Wachs 
 * @since 30-Oct-2018 
 */
public class Werewolf extends MetaHuman
{

    /**
     * Default constructor for the class, sets class properties
     */
    public Werewolf(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Werewolf " + super.toString();
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
    public Werewolf clone() {
        return this;
    }

}

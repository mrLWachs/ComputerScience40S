
/** required package class namespace */
package testing.advancedclasses;


/**
 * SuperHero.java - represents a super-hero person
 *
 * @author Mr. Wachs 
 * @since 30-Oct-2018 
 */
public class SuperHero extends MetaHuman
{

    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this object
     * @param age the age for this object
     * @param isMale the gender for this object
     */
    public SuperHero(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "SuperHero " + super.toString();
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
    public SuperHero clone() {
        return this;
    }

}

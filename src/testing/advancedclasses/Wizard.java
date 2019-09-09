
/** required package class namespace */
package testing.advancedclasses;

/**
 * Wizard.java - represents the fictional character of a wizard
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public abstract class Wizard extends HighSchoolStudent implements Quidditch
{

    // the "has a" relationship (composition) here between the classes
    protected static Magic magic;
    
    protected String mortalEnemy;

    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name of this Wizard High School student
     * @param isMale the gender of this Wizard High School student
     */
    public Wizard(String name, boolean isMale) {
        super(name,16,isMale,666);
        magic = new Magic();
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Wizard " + super.toString();
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

    /**
     * What color this wizard's tie is
     */
    public abstract void wearTie();

    /**
     * Did this wizard catch a snitch or not (to end the match)
     * 
     * @return they did catch it (true) or not (false)
     */
    @Override
    public abstract boolean catchSnitch();

}


/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Hufflepuff.java - represents the fictional character of Hufflepuff
 *
 * @author Mr. Wachs 
 * @since 22-Mar-2019 
 */
public class Hufflepuff extends Wizard
{

    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name of this Wizard High School student
     * @param isMale the gender of this Wizard High School student
     */
    public Hufflepuff(String name, boolean isMale) {
        super(name, isMale);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Hufflepuff " + super.toString();
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
    public Hufflepuff clone() {
        return this;
    }

    /**
     * What color this wizard's tie is
     */
    @Override
    public void wearTie() {
        System.out.println("Wear Yellow");
    }

    /**
     * Did this wizard catch a snitch or not (to end the match)
     * 
     * @return they did catch it (true) or not (false)
     */
    @Override
    public boolean catchSnitch() {
        return true;
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        super.mortalEnemy = name;
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        if (catchSnitch()) return true;
        else return false;
    }

}
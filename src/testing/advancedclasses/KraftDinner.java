
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * KraftDinner.java - represents a Kraft dinner
 *
 * @author Mr. Wachs
 * @since Oct. 29, 2019, 11:49:06 a.m.
 */
public class KraftDinner extends Food
{

    /** 
     * Default constructor for the class 
     */
    public KraftDinner() {
        super(true, Food.GROUPS[4], "cheesy");
    }

    /**
     * How to eat this Kraft dinner
     * 
     * @return the nurishment or not
     */
    @Override
    public boolean eat() {
        System.out.println("Spoon, plain");
        return super.nurishment;
    }

    /**
     * Store the Kraft dinner somehow
     */
    @Override
    public void store() {
        System.out.println("cupboard");
    }

    /**
     * Prepares the Kraft dinner to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("In a pot");
    }
    
}

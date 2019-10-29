
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * WellDoneSteak.java - represents a well done steak
 *
 * @author Mr. Wachs
 * @since Oct. 29, 2019, 11:48:51 a.m.
 */
public class WellDoneSteak extends Food
{

    /** 
     * Default constructor for the class 
     */
    public WellDoneSteak() {
        super(true, Food.GROUPS[1], "burnt");
    }

    /**
     * How to eat this well done steak
     * 
     * @return the nurishment or not
     */
    @Override
    public boolean eat() {
        System.out.println("Fork and knife");
        return super.nurishment;
    }

    /**
     * Store the well done steak somehow
     */
    @Override
    public void store() {
        System.out.println("In the garbage");
    }

    /**
     * Prepares the well done steak to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Sizzle until done, then flip");
    }

}

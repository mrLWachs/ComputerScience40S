
/** required package class namespace */
package testing.advancedclasses;

/**
 * Spaghetti.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Spaghetti extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Spaghetti() {
        super("grains", false);
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean canCook() {
        return true;
    }

    /**
     * 
     */
    @Override
    public void spoil() {
        System.out.println("Never!");
    }
       
}

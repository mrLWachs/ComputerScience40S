
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Spaghetti.java - represents spaghetti
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
     * Determines if this food item can be cooked or not 
     * 
     * @return can be cooked (true), or not (false)
     */
    @Override
    public boolean canCook() {
        return true;
    }

    /**
     * Outputs if the food has spoiled
     */
    @Override
    public void spoil() {
        System.out.println("Never!");
    }
       
}

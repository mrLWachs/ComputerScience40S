
/** required package class namespace */
package testing.advancedclasses;

/**
 * Apple.java - represents an apple
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Apple extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Apple() {
        super("fruits", true);
    }

    /**
     * Determines if this food item can be cooked or not 
     * 
     * @return can be cooked (true), or not (false)
     */
    @Override
    public boolean canCook() {
        return false;
    }
    
}

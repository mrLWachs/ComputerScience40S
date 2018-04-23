
/** required package class namespace */
package testing.advancedclasses;

/**
 * Apple.java - 
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
     * 
     * @return 
     */
    @Override
    public boolean canCook() {
        return false;
    }
    
}

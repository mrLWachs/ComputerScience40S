
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Potato.java - represents a potato
 *
 * @author Mr. Wachs
 * @since Oct. 28, 2019, 10:46:46 a.m.
 */
public class Potato extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Potato() {
        super(true, Food.GROUPS[0]);
    }

    /**
     * How to eat this potato
     * 
     * @return the nurishment or not
     */
    @Override
    public boolean eat() {
        return true;
    }

    /**
     * Prepares the potato to be eaten
     */
    @Override
    public void prepare() {
        
    }
    
}

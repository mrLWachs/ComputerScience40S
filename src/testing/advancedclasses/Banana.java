/** required package class namespace */
package testing.advancedclasses;


/**
 * Banana.java - represents a banana
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Banana extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Banana() {
        super(Food.GROUPS[1]);
    }

    /**
     * How to eat this food object
     */
    @Override
    public void eat() {
        System.out.println("Eating by peel from top of group " + group);
    }

    /**
     * Determines if this food item should be cooked or not 
     * 
     * @return should be cooked (true), or not (false)
     */
    @Override
    public boolean shouldCook() {
        return false;
    }

}

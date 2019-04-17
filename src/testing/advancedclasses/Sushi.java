
/** required package class namespace */
package testing.advancedclasses;


/**
 * Sushi.java - represents sushi
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Sushi extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Sushi() {
        super(Food.GROUPS[2]);
    }

    /**
     * How to eat this food object
     */
    @Override
    public void eat() {
        System.out.println("Eating California roll from group " + group);
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

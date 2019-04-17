
/** required package class namespace */
package testing.advancedclasses;


/**
 * Chicken.java - represents chicken
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Chicken extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Chicken() {
        super(Food.GROUPS[2]);
    }

    /**
     * How to eat this food object
     */
    @Override
    public void eat() {
        System.out.println("Eating fried chicken from " + group);
    }

    /**
     * Determines if this food item should be cooked or not 
     * 
     * @return should be cooked (true), or not (false)
     */
    @Override
    public boolean shouldCook() {
        return true;
    }

}

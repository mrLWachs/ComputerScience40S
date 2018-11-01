
/** required package class namespace */
package testing.advancedclasses;


/**
 * Poutine.java - represents poutine food
 *
 * @author Mr. Wachs 
 * @since 1-Nov-2018 
 */
public class Poutine extends Food
{

    /**
     * Constructor for the class, sets class properties 
     */
    public Poutine() {
        super("unhealthy");
    }

    /**
     * How to eat poutine
     */
    @Override
    public void eat() {
        System.out.println("maybe a fork");
    }

    /**
     * We should always cook poutine
     * 
     * @return it should be cooked
     */
    @Override
    public boolean shouldCook() {
        return true;
    }

}

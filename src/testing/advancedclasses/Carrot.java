
/** required package class namespace */
package testing.advancedclasses;


/**
 * Carrot.java - represents carrot food
 *
 * @author Mr. Wachs 
 * @since 1-Nov-2018 
 */
public class Carrot extends Food
{

    /**
     * Constructor for the class, sets class properties 
     */
    public Carrot() {
        super("Vegetable");
    }

    /**
     * How to eat a carrot
     */
    @Override
    public void eat() {
        System.out.println("with hands");
    }

    /**
     * We should never cook carrot
     * 
     * @return it should never be cooked
     */
    @Override
    public boolean shouldCook() {
        return false;
    }
    
}

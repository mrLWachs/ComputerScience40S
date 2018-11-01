
/** required package class namespace */
package testing.advancedclasses;


/**
 * Food.java - represents abstract food 
 *
 * @author Mr. Wachs 
 * @since 1-Nov-2018 
 */
public abstract class Food 
{

    protected String group;

    /**
     * Constructor for the class, sets class properties 
     * 
     * @param group the food group for this object
     */
    public Food(String group) {
        this.group = group;
    }

    /**
     * When food goes bad
     */
    public void spoil() {
        System.out.println("Yuck!");
    }
    
    /**
     * Abstract definition of how to eat this object
     */
    public abstract void eat();
    
    /**
     * Abstract definition of whether or not this object should be cooked
     * 
     * @return it should be cooked (true) or not (false)
     */
    public abstract boolean shouldCook();

}


/** required package class namespace */
package testing.advancedclasses;

/**
 * Food.java - abstract class representing the concept of food
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public abstract class Food 
{

    /**
     * The food group to belong to
     */
    protected String group;
    private boolean isSpoiled;
   
    /**
     * Constructor for the class
     * 
     * @param group the food group to belong to
     * @param isSpoiled is this food spoiled (true), or not (false)
     */
    public Food(String group, boolean isSpoiled) {
        this.group     = group;
        this.isSpoiled = isSpoiled;
    }
    
    /**
     * Outputs if the food has spoiled
     */
    public void spoil() {
        if (isSpoiled) System.out.println("Throw it out");
    }
    
    /**
     * Determines if this food item can be cooked or not 
     * 
     * @return can be cooked (true), or not (false)
     */
    public abstract boolean canCook();

}

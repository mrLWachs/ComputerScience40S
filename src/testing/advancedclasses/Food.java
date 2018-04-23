
/** required package class namespace */
package testing.advancedclasses;

/**
 * Food.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public abstract class Food 
{

    protected String group;
    private boolean isSpoiled;
   
    /**
     * 
     * @param group
     * @param isSpoiled 
     */
    public Food(String group, boolean isSpoiled) {
        this.group = group;
        this.isSpoiled = isSpoiled;
    }
    
    /**
     * 
     */
    public void spoil() {
        if (isSpoiled) 
            System.out.println("Throw it out");
    }
    
    /**
     * 
     * @return 
     */
    public abstract boolean canCook();

}

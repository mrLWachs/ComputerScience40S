
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
        super(1);
    }

    
    @Override
    public void eat() {
        System.out.println("Peel from top");
    }

    @Override
    public boolean shouldCook() {
        return false;
    }

}

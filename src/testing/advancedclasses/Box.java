
/** required package class namespace */
package testing.advancedclasses;

/**
 * Box.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Box <T> 
{

    private T thing;
    
    /**
     * 
     * @param thing 
     */
    public void putIn(T thing) {
        this.thing = thing;
    }
    
    /**
     * 
     * @return 
     */
    public T open() {
        return thing;
    }
    
}

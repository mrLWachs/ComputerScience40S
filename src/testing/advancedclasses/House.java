
/** required package class namespace */
package testing.advancedclasses;

/**
 * House.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class House <T,U>
{
    /**
     * 
     */
    public T owner;
    
    /**
     * 
     */
    public U contents;
    
    
    /**
     * 
     * @param <V>
     * @param items 
     */
    public static<V extends Food> void party(V[] items) {
        for (V item : items) {
            AdvancedClassesTest.output(item);
        }
    }    
    
}

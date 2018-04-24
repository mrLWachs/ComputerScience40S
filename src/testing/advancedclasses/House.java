
/** required package class namespace */
package testing.advancedclasses;

/**
 * House.java - represents a house that can hold anything and is owned
 * by anyone
 *
 * @author Mr. Wachs 
 * @param <T> the generic owner (parented from Person)
 * @param <U> the generic contents
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class House <T extends Person,U>
{
    /**
     * The generic owner (parented from Person)
     */
    public T owner;
    
    /**
     * The generic contents
     */
    public U contents;
    
    
    /**
     * Holds a house party with a number of generic items (parented from
     * Food) and outputs the items
     * 
     * @param <V> the generic item (parented from Food)
     * @param items the array of generic items (parented from Food)
     */
    public static<V extends Food> void party(V[] items) {
        for (V item : items) {
            AdvancedClassesTest.output(item);
        }
    }    
    
}

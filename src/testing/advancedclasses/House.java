
/** required package class namespace */
package testing.advancedclasses;


/**
 * House.java - represents a house, and has a homeowner property who 
 * generically restricted to be a person object or any children of the
 * person class. Also it contains contents (property) which can be 
 * generically anything
 *
 * @author Mr. Wachs 
 * @since 23-Apr-2019 
 */
public class House <T extends Person,U>
{

    /**
     * The generic owner (parented from Person)
     */
    public T homeOwner;
    
    /**
     * The generic contents
     */
    public U contents;
    
    
    /**
     * Holds a house party with a number of generic items (parented from
     * Food) and eats all the items (outputting them)
     * 
     * @param <V> the generic item (parented from Food)
     * @param items the array of generic items (parented from Food)
     */
    public <V extends Food> void party(V[] items) {
        System.out.println("Homeowner " + homeOwner.toString() +
                           " and " + contents.toString());
        for (V item : items) {
            homeOwner.eat(item);            
        }
    }
    
}

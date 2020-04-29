
/** required package class namespace */
package testing.advancedclasses;

/**
 * House.java - represents a house, and has a homeowner property who 
 * generically restricted to be a person object or any children of the
 * person class.Also it contains contents (property) which can be 
 * generically anything
 *
 * @author Mr. Wachs 
 * @param <T> the generic type for person owner of the house 
 * @param <U> the generic type for contents of the house
 * @since 29-Apr-2020, 1:26:47 PM
 */
public class House <T extends Person,U>
{

    /** The generic type for person owner of the house */
    public T homeOwner;
    
    /** The generic type for contents of the house */
    public U contents;
    
    
    /**
     * A party in the house where the home owner eats all the food
     * 
     * @param <V> the generic type for food objects
     * @param items the array of food items
     */
    public <V extends Food> void party(V[] items) {
        System.out.println("Home owner " +
                homeOwner.getName() + " and " +
                contents.toString());
        for (V item : items) {
            homeOwner.haveDinner(item);
        }        
    }
    
}

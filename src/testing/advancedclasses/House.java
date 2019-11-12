  
/** required package class namespace */
package testing.advancedclasses;

/**
 * House.java - represents a house, and has a homeowner property who 
 * generically restricted to be a person object or any children of the
 * person class. Also it contains contents (property) which can be 
 * generically anything
 *
 * @author Mr. Wachs 
 * @since Nov. 6, 2019, 11:38:39 a.m.
 */
public class House <T extends Person,U> 
{
    
    public T homeOwner;

    public U contents;
    
    public <V extends Food> void party(V[] items) {
        System.out.println("HomeOwner " + 
                homeOwner.toString() + " and " + 
                contents.toString());
        for (V item : items) {
            homeOwner.haveDinner(item);
        }
    }
    
}

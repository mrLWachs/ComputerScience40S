
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * House.java - represents a house, and has a homeowner property who 
 * generically restricted to be a person object or any children of the person
 * class. Also it contains contents (a property) which can be generically
 * anything. To add another generic, use a comma "," in the class signature
 * inside the angle brackets "< >" and another letter (a different letter) to 
 * act as another placeholder.
 *
 * @author Mr. Wachs
 * @since May 28, 2021, 11:13:06 a.m.
 */
public class House <T extends Person, U>
{

    /**
     * The generic owner of this house (must be a Person object or any children
     * of that class)
     */
    public T homeOwner;
    
    /**
     * The generic contents in this house. Since this is a different generic 
     * object, a different letter is used (again it can be any letter you want)
     */
    public U contents;
    
    /**
     * Generic method that has the home owner consume all the generic 
     * restricted Food (all all Food children) items that are passed in an 
     * array
     *
     * @param <V> Food objects (or children of the Food class)
     * @param items the array of generic items that are Food
     * objects or children of the Food class
     */
    public <V extends Food> void party(V[] items) {
        System.out.println("Home owner:\n"         + homeOwner.name + 
                           "\nAnd the contents:\n" + contents.toString() +
                           "");
        // Enhanced for loop ("for every item in items")
        for (V item : items) {
            homeOwner.consume(item);        // Call the Person class method
        }
    }
    
}
/** Required package class namespace */
package testing.classes;
 
/**
 * House.java - represents a House. This class uses two different 'generic' 
 * objects as properties of the class. The two are separated in the class
 * signature line with a comma. Also, the first generic "P" is a restricted
 * generic. This means you can use any data type as long as it fits the 
 * restrictions. This means you can use any Person object, or any of the 
 * children of the Person class. 
 *
 * @author Mr. Wachs
 * @param <P> Any generic object that is a Person or children of Person
 * @param <T> Any generic object to be the house contents
 * @since Dec 4, 2025, 9:09:17 AM
 */
public class House <P extends Person, T>
{

    /**
     * The generic owner of this house (must be a Person object or any children
     * of that class)
     */
    public P homeOwner;
    
    /**
     * The generic contents in this house. Since this is a different generic 
     * object, a different letter is used (again it can be any letter you want)
     */
    public T contents;
    
    
    /**
     * Generic method that has the home owner consume all the generic 
     * restricted Food (all all Food children) items that are passed in an 
     * array
     *
     * @param <U> Food objects (or children of the Food class)
     * @param items the array of generic items that are restricted to Food
     * objects or children of the Food class
     */
    public <U extends Food> void party(U[] items) {
        System.out.println("This home is owned by " + homeOwner.name);
        System.out.println("and contents of the house: " + contents.toString());
        for (U item : items) {
            homeOwner.consume(item);
        }
    }

}

/** required package class namespace */
package testing.advancedclasses;


/**
 * House.java - represents a house that can hold anything and is owned
 * by anyone
 *
 * @author Mr. Wachs 
 * @param <T> the generic owner (parented from Person)
 * @param <U> the generic contents array
 * @since 7-Nov-2018 
 */
public class House <T extends Person, U>
{
    
    private T owner;
    private U[] contents;

    /**
     * Constructor for the class, sets class properties
     * 
     * @param owner the generic owner
     * @param contents the generic contents 
     */
    public House(T owner, U[] contents) {
        this.owner    = owner;
        this.contents = contents;
    }
    
    /**
     * Visiting the house outputs the owner and all contents
     */
    public void visit() {
        String text = "Home owner " + owner.getName();
        text += " has:";
        for (U item : contents) {
            if (item instanceof Object[]) {
                Object[] a = (Object[])item;
                for (int i = 0; i < a.length; i++) {
                    text += "\n\t-> " + a[i].toString();
                }
            }
            else {
                text += "\n\t-> " + item.toString();
            }
        }
        System.out.println(text);
    }
   
}

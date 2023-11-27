
/** Required package class namespace */
package testing.classes;

 
/**
 * Steak.java - represents a steak
 *
 * @author Mr. Wachs
 * @since Nov 27, 2023, 10:28:16 a.m.
 */
public class Steak extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Steak() {
        super(1);                   // Call super-constructor, passing the group
        super.flavour = "Savory";   // Modifying our protected property
    }

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Grill on the BBQ");
    }

    /**
     * Determines if this 'steak' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;       // Access public property
    }

    /**
     * Smell the 'steak' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 5) super.eatable = false;
        else             super.eatable = true;
    }
    
}

/** Required package class namespace */
package testing.classes;

 
/**
 * Steak.java - represents a steak
 *
 * @author Mr. Wachs
 * @since 26-Apr-2023, 2:06:33 PM
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
     * Prepares Steak to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Grill it on the BBQ");
    }

    /**
     * Determines if this 'Steak' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;       // Access public property
    }

    /**
     * Smell the 'Steak' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 5) super.eatable = false;
        else            super.eatable = true;
    }
    
}
/** Required package class namespace */
package testing.classes;

 
/**
 * Steak.java - represents a steak
 *
 * @author Mr. Wachs
 * @since 5-May-2023, 10:14:22 AM
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
        System.out.println("Grill on the BBQ");
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

    @Override
    public void smell(int seconds) {
        if (seconds > 5) super.eatable = false;
        else             super.eatable = true;
    }
         
}
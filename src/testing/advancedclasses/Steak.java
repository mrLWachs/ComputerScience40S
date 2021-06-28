
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Steak.java - represents a steak
 *
 * @author Mr. Wachs
 * @since May 21, 2021, 11:35:55 a.m.
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
        System.out.println("Grill on BBQ");
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
        if (seconds > 5) super.eatable = true;
        else             super.eatable = false;
    }
     
    /**
     * How to eat this Steak object 
     * 
     * @return The output of how eating this 'Steak' item went
     */
    @Override
    public String eat() {
        return "Steak from " + super.eat();
    }
    
}

/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Apple.java - represents an apple. This class inherits from the abstract 
 * class all its properties and methods. However, the abstract methods are 
 * FORCED to be over-ridden in this class (now we move from the 'abstract' to
 * the 'concrete') and the methods MUST now be given a method body (now you
 * define HOW for this particular food object). Regular methods can still be
 * over-ridden as well.
 *
 * @author Mr. Wachs
 * @since May 21, 2021, 11:26:43 a.m.
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(0);                   // Call super-constructor, passing the group
        super.flavour = "Sweet";    // Modifying our protected property
    }

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Wash first");
    }

    /**
     * Determines if this 'apple' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;       // Access public property
    }

    /**
     * Smell the 'apple' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 3) super.eatable = true;
        else             super.eatable = false;
    }
     
    /**
     * How to eat this apple object 
     * 
     * @return The output of how eating this 'apple' item went
     */
    @Override
    public String eat() {
        return "Apple from " + super.eat();
    }
    
}
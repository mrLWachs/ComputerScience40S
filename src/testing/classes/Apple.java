/** Required package class namespace */
package testing.classes;
 
/**
 * Apple.java - represents an apple. This class inherits from the abstract 
 * class (Food) all its properties and methods.
 *
 * @author Mr. Wachs
 * @since Nov 24, 2025, 9:23:28 AM
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(0);              // Call super-constructor, passing the food group
        super.flavor = "Tart";               // Modifying our protected property
    }

    /**
     * Prepares the apple to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Wash it first");
    }

    /**
     * Determines if the apple item has spoiled or not
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    /**
     * Smell the apple item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 3) super.eatable = false;
        else             super.eatable = true;
    }
    
    /**
     * You still can over-ride methods from an abstract class that are not 
     * abstract methods (concrete methods) as an option. This method defines
     * how to eat an apple specifically
     * 
     * @return 
     */
    @Override
    public String eat() {
        return "Eating a Apple " + super.eat();
    }

}
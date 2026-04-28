/** Required package class namespace */ 
package testing.classes;
 
/**
 * Apple.java - represents an apple. This class inherits from the abstract 
 * class (Food) all its properties and methods. Because the class we are 
 * inheriting from is a abstract class with abstract methods - we are forced
 * to "implement" (write) those abstract methods into "real" (concrete) methods.
 * NetBeans allows us to use the "light bulb" to help do this
 *
 * @author Mr. Wachs
 * @since April 28, 2026
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(3);              // Call super-constructor, passing the food group
        // I can access "Food.GROUPS" because it is a static property that uses
        // proper JavaDoc commenting
        super.flavor = "apply";              // Modifying our protected property
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

}
/** Required package class namespace */
package testing.classes;
 
/**
 * CoffeCrisp.java - represents an Coffee Crisp bar.
 *
 * @author Mr. Wachs
 * @since Nov 4, 2024, 11:27:09 a.m.
 */
public class CoffeCrisp extends Food
{

    /**
     * Default constructor, set class properties
     */
    public CoffeCrisp() {
        super(5);
        super.flavour = "caffiney";
    }

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Unwrap, bite");
    }

    /**
     * Determines if this 'coffee crisp' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    /**
     * Smell the 'coffee crisp' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds < 5) super.eatable = false;
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
        return "Eating Coffee Crisp" + super.eat();
    }

}
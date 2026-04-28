/** Required package class namespace */
package testing.classes;
 
/**
 * Lasagna.java - represents lasagna.
 *
 * @author Mr. Wachs
 * @since Apr 28, 2026, 9:38:38 AM
 */
public class Lasagna extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Lasagna() {
        super(4);
        super.flavor = "spicey";
    }

    /**
     * Prepares the lasagna to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Heat in oven");
    }

    /**
     * Determines if the lasagna item has spoiled or not
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    /**
     * Smell the lasagna item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds < 5) super.eatable = false;
        else             super.eatable = true;
    }

}
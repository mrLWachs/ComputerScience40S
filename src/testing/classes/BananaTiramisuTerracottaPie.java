/** Required package class namespace */
package testing.classes;
 
/**
 * BananaTiramisuTerracottaPie.java - represents an Banana Tiramisu Terracotta 
 * Pie
 *
 * @author Mr. Wachs
 * @since Apr 28, 2026, 10:29:33 AM
 */
public class BananaTiramisuTerracottaPie extends Food
{

    /**
     * Default constructor, set class properties
     */
    public BananaTiramisuTerracottaPie() {
        super(4);
        super.flavor = "yuck";
    }

    /**
     * Prepares the Banana Tiramisu Terracotta Pie to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Create this unholy mixture of things");
    }

    /**
     * Determines if the Banana Tiramisu Terracotta Pie item has spoiled or not
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    /**
     * Smell the Banana Tiramisu Terracotta Pie item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds < 10) super.eatable = false;
        else              super.eatable = true;
    }
            
}
/** Required package class namespace */
package testing.classes;
 
/**
 * SweetieCookies.java - represents Grandma Sweetie's cookies
 *
 * @author Mr. Wachs
 * @since Nov 27, 2025, 9:25:44 AM
 */
public class SweetieCookie extends Food
{

    /**
     * Default constructor, set class properties
     */
    public SweetieCookie() {
        super(4);                   // Call super-constructor, passing the group
        super.flavor = "Delicious";          // Modifying our protected property
    }
    
    /**
     * Prepares Cookies to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Bake them in a oven");
    }

    /**
     * Determines if this 'cookie' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    /**
     * Smell the 'cookie' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 5) super.eatable = false;
        else             super.eatable = true;
    }

}
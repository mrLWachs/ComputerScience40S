
/** Required package class namespace */
package testing.classes;

 
/**
 * Apple.java - description
 *
 * @author Mr. Wachs
 * @since Nov 24, 2023, 10:36:44 a.m.
 */
public class Apple extends Food
{

    public Apple() {
        super(4);
        super.flavour = "Sweet";
    }


    @Override
    public void prepare() {
        System.out.println("Wash it first");
    }

    @Override
    public boolean hasSpoiled() {
        return super.eatable;
    }

    @Override
    public void smell(int seconds) {
        if (seconds > 3) super.eatable = false;
        else             super.eatable = true;
    }
     
}

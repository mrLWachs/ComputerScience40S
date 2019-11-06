

/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Box.java - description
 *
 * @author Mr. Wachs
 * @since Nov. 6, 2019, 11:38:39 a.m.
 */
public class Box <T>
{

    private T present;
    
    /**
     * Default constructor, set class properties
     */
    public Box(T present) {
        this.present = present;
    }
    
    public T open() {
        return present;
    }
    
    public void peek() {
        System.out.println(present.toString());
    }

}


/** required package class namespace */
package testing.advancedclasses;



/**
 * Box.java - 
 *
 * @author Mr. Wachs 
 * @since 22-Apr-2019 
 */
public class Box <T>
{

    private T item;
    
    public Box(T item) {
        this.item = item;
    }

    public T open() {
        return item;
    }
    
    public void peek() {
        System.out.println(item.toString());
    }    
    
}

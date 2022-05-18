/** Required package class namespace */
package testing.unit3;

 
/**
 * Apple.java - represents an apple. This class inherits from the abstract 
 * class all its properties and methods. However, the abstract methods are 
 * FORCED to be over-ridden in this class (now we move from the 'abstract' to
 * the 'concrete') and the methods MUST now be given a method body (now you
 * define HOW for this particular food object). Regular methods can still be
 * over-ridden as well.
 *
 * @author Mr. Wachs
 * @since 17-May-2022, 2:31:36 PM
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(3);                   // Call super-constructor, passing the group
    }
       
}
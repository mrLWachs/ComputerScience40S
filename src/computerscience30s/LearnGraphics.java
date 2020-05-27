/** required package class namespace */
package computerscience30s;

 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs
 * @since May 19, 2020 .
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Start learning graphics...");         
        Graphics1 graphics1 = new Graphics1();      // 1st object all coded 
        Graphics2 graphics2 = new Graphics2();      // 2nd object all coded
        Graphics3 graphics3 = new Graphics3();      // 3rd object using a hybrid
        System.out.println("Completed learning graphics!");
    }
    
}

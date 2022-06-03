/** Required package class namespace */
package computerscience30s;

 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs
 * @since 1-Jun-2022, 3:16:14 PM
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Start learning graphics...");
        // Create class objects for different examples        
        Graphics1 graphics1 = new Graphics1();
        Graphics2 graphics2 = new Graphics2();
        Graphics3 graphics3 = new Graphics3();        
        System.out.println("Learning graphics complete!");
    }
  
}
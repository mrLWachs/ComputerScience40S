
/** required package class namespace */
package computerscience30s;


/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs 
 * @since 23-May-2019 
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Learn graphics started");
        
        Graphics1 graphics1 = new Graphics1();  // 1st object all coded
        Graphics2 graphics2 = new Graphics2();  // 2nd object using designer 
        Graphics3 graphics3 = new Graphics3();  // 2nd object using designer 
        
        System.out.println("Learn graphics completed");
    }
    
}

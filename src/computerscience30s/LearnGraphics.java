/** Required package class namespace */
package computerscience30s;
 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author YOUR NAME
 * @since May 17, 2024, 8:50:16 a.m.
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Start learning Graphics...");
        
        // You can add a class to your project, by "right clicking" on the 
        // name of the package in the Project explorer window on the right in
        // NetBeans. Right click and select "New" then select:
        // "JFrame Form..." to add this to the project - NetBeans will switch
        // to a visual WYSIWYG editor...
        
        // Create class objects for different examples
        Graphics1 graphics1 = new Graphics1();
        Graphics2 graphics2 = new Graphics2();
        
        
        
        
        System.out.println("Completed learning Graphics!");
    }
    
}

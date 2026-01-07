
/** Required package class namespace */
package finalproject;
 
/** Required code library (API) imports */
import collections.LinkedList;


/**
 * FinalProject.java - this class was created to launch the first UI. If this
 * was a separate project (not part of of CS40S class example), then this class
 * would have the "main" method to begin execution
 * 
 * @author Mr. Wachs
 * @since January 2026
 */
public class FinalProject 
{

    /**
     * Default constructor, set class properties
     */
    public FinalProject() {
        // First instantiate the shared (static) global dynamic data structure
        // (the LinkedList)
        Globals.users = new LinkedList<User>();
        
        // Now launch and show the login UI to the user
        new LoginUI();
    }
      
}
/** Required package class namespace */
package finalproject;
 
import collections.LinkedList;

/**
 * FinalProject.java - description
 *
 * @author YOUR NAME
 * @since Jan 7, 2026, 8:46:50 AM
 */
public class FinalProject 
{

    /**
     * Default constructor, set class properties
     */
    public FinalProject() {
        Globals.users = new LinkedList<User>();
        new LoginUI();
    }
      
}
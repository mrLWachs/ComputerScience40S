
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since May 14, 2021, 11:41:36 a.m.
 */
public class Meeting 
{

    private final int MAX;  // Max number of people who can attend
    private int count;      // Keeps count of how many people are attending
    private Person[] members;   // Associated object array
    
    
    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX   = 1000;
        count = 0;
        // Need to instantiate our array
        members = new Person[MAX];
        // However, although the array has its size now set up, all the index 
        // values (spots in the array) are filled with "nulls" (no Person 
        // objects/instances are yet in the array) - so, we are going to fill 
        // the array with generic person objects
        for (Person member : members) {
            //"for every member in members"
            member = new Person();      // Using the default Person constructor
        }
    }
        
}
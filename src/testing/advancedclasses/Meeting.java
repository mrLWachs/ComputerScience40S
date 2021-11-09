/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Meeting.java - description
 *
 * @author Mr. Wachs
 * @since 9-Nov-2021, 11:44:16 AM
 */
public class Meeting 
{

    // The modifier words "private" encapsulates, "int" defines the data type
    // of this name (or "variable", "property", "field")
    private int count;
    
    // The modifier "final" turns the field into a constant
    private final int MAX;
    
    // Array (because of the square brackets) of class level objects, the
    // Meeting "has a" (associated with) Person (an array of them)
    private Person[] members;   
    
    
    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX   = 500;
        count = 0;
        // Need to "build" (construct, instantiate) our array
        members = new Person[MAX];
        // However, although the array has its size now set up, all the index 
        // values (spots in the array) are filled with "nulls" (no Person 
        // objects/instances are yet in the array)
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person the person object to attend
     */
    public void attend(Person person) {
        
    }
    
    /**
     * Hold the meeting for all members 
     */
    public void hold() {
        
    }
    
}
/** Required package class namespace */
package testing.classes;
 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since Oct 24, 2024, 11:54:17 a.m.
 */
public class Meeting 
{

    // The modifier words "private" encapsulates, "int" defines the data type
    // of this name (or "variable", "property", "field")
    private int count;      // How many people are attending
    
    // The modifier "final" turns the field into a constant
    private final int MAX;  // The maximum the meeting can hold
    
    // Array (because of the square brackets) of class level objects, the
    // Meeting "has a" (associated with) Person (an array of them)
    private Person[] members;   // All the people at the meeting
    
    
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
     * @param person a Person object to attend the meeting
     */
    public void attend(Person person) {
        
    }

}
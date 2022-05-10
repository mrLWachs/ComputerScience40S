/** Required package class namespace */
package testing.unit3;

 
/**
 * Meeting.java - description
 *
 * @author Mr. Wachs
 * @since 10-May-2022, 3:12:29 PM
 */
public class Meeting 
{

    // The modifier word "private" encapsulates the property
    // The modifier word "int" defines the data type
    // of the name (identifier name, or "variable", "property", "field")
    
    private int count;          // Tracks how many attend the meeting
    
    // The modifier "final" turns the field into a constant
    
    private final int MAX;
    
    // Array (because of the square brackets) of class level objects, this
    // meeting "has a" (associated with) Person class (an array of person 
    // objects)
    
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
     
    
}
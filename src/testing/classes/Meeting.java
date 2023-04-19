/** Required package class namespace */
package testing.classes;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since 13-Apr-2023, 2:06:23 PM
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
        
    }

    public void attend(Person person) {
        
    }

    public void hold() {
        
    }
      
}
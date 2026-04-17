/** Required package class namespace */
package testing.classes;
 
/**
 * Meeting.java - description
 *
 * @author YOUR NAME
 * @since Apr 16, 2026, 9:13:13 AM
 */
public class Meeting 
{    
   
    /**
     * Simple phrasing: A "list/collection" of all the people at the meeting
     * Complex phrasing: An array (because of square brackets) of class level
     * objects, the Meeting "has a" (associated with) Person (an array of them)
     */
    public Person[] members;
    
    /**
     * Simple phrasing: It represents how many people are attending the meeting
     * Complex phrasing: the modifier words "private" encapsulates, "int" 
     * defines the data type of this name (or "variable", "property", "field") 
     */
    private int count;
    
    /**
     * Simple phrasing: The maximum number of people that can be at the meeting
     * Complex phrasing: The modifier "final" turns the field into a constant
     */
    private final int MAX;
    
    
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
    
  
    public void attend(Person person) {
        
    }
    
}
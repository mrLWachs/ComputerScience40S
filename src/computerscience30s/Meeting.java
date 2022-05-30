/** Required package class namespace */
package computerscience30s;

 
/**
 * Meeting.java - represents a meeting. This class associates ("has a") with
 * objects of the Person class (through an array). It uses the concept of 
 * polymorphism to allow any Person objects or children (sub-classes) of the 
 * Person class to be added to the array.
 *
 * @author Mr. Wachs
 * @since 15-Dec-2021, 11:32:50 AM
 */
public class Meeting 
{
    
    private Person[] members;       // Associate array of Person objects
    private int index;              // Encapsulated counter for the array
    private final int MAX = 500;    // Constants maximum members
    
    
    /**
     * Default constructor, set the class properties to default values
     */
    public Meeting() {
        index = 0;                  // Initializing (set to default value)
        members = new Person[MAX];  // Initializing the array
    }

    /**
     * Adds a person to the members (the encapsulated array) of the meeting
     * 
     * @param person the Person object to add
     */
    public void attend(Person person) {
        members[index] = person;    // Assigning the parameter to the array
        index++;                    // Advance index to the next array location
        if (index >= MAX) index = 0;    // Error check the bounds of the array
    }
    
    /**
     * Has all of the active members of the meeting talk
     */
    public void hold() {
        System.out.println("Meeting begining with " + index + " members...");
        for (int i = 0; i < index; i++) {               // Loop through
            members[i].talk();                          // Have member talk
        }
    }
    
}
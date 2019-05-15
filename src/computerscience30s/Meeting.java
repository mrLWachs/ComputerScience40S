
/** required package class namespace */
package computerscience30s;


/**
 * Meeting.java - represents a meeting. This class associates ("has a") with
 * objects of the Person class (through an array). It uses the concept of 
 * polymorphism to allow any Person objects or children (sub-classes) of the 
 * Person class to be added to the array.
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Meeting 
{

    private       Person[] members;     // associate array of Person objects
    private       int      index;       // index counter to track with array
    
    
    /**
     * Default constructor sets class properties
     */
    public Meeting() {
        index = 0;                      // initialize counter
        members = new Person[500];      // initialize array
    }
    
    /**
     * Adds a person to the members of the meeting
     * 
     * @param person the Person object to add
     */
    public void attend(Person person) {
        members[index] = person;                    // assign to array
        index++;                                    // advance counter
        if (index >= members.length) index = 0;     // error check array bound                         
    }
    
    /**
     * Has all of the active members of the meeting talk
     */
    public void hold() {
        System.out.println("~~~Meeting beginning with " + index + " members");
        for (int i = 0; i < index; i++) {               // loop through
            members[i].talk();                          // have member talk
        }
        System.out.println("~~~Meeting adjurned!");
    }
    
}

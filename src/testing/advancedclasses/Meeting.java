
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
        MAX   = 100;
        count = 0;
        // Need to instantiate our array
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
        members[count] = person;            // Add to array slot
        count++;                            // Advanced counter to next index
        if (count > MAX) count = 0;         // Error check, reset back to slot 0
    }

    /**
     * Hold the meeting for all members 
     */
    public void hold() {
        // Variable to keep adding to for the output at the end
        String message = "Meeting is about to begin...";
        // Enhanced for loop through the array ("for every member in members")
        for (Person member : members) {
            // Only going to count members that 'exist' (that are not "null")
            if (member != null) {
                message += "\n";                // Line break
                // The "instanceof" operator takes an object (instance) on the 
                // left hand side (LHS) and the class type on the right hand
                // side (RHS) and is true if the object 'comes' from that class
                if (member instanceof MrWachs)    message += "\t MrWachs ->";
                if (member instanceof Teacher)    message += "\t Teacher ->";
                if (member instanceof Husky)      message += "\t Husky ->";
                if (member instanceof Piper)      message += "\t Piper ->";
                if (member instanceof HighSchool) message += "\t HighSchool ->";
                if (member instanceof Student)    message += "\t Student ->";
                if (member instanceof Doctor)     message += "\t Doctor ->";
                if (member instanceof Baker)      message += "\t MrWachs ->";
                if (member instanceof Person)     message += "\t Person ->";
                message += "\t ATTENDING!";                
            }
        }        
        // Get data from our static (shared) property of Student (variable)
        message += "\nWith " + Student.totalStudents + " students present!";
        System.out.println(message);        // Output the message
    }
    
}
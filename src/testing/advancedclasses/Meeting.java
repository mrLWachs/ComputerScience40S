
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:14:24 PM
 */
public class Meeting 
{

    private final int MAX;              // maximum number of students
    private int       count;            // keeps count of current student
    private Person[]  members;          // associated object array

    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX     = 100;
        count   = 0;
        members = new Person[MAX];
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person the person object to attend
     */
    public void attend(Person person) {
        members[count] = person;            // add to array slot
        count++;                            // advanced counter to next slot
        if (count > MAX) count = 0;         // reset back to slot 0
    }
    
    /**
     * Hold the meeting and have all members talk through an output
     */
    public void hold() {
        // access the "shared" static property (variable)
        System.out.println("Caution, there are " + 
                Student.total + " students here!");
        // enhanced for loop through all members
        for (Person member : members) {         // traverse all members
            if (member != null) {               // ignore empty array spots
                if (member.getAge() != 0) {     // ignore those with age 0
                    // used the accessor method (get)
                    if (member instanceof Teacher) {    // is a teacher
                        member.talk();                  // have them talk
                    }
                }
            }            
        }
    }
    
}

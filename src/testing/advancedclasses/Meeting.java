
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since Oct. 22, 2019, 11:42:49 a.m.
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
        for (Person member : members) { // enhanced for loop 
        // read as "for every member in members"
            member = new Person();
        }
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
        System.out.println("Caution, there  are " + Student.totalStudents
                         + " students at this meeting, watch your language!");
        for(Person member: members) {       // traverse all members
            member.talk();                  // have them talk
        }
    }

}

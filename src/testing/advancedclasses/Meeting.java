
/** required package class namespace */
package testing.advancedclasses;


/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs 
 * @since 31-Oct-2018 
 */
public class Meeting 
{

    private       Person[] members;
    private       int      count;
    private final int      MAX;
    
    /**
     * Default constructor for the class, sets class properties
     */
    public Meeting() {
        MAX     = 500;
        count   = 0;
        members = new Person[MAX];
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person the person to attend
     */
    public void attend(Person person) {
        members[count] = person;
        count++;
        if (count >= MAX) count = 0;
    }
    
    /**
     * Hold the meeting and have everyone talk
     */
    public void hold() {
        System.out.println("Meeting begins, but watch your language, because "
                + Student.totalStudents + " students are here!");        
        for (Person member : members) {
        // enhanced for loop "for each member in members"
            if (member != null) {           // spots that have a person in them
                member.talk();
                if (member instanceof MrWachs) {
                    System.out.println("Shhhh!, Wachs is talking");
                }
            }
        }        
        System.out.println("Meeting adjourned!");
    }
    
}

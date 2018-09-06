
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Meeting 
{
    
    private Person[] members;
    private int      count;    
    private final int MAX;

    /** 
     * Default constructor for the class 
     */
    public Meeting() {
        MAX = 100;
        count = 0;
        members = new Person[MAX];
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person the person object to attend
     */
    public void attend(Person person) {
        members[count] = person;
        count++;
        if (count > MAX) count = 0;
    }

    /**
     * Hold the meeting and have all members talk through an output
     */
    void hold() {
        System.out.println("Caution, watch your language, there are " +
                Student.totalStudents + " students in the room");
        for (Person member : members) { // enhanced for loop 
        // read as "for every member in members"
            if (member != null) {
                if (member instanceof MrWachs) {
                    System.out.println("Listen, Wachs is here!");
                }
                member.talk();
            }
        }        
    }
    
}

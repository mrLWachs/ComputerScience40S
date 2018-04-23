
/** required package class namespace */
package testing.advancedclasses;

/**
 * Meeting.java - 
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
     * 
     * @param person 
     */
    public void attend(Person person) {
        members[count] = person;
        count++;
        if (count > MAX) count = 0;
    }

    /**
     * 
     */
    void hold() {
        System.out.println("Caution, watch"
                + " your language, there"
                + " are " +
                Student.totalStudents +
                " students in the room");
        // enhanced for loop
        // read as "for every member in members"
        for (Person member : members) {
            if (member != null) {
                if (member instanceof MrWachs) {
                    System.out.println("Listen,"
                            + " Wachs is here!");
                }
                member.talk();
            }
        }        
    }
    
}

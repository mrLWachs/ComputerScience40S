
/** required package class namespace */
package testing.advancedclasses;



/**
 * Meeting.java - 
 *
 * @author Mr. Wachs 
 * @since 31-Oct-2018 
 */
public class Meeting 
{

    private Person[] members;
    private int count;
    private final int MAX;
    
    public Meeting() {
        MAX     = 500;
        count   = 0;
        members = new Person[MAX];
    }
    
    public void attend(Person person) {
        members[count] = person;
        count++;
        if (count >= MAX) count = 0;
    }
    
    public void hold() {
        System.out.println("Meeting begins, but"
                + " watch your language, "
                + "because " + Student.totalStudents +
                " students are here!");
        // enhanced for loop
        for (Person member : members) {
            // "for each member in members"
            if (member != null) {
                // spots that have a person in them
                member.talk();
                if (member instanceof MrWachs) {
                    System.out.println("Shhhh!, Wachs is talking");
                }
            }
        }        
        System.out.println("Meeting adjourned!");
    }
    
}

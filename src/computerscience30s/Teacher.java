
/** required package class namespace */
package computerscience30s;

/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs 
 * @since May 1, 2018 
 * @instructor Mr. Wachs
 */
public class Teacher extends Person
{

    private String room;                        // encapsulated property    
    public Student[] students;                  // an array of class objects
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     * @param age the age for this Teacher
     * @param isMale the gender for this Teacher
     * @param room the room for this Teacher 
     */
    public Teacher(String name, int age, boolean isMale, String room) {
        super(name,age,isMale,true);            // call to super constructor
        this.room = room;                       // set property to parameter
        students  = new Student[200];           // build up array
    }
    
    /**
     * Teaches all the students this teacher has an association with by making
     * them study
     */
    public void teach() {
        for (int i = 0; i < students.length; i++) { // traverse array
            if (students[i] != null) {              // array spot not a null
                students[i].study();                // make this spot study
            }
        }
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();                       // call to the super talk method
        System.out.println("\t - I teach " + students.length + " students:");
    }
    
}

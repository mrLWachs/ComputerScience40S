
/** required package class namespace */
package computerscience30s;

/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Teacher extends Person
{
    
    public  Student[] students;                 // an array of class objects
                                                // of an associate class
    private String    course;                   // encapsulated property
    
    private final int MAXIMUM = 100;            // constant maximum students
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     * @param course the course this teacher teaches
     */
    public Teacher(String name, String course) {
        super(name);                            // call to super constructor
        this.course = course;                   // set super private property
        students = new Student[MAXIMUM];        // build up array
    }
    
    /**
     * Teaches all the students this teacher has an association with by making
     * them study
     */
    public void teach() {
        for (int i = 0; i < MAXIMUM; i++) {         // traverse array
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
        System.out.println("\t I teach " + course);
        for (int i = 0; i < MAXIMUM; i++) {
            if (students[i] != null) {
                students[i].talk();
            }
        }
    }
    
}


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
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     * @param course the course this teacher teaches
     */
    public Teacher(String name, String course) {
        super(name);
        this.course = course;
    }
    
}


/** Required package class namespace */
package testing.unit3;

 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since 6-Apr-2022, 3:12:17 PM
 */
public class Teacher extends Person
{
    
    private int count;                     // How many students this teacher has
    private final int MAX;                 // Constant for the maximum students
    
    /**
     * An array of student objects, so the teacher has a association with these
     * objects (or a "has a" relationship) - it is "composed of" (composition)
     * student objects - reminder arrays are declared (created) with square
     * brackets "[ ]" and the style of naming arrays is to use a plural word
     */
    public Student[] students;
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        
    }
    
    
}
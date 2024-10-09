/** Required package class namespace */
package testing.classes;


/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since Oct 9, 2024
 */
public class Teacher extends Person
{
    
    private int count;                     // How many students this teacher has
    private final int MAX;                 // Constant for the maximum students
    
    /**
     * An array of student objects, so the teacher has a association with these
     * objects (or a "has a" relationship) - it is "composed of" (composition)
     * student objects
     */
    public Student[] students;
    
    
    public Teacher(String name) {
        
    }
    
    public void teach() {
        
    }
    
    
    public void add(Student student) {
        
    }

}
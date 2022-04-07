
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
        // Set (or construct) the properties of the parent class
        
        // Set the properties fo this class (not the parent class)
        count = 0;          // Set the "variable" (global) property
        MAX   = 200;        // Set the constant to a locked value
        // When declaring / creating (intitializing) an array you use the
        // keyword "new" and you use the square brackets "[ ]" and the size
        // of the array is stated inside those brackets when it is declared
        // This locks the array to that size (that is the maximum number of
        // elements in that array). The array is indexed so each "spot" (or
        // index) has an index number that starts at index 0 and goes up to
        // the length - 1 as the last index        
        students = new Student[MAX];        
    }
    
    public void add(Student student) {
        
    }
    
    public void teach() {
        
    }    
        
}
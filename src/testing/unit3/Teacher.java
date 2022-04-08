
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
        super(name, 52, "teacher");
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
    
    /**
     * Adds a new student to this teacher
     * 
     * @param student the student object to add
     */
    public void add(Student student) {
        // Add the passed student (parameter) into the array at the first 
        // available "slot" (or spot, index, element, location) - this is
        // done by using the square brackets "[ ]" and placing the index 
        // number in the brackets. Remember, arrays start the indexing at 
        // zero and the last index is always one less than the size 
        students[count] = student;
        count++;                // Move to the next index (for next time)  
        // We have to watch out for "out of bounds" errors
        if (count >= MAX) count = 0;
    }
    
    /**
     * Teaches all the students this teacher has an association with by making
     * them study (and makes all the students "smarter")
     */
    public void teach() {
        // To access an entire array we will travel (or "traverse", or "visit
        // every spot/index" in the array) through using a "for" loop, and
        // the ".length" feature of arrays...
        for (int i = 0; i < students.length; i++) {
            // Since this array is an array of "class" objects (not primitve
            // data types like "int") we have to watch out for "empty" spots
            // or "null" spots
            if (students[i] != null) {
                students[i].study();        // Make this spot study
            }            
        }        
    }    
        
}
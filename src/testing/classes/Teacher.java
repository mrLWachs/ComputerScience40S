
/** Required package class namespace */
package testing.classes;


/*
 * Teacher - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 * 
 * @author Mr. Wachs
 * @since 13-Oct-2022
*/
public class Teacher extends Person
{
    
    private int count;                     // How many students this teacher has
    private final int MAX;                  // Constant for the maximum students
    
    /**
     * An array of student objects, so the teacher has a association with these
     * objects (or a "has a" relationship) - it is "composed of" (composition)
     * student objects
     */
    public Student[] students;
    
    
    /**
     * Constructor, set class properties to the parameters
     * 
     * NOTE: if you write a class and do not write a default constructor,
     * then the code will "write one for you" - BUT if you write a 
     * constructor WITH parameter(s) then the code will NOT write you a
     * default constructor (but you could still write one)
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        super(name, 40, "teacher");         // Call to the super-constructor
        // We also have to initialize (give the properties starting values)
        // the specific properties ("global variables")
        MAX   = 100;                        // Set the constant to be locked
        count = 0;                          // Set a variable to start
        // When creating (declaring) arrays, you use the "new" keyword, you use
        // the square brackets "[ ]" and the size of the array is stated when
        // it is declared as arrays are locked into that maximum size
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
        count++;                    // Move to the next index (for next time)
        // We have to watch for "out of bounds" error (exception)
        if (count >= MAX) count = 0;
    }

    /**
     * Teaches all the students this teacher has an association with by making
     * them study (and makes all the students "smarter")
     */
    public void teach() {
        // To access an entire array we use a "for" loop, and the ".length"
        // feature of arrays
        for (int i = 0; i < students.length; i++) {     // Traverse array
            if (students[i] != null) {                  // Array spot not a null
                students[i].study();                    // Make this spot study
            }            
        }        
    }
    
}
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
    
    /**
     * Constructor, set class properties to the parameters
     * 
     * NOTE: if you write a class and do not write any constructor methods,
     * then the code will "write one for you" (like our Book class) - BUT if 
     * you write a constructor WITH parameter(s) then the code will NOT write 
     * you a default constructor (but you could still write one)
     * 
     * @param name the name for this Teacher
     */
    public Teacher(String name) {
        // First, construct a "Person" (the parent class)
        super(name,55,"teacher");
        // We also have to initialize (give the properties starting values)
        // the specific properties ("global variables")
        count = 0;                          // Set a variable to start
        MAX   = 100;                        // Set the constant to be locked
        // When creating (declaring) arrays, you use the "new" keyword, you use
        // the square brackets "[ ]" and the size of the array is stated when
        // it is declared as arrays are locked into that maximum size
        students = new Student[MAX];
        // Note: an array of primitive data types (e.g. int, double, char, 
        // boolean) will be initialized to simple values (like 0, false, etc.)
        // but arrays of class level data (like this array of "Student" objects)
        // are initialized to "null" values 
    }
    
    public void teach() {
        
    }
    
    
    public void add(Student student) {
        
    }

}
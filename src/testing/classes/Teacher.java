/** Required package class namespace */
package testing.classes;

 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since March 2023
 */
public class Teacher 
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
        
    }
         
    /**
     * Adds a new student to this teacher
     * 
     * @param student the student object to add
     */
    public void add(Student student) {
        
    }
    
    /**
     * Teaches all the students this teacher has an association with by making
     * them study (and makes all the students "smarter")
     */
    public void teach() {
        
    }
    
    
    
    
    
    
    
    
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Teacher clone() {
        return this;
    }
    
}
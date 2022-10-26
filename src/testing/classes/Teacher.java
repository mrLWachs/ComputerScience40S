
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
        
    }

}
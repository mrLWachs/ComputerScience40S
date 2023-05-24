
/** Required package class namespace */
package computerscience30s;

/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since May 24, 2023
 */
public class Teacher extends Person
{

    /**
     * A public property, an "association" or "composition" ("has a") 
     * relationship to the Student class using an array
     */
    public Student[] students;
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher Person
     */
    public Teacher(String name) {
        super(name);
        students = new Student[100];
        // We still need to give a size (or instantiate) to the array
    }
    
    /**
     * This method will (1) force every student to study, and (2) make every  
     * student talk, and (3) have the teacher talk 
     */
    public void teach() {
        
    }
    
}
/** Required package class namespace */
package computerscience30s;

 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since 15-Dec-2021, 11:32:35 AM
 */
public class Teacher extends Person
{

    // public property, association ("has a") relationship to the 
    // Student class, an array
    public Student[] students;
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher Person
     */
    public Teacher(String name) {
        super(name);
        students = new Student[100];
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tHere are my students...");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].talk();
            }
        }
    }
    
}
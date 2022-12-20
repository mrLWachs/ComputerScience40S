
/** Required package class namespace */
package computerscience30s;

 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since 20-Dec-2022, 11:20:11 AM
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
        System.out.println("Here are my students...");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                teach(students[i]);
                students[i].talk();
            }
        }
    }

    /**
     * A private (or "encapsulated" or "helper") method for this class - can 
     * only be called (invoked) within the class by other methods of this class
     * (not by any other classes). It makes a student study
     * 
     * @param student The Student object to make study
     */
    private void teach(Student student) {
        student.study();
    }    
    
}
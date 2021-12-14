/** Required package class namespace */
package computerscience30s;

 
/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since 13-Dec-2021, 11:28:54 AM
 */
public class Student extends Person
{

    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    
    // private (encapsulated) property (global variable) identified (named)
    // "studentNumber" that is of type "integer"
    private int studentNumber;
    
    private double average;
    
    
    public Student() {
        
    }    
    
    /**
     * Studying raises the student's average
     */
    public void study() {
        average += 1.25;
    }
    
    /**
     * Slacking off lowers the student's average
     */
    public void slackOff() {
        average -= 0.33;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }
    
}
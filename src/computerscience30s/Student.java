
package computerscience30s;


/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since December 2024
 */
public class Student extends Person
{
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    private Book book;
    
    // private (encapsulated) properties (global variables) identified (named)
    // "number" that is of type "integer"
    private int number;
    private double average;
    
    
    public Student() {
        
    }
    
    public void study() {
        
    }
    
    public void slackOff() {
        
    }
    
    public void cram() {
        
    }
    
}
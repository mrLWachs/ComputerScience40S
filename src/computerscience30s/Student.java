
/** Required package class namespace */
package computerscience30s;

/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since 16-Dec-2022
 */
public class Student extends Person
{
    
    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    // The Student class "associates" with the Book class or more simply put,
    // The Student "has a " book. This class relationship can be called
    // association (or "usage", composition)
    private Book book;
    
    // private (encapsulated) property (global variable) identified (named)
    // "number" that is of type "integer"
    private int number;
    
    private double average;
    
    /**
     * Constructor for the class, sets the class properties (including the
     * properties it inherited form the super or parent class)
     * 
     * @param name the name for this student person
     * @param gender the gender for this student person
     * @param number the student number for this student
     */
    public Student(String name, String gender, int number) {
        this.number = number;
        // Assigning the parameter (called "number") to the property (called
        // "number") using the keyword "this"
        super.name = name;
        // The keyword "super" refers to the super-class (or the "parent"
        // class) in this case "Person"
        super.gender = gender;
        // super.age = age; (age is encapsulated, we will ignore)
        average = 0;
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
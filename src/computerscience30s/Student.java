
/** Required package class namespace */
package computerscience30s;


/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since May 8, 2024
 */
public class Student extends Person 
{

    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    // private (encapsulated) property (global variable) identified (named)
    // "number" that is of type "integer"
    private int number;
    
    private double gpa;
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    private Book book;
    
    
    
    /**
     * Constructor for the class, sets the class properties (including the
     * properties it inherited form the super or parent class)
     * 
     * @param name the name for this student person
     * @param age the age for this student person
     * @param gender the gender for this student person
     * @param number the student number for this student
     */
    public Student(String name, int age, String gender, int number) {
        // The keyword "super" is a reference to the "super class" (in this
        // case is "Person) and you can use the keyword to change properties
        // (but not encapsulated/private ones) and call methods
        super.name   = name;
        super.gender = gender;
        super.birthday(age);
        // "this" is an explicit refernce to "this class"
        this.number = number;
        gpa = 0;
    }    
    
    /**
     * Studying raises the student's average
     */
    public void study() {
        gpa += 1.25;
    }
    
    /**
     * Slacking off lowers the student's average
     */
    public void slackOff() {
        gpa -= 0.33;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    @Override
    public void talk() {
        // Even with a class that inherits from another class, we 
        // can call the methods of the parent class
        super.talk();
        System.out.println("\tNumber: " + number);
        System.out.println("\tGPA:    " + gpa);        
    }
    
}

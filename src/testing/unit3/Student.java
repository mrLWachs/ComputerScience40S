
/** Required package class namespace */
package testing.unit3;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. The 
 * line below is called the "signature" line for this class. If we add the 
 * "modifier" word "extends" it causes inheritance and then the class it 
 * inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 *
 * @author Mr. Wachs
 * @since 22-Mar-2022, 3:26:17 PM
 */
public class Student extends Person
{
    
    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    
    // "number" is the name, "int" is the data type, "private" is a modifier
    // to make this property encapsulated - so this property or this 
    // global variable
    private int number;
    
    private double gpa;
    
    
    /**
     * Constructor for the class, sets the class properties (including the
     * properties it inherited form the super or parent class)
     */
    public Student() {
        
    }
    
    public void study() {
        
    }
    
    /**
     * Slacking off lowers the student's average
     */
    public void slackOff() {
        
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    public void talk() {
        System.out.println("I am the new Talk");
    }
        
}
/** Required package class namespace */
package computerscience30s;

 
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
 * @since 25-May-2022, 3:08:11 PM
 */
public class Student extends Person
{
    
    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)

    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" (or "composition") with the student class
     */
    private Book book;
    
    // "number" is the name, "int" is the data type, "private" is a modifier
    // to make this "property" encapsulated - so this property or this 
    // "global variable"
    
    public int number;    
    private double gpa;
    
    /**
     * If a constructor has NO parameters it is called the "default" 
     * constructor 
     * 
     * Default constructor method for the class, sets the class properties 
     * (including the properties it inherited form the super or parent class)
     */
    public Student() {
        super();            // invoking (calling) the "super-constructor"
        
        // Set the class properties (of this child/sub class of the Person 
        // class which is the super/parent class)
        number = 0;
        gpa    = 0.0;
        book   = null;
    }
    
    
    
}
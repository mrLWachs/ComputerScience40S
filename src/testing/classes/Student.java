/** Required package class namespace */
package testing.classes;


/*
 * Student - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. 
 * 
 * @author Mr. Wachs
 * @since Mar 12, 2026
*/
public class Student extends Person
{
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
     
    private int number;     // Class properties (and inherited other properties)  
    private double gpa;     // Encapsulated property
    
    
    /**
     * Default constructor, set class properties (including a call to the 
     * "super-constructor" from the parent class to set all of its properties 
     * as well)
     */
    public Student() {        
        // We can access (not encapsulated - so public) properties of our
        // super class (parent/base class) and give them default values as 
        // a default constructor should do
        // super.name   = "undefined";
        // super.gender = "undefined";
        // super.alive  = true;
        
        // But... this can also be accomplished by calling methods of the 
        // parent class, specifically the parent constructor methods called
        // the super constructor
        super();
        
        // Set the properties of "this" class to default values
        number = 1;
        gpa    = 0.0;
        
        // The "Book" class we associate with here is instantiated into a
        // book object
        book = new Book();
    }

}
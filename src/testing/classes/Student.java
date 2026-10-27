
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
 * @since Oct 26, 2026
*/
public class Student extends Person
{
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;

    /*
     * NOTE: If you do NOT write a default constructor within a class, The IDE 
     * (or "compiler") normally writes one for you when it compiles your code. 
     * If you do write a default constructor then the IDE no longer writes one. 
     * Also if you write a constructor with parameters then the ID also no 
     * longer writes a default constructor for you. 
     */
    
    public Student() {
        
    }

}

/** Required package class namespace */
package testing.classes;


/*
 * Student - represents a student, reminder that "extends" causes
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
 * @since 13-Oct-2022
*/
public class Student
{
    
    private int number;    
    private double gpa; // class properties (and inherited other properties)
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    

    /**
     * Default constructor, set class properties
     */
    public Student() {
        
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     */
    public Student(String name, int age, String gender) {
        
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        
    }

    /**
     * Slacking off lowers this student's average
     */
    public void slackOff() {
        
    }
    
    /**
     * Studying raises this student's average
     */
    public void study() {
        
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    public void talk() {
        
    }
    
    /**
     * This "secret" method is a private, encapsulated method. These types of 
     * methods are sometimes called "helper" or "utility" methods as they can
     * only be called by other methods inside this class
     */
    private void secret() {
        
    }
    
}
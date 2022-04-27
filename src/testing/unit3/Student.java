
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
     * Default constructor method for the class, sets the class properties 
     * (including the properties it inherited form the super or parent class)
     */
    public Student() {
        super();        // invoking (calling) the "super-constructor"
        // Set the class properties (of this child/sub class)
        number = 0;
        gpa    = 0.0;
        book   = null;
    }

    /**
     * Overloaded constructor method (means two or more methods with the same 
     * method name, but different parameters)
     * 
     * @param name for this student
     * @param age for this student
     * @param gender for this student 
     */
    public Student(String name, int age, String gender) {
        super(name, age, gender); // call the second super-constructor
        number = 1;
        gpa    = 0.0;
        book   = null;
    }
    
    /**
     * Method just for this class, raises the average 
     */
    public void study() {
        gpa *= 1.10;                            // Increase average by 10%
    }
    
    /**
     * Method just for this class, lowers the student's average
     */
    public void slackOff() {
        gpa = gpa - 0.05;                       // Decrease average by 5%
        
        // Protected methods CAN be called by this class as this class IS 
        // related to the class with the proected method
        super.secret();
    }
    
    /**
     * Method just for this class, is intense repetitive studying
     */
    public void cram() {
        for (int i = 0; i < 5; i++) {               // Study 5 times as hard
            study();
        }
    }
    
    /**
     * This talk method overrides the same talk method of the parent class and 
     * outputs additional information to the screen - it also calls the same 
     * over-ridden method (talk) from the super class using the "super" keyword.  
     * With override methods, the light bulb appears for the comments as you  
     * can (but is optional) add the "annotation" (which are like comments) 
     * called the "@override" annotation which also adds a "circle" like target
     * in NetBeans to the super class method
     */
    @Override
    public void talk() {
        super.talk();                      // Invoking super class method
        System.out.println("\t student number  = " + number);
        System.out.println("\t student average = " + gpa);  
    }
        
}
/** Required package class namespace */
package testing.classes;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. 
 *
 * @author Mr. Wachs
 * @since 13-Mar-2023, 10:25:29 AM
 */
public class Student extends Person
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
        super();
        // The keyword "super" referes to the "super-class" or "parent" class
        // in this case that is the Person class - by adding the round brackets
        // we make a call to the super constructor
        gpa    = 0;
        number = 1;
        book   = new Book();
    }
    
    /**
     * Talk is an "over-ride" (not overload) method means it when called will 
     * run its code and not the code from the method it inherited. The "comment"
     * the light bulb suggested "@Override" is a signal to NetBeans that 
     * a method over-ride is taking place - this is also seen in NetBeans with 
     * a target-like circle
     */
    @Override
    public void talk() {
        System.out.println("I am a student");
    }
    
    
    
    
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        return this;
    }
    
}

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
 * @since Oct 19, 2023, 11:29:13 a.m.
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
        super();
        // The keyword "super" refers to the "super-class" or "parent" class
        // in this case that is the Person class - by adding the round brackets
        // we make a call to the super constructor        
        gpa    = 0.0;
        number = 1;
        book   = new Book();
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     */
    public Student(String name, int age, String gender) {
        // Use the super constructor in the parent class (Person) to modify
        // (change) the encapsulated (private) properties on that super class
        // this sets all the properties of the parent (Person) object that 
        // the child (Student) cannot set
        super(name, age, gender);      
        // Now set the properties of "this" (the Student) class...
        gpa    = 0.0;
        number = 1;
        book   = new Book();
    }
        
    public void cram() {
        
    }
    
    public void slackOff() {
        
    }
    
    public void study() {
        
    }
    
    public void talk() {
        
    }
    
    private void secret() {
        
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

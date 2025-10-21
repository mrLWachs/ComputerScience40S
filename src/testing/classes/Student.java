
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
 * @since Oct 15, 2025
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
        number = 1;
        gpa    = 0.0;
        // The "Book" class we associate with here is instantiated into a
        // book object
        book = new Book();
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     * @param number the student number for this student
     */
    public Student(String name, int age, String gender, int number) {
        // Use the super constructor in the parent class (Person) to modify
        // (change) the encapsulated (private) properties on that super class
        // this sets all the properties of the parent (Person) object that 
        // the child (Student) cannot set
        super(name, age, gender);
        // Now set the properties of "this" (the Student) class...
        this.number = number;
        gpa         = 0.0;
        book        = new Book();
    }
    
    /**
     * Studying raises this student's average
     */
    public void study() {
        gpa += 0.3;
    }
    
    /**
     * Slacking off lowers this student's average
     */
    public void slackOff() {
        gpa -= 0.3;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
        secret();   // We call a private, encapsulated, helper, utility method
    }
    
    /**
     * This "secret" method is a private, encapsulated method. These types of 
     * methods are sometimes called "helper" or "utility" methods as they can
     * only be called by other methods inside this class
     */
    private void secret() {
        gpa *= 1.0001;
    }

}

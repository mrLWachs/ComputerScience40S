  
/** Required package class namespace */
package testing.advancedclasses;

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
 * @since 21-Oct-2021 
*/
public class Student extends Person
{
    
    private int studentNumber;
    private double average; // class properties (and inherited other properties)
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    
    /**
     * "static" property: the modifier word "static" simply means "shared" 
     * meaning that ALL objects of this class share this ONE instance of this
     * variable
     */
    public static int total;
        
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     */
    public Student(String name, int age) {
        super(name,age,"student");              // Call the "super constructor"
        studentNumber = 1;                      // Set properties to "defaults"
        average       = 1.0;
        // Mutate (change) the static (shared) property (global variable)
        total++;
    }
    
    /**
     * Method just for this class, raises the average
     */
    public void study() {
        average *= 1.10;                            // Increase avarage by 10%
    }
    
    /**
     * Slacking off lowers the average
     */
    public void slackOff() {
        average = average - 0.05;                   // Decrease avarage by 5%
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 5; i++) {               // Study 5 times as hard
            study();
        }
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();                      // Invoking super class method
        System.out.println("\t student number  = " + studentNumber);
        System.out.println("\t student average = " + average);        
    }
    
    /**
     * String representation of this object
     * 
     * @return the object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString() + " average is " + average;
    }
        
    /**
     * Deep comparison, determines if two objects are"equal" in this context
     * 
     * @param object the object to compare to
     * @return the object are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    /**
     * Deep clone, creates a duplicate (all properties?) object using new memory
     * 
     * @return a "clone" of the object using new memory
     */
    public Student clone() {
        return (Student)super.clone();
    }
    
}

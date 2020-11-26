
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since Mar. 3, 2020, 10:07:24 a.m.
 */
public class Student extends Person
{

    private int number;                         // encapsulated property
    
    
    /**
     * Default class constructor sets class properties, when a constructor has 
     * a parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     */
    public Student() {
        super();                                // call to super constructor
        this.number = 0;                        // set property
    }
 
    /**
     * Outputs data on this student to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("Student: " + number);
    }
    
}

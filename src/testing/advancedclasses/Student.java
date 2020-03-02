
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since Mar. 2, 2020, 1:59:59 p.m.
 */
public class Student extends Person
{

    private int studentNumber;                      // encapsulated property
    
    
    /**
     * Class constructor sets class properties, when a constructor has a 
     * parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     * 
     * @param studentNumber the student number of this student
     */
    public Student(int studentNumber) {
        super();                                // call to super constructor
        this.studentNumber = studentNumber;     // set property from parameter     
    }
    
    public void talk() {
        super.talk();                           // invoke super class method
        System.out.println("\tStudent number = " + studentNumber);                 
    }
   
}

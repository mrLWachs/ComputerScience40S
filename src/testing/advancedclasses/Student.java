
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
        super.isMale = true;
    }
    
    /**
     * Class constructor sets class properties to parameter values
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param studentNumber the student number for this student
     */
    public Student(String name, int age, boolean isMale, int studentNumber) {
        super(name, age, isMale);
        this.studentNumber = studentNumber;
    }
      
    /**
     * Outputs data on this student to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tStudent number: " + studentNumber);
    }
    
}

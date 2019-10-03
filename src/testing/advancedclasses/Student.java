
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since 09-Mar-2019
 * @instructor Mr. Wachs
 */
public class Student extends Person
{
    
    private int studentNumber;
   
    /**
     * Class constructor sets class properties, when a constructor has a 
     * parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     * 
     * @param studentNumber the student number of this student
     */
    public Student(int studentNumber) {
        super();
        this.studentNumber = studentNumber;   
    }
    
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("\t#" + studentNumber);
    }
    

}

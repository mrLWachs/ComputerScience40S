/** required package class namespace */
package testing.advancedclasses;


/**
 * Student.java - represents a student
 *
 * @author Mr. Wachs 
 * @since 5-Oct-2018 
 */
public class Student extends Person
{

    private int studentNumber;
    
    /**
     * Class constructor sets class properties
     * 
     * @param studentNumber the student number of this high school student
     */
    public Student(int studentNumber) {
        super();
        this.isMale        = true;              // modify protected member
        this.studentNumber = studentNumber;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tStudent #" + studentNumber);
    }
        
}
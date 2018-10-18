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
        System.out.println(this.toString());
    }
              
    /**
     * Accessor method to "see" the student number
     * 
     * @return the private property
     */
    public int getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tStudent #" + 
                studentNumber;
    }
    
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Student student = (Student)object;
        if (!super.equals(object)) return false;
        if (student.getStudentNumber() != this.getStudentNumber()) 
            return false;
        return true;
    }    
            
}
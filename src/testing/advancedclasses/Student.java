
/** required package class namespace */
package testing.advancedclasses;

/**
 * Student.java - represents a student
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Student extends Person
{
    
    private int studentNumber;
    
    /**
     * Static property that counts the total number of student objects
     */
    public static int totalStudents;
    
    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this high school student
     * @param age the age of this high school student
     * @param studentNumber the student number of this high school student
     * @param isMale the gender of this high school student
     */
    public Student(String name, int age, int studentNumber, boolean isMale) {
        super(name,age);
        this.studentNumber = studentNumber;        
        super.isMale       = isMale;
        totalStudents++;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tStudent #: " + studentNumber);        
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
        if (super.equals(student) == false) {
            return false;
        }
        if (this.studentNumber != student.studentNumber) {
            return false;
        }
        return true;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString() + " student number " + studentNumber;
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        Student student = new Student(
                this.name,
                this.getAge(),
                this.studentNumber,
                this.isMale
        );
        return student;
    }
      
}

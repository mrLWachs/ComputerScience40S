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
    public static int totalStudents;
    
    /**
     * Class constructor sets class properties
     * 
     * @param studentNumber the student number of this high school student
     */
    public Student(int studentNumber) {
        super();
        this.isMale        = true;              // modify protected member
        this.studentNumber = studentNumber;
        totalStudents++;
    }
    
    /**
     * Class constructor, sets class properties
     * 
     * @param name the name of this student
     * @param age the age of this student
     * @param isMale the gender of this student
     * @param studentNumber the student number of this student
     */
    public Student(String name, int age, boolean isMale, int studentNumber) {
        super(name,age,isMale);
        this.studentNumber = studentNumber;
        totalStudents++;
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
        return "Student " + super.toString() + 
                " with Student #" + studentNumber;
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
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        return new Student(
                super.getName(), 
                super.age, 
                super.isMale, 
                studentNumber);
    }
    
}
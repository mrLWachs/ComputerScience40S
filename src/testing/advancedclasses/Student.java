
/** required package class namespace */
package testing.advancedclasses;

/**
 * Student.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Student extends Person
{
    
    private int studentNumber;
    /**
     * 
     */
    public static int totalStudents;
    
    /**
     * 
     * @param name
     * @param age
     * @param studentNumber
     * @param isMale 
     */
    public Student(String name,
                   int age,
                   int studentNumber,
                   boolean isMale) {
        super(name,age);
        this.studentNumber = studentNumber;        
        super.isMale = isMale;
        totalStudents++;
    }
    
    /**
     * 
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tStudent #: " + 
                studentNumber);        
    }
    
    /**
     * 
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        Student student = (Student)object;        
        if (super.equals(student) == false) {
            return false;
        }
        if (this.studentNumber != 
                student.studentNumber) {
            return false;
        }
        return true;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + 
                " student number " + 
                studentNumber;
    }
    
    /**
     * 
     * @return 
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

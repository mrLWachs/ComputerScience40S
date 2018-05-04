
/** required package class namespace */
package computerscience30s;

/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since May 1, 2018 
 * @instructor Mr. Wachs
 */
public class Student extends Person
{

    private int grade;                          // encapsulated property
    private double gpa;                         // encapsulated property
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param grade the grade for this student 
     */
    public Student(String name, int age, boolean isMale, int grade) {
        super(name,age,isMale,true);
        this.grade = grade;
        gpa        = 0.0;
    }
      
    /**
     * Studying raises the GPA
     */
    public void study() {
        gpa = gpa + (Math.PI * 0.01);
    }
    
    /**
     * Slacking off lowers the GPA
     */
    public void slackOff() {
        gpa = gpa - (Math.PI * 0.01) / 2;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }   
    
    /**
     * Talking overrides the same talk metho of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("....Grade is " +
                grade + " and GPA is " + 
                gpa);
    }
    
}

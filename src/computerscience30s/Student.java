
/** required package class namespace */
package computerscience30s;


/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since 27-Nov-2018 
 */
public class Student extends Person
{
    
    private int studentNumber;
    private int grade;
    private double gpa;   
    
    
    public Student(
            String name,
            int age,
            boolean isMale,
            int grade,
            int studentNumber) {
        super(name, age, isMale);
        gpa = 0;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }
   
}

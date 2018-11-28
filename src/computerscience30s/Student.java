
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
    
    private int studentNumber;                      // encapsulated property
    private int grade;                              // encapsulated property
    private double gpa;                             // encapsulated property
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param grade the grade for this student 
     * @param studentNumber the student number for this student
     */
    public Student(String name, int age, boolean isMale, int grade,
                   int studentNumber) {
        super(name, age, isMale);               // call to super constructor
        gpa = 0;                                // set internal properties
        this.grade = grade;
        this.studentNumber = studentNumber;
    }
   
    
}


/** required package class namespace */
package computerscience30s;

 
/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since 5-May-2020, 1:25:25 PM
 */
public class Student extends Person
{

    private int    number;
    private double gpa;
    private int    stress;
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param number the student number for this student
     */
    public Student(String name, int age, boolean isMale, int number) {
        super.name = name;
        super.isMale = isMale;
        super.birthday(age);
        this.number = number;
    }
    
}

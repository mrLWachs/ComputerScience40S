  
/** required package class namespace */
package computerscience30s;

/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since 9-May-2019 
 */
public class Student extends Person
{
    
    private int number;
    private double gpa;
    private int stress;
    
    
    
    public Student(String name, 
                   int age,
                   boolean isMale, 
                   int number) {
        super.isMale = isMale;
        super.name = name;
        super.birthday(age);
        this.number = number;
    }
    
    
    
    
    
    
    public void study() {
        gpa = gpa + 0.1;
        stress += 10;
    }
    
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }
    
    /**
     * slacking off reduces my gpa but also
     * relieves my stress a little
     */
    public void slackOff() {
        stress -= 15;
        gpa = gpa - youtube(60);
    }
    
    private double youtube(int time) {
        double amount = 0;
        for (int i = 0; i < time; i++) {
            amount = amount + 0.01;
        }
        return amount;
    }
        
}

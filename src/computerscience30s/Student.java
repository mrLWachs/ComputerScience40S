  
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

    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     */
    public Student(String name, int age, boolean isMale) {
        super(name,age,isMale);
        number = (int)(99 * Math.random() + 1);
    }
        
    /**
     * Studying raises the GPA and increases stress
     */
    public void study() {
        gpa = gpa + 0.0001;
        stress += 20;
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
     * Slacking off lowers the GPA and stress
     */
    public void slackOff() {
        stress -= 30;
        gpa = gpa - youtube(60);
    }
    
    /**
     * Watching YouTube lowers GPA 
     * 
     * @param time how many minutes you watched
     * @return the amount to reduce the GPA
     */
    private double youtube(int time) {
        double amount = 0;
        for (int i = 0; i < time; i++) {
            amount = amount + 2.2;
        }
        return amount;
    }
     
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\t Number: " + number);
        System.out.println("\t GPA:    " + gpa);
        System.out.println("\t Stress: " + stress);                
    }
    
}

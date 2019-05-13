
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
    
    private double gpa;                                 // encapsulated 
    private int number;                                 // properties
    private String[] courses;
    private int intelligence;
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param courses the courses this student is taking
     */
    public Student(String name, int age, boolean isMale, String[] courses) {        
        super(name,age,isMale);
        this.courses = courses;
        gpa          = 3.2;
        intelligence = 0;
        number = (int)((999999999-100000000+1) * Math.random() + 100000000);
    }
    
    /**
     * Studying raises the GPA
     */
    public void study(int hours) {
        for (int i = 0; i < hours; i++) {
            gpa = gpa + 0.01;
        }
    }
    
    /**
     * Slacking off lowers the GPA
     */
    public void slackOff() {
        for (int i = 0; i < 7; i++) {
            tetris();
        }
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study(2);
        }
    }
    
    /**
     * The game of Tetris lowers GPA but raises intelligence
     */
    private void tetris() {
        gpa = gpa - 0.00001;
        intelligence++;
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tNumber:  " + number);
        System.out.println("\tGPA:     " + gpa);
        System.out.println("\tIQ:      " + intelligence);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("\t\t " + courses[i]);
        }
    }
   
}

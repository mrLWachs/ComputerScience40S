  
/** Required package class namespace */
package testing.advancedclasses;

/** 
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. The 
 * line below is called the "signature" line for this class. If we add the 
 * "modifier" word "extends" it causes inheritance and then the class it 
 * inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 *
 * @author Mr. Wachs 
 * @since 21-Oct-2021 
*/
public class Student extends Person
{
    
    private int studentNumber;
    private double average; // class properties (and inherited other properties)
    
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     */
    public Student(String name, int age) {
        super(name,age,"student");
    }
    
    /**
     * Method just for this class, raises the average
     */
    public void study() {
        average *= 1.10;
    }
    
    /**
     * Slacking off lowers the average
     */
    public void slackOff() {
        average = average - 0.05;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 5; i++) {
            study();
        }
    }
    
}

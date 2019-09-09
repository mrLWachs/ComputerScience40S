
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since 09-Mar-2019
 * @instructor Mr. Wachs
 */
public class Student extends Person {

    private int studentNumber;                      // encapsulated property
    
    public static int totalStudents;                // static variable

    /**
     * Class constructor sets class properties, when a constructor has a 
     * parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     * 
     * @param studentNumber the student number of this student
     */
    public Student(int studentNumber) {
        super();                                // call to super constructor
        super.isMale = true;                    // modify protected property
        this.studentNumber = studentNumber;     // set property from parameter
    }
    
    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this student
     * @param age the age of this student
     * @param isMale the gender of this student
     * @param studentNumber the student number of this student
     */
    public Student(String name, int age, boolean isMale,
                   int studentNumber) {
        super();                                // call to super constructor
        super.setName(name);                    // modify protected property
        super.age = age;                      
        super.setMale(isMale);                  // modify protected property
        this.studentNumber = studentNumber;     // set property from parameter
        totalStudents++;                        // modify static variable
    }

    /**
     * Outputs data on this student to the screen
     */
    @Override
    public void talk() {
        System.out.println(this.toString());
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) { 
        Student that = (Student)object;   
        if (!super.equals(that))                      return false;
        if (this.studentNumber != that.studentNumber) return false;
        return true;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString() + 
                " with student number: " + studentNumber;
    }
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        Student that = new Student(studentNumber);
        that.setName(this.getName());
        that.age    = this.age;
        that.isMale = this.isMale;
        return that;
    }
    
}

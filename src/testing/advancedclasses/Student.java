
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class
 *
 * @author Mr. Wachs
 * @since Mar. 3, 2020, 10:07:24 a.m.
 */
public class Student extends Person
{

    private int number;                         // encapsulated property
    
    /**
     * Static variable (or property, or global variable), the word "static" 
     * means "shared" - this counts the total number of student objects
     */
    public static int total;
    

    /**
     * Default class constructor sets class properties, when a constructor has 
     * a parameter, it is no longer a default constructor. If you have no 
     * default, usually one is written for you, EXCEPT if you write a 
     * non-default constructor, it will not!
     */
    public Student() {
        super();                                // call to super constructor
        this.number = 0;                        // set property
        total++;
    }
    
    /**
     * Class constructor sets class properties to parameter values
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param number the student number for this student
     */
    public Student(String name, int age, boolean isMale, int number) {
        super(name, age, isMale);
        this.number = number;
        total++;
    }
    

    /**
     * Outputs data on this student to the screen
     */
    @Override
    public void talk() {
        System.out.println(this.toString());
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student: " + super.toString() + "," + number;
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
        if (this.number != that.number) return false;
        return super.equals(that);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        Student that = new Student(
                this.name,
                this.getAge(),
                this.isMale,
                this.number
        );                          // construct student and copy properties
        return that;                // return that new memory
    }
    
}

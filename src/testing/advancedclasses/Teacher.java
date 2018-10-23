
/** required package class namespace */
package testing.advancedclasses;


/**
 * Teacher.java - represents a teacher
 *
 * @author Mr. Wachs 
 * @since 22-Oct-2018 
 */
public class Teacher extends Person
{
    
    private int count;                  // count of the current studetn to add
    private final int MAX_STUDENTS;     // the maximum number of students
    public Student[] students;          // (composition) "has a" relationship
    

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this teacher
     * @param isMale the gender of this teacher
     */
    public Teacher(String name, boolean isMale) {
        super(name,35,isMale);
        MAX_STUDENTS = 150;
        count        = 0;
        students     = new Student[MAX_STUDENTS];
    }

    /**
     * Adds a student to this teacher's collection
     * 
     * @param student the student to add
     */
    public void add(Student student) {
        students[count] = student;
        count++;
        if (count >= MAX_STUDENTS) count = 0;
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Teacher clone() {
        return this;
    }

}
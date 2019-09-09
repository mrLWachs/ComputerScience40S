
/** required package class namespace */
package testing.advancedclasses;

/**
 * HighSchoolStudent.java - represents a high school student
 *
 * @author Mr. Wachs 
 * @since 16-Apr-2019 
 */
public class HighSchoolStudent extends Student
{
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name of this High School student
     * @param age the age of this High School student
     * @param isMale the gender of this High School student
     * @param studentNumber the student number of this High School student
     */
    public HighSchoolStudent(String name, int age, boolean isMale,
                   int studentNumber) {
        super(name, age, isMale, studentNumber);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "High School " + super.toString();
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
    public HighSchoolStudent clone() {
        return this;
    }

}

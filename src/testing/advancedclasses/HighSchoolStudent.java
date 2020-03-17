/** required package class namespace */
package testing.advancedclasses;

 
/**
 * HighSchoolStudent.java - represents a husky student person
 *
 * @author Mr. Wachs
 * @since Mar. 16, 2020, 2:09:51 p.m.
 */
public class HighSchoolStudent extends Student
{

    /**
     * Class constructor sets class properties
     * 
     * @param studentNumber the student number of this student
     */
    public HighSchoolStudent(int studentNumber) {
        super(studentNumber);
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchoolStudent: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public HighSchoolStudent clone() {
        return this;
    }
    
}

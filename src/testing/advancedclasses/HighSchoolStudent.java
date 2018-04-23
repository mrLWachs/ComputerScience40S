
/** required package class namespace */
package testing.advancedclasses;

/**
 * HighSchoolStudent.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class HighSchoolStudent extends Student
{

    /**
     * 
     * @param name
     * @param age
     * @param studentNumber
     * @param isMale 
     */
    public HighSchoolStudent(String name, 
                             int age, 
                             int studentNumber, 
                             boolean isMale) {
        super(name, age, studentNumber, isMale);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "High School " + super.toString();
    }

}

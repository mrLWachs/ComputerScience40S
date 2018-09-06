
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * HighSchoolStudent.java - represents a high school student 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class HighSchoolStudent extends Student
{

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this high school student
     * @param age the age of this high school student
     * @param studentNumber the student number of this high school student
     * @param isMale the gender of this high school student
     */
    public HighSchoolStudent(String name, int age, int studentNumber, 
                             boolean isMale) {
        super(name, age, studentNumber, isMale);
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

}

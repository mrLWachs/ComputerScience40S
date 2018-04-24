
/** required package class namespace */
package testing.advancedclasses;

/**
 * ComputerScienceTeacher.java - represents a Computer Science teacher
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class ComputerScienceTeacher extends Teacher
{

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this Computer Science teacher
     * @param age the age of this Computer Science teacher
     * @param isMale the gender of this Computer Science teacher
     */
    public ComputerScienceTeacher(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "CS teach " + super.toString();
    }
    
}

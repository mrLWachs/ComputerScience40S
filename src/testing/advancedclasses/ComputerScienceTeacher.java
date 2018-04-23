
/** required package class namespace */
package testing.advancedclasses;

/**
 * ComputerScienceTeacher.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class ComputerScienceTeacher extends Teacher
{

    /**
     * 
     * @param name
     * @param age
     * @param isMale 
     */
    public ComputerScienceTeacher(String name, 
                                  int age, 
                                  boolean isMale) {
        super(name, age, isMale);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "CS teach " + super.toString();
    }
    
}

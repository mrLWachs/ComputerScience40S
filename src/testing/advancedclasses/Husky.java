
/** required package class namespace */
package testing.advancedclasses;

/**
 * Husky.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Husky extends HighSchoolStudent
{

    /**
     * 
     * @param name
     * @param age
     * @param studentNumber
     * @param isMale 
     */
    public Husky(String name, 
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
        return "Husky " + super.toString();
    }
    
}

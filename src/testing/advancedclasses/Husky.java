
/** required package class namespace */
package testing.advancedclasses;

/**
 * Husky.java - represents a husky
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Husky extends HighSchoolStudent
{

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this husky 
     * @param age the age of this husky 
     * @param studentNumber the student number of this husky
     * @param isMale the gender of this husky
     */
    public Husky(String name, int age, int studentNumber, boolean isMale) {
        super(name, age, studentNumber, isMale);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Husky " + super.toString();
    }
    
}

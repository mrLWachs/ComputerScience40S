
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * MrWachs.java - represents a Mr. Wachs
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class MrWachs extends ComputerScienceTeacher
{

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this MrWachs 
     * @param age the age of this MrWachs 
     * @param isMale the gender of this MrWachs
     */
    public MrWachs(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Wachs " + super.toString();
    }
   
}

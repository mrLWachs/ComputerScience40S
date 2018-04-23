
/** required package class namespace */
package testing.advancedclasses;

/**
 * MrWachs.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class MrWachs extends ComputerScienceTeacher
{

    /**
     * 
     * @param name
     * @param age
     * @param isMale 
     */
    public MrWachs(String name, 
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
        return "Wachs " + super.toString();
    }
   
}

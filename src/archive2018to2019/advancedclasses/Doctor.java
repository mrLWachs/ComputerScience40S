
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Doctor.java - represents a doctor
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Doctor extends Person
{

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this doctor
     * @param age the age of this doctor
     */
    public Doctor(String name,
                  int age) {
        super(name,age);
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Dr. " + super.toString();
    }
    
}

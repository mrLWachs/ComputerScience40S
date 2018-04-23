
/** required package class namespace */
package testing.advancedclasses;

/**
 * Doctor.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Doctor extends Person
{

    /**
     * 
     * @param name
     * @param age 
     */
    public Doctor(String name,
                  int age) {
        super(name,age);
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return "Dr. " + super.toString();
    }
    
}

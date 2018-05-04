
/** required package class namespace */
package computerscience30s;

/**
 * Husky.java - represents a Husky. This class uses inheritance to inherit
 * the properties and methods from the Students class, which was already 
 * inheriting (extending) from the Person class. Therefore, this class 
 * inherits from both (a double inheritance).
 *
 * @author Mr. Wachs 
 * @since May 1, 2018 
 * @instructor Mr. Wachs
 */
public class Husky extends Student
{

    private int pride;                          // encapsulated property
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Husky
     * @param age the age for this Husky
     * @param isMale the gender for this Husky
     * @param grade the grade for this Husky 
     */
    public Husky(String name, int age, boolean isMale, int grade) {
        super(name, age, isMale, grade);        // call to super constructor
        pride = 5;                              // set internal properties
    }
    
    /**
     * Raises Husky pride
     */
    public void pepRally() {
        pride += 2;
    }
    
    /**
     * Lowers Husky pride
     */
    public void defeat() {
        pride -= 1;
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();       // call to super talk(), it calls super talk() also
        System.out.println("\t - My Husky pride is " + pride);
    }
    
}

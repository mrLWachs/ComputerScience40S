
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Food.java - abstract class representing the concept of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. Once a class has been 
 * made abstract then you can add abstract methods to the class (regular 
 * methods can be added as well). Abstract methods cannot be added to regular 
 * classes.
 *
 * @author Mr. Wachs
 * @since Oct. 28, 2019, 10:24:56 a.m.
 */
public abstract class Food 
{

    String flavour;
    
    private boolean nurishment;
    private String group;
    
    /**
     * The defined food groups
     */
    public static final String[] GROUPS = {
        "fruits and vegatables",
        "grains",
        "meats",
        "diary",
        "other"
    };
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param nurishment yes/true (does have), no/false (does not)
     * @param group the food group name
     */
    public Food(boolean nurishment, String group) {
        this.nurishment = nurishment;
        this.group      = group;
    }
    
    /**
     * How to eat this food object
     * 
     * @return the nurishment or not
     */
    public abstract boolean eat();
    
    /**
     * Digests the food
     */
    public void digest() {
        System.out.println("gurgle.....");
    }
    
    /**
     * Prepares it to be eaten
     */
    public abstract void prepare();
        
}


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

    /**
     * Whether or not this food has nurishment value
     */
    protected boolean nurishment;
    
    /**
     * The flavor quality of this food
     */
    public String flavour;
    
    private String group;
    
    /**
     * The food groups: (0) Fruits and Vegetables, (1) Meats, (2) Dairy, 
     * (3) Grains, (4) Other
     */
    public static final String GROUPS[] = {
        "Fruits and Vegetables",
        "Meats",
        "Dairy",
        "Grains",
        "Other"
    };
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param nurishment yes/true (does have), no/false (does not)
     * @param group the food group name
     * @param flavour the flavor of the food
     */
    public Food(boolean nurishment, String group, String flavour) {
        this.nurishment = nurishment;
        this.group      = group;        
        this.flavour    = flavour;
    }
    
    /**
     * Digests the food
     */
    public void digest() {
        System.out.println("gurgle...");
    }
    
    /**
     * Smell the food
     */
    public void smell() {
        System.out.println("Snifffff...");
    }
    
    /**
     * How to eat this food object
     * 
     * @return the nurishment or not
     */
    public abstract boolean eat();
    
    /**
     * Prepares it to be eaten
     */
    public abstract void prepare();
    
    /**
     * Store the food somehow
     */
    public abstract void store();
        
}

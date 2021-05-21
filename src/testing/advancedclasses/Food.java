
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Food.java - abstract class representing the 'concept' of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. Once a class has been 
 * made abstract then you can add abstract methods to the class (regular 
 * methods and regular properties can be added as well). Abstract methods 
 * CANNOT be added to regular classes (once a method is abstract, the entire
 * class must be an abstract class).
 *
 * @author Mr. Wachs
 * @since May 20, 2021, 11:22:38 a.m.
 */
public abstract class Food 
{
    
    /**
     * The food groups: (0) Fruits and Vegetables, (1) Meats, (2) Dairy, 
     * (3) Grains, (4) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Fruits and Vegetables",
        "Meats",
        "Dairy",
        "Grains",
        "Other"
    };
    
    /**
     * Whether or not this 'food' item can be eaten
     */
    public boolean eatable;
    
    /**
     * Encapsulated property, which food group the 'food' item is part of
     */
    private int group;
    
    /**
     * Available to the class and children of the class, The flavor quality of 
     * this food
     */
    protected String flavour;
        

    /**
     * Constructor for the class, sets class properties
     */
    public Food(int group) {
        this.group = group;           // Assign parameter to property
    }
    
    /**
     * How to eat this food object - note: abstract classes can ALSO have 
     * "regular" methods and properties (not just abstract methods)
     * 
     * @return The output of how eating this 'food' item went
     */
    public String eat() {
        if (hasSpoiled()) return "Do not eat!";
        else {                                  // Food has not spoiled
            prepare();                          // Prepare it (abstractly)
            return GROUPS[group] + ", it was " + flavour;
        }
    }
    
    /**
     * Prepares food to be eaten. By adding the modifier "abstract" to a method,
     * it makes it an abstract method - means the method has no code for the 
     * body (no curly brackets) and ends in a semi-colon (it can have
     * parameters and it can return a value)
     */
    public abstract void prepare(); 
    
    /**
     * Determines if this 'food' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    public abstract boolean hasSpoiled();
    
    /**
     * Smell the 'food' item
     * 
     * @param seconds how many seconds to smell it
     */
    public abstract void smell(int seconds);
        
}
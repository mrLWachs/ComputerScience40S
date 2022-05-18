/** Required package class namespace */
package testing.unit3;

 
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
 * @since 17-May-2022, 2:28:26 PM
 */
public abstract class Food 
{

    /**
     * Whether or not this 'food' item should be eaten
     */
    public boolean eatable;
    
    /**
     * Encapsulated property, which food group the 'food' item is part of
     */
    private int group;
    
    /**
     * Available to this class and all children of this class, the flavour
     * quality of the food
     */
    protected String flavour;
    
    /**
     * Agreed upon food groups: (0) Meat, (1) Dairy, (2) Vegetables,
     * (3) Fruit, (4) Grains, (5) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Meat",
        "Dairy",
        "Vegetables",
        "Fruit",
        "Grains",
        "Other"        
    };
    
    
    /**
     * Constructor, set class properties
     * 
     * @param group which food group this food item belong to
     */
    public Food(int group) {
        this.group = group;     // Assign parameter to private property
    }
    
    public abstract void prepare();
    
    public abstract boolean hasSpoiled();
    
    public abstract void smell(int seconds);
    
    
    public String eat() {
        if (hasSpoiled()) {
            return "Do not eat!";
        }
        else {
            prepare();
            return GROUPS[group] + ", it was " + flavour;
        }
    }
     
}
/** Required package class namespace */
package testing.classes;
 
/**
 * Food.java - abstract class representing the 'concept' of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. Once a class has been 
 * made abstract then you can add abstract methods to the class (regular 
 * methods and regular properties can be added as well). Abstract methods 
 * CANNOT be added to regular classes (once a method is abstract, the entire
 * class must be an abstract class).
 *
 * @author YOUR NAME
 * @since May 1, 2024, 9:26:54 a.m.
 */
public abstract class Food 
{
    
    /**
     * Agreed upon food groups: (0) Fruits and Vegetables, (1) Dairy, 
     * (2) Grains, (3) Protein, (4) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Fruits and Vegetables",
        "Dairy",
        "Grains",
        "Protein",
        "Other"
    };
     
    /**
     * Whether or not this 'food' item should be eaten
     */
    public boolean eatable;
    
    // Encapsulated property, which food group the 'food' item is part of
    private int group;

    /**
     * Available to this class and all children of this class, the flavour
     * quality of the food
     */ 
    protected String flavour;
    
    /**
     * Default constructor, set class properties
     */
    public Food() {
        
    }
     
    
}

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
 * @author Mr. Wachs
 * @since Oct 31, 2024, 11:43:16 a.m.
 */
public abstract class Food 
{
    
    /**
     * Agreed upon food groups: 
     * (0) Grains, (1) Protein, (2) Fruits, (3) Vegetables,
     * (4) Dairy, (5) Other - "shared" constant array
     */
    public static final String[] GROUPS =
        { "Grains","Protein","Fruits","Vegetables","Dairy","Other" };
        
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
     * Constructor, set class properties
     * 
     * @param group which food group this food item belongs to
     */
    public Food(int group) {
        this.group = group;     // Assign parameter to private property
    }
    
    /**
     * How to eat this food object - note: abstract classes can ALSO have
     * "regular" methods and regular properties (not just abstract methods)
     * 
     * @return The output of how eating this "food" item went
     */
    public String eat() {
        prepare();
        if (hasSpoiled()) {
            return " SPOILED: Do not eat!";
        }
        else {
            return " from " +  GROUPS[group] + " was " + flavour;
        }
    }
    
    /**
     * Prepares food to be eaten. By adding the modifier "abstract" to a method,
     * it makes an abstract method - means the method has no code for the 
     * body (no curly brackets) and ends in a semi-colon (it can have
     * parameters and it can return a value)
     */
    public abstract void prepare();
    
    /**
     * Determines if this 'food' item has spoiled - note: abstract methods
     * can return things
     * 
     * @return the food has spoiled (true) or not (false)
     */
    public abstract boolean hasSpoiled();
    
    /**
     * Smells the 'food' item - note: abstract methods can have parameter(s)
     * 
     * @param seconds how many seconds to smell it
     */
    public abstract void smell(int seconds);
    
}
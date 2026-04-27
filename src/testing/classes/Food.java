/** Required package class namespace */
package testing.classes;
 
/**
 * Food.java - abstract class representing the 'concept' of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. 
 *
 * @author Mr. Wachs
 * @since Apr 27, 2026, 9:02:33 AM
 */
public abstract class Food 
{
    
    /** Whether or not this 'food' item should be eaten */
    public boolean eatable;
    
    /**
     * Available to this class and all children of this class, the flavor
     * quality of the food
     */ 
    protected String flavor;
    
    /**
     * Agreed upon food groups: (0) Grains, (1) Fruits and Vegetables, 
     * (2) Protein, (3) Dairy, (4) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Grains",
        "Fruits and Vegatables",
        "Proteins",
        "Dairy",
        "Other"
    };
    
    /** Encapsulated property, which food group the 'food' item is part of */
    private int group;
        

    /**
     * Why write a constructor for a class that will never be instantiated, 
     * which a abstract class can not. This is done for inheritance sake and
     * when the sub-classes call the super-constructor. NOTE: a default 
     * constructor is a constructor (no return type, same name as the class) 
     * without any parameters - compilers (NetBeans) will write a default 
     * constructor for you if you don't. But, if we write a constructor with 
     * parameters, then it will not
     * 
     * @param group which food group this food item belongs to
     */
    public Food(int group) {
        this.group = group;
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
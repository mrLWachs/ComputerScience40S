/** Required package class namespace */
package testing.classes;
 
/**
 * Food.java - abstract class representing the 'concept' of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. 
 *
 * @author Mr. Wachs
 * @since Nov 24, 2025, 9:21:45 AM
 */
public abstract class Food 
{
    
    /** Encapsulated property, which food group the 'food' item is part of */
    private int group;
    
    /**
     * Agreed upon food groups: (0) Fruits and Vegetables, (1) Protein, 
     * (2) Grains, (3) Dairy, (4) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Fruits and Vegetables",
        "Protein",
        "Grains",
        "Dairy",
        "Other"
    };
    
    /** Whether or not this 'food' item should be eaten */
    public boolean eatable;
    
    /**
     * Available to this class and all children of this class, the flavour
     * quality of the food
     */ 
    protected String flavor;
    
    
    /**
     * Why write a constructor for a class that will never be instantiated, 
     * which a abstract class can not. This is done for inheritance sake.
     * NOTE: a default constructor is a constructor (no return type, same name 
     * as the class) without any parameters - compilers (NetBeans) will write 
     * a default constructor for you if you don't. But, if we write a 
     * constructor with parameters, then it will not
     */
    public Food(int group) {
        this.group = group;
    }
    
    public void eat() {
        
    }
    
   
}
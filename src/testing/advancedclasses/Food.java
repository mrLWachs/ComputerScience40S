
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
 * @since April 9, 2019 
 */
public abstract class Food 
{
    
    /** the tastiness value for this food */
    protected int taste;
    /** the various food groups for food */
    public static final String[] GROUPS =
    {
        "grains",
        "fruits and veggies",
        "meats",
        "dairy"
    };
    public String group;
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param group the food group number for this food
     */
    public Food(String group) {
        taste = 0;      
        this.group = group;
    }
    
    /**
     * Outputs if the food has rotted 
     */
    public void rot() {
        System.out.println("Food from group " +  group + " has rotted!");
    }

    // abstract methods can only be created in abstract classes, abstract 
    // methods are methods which have no method body (no code inside)
    
    /**
     * How to eat this food object
     */
    public abstract void eat();
    
    /**
     * Determines if this food item should be cooked or not 
     * 
     * @return should be cooked (true), or not (false)
     */
    public abstract boolean shouldCook();
    
    
}


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
     * Default constructor, set class properties
     */
    public Food() {
        
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
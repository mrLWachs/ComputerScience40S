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
 * @since May 7, 2025, 10:30:42 a.m.
 */
public abstract class Food 
{

    final String GROUPS[] = {
        "grains",
        "dairy",
        "protein",
        "fruits and vegatables",
        "other"
    };
    
    int group;
    
    boolean eatable;
    
    String flavour;
    
    
}
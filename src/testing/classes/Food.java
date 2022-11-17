
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
 * @since 17-Nov-2022, 11:34:21 AM
 */
public abstract class Food 
{
    
    /**
     * Agreed upon food groups: (0) Dairy, (1) Protein, (2) Grains,
     * (3) Vegetables, (4) Fruits, (5) Other - "shared" constant array
     */
    public static final String[] GROUPS = {
        "Dairy",
        "Protien",
        "Grains",
        "Vegetables",
        "Fruits",
        "Other"
    };
    
    
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
     * Default constructor, set class properties
     */
    public Food() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Food: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Food clone() {
        return this;
    }
    
}
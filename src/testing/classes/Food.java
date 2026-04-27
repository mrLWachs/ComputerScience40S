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
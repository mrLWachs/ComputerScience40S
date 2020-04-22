
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Banana.java - represents a banana
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:28:54 PM
 */
public class Banana extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Banana() {
        super(true, Food.GROUPS[0], "sweet");
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Banana: " + super.toString();
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
    public Banana clone() {
        return this;
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public void prepare() {
        System.out.println("Peel it");
    }

    @Override
    public void store() {
        System.out.println("Not in fridge");
    }
    
}

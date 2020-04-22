
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Donut.java - represents a donut
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:30:57 PM
 */
public class Donut extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Donut() {
        super(false, Food.GROUPS[4], "fantastic");
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Donut: " + super.toString();
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
    public Donut clone() {
        return this;
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public void prepare() {
        System.out.println("Just eat");
    }

    @Override
    public void store() {
        System.out.println("Don't just eat");
    }
    
}

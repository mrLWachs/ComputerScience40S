/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Husky.java - represents a husky student person
 *
 * @author Mr. Wachs
 * @since Mar. 16, 2020, 2:11:12 p.m.
 */
public class Husky extends HighSchoolStudent
{

    /**
     * Class constructor sets class properties
     * 
     * @param studentNumber the student number of this student
     */
    public Husky(int studentNumber) {
        super(studentNumber);
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Husky: " + super.toString();
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
    public Husky clone() {
        return this;
    }
    
}

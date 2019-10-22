
/** required package class namespace */
package testing.advancedclasses;

/**
 * Husky.java - represents a husky student person
 *
 * @author Mr. Wachs
 * @since Oct. 21, 2019, 10:44:22 a.m.
 */
public class Husky extends Student
{

    /**
     * Default constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param isMale the gender for this student
     * @param studentNumber the student number for this student
     */
    public Husky(String name, int age, boolean isMale, int studentNumber) {
        super(name, age, isMale, studentNumber);
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

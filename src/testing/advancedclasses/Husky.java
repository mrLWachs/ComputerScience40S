
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Husky.java - represents a husky high school student person
 *
 * @author Mr. Wachs
 * @since May 14, 2021, 11:39:10 a.m.
 */
public class Husky extends HighSchool
{

    /**
     * Class constructor, sets the class properties
     * 
     * @param name the name for this Husky High School 
     * @param age the age for this Husky High School 
     * @param studentNumber the student number for this Husky High School  
     */
    public Husky(String name, int age, int studentNumber) {
        super(name, age, studentNumber);
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
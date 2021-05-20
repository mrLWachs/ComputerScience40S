
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * HighSchool.java - represents a high school student person
 * 
 * Abstract class - is a class which can NOT ever be instantiated. This means  
 * this class can only act as a parent class for other child classes (in this 
 * case are Husky and Piper). To make a class abstract, add the "abstract" 
 * keyword to the class signature line as seen below...
 *
 * @author Mr. Wachs
 * @since May 14, 2021, 11:38:45 a.m.
 */
public abstract class HighSchool extends Student
{

    /**
     * Class constructor, sets the class properties
     * 
     * @param name the name for this High School student
     * @param age the age for this High School student
     * @param studentNumber the student number for this High School student
     */
    public HighSchool(String name, int age, int studentNumber) {
        super(name, age, studentNumber);
    }
    
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
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
    public HighSchool clone() {
        return this;
    }
    
}
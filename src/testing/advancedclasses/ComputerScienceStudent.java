
/** required package class namespace */
package testing.advancedclasses;


/**
 * ComputerScienceStudent.java - represents a computer science high school 
 * student
 *
 * @author Mr. Wachs 
 * @since 31-Oct-2018 
 */
public class ComputerScienceStudent extends HighSchoolStudent
{

    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this object
     * @param age the age for this object
     * @param isMale the gender for this object
     * @param studentNumber the student number for this object
     */
    public ComputerScienceStudent(String name, int age, boolean isMale, 
            int studentNumber) {
        super(name, age, isMale, studentNumber);
    }



    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "ComputerScienceStudent " + super.toString();
    }
        
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public ComputerScienceStudent clone() {
        return this;
    }

}


/** required package class namespace */
package testing.advancedclasses;



/**
 * Teacher.java - 
 *
 * @author Mr. Wachs 
 * @since 14-Mar-2019 
 */
public class Teacher extends Person
{
    
    public Student[] students;
    public String course;
    public String room;
    
    private int count;
    private final int MAX;
            
            

    /**
     * Default constructor for the class, sets class properties
     */
    public Teacher() {        
        count = 0;
        MAX = 100;
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher " + super.toString();
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
    public Teacher clone() {
        return this;
    }

}

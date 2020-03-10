
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Teacher.java - represents a teacher (and "is a" person)
 *
 * @author Mr. Wachs
 * @since Mar. 9, 2020, 1:29:28 p.m.
 */
public class Teacher extends Person
{

    public Student[] students;                      // associated object array
        
    /**
     * Default constructor, set class properties
     */
    public Teacher(String name) {
        super(name, 40, true);
        students = new Student[100];                // instantiate array
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
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
    public Teacher clone() {
        return this;
    }
    
}

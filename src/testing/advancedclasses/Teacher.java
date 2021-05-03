
/** Required package class namespace */
package testing.advancedclasses;

 
/**
 * Teacher.java - represents a teacher (and "is a" person)
 *
 * @author Mr. Wachs
 * @since Apr. 26, 2021, 11:53:09 a.m.
 */
public class Teacher extends Person
{

    /**
     * An array of student objects, so the teacher has a association with these
     * objects (or a "has a" relationship)
     */
    public Student[] students;
    
    /**
     * Class constructor, sets class properties
     * 
     * If a constructor has no parameters, it is called a "default constructor"
     * When you create a class, if you never write any constructors, NetBeans 
     * (any compiler or IDE) will write a default constructor for you! 
     * HOWEVER...If you write a constructor, with parameters (in other words 
     * no longer a default) then it will NOT write a default for you
     * 
     * @param name the name for this teacher
     */
    public Teacher(String name) {
        super();
        super.name = name;
        // Needs to instantiate (means "make instances of", "instance" is 
        // another word for "object") the array
        students = new Student[200];
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
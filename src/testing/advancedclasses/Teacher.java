
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
        super();    // call to the "super constructor"
        super.name = name;
        // Need to instantiate (means "make instances of", "instance" is
        // another word for "object") the array
        students = new Student[100];
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        // Create a temporary variable to hold all the output data
        String text = "Teacher: " + super.toString();
        // Now add all the student data (from the array) to this variable by
        // looping through the entire array (start to finish) - using a NEW type
        // of loop called the "enhanced for loop". to create the enhanced for
        // loop use the shortcut: type "for" then CTRL + SPACE and pick the 
        // fourth option from the top...        
        for (Student student : students) {
            // The enhanced for loop should be read as:
            // "for every student in students..."
            // The "student" object automatically goes through each element in
            // the array, automatically from the start of the array to the end,
            // changing "student" each time through to each element in order...
            if (student != null) {  // only count student objects in the array
                text = text + "\n\t" + student.toString(); // attach to variable
            }
        }        
        return text;        // Send back the temporary variable
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
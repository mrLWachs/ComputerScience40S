
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
     * Constructor, set class properties
     */
    public Teacher(String name) {
        super(name, 50, true);
        students = new Student[100];                // instantiate array
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        String text = "Teacher: " + super.toString();
        // Loop (traverse) through all students (that exist!) 
        for (Student student : students) {
            // Use "enhanced for loop"
            // should read this loop as "for every student in students"
            // it is an option for looping with advanced groups of things 
            // (classes) with arrays and other more advanced things to come...            
            if (student != null) {
                text = text + "\n\t" + student.toString();
            }
        }
        return text;
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Teacher that = (Teacher)object;
        // start by comparing array sizes
        if (that.students.length != this.students.length) return false;
        // we could go deeper by somparing each student...
        for (int i = 0; i < this.students.length; i++) {
            Student s1 = this.students[i];
            Student s2 = that.students[i];
            if (s1 != null) {
                if (!s1.equals(s2)) return false;
            }
        }
        return super.equals(that);
    }
           
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Teacher clone() {
        Teacher that = new Teacher(this.name);
        // if I wanted to go deeper, clone
        // all the students        
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                that.students[i] = this.students[i].clone();
            }
        }        
        return that;
    }
    
}

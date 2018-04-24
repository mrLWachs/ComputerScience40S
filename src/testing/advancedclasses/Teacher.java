
/** required package class namespace */
package testing.advancedclasses;

/**
 * Teacher.java - represents a teacher
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Teacher extends Person
{
    
    /**
     * The array of associated student objects
     */
    public Student[] students;                      // "has a" relationship
    private int count;
    private final int MAX = 200;
    
    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this Computer Science teacher
     * @param age the age of this Computer Science teacher
     * @param isMale the gender of this Computer Science teacher
     */
    public Teacher(String name, int age, boolean isMale) {
        super(name,age);
        super.isMale = isMale;
        count        = 0;
        students     = new Student[MAX];
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher " + super.toString() + " and teaches " + count + 
               " students";
    }
    
    /**
     * Adds a student object association to this teacher
     * 
     * @param student the student to associate with
     */
    public void add(Student student) {
        students[count] = student;
        count++;
        if (count > MAX) count = 0;
    }
    
    /**
     * Determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        Teacher that = (Teacher)object;
        if (super.equals(that) == false) return false;
        if (this.count != that.count)    return false;
        for (int i = 0; i < count; i++) {
            if (!this.students[i].equals(that.students[i])) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Teacher clone() {
        Teacher teacher = new Teacher(
                this.name,
                this.getAge(),
                this.isMale);
        for (int i = 0; i < count; i++) {
            teacher.add(this.students[i].clone());
        }
        return teacher;
    }
        
}

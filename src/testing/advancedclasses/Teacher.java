
/** required package class namespace */
package testing.advancedclasses;


/**
 * Teacher.java - represents a teacher
 *
 * @author Mr. Wachs 
 * @since 22-Oct-2018 
 */
public class Teacher extends Person
{
    
    private int count;                  // count of the current studetn to add
    private final int MAX_STUDENTS;     // the maximum number of students
    public Student[] students;          // (composition) "has a" relationship
    

    /**
     * Class constructor sets class properties
     * 
     * @param name the name of this teacher
     * @param age the age of this teacher
     * @param isMale the gender of this teacher
     */
    public Teacher(String name, int age, boolean isMale) {
        super(name,age,isMale);
        MAX_STUDENTS = 150;
        count        = 0;
        students     = new Student[MAX_STUDENTS];
    }

    /**
     * Adds a student to this teacher's collection
     * 
     * @param student the student to add
     */
    public void add(Student student) {
        students[count] = student;
        count++;
        if (count >= MAX_STUDENTS) count = 0;
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        String text = "Teacher " + super.toString() + " and teaches " + count + 
                      " out of " + MAX_STUDENTS + " students:";
        for (int i = 0; i < count; i++) {
            text += "\n\t" + i + ": " + students[i].toString();
        }                
        return text;
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
        if (!super.equals(that))      return false;
        if (this.count != that.count) return false;
        for (int i = 0; i < count; i++) {
            Student a = this.students[i];
            Student b = that.students[i];
            if (!a.equals(b)) return false;            
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
        Teacher teacher = new Teacher(this.getName(), age, isMale);
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                teacher.add(this.students[i].clone());
            }
        }
        return teacher;
    }

}
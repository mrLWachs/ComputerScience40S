
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Teacher.java - represents a teacher
 *
 * @author Mr. Wachs 
 * @since 14-Mar-2019 
 */
public class Teacher extends Person
{
    
    /** The array of associated student objects */
    public Student[] students;                      // "has a" relationship
    public String course;
    public String room;
    
    private int count;
    private final int MAX;
            

    /**
     * Default constructor for the class, sets class properties
     */
    public Teacher(String name, int age, boolean isMale, String course,
            String room) {        
        super.setName(name);
        super.age    = age;
        super.isMale = isMale;        
        count        = 0;
        MAX          = 100;        
        this.course  = course;
        this.room    = room;
        students     = new Student[MAX];
    }

    /**
     * Adds a student object association to this teacher
     * 
     * @param student the student to associate with
     */
    public void add(Student student) {
        students[count] = student;
        count++;
        if (count >= MAX) count = 0;
    }
        
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        String text = "Teacher: " + super.toString();
        text += " teaches " + count + " kids " + course + " in room " + room;
        for (int i = 0; i < MAX; i++) {
            if (students[i] != null) {
                text += "\n\t" + i + ": " + students[i].toString();
            }            
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
        if (!super.equals(that))              return false;
        if (!this.course.equals(that.course)) return false;
        if (!this.room.equals(that.room))     return false;        
        else {
            for (int i = 0; i < MAX; i++) {
                if (this.students[i] == null && that.students[i] != null) {
                    return false;
                }
                if (this.students[i] != null && that.students[i] == null) {
                    return false;
                }                
                if (!this.students[i].equals(that.students[i])) {
                    return false;
                }
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
        String name = super.getName();
        Teacher that =  new Teacher(name, age, isMale, course, room);
        for (int i = 0; i < count; i++) {
            that.add(this.students[i].clone());
        }
        return that;
    }

}

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
    public Teacher(String name, int age,
            boolean isMale, String course,
            String room) {        
        count = 0;
        MAX   = 100;
        super.age = age;
        super.isMale = isMale;
        super.setName(name);
        this.course = course;
        this.room   = room;
        students = new Student[MAX];
    }

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
        for (int i = 0; i < MAX; i++) {
            if (students[i] != null) {
                text += "\n\t" + i + ": " + 
                        students[i].toString();
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

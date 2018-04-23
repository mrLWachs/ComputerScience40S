
/** required package class namespace */
package testing.advancedclasses;

/**
 * Teacher.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class Teacher extends Person
{
    
    /**
     * 
     */
    public Student[] students; // "has a"
    private int count;
    private final int MAX = 200;
    
    /**
     * 
     * @param name
     * @param age
     * @param isMale 
     */
    public Teacher(String name, 
                   int age,
                   boolean isMale) {
        super(name,age);
        super.isMale = isMale;
        count = 0;
        students = new Student[MAX];
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Teacher " + 
                super.toString() + 
                " and teaches " +
                count + " students";
    }
    
    /**
     * 
     * @param student 
     */
    public void add(Student student) {
        students[count] = student;
        count++;
        if (count > MAX) count = 0;
    }
    
    /**
     * 
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        Teacher that = (Teacher)object;
        if (super.equals(that) == false) {
            return false;
        } 
        if (this.count != that.count) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (!this.students[i].equals(that.students[i])) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * @return 
     */
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

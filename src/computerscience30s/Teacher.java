
/** required package class namespace */
package computerscience30s;


/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs 
 * @since 14-May-2019 
 */
public class Teacher extends Person
{

    public Student[] students;                  // an array of class objects
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher
     * @param isMale the gender of this teacher
     */
    public Teacher(String name, boolean isMale) {
        super();                                // call to super constructor
        super.name = name;
        super.birthday(30);                     // set super private property
        super.isMale = isMale;
        students = new Student[300];            // build up array
    }
    
    /**
     * Teaches all the students this teacher has an association with by making
     * them study
     */
    public void teach() {
        for (int i = 0; i < students.length; i++) { // traverse array
            if (students[i] != null) {              // array spot not a null
                students[i].study(1);               // make this spot study
            }
        }
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();                       // call to the super talk method
        System.out.println("I am a teacher!");
        System.out.println("I teach " + students.length + " students");
        for (int i = 0; i < students.length; i++) {            
            if (students[i] != null) {
                students[i].talk();
            }
        }
    }
      
}

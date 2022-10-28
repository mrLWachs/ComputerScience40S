
/** Required package class namespace */
package testing;

import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;

/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since October, 2022
 */
public class AdvancedClassesTest 
{
    
    /**
     * Default constructor method, it sets class properties.
     * 
     * Special Methods that have the same name as the class (including a
     * capital at the start of the name) and NO return type (not even "void")
     * are called "constructor" methods these methods are called when the class
     * is created (or constructed), it makes an object from the class, or it
     * instantiates the class (creates an "instance")
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced Classes testing begins...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // Try to change (modify) some of our properties
        person.name = "Demitrius Demarkus the 3rd";
        person.gender = "non-binary";
        // person.age = 7; // Cannot do this, property is "locked" (private)
        // person.alive = false; // Cannot do (access) this! (encapsulated)
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.die();
        person.talk();
        
        // Instantiate (create) an object of type Student...
        Student student = new Student();
        student.birthday();             // Inherited method from parent class
        student.study();                // This method is only in student
        student.cram();                 // This method modifies the private
        student.slackOff();             // encapsulated property (gpa)
        student.talk();                 // The over-ride method
        
        // Instantiate a second student object
        Student keyAndPeele = new Student("Hingle McCringleberry",17,"male");
        keyAndPeele.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Professor Snape");
        teacher.add(student);           // Associate object through method
        teacher.add(keyAndPeele);       // Add another student object
        teacher.teach();                // Effect associated objects
        teacher.talk();                 // Inherited method invoked        
        student.talk();                 // Test the teach method
        keyAndPeele.talk();              
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes testing complete!\n");
    }
    
}

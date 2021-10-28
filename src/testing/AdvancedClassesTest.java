
  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;


/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:43:07 a.m.
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
        System.out.println("\nAdvanced Classes starting...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
          
        // Call one of the methods in this object (an instance of the class)
        person.talk();
        
        // Try to change (modify) some of our properties:
        
        person.name   = "Bruce Spruce"; // "public" properties can be accessed
        person.gender = "demi-male";        
        // person.age     = 16;  // Cannot do this, property is locked (private)
        // person.isAlive = false; // Cannot do (access) this! (encapsulated)
                
        // Try to call (invoke) some of our methods:
        
        person.birthday();
        person.die();
        person.talk();
        
        // Instantiate (create) and object of type student 
        Student student = new Student("Flash Thompson",17);
        student.birthday();             // Inherited method from parent class
        student.study();                // This method is only in student
        student.cram();                 // This method modifies the private
        student.slackOff();             // encapsulated property (average)
        student.talk();                 // The over-ride method
        
        
        System.out.println("\nAdvanced Classes completed!\n");
    }
    
}

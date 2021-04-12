  
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
    
    // Special Methods that have the same name as the class (including a   
    // capital at the start of the name) and NO return type (not even "void")
    // are called "constructor" methods these methods are called when the class
    // is created (or constructed), it makes an object from the class, or it
    // instantiates the class (creates an "instance")
    
    /**
     * Default constructor, sets class properties
     */
    public AdvancedClassesTest() {
        System.out.println("\nStarting Advanced classes...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        
        Person person = new Person();
        
        // Call one of the methods in this object (of the class)
        person.talk();
        
        // Instantiate (create) and object of type student
        
        Student student = new Student("Smelly Teenager",17,101);
        
        student.talk();                     // inherited method
        
        
        
        System.out.println("\nCompleted Advanced classes!\n");
    }

}

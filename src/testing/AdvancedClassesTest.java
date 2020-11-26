
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:00:03 p.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes test started...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
     
        // Second student object (occupies different memory spaces)
        Person jeanie = new Person();
        jeanie.name = "Jeanette";
        jeanie.talk();   
        
        // Third person (uses the overloaded constructor)
        Person dave = new Person("David Davidson",17);
        dave.talk();
        
        // Fourth person...
        Person david = new Person("David Davidson",17);
        david.talk();   
        
        // class using inheritance of a new student object 
        Student student = new Student();                // new student object
        student.talk();                                 // inherited method
                        
        System.out.println("\nAdvanced classes test complete!\n");
    }
             
}

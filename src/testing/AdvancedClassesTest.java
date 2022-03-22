
/** Required package class namespace */
package testing;

/** Required imports */
import testing.unit3.Person;

/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 11-Mar-2022, 3:20:05 PM
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor method, called when the class is turned into an
     * object, or "constructed", or "instantiated" (means built into an 
     * "instance") 
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes test started...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        // Construct another person object (instance) using our second
        // overloaded constructor method
        
        Person ap = new Person("Aaech Ippouh Potimus",75,"he/him");                
        ap.talk();
        ap.birthday();
        ap.talk();
        ap.gender = "they";
        ap.talk();
        ap.die();
        ap.talk();
        
        
        
        
        System.out.println("\nAdvanced classes test complete!\n");
    }
    
}
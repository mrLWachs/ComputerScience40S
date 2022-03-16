
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

    public AdvancedClassesTest() {
        System.out.println("Learning advanced classes...");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        
        
        System.out.println("Advanced classes complete!");
    }
    
}
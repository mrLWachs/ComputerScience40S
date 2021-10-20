
  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Person;

/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:43:07 a.m.
 */
public class AdvancedClassesTest 
{

    public AdvancedClassesTest() {
        System.out.println("Advanced Classes starting...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
          
        // Call one of the methods in this object (an instance of the class)
        person.talk();
        
        
        System.out.println("Advanced Classes completed!");
    }
    
}

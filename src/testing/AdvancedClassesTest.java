
/** required package class namespace */
package testing;

import testing.advancedclasses.Person;

 
/**
 * AdvancedClassesTest.java - description
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
        Person person = new Person();
        
        
        
        System.out.println("\nAdvanced classes test complete!\n");
    }

    
}

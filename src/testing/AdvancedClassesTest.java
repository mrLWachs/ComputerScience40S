/** Required package class namespace */
package testing;

import testing.classes.Person;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since Mar 12, 2024
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
        System.out.println("Start Learning Advanced classes...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        
        
        System.out.println("Completed Learning Advanced classes!");
    }
    
}
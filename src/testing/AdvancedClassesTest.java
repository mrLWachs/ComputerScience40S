
/** Required package class namespace */
package testing;

/** Required imports */
import testing.classes.Person;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since Oct 6, 2025
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
        System.out.println("Start learning Advanced Classes...");
        
        // Using the class (like a "cookie cutter") to create an object of that
        // class (like a "cookie")
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a "instance", or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // Cannot access private properties or methods...
        // person.alive = false;
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }

}

  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Book;
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
        System.out.println("\nStarting Advanced classes...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)        
        Person person = new Person();
        person.name = "Dave Smith"; // "public" properties can be accessed
        // person.age = 16; // Can't change "private" (encapsulated) properties
        person.talk();  // Call one of the methods in this object (of the class)
        
        // Instantiate (create) and object of type student        
        Student student = new Student("Smelly Teenager",17,101);        
        student.talk();                     // Inherited method from person
        student.study();                    // Method for just this class
        
        // The Object class (parent class of all classes)
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;        
        
        // Built into the Object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this
        // unit, and others like:
        
        // The toString(), clone(), and equals() methods
        
        
        
        System.out.println("\nCompleted Advanced classes!\n");
    }

}

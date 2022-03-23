
/** Required package class namespace */
package testing;

/** Required imports */
import testing.unit3.Person;
import testing.unit3.Student;


/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 11-Mar-2022, 3:20:05 PM
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
        System.out.println("\nAdvanced classes test started...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // To create a "person" (add a class called "Person" to this Java 
        // project). To do this in NetBeans, click on File - New File (or 
        // the icon on toolbar) and a dialog will appear and you select 
        // "Java" and "Java Class". Then give the class a name (which always
        // starts with a capital letter and uses camel casing). Then click 
        // finish. This relates to a familiar line of code from CS20S like:
        // Random random = new Random();
        
        Person person = new Person();                   // A person object
        // Class object = new Class() <--- implies a method?
        // That is the call to the constructor method
        
        // Now call (invoke) a method within the object
        person.talk();                                  // Calls class method 
        
        // Construct another person object (instance) using our second
        // overloaded constructor method        
        Person hippo = new Person("Aaech Ippouh Potimus",75,"he/him");
        
        // Use (call, invoke) other methods and change (modify) properties
        hippo.talk();
        hippo.birthday();
        hippo.talk();
        hippo.gender = "they";
        hippo.talk();
        hippo.die();
        hippo.talk();
        // hippo.age     = 16;   // Cannot do this, property is locked (private)
        // hippo.isAlive = false; // Cannot do (access) this! (encapsulated)
        
        // Instantiate (create) a Student object and call it's methods 
        // (including the ones it inherited from the Person class) 
        Student student = new Student();
        
        // Call (invoke) any inherited methods, or change any inhertited 
        // properties from the Person class
        student.talk();
        student.name = "Slacker Teenager";
        student.birthday();
        student.talk();
        student.die();
        student.talk();
        
        
        
        
        
        
        System.out.println("\nAdvanced classes test complete!\n");
    }
    
}
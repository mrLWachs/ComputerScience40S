
  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;


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
        System.out.println("\nAdvanced Classes starting...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
          
        // Call one of the methods in this object (an instance of the class)
        person.talk();
        
        // Try to change (modify) some of our properties:        
        person.name   = "Bruce Spruce"; // "public" properties can be accessed
        person.gender = "demi-male";        
        // person.age     = 16;  // Cannot do this, property is locked (private)
        // person.isAlive = false; // Cannot do (access) this! (encapsulated)
                
        // Try to call (invoke) some of our methods:        
        person.birthday();
        person.die();
        person.talk();
        
        // Instantiate (create) and object of type student 
        Student student = new Student("Flash Thompson",17);
        student.birthday();             // Inherited method from parent class
        student.study();                // This method is only in student
        student.cram();                 // This method modifies the private
        student.slackOff();             // encapsulated property (average)
        student.talk();                 // The over-ride method
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Professor");
        teacher.add(student);           // Associate object through method
        teacher.teach();                // Effect associated objects
        teacher.talk();                 // Inherited method invoked
                
        // The Object class (parent class of all classes)
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes
        
        Object object1 = new Object();      // 1st instance of the object class
        Object object2 = new Object();      // 2nd instance of the object class
        Object object3 = object2;
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: toString(), clone(), and equals() methods
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory
        
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // This method is inherited by all sub classes (children), for example:
        
        System.out.println("Person  = " + person.toString());
        System.out.println("Student = " + student.toString());
        System.out.println("Teacher = " + teacher.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" 
        
        
        
        
        System.out.println("\nAdvanced Classes completed!\n");
    }
    
}

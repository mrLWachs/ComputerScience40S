
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
        
        // class using inheritance
        Student student = new Student(99);              // new student object
        student.talk();                                 // inherited method
        
        // The Object class (parent class of all classes)
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        
        Object object1 = new Object();              // parent of all classes
        Object object2 = new Object();
        Object object3 = object1;                   // same memory address
        
        // The toString(), clone(), and equals() methods
                
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        System.out.println(object3.toString());
                        
        if (object1.equals(object2)) {                  // the equals() method
            System.out.println("1 == 2");
        }
        if (object1.equals(object3)) {
            System.out.println("1 == 3");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        System.out.println("\nAdvanced classes test complete!\n");
    }

    
}

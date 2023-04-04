
/** Required package class namespace */
package testing;

import javax.swing.JOptionPane;
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since March 2023
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
        System.out.println("\nAdvanced Classes Test started...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Per Soney";
        
        // The code below would generate errors because of encapsulation......        
        // person.gender = "non-binary";
        // person.age = 17;
        // person.alive = false;
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Instantiate (means create an "instance of") a student object        
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Stu Denty";
        // We can also change some of the porperties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        student.die();      // Inherited method from Person (parent/super) class
        student.talk();
        
        // Instantiate (means "create") a second Student object (instance)
        Student stewie = new Student("Stewie Griffin", 2, "cat");
        stewie.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Mr. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.talk();                 // Call again (to see any changes)
        teacher.teach();                // Effect the associated objects
        teacher.talk();                 // See the results from the teacher
        student.talk();                 // and the 2 students
        stewie.talk();
        
        // The Object class (parent class of all classes)
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes  
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: 
        //      toString()
        //      equals()
        //      clone()
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory 
        
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // This method (toString) is inherited by ALL sub classes (children)
        System.out.println("Person  = " + person.toString());
        System.out.println("Student = " + student.toString());        
        System.out.println("Teacher = " + teacher.toString());
        
        // Seeing the object class as the parent of classes wwe don't write
        String string = new String("squirrel");
        System.out.println("string = " + string.toString());
        
        // Another "built-in" object...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane = " + joptionpane.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes Test complete!\n");
    }    

}
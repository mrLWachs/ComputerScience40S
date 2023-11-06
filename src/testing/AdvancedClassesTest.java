
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
 * @since Oct 12, 2023, 11:42:49 a.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("Start Advanced Classes testing...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Christopher Yesland";
        person.gender = "male";
        
        // The code below would generate errors because of encapsulation......    
        // person.age = 30;
        
        // Recall our method... (to see any changes)
        person.talk();
                
        Person ironMan = new Person("Tony Stark",58,"Iron man");
        // Try to call (invoke) some of our other methods:
        ironMan.birthday();
        ironMan.talk();
        ironMan.die();
        ironMan.talk();
        
        // Instantiate (means create an "instance of") a student object  
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Stu Denty";
        student.birthday();
        student.talk();
        
        // Instantiate (means "create") a second Student object (instance)
        Student stewie = new Student("Stewie Griffin", 2, "cat");
        stewie.talk();
        // Call specific methods from the Student class
        stewie.study();
        stewie.talk();
        stewie.slackOff();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        
        // Instantiate a Teacher object and associate it with a Student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method        
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.teach();                // Effect the associated objects
        
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

        // The method (toString) is inherited by ALL sub classes (children)
        // of the Object class - remember the Object class is the parent or
        // super class of ALL classes - so they all inherit toString, including
        // classes we write...
        System.out.println("Person as a string = " + person.toString());
        System.out.println("Student as a string = " + student.toString());
        System.out.println("Teacher as a string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...    
        String string = new String("squirrel");
        System.out.println("String as a string = " + string.toString());
        
        // Another example of "built-into" Java class level object that inherits
        // all the methods (including toString) from the Object class...     
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as string = " + joptionpane.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes test!");
    }
     
}

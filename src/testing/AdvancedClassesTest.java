
/** Required package class namespace */
package testing;

/** Required API imports */
import javax.swing.JOptionPane;
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


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
        
        person.name = "Per Soney";
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is modified to be "private" I do NOT have
        // access to that - for example:
        // person.gender = "male";
        
        // Try our overloaded, second constructor option
        Person john = new Person("John Doe",63,"male");
        john.talk();
        
        // Instantiate (means create an "instance of") a student object
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.birthday();
        student.talk();
        
        // Instantiate (means "create and instance of") a second Student 
        // object (instance)
        Student stewie = new Student("Stewie Griffin", 1, "male", 100);
        stewie.talk();
        stewie.study();
        stewie.talk();
        stewie.slackoff();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        stewie.die();      // Inherited method from Person (parent/super) class
        stewie.talk();
        // stewie.secret(); // you cannot call encapsulated methods!
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.talk();                 // Call again (to see any changes)
        teacher.teach();                // Effect the associated objects
        teacher.birthday();             // See any more "effects" from 
        teacher.talk();                 // calling these methods...  
        teacher.die(); 
        teacher.talk();
        // See if the teacher object effeced its associated class objects
        // those being the two student objects...
        student.talk();
        stewie.talk();
        
        // The Object class - this class already exists (we don't write it)
        // it is part of Java, all Java project "have it". Also, the
        // Object class is the parent (super) class of ALL classes
        
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes  
        
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
        
        System.out.println("Person  as a string = " + person.toString());
        System.out.println("Student as a string = " + student.toString());
        System.out.println("Teacher as a string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...
        
        String string = new String("squirrel");
        System.out.println("String as a string = " + string.toString());
        
        // Another example of "built-in" Java class (actually imported)
        // level object that inherits all the methods (including toString)
        // from the Object class...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as a string = " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Learning Advanced classes!");
    }
    
}
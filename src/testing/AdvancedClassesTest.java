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
 * @since October 2, 2024
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
        System.out.println("Advanced Classes test starting...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // Change (or "modify" or"mutate") some properties (or "data")
        person.name = "per sony";
        person.age = 17;
        
        // If I try to change ("mutate") a property ("variable") of the
        // Person class that is modified to be "private" (or encapsulated) 
        // I do NOT have access to that - for example:
        
        //person.gender = "non-binary";
        
        // Try to call (invoke) some of our other methods:
        person.talk();
        person.die();
        person.talk();
        
        //person.birthday();
        
        // Will not execute as the birthday() method is private (encapsulated)
                
        // Try our overloaded, second constructor option as build a second
        // Person object...
        Person hugh = new Person("Hugh Jass",103,"female");
        hugh.talk();
        
        // Instantiate (means create an "instance of") a student object
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        student.talk();
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.die();
        student.talk();
        
        // Instantiate (means "create and instance of") a second Student 
        // object (instance)
        Student stewie = new Student("Stewie Griffin",1,"male",148);
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
        teacher.teach();                // Effect the associated objects
        // To see if the associated objects (Student object) were effected
        // we "output" those students
        student.talk();
        stewie.talk();
        teacher.die();
        teacher.talk();
        
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
        System.out.println("String  as a string = " + string.toString());
        
        // Another example of "built-in" Java class (actually imported)
        // level object that inherits all the methods (including toString)
        // from the Object class...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as a string = " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)  
        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Using our previously created Person objects with equals
        if (person.equals(hugh)) System.out.println("person==hugh");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Advanced classes test complete!");
    }
    
}

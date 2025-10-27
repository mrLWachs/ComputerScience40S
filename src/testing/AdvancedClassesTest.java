
/** Required package class namespace */
package testing;

/** Required imports */
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


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
        
        // We call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // We can NOT access private properties or methods...
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have
        // access to that. With methods, you cannot call the private 
        // (encapsuilated, utility, helper) methods outside the class...
        
        // person.alive = false;        // Cannot change encapsulated properties
        // person.age = 15;
        // person.born();                    // Cannot call encapsulated methods 
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Per sony";
        person.birthday();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object        
        Person tom = new Person("Tom Williams",18,"male");
        tom.talk();
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class - invoking our default constructor
        Student student = new Student();
        student.talk();
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.name = "Stu Denty";
        student.birthday();
        student.talk();
         
        // Create another student... (simple language)        
        Student grand = new Student("Grandma Sweetie",72,"male",102);
        grand.talk();
        grand.study();
        grand.talk();
        grand.slackOff();
        grand.talk();
        grand.cram();
        grand.talk();
        grand.die();
        grand.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.add(student);                 // Associate object through method
        teacher.add(grand);                        // or "Teacher has a Student"
        teacher.talk();                           // Invoke an overloaded method
        teacher.birthday();                // Invoke (call) the inherited method
        teacher.die();
        // See if the teacher object effected its associated class objects
        // those being the two student objects...
        teacher.talk();
        
        // Now the review of CS30S content (introduction: variables, conditional
        // statements, looping and methods and arrays and classes)..............
        
        // Now new CS40S advanced classes content...............................
        
        // The Object class - this class already exists (we don't write it) it 
        // is part of Java, all Java project "have it". Also, the Object class 
        // is the parent (super) class of ALL classes        
        Object object = new Object();
        
        // This class has NO properties, but does have methods that we can and
        // often SHOULD over-ride. All classes (including ones we create) 
        // inherit from the object class, which is the parent (super) class of 
        // all classes. Built into the object class are a number of methods that
        // all other classes inherit. These include some that are not relevant
        // in this unit, and others like these: 
        //      toString()
        //      equals()
        //      clone()
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }

}

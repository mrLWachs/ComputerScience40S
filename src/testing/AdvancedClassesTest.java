/** Required package class namespace */
package testing;

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
        //person.gender = "non-binary";
        // The gender property of the person object is encapsulated
        
        // Try to call (invoke) some of our other methods:
        person.talk();
        person.die();
        person.talk();
        //person.birthday();
        // birthday is private
        
        // If I try to change ("mutate") a property ("variable") of the
        // Person class that is modified to be "private" I do NOT have
        // access to that - for example:
        // person.gender = "male";
        
        // Try our overloaded, second constructor option
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
       
        
        
        
        
        
        
        
        System.out.println("Advanced classes test complete!");
    }
    
}

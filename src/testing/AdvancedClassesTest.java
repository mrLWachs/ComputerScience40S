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
 * @since Mar 17, 2025
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
        System.out.println("Start learing Advanced Classes..");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();        
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
                
        // We can also change (mutate) the properties of this object
        person.name = "Per sony";
        person.gender = "male";
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have
        // access to that - for example:
        
        // person.age = 15; // We cannot change this encapsulated property
                
        // person.born();
        
        // This method was later made "private" as well so the method can no
        // longer be called by this class outside the "Person" class (it is
        // now a private, encapsulated, helper, utility method)
        
        // Recall our methods... (to see the changes to the properties)
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object
        Person john = new Person("John Doe",17,"male");
        john.talk();
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class
        Student student = new Student();
        student.talk();
        
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.birthday();
        student.talk();
        
        // Create another student... (simple language)
        Student stewie = new Student("Stewie Griffin", 1, "baby", 13);
        stewie.talk();
        stewie.study();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        stewie.slackOff();
        stewie.talk();
        
        // You cannot call encapsulated (private) methods!
        // stewie.secret();   
        
        // But, we can still call inherited methods...
        stewie.die();
        stewie.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.teach();                // Call again (to see any changes)
        teacher.birthday();             // Effect the associated objects
        teacher.die();                  // See any more "effects" from 
        teacher.talk();                 // calling these methods...  
        // See if the teacher object effected its associated class objects
        // those being the two student objects...
        teacher.teach();
        
        // The Object class - this class already exists (we don't write it)
        // it is part of Java, all Java project "have it". Also, the
        // Object class is the parent (super) class of ALL classes
        
        Object object1 = new Object();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }
    

}
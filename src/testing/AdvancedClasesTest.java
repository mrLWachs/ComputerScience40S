/** Required package class namespace */
package testing;

import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit (including some
 * "re-teaching" of the Computer Science 30S unit called "Classes")
 * 
 * @author Mr. Wachs
 * @since Mar 9, 2026
*/
class AdvancedClasesTest
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
    public AdvancedClasesTest() {
        System.out.println("Start Advanced Classes...");
        
        // =====================================================================
        // (1) REVIEW: Classes (properties and methods)
        // =====================================================================
        
        // A class is a way in code to combine properties and methods. Classes 
        // can also "communicate" with other classes, and they are used to 
        // model "things" in the "real" world. Properties: are things about 
        // the class, or descriptors, or adjectives (they can also be seen as 
        // "global variables" for the class). Methods: are things the class can 
        // do, or actions, or verbs (they are written with parameters, return 
        // types, etc.)
        
        // Using the class (like a "cookie cutter") to create an object of that
        // class (like a "cookie")
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // =====================================================================
        // (2) REVIEW: Encapsulation (private and public)
        // =====================================================================
        
        // A concept applied to both properties and methods of classes to 
        // determine if they can be "used" only within the class or by other 
        // classes "communicating" with this class. private - this modifier 
        // word means the property can only be accessed and changed within the 
        // class (not from other classes) and if used with methods, the methods 
        // can only be called by other methods inside the class (sometimes call 
        // "helper" or "utility" methods). public - this modifier word means the 
        // property can be accessed and changed within the class and outside the 
        // class (from other classes) and if used with methods, the methods can 
        // be called anywhere (inside or outside the class)
        
        // We can NOT access private properties or methods. If I try to change
        // ("modify") a property ("variable") of the Person class that is set 
        // to be "private" I do NOT have access to that. With methods, you
        // cannot call the private (encapsuilated, utility, helper) methods 
        // outside the class...
        
        // person.alive = false;        // Cannot change encapsulated properties
        // person.age = 15;
        // person.born();                    // Cannot call encapsulated methods         
        // This method was later made "private" as well so the method can no
        // longer be called by this class outside the "Person" class (it is
        // now a private, encapsulated, helper, utility method)
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Per sony";
        person.gender = "non-binary";
        person.birthday();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object
        Person fhorhea = new Person("Fhorhea DeGuzmann", 37, "fluid");
        fhorhea.talk();
        
        // =====================================================================
        // (3) REVIEW: Inheritance (super and child class)
        // =====================================================================
        
        // The ways two or more classes of code "communicate" with each other 
        // to transfer data or represent (model) a "real world" relationship of 
        // concepts. Inheritance - this is where one class "inherits" all the 
        // properties and methods of the other class - like biology you can 
        // have a parent (or "super" or "base") class and a child (or "sub") 
        // class that inherits from the parent class - this is also simply put 
        // as a "is a" relationship. 
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class
        Student student = new Student();
        student.talk();
        
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change age directly because it is encapsulated (private)
        student.name = "Stu Denty";
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.birthday();
        student.talk();
        
        // Create another student... (simple language)
        Student wave = new Student("Waverly Micron", 0, "photon", 299792458);
        wave.talk();
        wave.study();
        wave.talk();
        wave.cram();
        wave.talk();
        wave.slackOff();
        wave.talk();
        
        // You cannot call encapsulated (private) methods!
        // wave.secret();
        
        // But, we can still call inherited methods...        
        wave.birthday();
        wave.die();
        wave.talk();
        
        // =====================================================================
        // (4) REVIEW: Association ("has a" vs. "is a")
        // =====================================================================
        
        // Association - this is where one class and another class "use" one 
        // another - this can be also classified as a "usage" (one class using
        // the other), or "composition" (one class composed of another) 
        // relationship - this is also simply put as a "has a" relationship
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Albert Von Shnapsfickle");
        teacher.talk();
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes!");
    }
    

}

/** Required package class namespace */
package testing;

/** Required imports */
import testing.classes.Person;
import testing.classes.Student;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since Oct 13, 2026
*/
public class AdvancedClassesTest
{

    public AdvancedClassesTest() {
        System.out.println("Start learning Advanced Classes...");
        
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
        // be called a "instance", or even a "variable"
        
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
        
        // We call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // person.alive = false;        // Cannot change encapsulated properties
        // person.age = 15;
        // person.born();                    // Cannot call encapsulated methods 
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Bartholomew Simpson";
        person.gender = "Cartoon";
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object 
        
        Person nigel = new Person("Nigel Thornberry",75,"mustache");
        nigel.talk();
         
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
        // Person class - invoking our default constructor
        Student student = new Student();
        student.talk();
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.name = "Stu Denty";
        student.birthday();
        student.talk();
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }
    

}
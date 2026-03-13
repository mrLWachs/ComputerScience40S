/** Required package class namespace */
package testing;

import testing.classes.Person;
import testing.classes.Student;


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
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)  
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // We can also change (mutate) the properties of this object
        person.name = "Per Sony";
        person.gender = "non-binary";
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have access to 
        // that - for example:
        
        // person.age = 15; // We cannot change this encapsulated property
        
        // Recall our methods... (to see the changes to the properties)
        person.talk();
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        // person.born();
        
        // This method was later made "private" as well so the method can no
        // longer be called by this class outside the "Person" class (it is
        // now a private, encapsulated, helper, utility method)
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object
        Person joe = new Person("Joe Smoe", 17, "male");
        joe.talk();
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class
        Student student = new Student();
        student.talk();
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes!");
    }
    

}
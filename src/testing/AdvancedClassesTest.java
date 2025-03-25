/** Required package class namespace */
package testing;

import testing.classes.Person;


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
        
        //person.born();
        
        // We can also change (mutate) the properties of this object
        person.name = "Per sony";
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have
        // access to that - for example:
        // person.age = 15; // We cannot change this encapsulated property
        
        person.gender = "male";
        
        // Recall our methods... (to see any changes)
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }
    

}
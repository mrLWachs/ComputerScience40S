
/** Required package class namespace */
package testing;

import testing.classes.Person;

 
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
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes test!");
    }
     
}

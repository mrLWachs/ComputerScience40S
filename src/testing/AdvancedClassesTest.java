
/** Required package class namespace */
package testing;

import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since March 2023
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
        System.out.println("\nAdvanced Classes Test started...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Sir Fitgerald The 4th";
        // person.name = "Peter Parker";
        
        // person.gender = "non-binary";
        // person.gender = "spider";
        // person.age = 17;
        // person.alive = false;
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Instantiate (means create an "instance of") a student object        
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Student Studenty";
        // We can also change some of the porperties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        student.die();
        student.talk();
        
        // Instantiate a second student object
        Student amber = new Student("Amber Aligawesa", 15, "female");
        amber.talk();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes Test complete!\n");
    }    

}
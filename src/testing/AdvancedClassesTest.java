
/** required package class namespace */
package testing;

import testing.advancedclasses.Person;
import testing.advancedclasses.Student;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:43:07 a.m.
 */
public class AdvancedClassesTest 
{
    
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes unit starting...\n");
        
        // use the class to create an object with the default constructor
        // Class object = new Class(); <- constructor method
        Person person = new Person();
        person.talk();
        person.age = 10;
        person.talk();
        
        Student student = new Student(666);
        student.talk();
        
        
        
        
        System.out.println("\nAdvanced classes unit complete!\n");
    }    

}

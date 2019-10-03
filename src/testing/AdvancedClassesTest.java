
/** required package class namespace */
package testing;

import testing.advancedclasses.Person;


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
        
        // using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        
        System.out.println("\nAdvanced classes unit complete!\n");
    }    

}

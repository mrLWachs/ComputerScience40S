

/** required package class namespace */
package testing;

import testing.advancedclasses.Person;

 
/**
 * AdvancedClassesTest.java - description
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 9:56:32 a.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced Classes test started...\n");
        
        Person person = new Person();
        
        person.talk();
        
        
        System.out.println("\nAdvanced Classes test complete!\n");
    }

   
}

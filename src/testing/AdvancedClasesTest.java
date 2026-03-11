/** Required package class namespace */
package testing;

import testing.classes.Person;


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
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes!");
    }
    

}
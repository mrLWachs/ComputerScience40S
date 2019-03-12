
/** required package class namespace */
package testing.advancedclasses;

/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since 09-Mar-2019  
 */
public class AdvancedClassesTest 
{
    
    /** 
     * Default constructor for the class 
     */
    public AdvancedClassesTest() {
        System.out.println("\nStarting advanced classes testing...\n");
        
        // using the class to create an object with the default constructor:
        Person person = new Person();
        //class object = call constructor method (default)
        person.talk();
        // calls the method in the class object
        
        // class using inheritance
        Student student = new Student(99);
        student.talk();
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        Object object = new Object();
        
        // testing equals method:        
        Person sam = new Person();
        sam.isMale = true;
        if (person.equals(sam)) {
            System.out.println("==");
        }
        else {
            System.out.println("!=");
        }
        
        System.out.println("\nCompleted advanced classes test!\n");
    }
    
}

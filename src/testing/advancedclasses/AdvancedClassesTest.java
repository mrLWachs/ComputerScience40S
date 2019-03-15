
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
        Object object1 = new Object();
        Object object2 = object1;                       // parent of all classes
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        if (object1.equals(object2)) {                  // the equals method
            System.out.println("object 1 == object 2");
        }
        
        // testing equals method:        
        Person sam = new Person();
        sam.isMale = true;
        if (person.equals(sam)) {                       // equals overloaded
            System.out.println("person == sam");
        }
        
        sam.age    = 25;
        sam.isMale = true;
        sam.setName("Samuel Samson");                   // mutator method used
        Person samClone = sam.clone();                  // clone method
        System.out.println(samClone.toString());        // toString overloaded
        System.out.println(sam.toString());             // display clone
        if (sam.equals(samClone)) {
            System.out.println("sam == sam clone");
        }
        
        
        
        System.out.println("\nCompleted advanced classes test!\n");
    }
    
}

  
/** Required package class namespace */
package testing;

/** Required imports */
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
        System.out.println("\nStarting Advanced classes...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)        
        Person person = new Person();
        person.name = "Dave Smith"; // "public" properties can be accessed
        // person.age = 16; // Can't change "private" (encapsulated) properties
        person.talk();  // Call one of the methods in this object (of the class)
        
        // Instantiate (create) and object of type student        
        Student student = new Student("Smelly Teenager",17,101);        
        student.talk();                     // Inherited method from person
        student.study();                    // Method for just this class
        
        // The Object class (parent class of all classes)
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
       
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;
        
        // Built into the Object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this
        // unit, and others like:
        
        // The toString(), clone(), and equals() methods
        
        System.out.println("Object 1 is " + object1.toString());
        System.out.println("Object 2 is " + object2.toString());
        System.out.println("Object 3 is " + object3.toString());
        
        // Use the equals method to check if two objects are "equal"
        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Check the over-ride of the toString() and equals() in person
        // Create 3 person identifier names, but only one memory location for
        // all three
        
        Person person1 = new Person();
        Person person2 = person1;
        Person person3 = person2;
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person2.toString());
        System.out.println("P3 = " + person3.toString());
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        Student student1 = new Student("S1", 1, 1);
        Student student2 = new Student("S2", 2, 2);
        Student student3 = new Student("S1", 1, 1);
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        
        if (student1.equals(student2)) System.out.println("S1==S2");
        if (student2.equals(student3)) System.out.println("S2==S3");
        if (student1.equals(student3)) System.out.println("S1==S3");  
            
            
            
            
            
            
        
        
        
        
        
        System.out.println("\nCompleted Advanced classes!\n");
    }

}

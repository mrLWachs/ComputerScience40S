
/** Required package class namespace */
package testing;

/** Required imports */
import testing.unit3.Person;
import testing.unit3.Student;
import testing.unit3.Teacher;


/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 11-Mar-2022, 3:20:05 PM
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
        System.out.println("\nAdvanced classes test started...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // To create a "person" (add a class called "Person" to this Java 
        // project). To do this in NetBeans, click on File - New File (or 
        // the icon on toolbar) and a dialog will appear and you select 
        // "Java" and "Java Class". Then give the class a name (which always
        // starts with a capital letter and uses camel casing). Then click 
        // finish. This relates to a familiar line of code from CS20S like:
        // Random random = new Random();
        
        Person person = new Person();                   // A person object
        // Class object = new Class() <--- implies a method?
        // That is the call to the constructor method
        
        // Now call (invoke) a method within the object
        person.talk();                                  // Calls class method 
        
        // Construct another person object (instance) using our second
        // overloaded constructor method        
        Person hippo = new Person("Aaech Ippouh Potimus",75,"he/him");
        
        // Use (call, invoke) other methods and change (modify) properties
        hippo.talk();
        hippo.birthday();
        hippo.talk();
        hippo.gender = "they";
        hippo.talk();
        hippo.die();
        hippo.talk();
        // hippo.age     = 16;   // Cannot do this, property is locked (private)
        // hippo.isAlive = false; // Cannot do (access) this! (encapsulated)
        
        // Instantiate (create) a Student object and call it's methods 
        // (including the ones it inherited from the Person class) 
        Student student = new Student();
        
        // Call (invoke) any inherited methods, or change any inhertited 
        // properties from the Person class
        student.talk();
        student.name = "Slacker Teenager";
        student.birthday();
        student.talk();
        student.die();
        student.talk();
        
        // Call (invoke) any methods just for this class, or change any  
        // properties from the Student class and create (instantiate) another
        // student object (instance)
        Student slappy = new Student("Jaden Smith",17,"male");
        slappy.study();
        slappy.talk();          // This is a call to an over-ride method
        slappy.slackOff();
        slappy.cram();
        slappy.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Mr. Chan Miyagi");
        teacher.add(student);           // Associate object through method
        teacher.add(slappy);            // Associate object through method
        teacher.teach();                // Effect associated objects
        teacher.talk();                 // Inherited method invoked
        
        // The "Object" class....
        // Is built into Java (notice all classes start with a capital)
        // The parent (or "super class") of ALL classes (includes classes 
        // already created like "String" or "JOptionPane" and classes we
        // create like "Person" or "Book") - means we will be inheriting 
        // the properties and methods of the Object class
        
        Object object1 = new Object();      // 1st instance of the object class
        Object object2 = new Object();      // 2nd instance of the object class
        Object object3 = object2;
                        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: toString() and equals() methods
        
        System.out.println("object1 as a string is " + object1.toString());
        System.out.println("object2 as a string is " + object2.toString());
        System.out.println("object3 as a string is " + object3.toString());
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory 
        
        // This method is inherited by all sub classes (children), for example:   
        System.out.println("Person  = " + person.toString());
        System.out.println("Student = " + student.toString());
        System.out.println("Teacher = " + teacher.toString());
        
        // Seeing the object class as the parent class of classes we don't write
        String string = new String("puppy");
        System.out.println("String = " + string.toString());
        
        // Primitive data types (like "int") also have a "class" version (or 
        // a "big daddy" version) - also know as the "wrapper" class        
        Integer integer = new Integer(7);
        System.out.println("Integer = " + integer.toString());
        
        // Test the built-in equals method (inherited from the Object class)
        // checks if two objects are "equal" by using the "memory address" of 
        // each object and checks if the two objects being compared use the 
        // same address (true) or not (false) 
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object1.equals(object3)) System.out.println("O1==O3");
        if (object2.equals(object3)) System.out.println("O2==O3");
        
        // Now since these two methods are inherited by ALL class objects, we
        // can use this methods with Person class objects:
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three  
        Person person1 = new Person();  // Creates a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person2.toString());
        System.out.println("P3 = " + person3.toString());
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person1.equals(person3)) System.out.println("P1==P3");
        if (person2.equals(person3)) System.out.println("P2==P3");
        
        // Then we will over-ride the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced classes test complete!\n");
    }
    
}
  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;


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
        
        // All classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
       
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;           // Same address as the first object
        
        // Built into the Object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this
        // unit, and others like the toString(), clone(), and equals() methods
        
        // The toString() method of the object class outputs information 
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory
        
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // The equals() method of the object class checks if two objects are 
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)
        
        if (object1.equals(object2)) System.out.println("O1 == O2");
        if (object2.equals(object3)) System.out.println("O2 == O3");
        if (object1.equals(object3)) System.out.println("O1 == O3");
        
        // Now since these two methods are inherited by ALL class objects, we
        // can use this methods with Person class objects:
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three 
        
        Person person1 = new Person();
        Person person2 = person1;           // Same address as the first object
        Person person3 = person2;           // Same as address 2 (which is 1)
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person2.toString());
        System.out.println("P3 = " + person3.toString());
                
        if (person1.equals(person2)) System.out.println("P1 == P2");
        if (person2.equals(person3)) System.out.println("P2 == P3");
        if (person1.equals(person3)) System.out.println("P1 == P3");
        
        // Then we will over-ride the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
                        
        Student student1 = new Student("Name1", 10, 100);
        Student student2 = new Student("Name2", 20, 200);
        Student student3 = new Student("Name1", 10, 100);
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        
        if (student1.equals(student2)) System.out.println("S1 == S2");
        if (student2.equals(student3)) System.out.println("S2 == S3");
        if (student1.equals(student3)) System.out.println("S1 == S3");  
            
        // Test the deep clone method making a perfect clone with new memory
        // allocated and test the equals and toString method. With the println
        // method, it will call the toString method of an object automatically
        
        Person  personClone  = person.clone();
        Student studentClone = student.clone();
        
        if (person.equals(personClone))   System.out.println(personClone);
        if (student.equals(studentClone)) System.out.println(studentClone);
        
        // Teacher class uses inheritance ("is a" person), and association
        // ("has a" person)
        
        Teacher teacher = new Teacher("Ms. Teacherson");
        System.out.println(teacher);
        
        // "Give our teacher some students" - mean we will assign a student
        // object (or "instance") to the index of the array property of the
        // teacher object
        
        teacher.students[0] = student;
        teacher.students[1] = student1;
        teacher.students[2] = student2;
        teacher.students[3] = student3;
        teacher.students[4] = studentClone;
        
        // Output our teacher again
        System.out.println(teacher.toString());
        
        System.out.println("\nCompleted Advanced classes!\n");
    }

}


/** Required package class namespace */
package testing;

import javax.swing.JOptionPane;
import testing.classes.HighSchool;
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;

/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since October, 2022
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
        System.out.println("\nAdvanced Classes testing begins...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // Try to change (modify) some of our properties
        person.name = "Demitrius Demarkus the 3rd";
        // person.gender = "non-binary";
        person.setGender("non-binary");
        // person.age = 7; // Cannot do this, property is "locked" (private)
        // person.alive = false; // Cannot do (access) this! (encapsulated)
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.die();
        person.talk();
        
        // Instantiate (create) an object of type Student...
        Student student = new Student();
        student.birthday();             // Inherited method from parent class
        student.study();                // This method is only in student
        student.cram();                 // This method modifies the private
        student.slackOff();             // encapsulated property (gpa)
        student.talk();                 // The over-ride method
        
        // Instantiate a second student object
        Student keyAndPeele = new Student("Hingle McCringleberry",17,"male");
        keyAndPeele.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Professor Snape");
        teacher.add(student);           // Associate object through method
        teacher.add(keyAndPeele);       // Add another student object
        teacher.teach();                // Effect associated objects
        teacher.talk();                 // Inherited method invoked        
        student.talk();                 // Test the teach method
        keyAndPeele.talk();              
        
        // The Object class (parent class of all classes)
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes    
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: 
        //      toString()
        //      equals()
        //      clone()
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory 
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // This method is inherited by all sub classes (children), for example: 
        System.out.println("Person  = " + person.toString());
        System.out.println("Student = " + student.toString());
        System.out.println("Teacher = " + teacher.toString());
        
        // Seeing the object class as the parent class of classes we don't write
        String string = new String("squirrel");
        System.out.println("String = " + string.toString());
        // The string class over-rides the toString() method here
        
        // Another "built-in" object...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane = " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)         
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three   
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person1.toString());
        System.out.println("P3 = " + person1.toString());
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Then we will over-ride the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        
        // Testing the clone() method:
        Person clonePerson = person.clone();
        System.out.println("Person is " + person.toString());
        System.out.println("Clone  is " + clonePerson.toString());
        if (person.equals(clonePerson)) System.out.println("Clone is ==");
        
        // Change one of the properties of our second object
        clonePerson.birthday();
        if (person.equals(clonePerson)) System.out.println("Clone is still ==");
        
        // Now we will do the same thing to the student class and over-ride the
        // toString(), equals(), and clone() methods we inherited from the 
        // object class:
        Student student1 = new Student("Name1",10,"Student1");
        Student student2 = new Student("Name2",20,"Student2");
        Student student3 = new Student("Name3",30,"Student3");
        
        // Use methods to alter (change, modify, mutate) the encapsulated
        // (inside the class) property through a method        
        student1.slackOff();
        student2.study();
        student3.cram();
        
        // When doing an output (like System.out... you "can" call "toString()"
        // but it often calls it automatically for you        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        // Now output the static variable of each object and you will notice
        // how we get the same output for each student instance as they all
        // "share" the same access to the same static variable
        
        System.out.println("S1 total = " + student1.total);
        System.out.println("S2 total = " + student2.total);
        System.out.println("S3 total = " + student3.total);
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        person.endTheWorld();
        person1.endTheWorld();
        teacher.endTheWorld();
        student.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        HighSchool.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes testing complete!\n");
    }
    
}

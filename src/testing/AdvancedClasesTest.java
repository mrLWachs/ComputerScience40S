/** Required package class namespace */
package testing;

import javax.swing.JOptionPane;
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


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
        
        // =====================================================================
        // (1) REVIEW: Classes (properties and methods)
        // =====================================================================
        
        // A class is a way in code to combine properties and methods. Classes 
        // can also "communicate" with other classes, and they are used to 
        // model "things" in the "real" world. Properties: are things about 
        // the class, or descriptors, or adjectives (they can also be seen as 
        // "global variables" for the class). Methods: are things the class can 
        // do, or actions, or verbs (they are written with parameters, return 
        // types, etc.)
        
        // Using the class (like a "cookie cutter") to create an object of that
        // class (like a "cookie")
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // =====================================================================
        // (2) REVIEW: Encapsulation (private and public)
        // =====================================================================
        
        // A concept applied to both properties and methods of classes to 
        // determine if they can be "used" only within the class or by other 
        // classes "communicating" with this class. private - this modifier 
        // word means the property can only be accessed and changed within the 
        // class (not from other classes) and if used with methods, the methods 
        // can only be called by other methods inside the class (sometimes call 
        // "helper" or "utility" methods). public - this modifier word means the 
        // property can be accessed and changed within the class and outside the 
        // class (from other classes) and if used with methods, the methods can 
        // be called anywhere (inside or outside the class)
        
        // We can NOT access private properties or methods. If I try to change
        // ("modify") a property ("variable") of the Person class that is set 
        // to be "private" I do NOT have access to that. With methods, you
        // cannot call the private (encapsuilated, utility, helper) methods 
        // outside the class...
        
        // person.alive = false;        // Cannot change encapsulated properties
        // person.age = 15;
        // person.born();                    // Cannot call encapsulated methods         
        // This method was later made "private" as well so the method can no
        // longer be called by this class outside the "Person" class (it is
        // now a private, encapsulated, helper, utility method)
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Per sony";
        person.gender = "non-binary";
        person.birthday();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object
        Person fhorhea = new Person("Fhorhea DeGuzmann", 37, "fluid");
        fhorhea.talk();
        
        // =====================================================================
        // (3) REVIEW: Inheritance (super and child class)
        // =====================================================================
        
        // The ways two or more classes of code "communicate" with each other 
        // to transfer data or represent (model) a "real world" relationship of 
        // concepts. Inheritance - this is where one class "inherits" all the 
        // properties and methods of the other class - like biology you can 
        // have a parent (or "super" or "base") class and a child (or "sub") 
        // class that inherits from the parent class - this is also simply put 
        // as a "is a" relationship. 
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class
        Student student = new Student();
        student.talk();
        
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change age directly because it is encapsulated (private)
        student.name = "Stu Denty";
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.birthday();
        student.talk();
        
        // Create another student... (simple language)
        Student wave = new Student("Waverly Micron", 0, "photon", 299792458);
        wave.talk();
        wave.study();
        wave.talk();
        wave.cram();
        wave.talk();
        wave.slackOff();
        wave.talk();
        
        // You cannot call encapsulated (private) methods!
        // wave.secret();
        
        // But, we can still call inherited methods...        
        wave.birthday();
        wave.die();
        wave.talk();
        
        // =====================================================================
        // (4) REVIEW: Association ("has a" vs. "is a")
        // =====================================================================
        
        // Association - this is where one class and another class "use" one 
        // another - this can be also classified as a "usage" (one class using
        // the other), or "composition" (one class composed of another) 
        // relationship - this is also simply put as a "has a" relationship
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Albert Von Shnapsfickle");
        teacher.talk();                           // Invoke an overloaded method
        teacher.add(student);                 // Associate object through method
        teacher.add(wave);                         // or "Teacher has a Student"
        // See if the teacher object is effected by its associated class objects
        // (those being the two student objects...)
        teacher.talk();                      // Reinvoking the overloaded method
        teacher.birthday();
        teacher.die();
        teacher.talk();
        
        // Now that the review of CS30S content (introduction: variables, 
        // conditional statements, looping, methods, arrays and specifically 
        // classes) is completed, we can now start looking at the new CS40S
        // advanced classes content.............................................
        
        // =====================================================================
        // (5) ADVANCED: Object class
        // =====================================================================
        
        // The Object class - this class already exists (we don't write it) it 
        // is part of Java, all Java project "have it". It is "built-into" all 
        // Java classes - it acts as the parent (or super-class) of all classes 
        // (including the new ones we write) - which means all classes inherit 
        // the methods of this class
                
        Object object = new Object();
        
        // =====================================================================
        // (6) ADVANCED: toString, equals, clone
        // =====================================================================
        
        // The Object class has NO properties, but does have methods that we can
        // and often SHOULD over-ride. All classes (including ones we create) 
        // inherit from the object class, which is the parent (super) class of 
        // all classes. Built into the object class are a number of methods that
        // all other classes inherit. These include some that are not relevant
        // in this unit, and others like these: 
        //      toString()
        //      equals()
        //      clone()
        
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // We will now output the 3 objects, using the "toString()" method
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory...   
        
        System.out.println("object1 as a string is " + object1.toString());
        System.out.println("object2 as a string is " + object2.toString());
        System.out.println("object3 as a string is " + object3.toString());
        
        // Since the "Object" class is the "parent" (or super-class) of ALL
        // classes (even our classes we wrote, for example "Person"). Then
        // all child classes inherit the "toString" method...  
        
        System.out.println("Person  as a string is " + person.toString());
        System.out.println("Student as a string is " + student.toString());
        System.out.println("Teacher as a string is " + teacher.toString());
        
        // This true for classes we don't write, that are built-in to Java (like
        // the "String" and "JOptionPane" class) as well...   
        String string = new String("onomatopoeia");
        System.out.println("String as a string " + string.toString());
        
        JOptionPane jop = new JOptionPane();
        System.out.println("JOptionPane as a string is " + jop.toString());
        
        // So why is this last output not using the "toString()" method it 
        // inherited from "Object" which gives a memory address? The answer is 
        // that the String class "over-rides" the toString method and that 
        // over-ride version of "toString()" method is called instead. We can 
        // and will over-ride the toString method on all our classes 
        // (Person, Student, Teacher) and all classes to come. We will help to
        // automate this process using another modification to the NetBeans 
        // templates: (1) open the "ComputerScience40S.java" file from when
        // we originally created this NetBeans project, (2) scroll down to the
        // comments at the bottom of this file and comment 35 and follow its
        // instructions (if you are missing these comments, go instead to this
        // webpage: https://bit.ly/4nxivtB ). Now go back to the Person, 
        // Student, and Teacher classes and add these three over-ride methods
        // and then re-run this code to see the over-ride in the outputs
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)...
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three...
        Person p1 = new Person();
        Person p2 = p1;
        Person p3 = p2;
        
        if (p1.equals(p2)) System.out.println("P1==P2");
        if (p2.equals(p3)) System.out.println("P2==P3");
        if (p1.equals(p3)) System.out.println("P1==P3");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes!");
    }
    

}
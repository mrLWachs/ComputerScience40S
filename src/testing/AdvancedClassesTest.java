
/** Required package class namespace */
package testing;

import javax.swing.JOptionPane;
import testing.classes.Athlete;
import testing.classes.DiskJockey;
import testing.classes.Doctor;
import testing.classes.HighSchool;
import testing.classes.Husky;
import testing.classes.Meeting;
import testing.classes.MrWachs;
import testing.classes.Person;
import testing.classes.Piper;
import testing.classes.Student;
import testing.classes.Teacher;


/** 
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs 
 * @since March 2023
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
        System.out.println("\nAdvanced Classes Test started...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Per Soney";
        
        // The code below would generate errors because of encapsulation......        
        // person.gender = "non-binary";
        // person.age = 17;
        // person.alive = false;
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Instantiate (means create an "instance of") a student object        
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Stu Denty";
        // We can also change some of the porperties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        student.die();      // Inherited method from Person (parent/super) class
        student.talk();
        
        // Instantiate (means "create") a second Student object (instance)
        Student stewie = new Student("Stewie Griffin", 2, "cat");
        stewie.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Mr. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.talk();                 // Call again (to see any changes)
        teacher.teach();                // Effect the associated objects
        teacher.talk();                 // See the results from the teacher
        student.talk();                 // and the 2 students
        stewie.talk();
        
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
        
        // The method (toString) is inherited by ALL sub classes (children)
        // of the Object class - remember the Object class is the parent or
        // super class of ALL classes - so they all inherit toString, including
        // classes we write...
        System.out.println("Person  as string = " + person.toString());
        System.out.println("Student as string = " + student.toString());
        System.out.println("Teacher as string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...        
        String string = new String("squirrel");
        System.out.println("String  as string = " + string.toString());
        
        // Another example of "built-into" Java class level object that inherits
        // all the methods (including toString) from the Object class...        
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as string = " + joptionpane.toString());
        
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
        
        // Now we will test the "over-loaded" equals method in the Person class
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Now reinstantiate (recreate) the 3 person object with new properties
        person1 = new Person("1", 0, "1");
        person2 = new Person("1", 0, "2");
        person3 = new Person("1", 0, "2");
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Have over-ridden the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // objec1t version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        // Now we also over-rode the clone method
        
        // Testing the clone() method:
        Person clone = person.clone();
        System.out.println("Person is " + person.toString());
        System.out.println("Clone  is " + clone.toString());
        if (person.equals(clone)) System.out.println("Clone is ==");
        
        // Change one of the properties of our second object
        clone.birthday();
        if (person.equals(clone)) System.out.println("Clone is still ==");
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        // Now output the static variable of each object and you will notice
        // how we get the same output for each student instance as they all
        // "share" the same access to the same static variable        
        System.out.println("S1 total = " + student.total);
        System.out.println("S2 total = " + stewie.total);
        
        // We create (instantiate) 2 more Student objects...
        Student student3 = new Student();
        Student student4 = new Student("4", 4, "4");
        
        // And output the shared/static property of those new instances
        System.out.println("S3 total = " + student3.total);
        System.out.println("S4 total = " + student4.total);
        
        // Mutate (change) that static variable directly (in one instance)
        stewie.total = 9;
        
        // Output the static variable again - showing that it changed (mutated) 
        // ALL the instances (all the student obejcts) since that varaible is
        // modified to be static        
        System.out.println("S3 total = " + student3.total);
        System.out.println("S4 total = " + student4.total);
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        // Instantiate some other classes:
        Doctor     doctor     = new Doctor();
        DiskJockey diskJockey = new DiskJockey();
        MrWachs    mrWachs    = new MrWachs();
        Piper      piper      = new Piper();
        Husky      husky      = new Husky();
        Athlete    athlete    = new Athlete();
                
        // And output those objects (remember the "toString() method is called
        // automaitcally by the println() method)
        System.out.println(doctor);
        System.out.println(diskJockey);
        System.out.println(mrWachs);
        System.out.println(piper);
        System.out.println(husky);
        System.out.println(athlete);
                
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
           
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        meeting.attend(person);
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);
        meeting.attend(clone);
        meeting.attend(student);
        meeting.attend(stewie);
        meeting.attend(student3);
        meeting.attend(student4);
        meeting.attend(teacher);
        meeting.attend(doctor);
        meeting.attend(diskJockey);
        meeting.attend(mrWachs);
        meeting.attend(piper);
        meeting.attend(husky);
        meeting.attend(athlete);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes Test complete!\n");
    }   
    
}
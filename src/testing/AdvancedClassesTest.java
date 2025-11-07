
/** Required package class namespace */
package testing;

/** Required imports */
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since Oct 6, 2025
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
        System.out.println("Start learning Advanced Classes...");
        
        // Using the class (like a "cookie cutter") to create an object of that
        // class (like a "cookie")
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a "instance", or even a "variable"
        
        // We call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // We can NOT access private properties or methods...
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have
        // access to that. With methods, you cannot call the private 
        // (encapsuilated, utility, helper) methods outside the class...
        
        // person.alive = false;        // Cannot change encapsulated properties
        // person.age = 15;
        // person.born();                    // Cannot call encapsulated methods 
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Per sony";
        person.birthday();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object        
        Person tom = new Person("Tom Williams",18,"male");
        tom.talk();
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class - invoking our default constructor
        Student student = new Student();
        student.talk();
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.name = "Stu Denty";
        student.birthday();
        student.talk();
         
        // Create another student... (simple language)        
        Student grand = new Student("Grandma Sweetie",72,"male",102);
        grand.talk();
        grand.study();
        grand.talk();
        grand.slackOff();
        grand.talk();
        grand.cram();
        grand.talk();
        grand.die();
        grand.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.add(student);                 // Associate object through method
        teacher.add(grand);                        // or "Teacher has a Student"
        teacher.talk();                           // Invoke an overloaded method
        teacher.birthday();                // Invoke (call) the inherited method
        teacher.die();
        // See if the teacher object effected its associated class objects
        // those being the two student objects...
        teacher.talk();
        
        // Now the review of CS30S content (introduction: variables, conditional
        // statements, looping and methods and arrays and classes)..............
        
        // Now new CS40S advanced classes content...............................
        
        // The Object class - this class already exists (we don't write it) it 
        // is part of Java, all Java project "have it". Also, the Object class 
        // is the parent (super) class of ALL classes        
        Object object = new Object();
        
        // This class has NO properties, but does have methods that we can and
        // often SHOULD over-ride. All classes (including ones we create) 
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
        // is stored in this computer's memory 
        
        System.out.println("object1 as a string is " + object1.toString());
        System.out.println("object2 as a string is " + object2.toString());
        System.out.println("object3 as a string is " + object3.toString());
        
        // Since the "Object" class is the "parent" (or super-class) of ALL
        // classes (even our classes we wrote, for example "Person"). Then
        // all child classes inherit the "toString" method...
        
        System.out.println("Person  as string is " + person.toString());
        System.out.println("Student as string is " + student.toString());
        System.out.println("Teacher as string is " + teacher.toString());
        
        // This true for classes we don't write, that are built-in to Java (like
        // the "String" class) as well...
        
        String string = new String("gubernatorial");
        System.out.println("String as a string is " + string.toString());
        
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
        // (false)  
        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Using our previously created Person objects with equals
        if (person.equals(tom)) System.out.println("person==tom");
        
        // This also applies to the "String" class which obviously over-rides
        // the "equals" method to compare the string lexographically...
        String s1 = "cat";
        String s2 = "cat";        
        if (s1.equals(s2)) System.out.println("S1==S2");
        
        // Now we can over-ride the "equals" method in the Person, Student,
        // and Teacher classes to customize the "equality" of comparing 
        // those objects...
        Student student1 = new Student();
        Student student2 = new Student();
        if (student1.equals(student2)) System.out.println("Students are equal");
        
        Teacher teacher1 = new Teacher("teacher");
        Teacher teacher2 = new Teacher("teacher");
        if (teacher1.equals(teacher2)) System.out.println("Teachers are equal");
        
        // Now we will also over-ride the "clone" method in the 3 classes...
        
        // Object clone1 = object1.clone();
        
        // We cannot call the "clone" method directly from the "Object" class
        // (but we can "over-ride" the clone() method in all sub-classes)
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }

}

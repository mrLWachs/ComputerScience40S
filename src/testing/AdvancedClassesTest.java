
/** Required package class namespace */
package testing;

/** Required imports */
import testing.classes.Athlete;
import testing.classes.Doctor;
import testing.classes.DragQueen;
import testing.classes.Husky;
import testing.classes.Meeting;
import testing.classes.MrWachs;
import testing.classes.Person;
import testing.classes.Piper;
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
        // be called a "instance", or even a "variable"
        
        // We call (invoke) one of our methods in this object ("instance") 
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
        
        // We CAN access public properties and we CAN call public methods...
        person.name = "Per sony";
        person.birthday();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object        
        Person tom = new Person("Tom Williams",18,"male");
        tom.talk();
        
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
        
        // =====================================================================
        // (4) REVIEW: Association ("has a" vs. "is a")
        // =====================================================================
        
        // Association - this is where one class and another class "use" one 
        // another - this can be also classified as a "usage" (one class using
        // the other), or "composition" (one class composed of another) 
        // relationship - this is also simply put as a "has a" relationship
        
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
        // (false)...
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three...
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Using our previously created Person objects with equals..
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
        // (but we can "over-ride" the clone() method in all sub-classes)...        
        Person  clone2 = person1.clone();
        Student clone3 = student1.clone();
        Teacher clone4 = teacher1.clone();
        
        System.out.println("Person  1: " + person1.toString());
        System.out.println("Clone   2: " + clone2.toString());
        System.out.println("Student 1: " + student1.toString());
        System.out.println("Clone   3: " + clone3.toString());
        System.out.println("Teacher 1: " + teacher1.toString());
        System.out.println("Clone   4: " + clone4.toString());
        
        // =====================================================================
        // (7) ADVANCED: static modifier
        // =====================================================================
        
        // Using a static variable: these are variables get instantiated "once" 
        // and all objects "share" a reference to that same memory location 
        // (means the "static" variable "belongs" to the class not the object).        
        // We added a static variable to the Student class, and then outputted
        // it for two different objects of the Student class, and you will 
        // notice how we get the same output for each student instance as they 
        // all "share" the same access to the same static variable ... 
        
        System.out.println("Student total = " + student.total);
        System.out.println("Student total = " + grand.total);
        
        // Note: the word "total" is given a "warning" in NetBeans (the yellow
        // squiggly line) because you normally access static properties from 
        // the "class" refernce rahter than an object reference (but this code
        // is still allowed)
        
        // Now create (instantiate) 2 more Student objects...
        Student s4 = new Student();
        System.out.println("S4 total = " + s4.total);
        
        Student s5 = new Student("5",5,"5",5);        
        System.out.println("S5 total = " + s5.total);
        
        // Use static variables/properties carefully, you can still modify 
        // them and may have unexpected results
        grand.total = 10;
        System.out.println("S5 total = " + s5.total);
        
        // Coming up, we will look at the dangers of making properties "public"
        // and not encapsualting them when we look: accessors and mutators...
        
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
        MrWachs.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        // NOTE: we generally call static methods and access static properties 
        // from the Class reference (class name) not the object reference 
        // (the names of the instances)
        
        // =====================================================================
        // (8) ADVANCED: protected modifier 
        // =====================================================================
        
        // This modifier word like public and private changes the encapsulation 
        // level or properties and methods. Like the modifier private - the 
        // protected modifier word means the property can only be accessed and 
        // changed within the class BUT can also be accessed by any children 
        // (sub classes) of this class (this is also true of methods)
        
        // The "protected" modifier means the "alive" property of the "Person"
        // class cannot be accessed from the "AdvancedClassesTest" class
        // because it is not related to the "Person" class through inheritance
        // (it is only related through association or "has a")

        // person.alive = false;
        
        // Also, the "yelling()" method in the "Teacher" class is also a method 
        // marked as "protected" which means that method cannot be called in 
        // the "AdvancedClassesTest" class (as this class is only related 
        // through association) and can only be called from classes (like the
        // "MrWachs" class) that are related to the "Teacher" class through
        // inheritance
        
        // teacher.yelling();
        
        // =====================================================================
        // (9) ADVANCED: accessors and mutators
        // =====================================================================
        
        // These are the names given to two types of specific methods you can 
        // write and are commonly written in other's code. Accessor - also known 
        // as a "get" (or "getter") method, will always return a property value 
        // that is being retrieved or "accessed" (usually one that is 
        // encapsulated). Mutator - also known as a "set" (or "setter") method, 
        // will always have a parameter(s) to modify (or "change") a property 
        // value (often one that is encapsulated). Accessor / Mutators often 
        // have error checking code so the properties can remain encapsulated 
        // but still "used"
        
        // Calling an accessor (or getter) method on this object of the Person
        // class (which is a private, encapsulated property)   
        int age = person.getAge();
        System.out.println("Person age is " + age);
        // Now using the other (inherited) accessor method of a Teacher object
        // which inherited the accessor method from its parent class
        System.out.println("Teacher alive is " + teacher.getAlive());
        
        // Calling a mutator (or setter) method on this object's porperty
        // (which is a protected property) 
        teacher.setAlive(true);
        System.out.println("Teacher alive is " + teacher.getAlive());
        
        // =====================================================================
        // (10) ADVANCED: polymorphism
        // =====================================================================
        
        // Is the idea that our code can adapt or change ("morph") to many 
        // ("poly") different types of objects. For example, a method that can 
        // take a class type as a parameter will accept all objects of that type
        // - but also all children (sub-class) objects of that class as well
        
        // Instatiate (make an "instance" aka "object") of the classes...
        Doctor     doctor    = new Doctor();
        DragQueen  dragQueen = new DragQueen();
        MrWachs    mrWachs   = new MrWachs();
        Husky      husky     = new Husky();
        Piper      piper     = new Piper();
        Athlete    athlete   = new Athlete();
        // Intentially leaving out "HighSchool"
        
        // Output these new objects, the "toString()" method is automatically 
        // called by System.out.println() so we can just pass the object itself
        System.out.println(doctor);
        System.out.println(dragQueen);
        System.out.println(mrWachs);
        System.out.println(husky);
        System.out.println(piper);
        System.out.println(athlete);
        
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
        
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism
        meeting.attend(person);
        
        // NOTE: in NetBeans, if you remove the argument from the method call
        // of a method like "attend()" (meaning remove the word "person") and
        // leave empty brackets and then with your cursor between the brackets, 
        // you press CTRL + SPACEBAR, NetBeans will show you all the potential 
        // arguments that are valid for this method (up to a line)
        meeting.attend(athlete);
        meeting.attend(doctor);
        meeting.attend(dragQueen);
        meeting.attend(husky);
        meeting.attend(piper);
        meeting.attend(grand);
        meeting.attend(tom);
        meeting.attend(teacher);        
        meeting.attend(mrWachs);
        
        // =====================================================================
        // (11) ADVANCED: enhanced for loop
        // =====================================================================
        
        // In the Meeting class the hold() method, demonstrates the use of an 
        // enhanced for loop. This is an alternative (not needed) way to 
        // implement a for loop. It can be used with arrays (of objects) and 
        // collections (next unit). IDEs (like NetBeans) can often write this 
        // loop for you with CTRL + SPACE after writing "for" or type "fore" 
        // and tab (and are often suggested to be used with the "light bulb").
        // It should be "read" as "for every item in items...". It do not have 
        // a counter variable, automatically "knows" where to start and stop 
        // looping (to match the collection/array) and automatically advances 
        // each time through the loop 
        
        // Here is a simple example of the enhanced for loop....................
        
        // String[] dogs = { "Golden Retriever", "German Shapard", "Poodle",
        //                   "Husky", "Bulldog", "Pug", "Irish Wolfhound"};
        
        // Traditional for loop: would be...
        // for (int i = 0; i < dogs.length; i++) {
        //     System.out.println(dogs[i]);
        // }
        
        // Enhanced for loop: would look like...
        // for (String dog : dogs) {
        //     System.out.println(dog);
        // }
        
        // =====================================================================
        // (12) ADVANCED: instanceof
        // =====================================================================
        
        // In the Meeting class the hold() method, also demonstrates the use of
        // the instanceof operator. This operator keyword is a way to determine
        // if an object / instance "comes from" a certain class. It is kind of 
        // like the "==" operator but for classes and objects. It can be used 
        // in an "if" statement. You put the object / instance on the left hand 
        // side (LHS) and the class type on the right hand side (RHS). It 
        // "returns" a boolean (true / false)
        
        meeting.hold();
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }

}

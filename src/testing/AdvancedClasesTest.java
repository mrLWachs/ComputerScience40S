/** Required package class namespace */
package testing;

import javax.swing.JOptionPane;
import testing.classes.Athlete;
import testing.classes.CaveDiver;
import testing.classes.Doctor;
import testing.classes.Husky;
import testing.classes.MrWachs;
import testing.classes.Person;
import testing.classes.Piper;
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
        
        // Later in this unit we had to go back and comment this next line out 
        // as we were learning new things that effected it working properly:
        // person.gender = "non-binary";
        
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
        // that the String and JOptionPane classes both "over-ride" the 
        // toString method and then that over-ride version of the "toString()" 
        // method is called instead
                
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)...        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // This also applies to the "String" class which obviously over-rides
        // the "equals" method to compare the string lexographically...
        String string1 = "cat";
        String string2 = "cat";        
        if (string1.equals(string2)) System.out.println("string1==string2");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three...
        Person p1 = new Person();
        Person p2 = p1;
        Person p3 = p2;
        
        if (p1.equals(p2)) System.out.println("P1==P2");
        if (p2.equals(p3)) System.out.println("P2==P3");
        if (p1.equals(p3)) System.out.println("P1==P3");
        
        // Using our previously created Person objects with equals..
        if (person.equals(fhorhea)) System.out.println("person==fhorhea");
        
        // Now we can over-ride the "equals" method in the Person, Student,
        // and Teacher classes to customize the "equality" of comparing 
        // those objects...
        Student s1 = new Student();
        Student s2 = new Student();
        if (s1.equals(s2)) System.out.println("s1==s2");
        
        Teacher t1 = new Teacher("teacher");
        Teacher t2 = new Teacher("teacher");
        if (t1.equals(t2)) System.out.println("t1==t2");
        
        // Now we will also over-ride the "clone" method in the 3 classes...        
        // Object clone1 = object1.clone();        
        // We cannot call the "clone" method directly from the "Object" class
        // (but we can "over-ride" the clone() method in all sub-classes)...       
        
        Person  c1 = p1.clone();
        Student c2 = s1.clone();
        Teacher c3 = t1.clone();
        
        System.out.println("P1: " + p1.toString());
        System.out.println("C1: " + c1.toString());
        System.out.println("S1: " + s1.toString());
        System.out.println("C2: " + c2.toString());
        System.out.println("T1: " + t1.toString());
        System.out.println("C3: " + c3.toString());
        
        ////////////////////////////////////////////////////////////////////////
        // NOTE: At this point, Mr. Wachs advised all students in the CS40S
        // class to make a modification to a NetBeans template for all classes 
        // in the future for this course. To do this, go to tip #38 in the 
        // comments at the bottom of the "ComputerScience40S.java" file in 
        // this project or on this GitHub page: https://bit.ly/4tyn4Hk
        // and follow the instructions...
        ////////////////////////////////////////////////////////////////////////
        
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
        System.out.println("Student total = " + wave.total);
        
        // Note: the word "total" is given a "warning" in NetBeans (the yellow
        // squiggly line) because you normally access static properties from 
        // the "class" refernce rahter than an object reference (but this code
        // is still allowed)
        
        Student s6 = new Student();
        System.out.println("S6 total = " + s6.total);
        Student s7 = new Student("7", 7, "7", 7);
        System.out.println("S7 total = " + s7.total);
        
        // Use static variables/properties carefully, you can still modify 
        // them and may have unexpected results
        wave.total = 10;        
        System.out.println("student total = " + student.total);
        System.out.println("wave    total = " + wave.total);        
        System.out.println("S1      total = " + s1.total);
        System.out.println("S2      total = " + s2.total);
        System.out.println("S5      total = " + c2.total);
        System.out.println("S6      total = " + s6.total);
        System.out.println("S7      total = " + s7.total);
        
        // Static properties can also be accessed DIRECTLY from the class 
        // reference in addition to accessing them from obejcts of the class
        System.out.println("Student total = " + Student.total);
        
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
        String gender = person.getGender();
        System.out.println("Person gender is " + gender);
        
        // Now using the other (inherited) accessor method of a Teacher object
        // which inherited the accessor method from its parent class (Person)
        System.out.println("Teacher gender is " + teacher.getGender());
        
        // Calling a mutator (or setter) method on this object's property
        // (which is a protected property) 
        student.setAlive(false);
        System.out.println("Student alive is " + student.getAlive());
        
        // =====================================================================
        // (10) ADVANCED: polymorphism
        // =====================================================================
        
        // Is the idea that our code can adapt or change ("morph") to many 
        // ("poly") different types of objects. For example, a method that can 
        // take a class type as a parameter will accept all objects of that type
        // - but also all children (sub-class) objects of that class as well
        
        // Instatiate (make an "instance" aka "object") of the classes...
        Doctor    doctor    = new Doctor();
        MrWachs   mrWachs   = new MrWachs();
        Husky     husky     = new Husky();
        Piper     piper     = new Piper();
        Athlete   athlete   = new Athlete();
        CaveDiver caveDiver = new CaveDiver();
        // Intentially leaving out "HighSchool"
        
        // Output these new objects, the "toString()" method is automatically 
        // called by System.out.println() so we can just pass the object itself
        System.out.println(doctor);
        System.out.println(mrWachs);
        System.out.println(husky);
        System.out.println(piper);
        System.out.println(athlete);
        System.out.println(caveDiver);
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes!");
    }
    

}



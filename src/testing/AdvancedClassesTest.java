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
 * @since Mar 17, 2025
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
        System.out.println("Start learing Advanced Classes..");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();        
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
                
        // We can also change (mutate) the properties of this object
        person.name = "Per sony";
        person.gender = "male";
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is set to be "private" I do NOT have
        // access to that - for example:
        
        // person.age = 15; // We cannot change this encapsulated property
                
        // person.born();
        
        // This method was later made "private" as well so the method can no
        // longer be called by this class outside the "Person" class (it is
        // now a private, encapsulated, helper, utility method)
        
        // Recall our methods... (to see the changes to the properties)
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // Try our overloaded, second constructor option to instantiate (which 
        // means to create an "instance of") another Person object
        Person john = new Person("John Doe",17,"male");
        john.talk();
        
        // Now we instantiate (create an object from the Student class) 
        // a Student object (or a Student instance) that inherts from the 
        // Person class
        Student student = new Student();
        student.talk();
        
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.birthday();
        student.talk();
        
        // Create another student... (simple language)
        Student stewie = new Student("Stewie Griffin", 1, "baby", 13);
        stewie.talk();
        stewie.study();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        stewie.slackOff();
        stewie.talk();
        
        // You cannot call encapsulated (private) methods!
        // stewie.secret();   
        
        // But, we can still call inherited methods...
        stewie.die();
        stewie.talk();
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.teach();                // Call again (to see any changes)
        teacher.birthday();             // Effect the associated objects
        teacher.die();                  // See any more "effects" from 
        teacher.talk();                 // calling these methods...  
        // See if the teacher object effected its associated class objects
        // those being the two student objects...
        teacher.teach();
        
        // The Object class - this class already exists (we don't write it)
        // it is part of Java, all Java project "have it". Also, the
        // Object class is the parent (super) class of ALL classes
        
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes  
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: 
        //      toString()
        //      equals()
        //      clone()
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory 
        
        System.out.println("Object1 as a string = " + object1.toString());
        System.out.println("Object2 as a string = " + object2.toString());
        System.out.println("Object3 as a string = " + object3.toString());
        
        // Since the "Object" class is the "parent" (or super-class) of ALL
        // classes (even our classes we wrote, for example "Person"). Then
        // all child classes inherit the "toString" method...
        
        System.out.println("Person  as a string = " + person.toString());
        System.out.println("Student as a string = " + student.toString());
        System.out.println("Teacher as a string = " + teacher.toString());
        
        // This true for classes we don't write, that are built-in to Java (like
        // the "String" class) as well...
        
        String string = new String("squirrel");
        System.out.println("String  as a string = " + string.toString());
        
        // So why is this last output not using the "toString" method it 
        // inherited from "Object" which gives a memory address? The answer is 
        // that the String class "over-rides" the toString method and that 
        // over-ride version of "toString" method is called instead. We can 
        // over-ride the toString method on all our classes (Student, Teacher).
        
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
        if (person.equals(john)) System.out.println("person==john");
        
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
        Teacher teacher1 = new Teacher("teacher");
        Teacher teacher2 = new Teacher("teacher");        
        if (student1.equals(student2)) System.out.println("Students are equal!");
        if (teacher1.equals(teacher2)) System.out.println("Teachers are equal!");
        
        // Now we will also over-ride the "clone" method in the 3 classes...
        
        // Object clone1 = object1.clone();
        // We cannot call the "clone" method directly from the "Object" class
        
        Person  clone2 = person1.clone();
        Student clone3 = student1.clone();
        
        
        
        // Have over-ridden the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this).
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed learning Advanced Classes!");
    }
    

}
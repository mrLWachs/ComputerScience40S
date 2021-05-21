  
/** Required package class namespace */
package testing;

/** Required imports */
import testing.advancedclasses.Apple;
import testing.advancedclasses.Baker;
import testing.advancedclasses.Doctor;
import testing.advancedclasses.Husky;
import testing.advancedclasses.Meeting;
import testing.advancedclasses.MrWachs;
import testing.advancedclasses.Person;
import testing.advancedclasses.Piper;
import testing.advancedclasses.Steak;
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
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        // Check our static variable
        System.out.println(student.name + "=" + student.totalStudents);
        System.out.println(student1.name + "=" + student1.totalStudents);
        System.out.println(student2.name + "=" + student2.totalStudents);
        System.out.println(student3.name + "=" + student3.totalStudents);
        System.out.println(studentClone.name + "=" + studentClone.totalStudents);
        
        // Notice how we get the same output for each student instance as they
        // all "share" the same access to the same static variable
        
        // You can access static variables from the class itself, not just 
        // the instances (objects) of the class, for example...
        
        System.out.println(Student.totalStudents);
        
        // Call a static method from the class name:
        
        Person.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // You still can call static methods from the instances (but, 
        // autocomplete/intellisense will not show it)
        
        person.endTheWorld();
        student.endTheWorld();      // Child class inherited the method
        teacher.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        
        // Create (instantiate) objects (instances) of the new classes...
        Husky   husky   = new Husky("Havoc", 12, 2665);
        Piper   piper   = new Piper("Yosemite", 51, 470);
        Doctor  doctor  = new Doctor();
        Baker   baker   = new Baker();
        MrWachs mrWachs = new MrWachs("Mr. Wachs");
        
        // Add a student object to that instance of a MrWachs object
        mrWachs.students[0] = husky;
        
        // Output these new objects (using toString called automatically)
        System.out.println(husky);
        System.out.println(piper);
        System.out.println(doctor);
        System.out.println(baker);
        System.out.println(mrWachs);
        
        // Instantiate ("make an instance of") a meeting object (of that class)        
        Meeting meeting = new Meeting();
        
        // Have person objects (and all children) attend - through polmorphism
        meeting.attend(person);
        meeting.attend(student);
        meeting.attend(teacher);
        meeting.attend(husky);
        meeting.attend(piper);
        meeting.attend(doctor);
        meeting.attend(baker);
        meeting.attend(mrWachs);
        meeting.attend(null);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
                
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool("", 0, 0);
        // Food food = new Food();
                
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class
        Apple apple = new Apple();
        apple.smell(1);
        
        Steak steak = new Steak();
        steak.smell(3);
        
        // Call the polymorphic method which accepts the abstract object (food)
        // as an argument. Since the abstract class cannot be instantiated, 
        // only children objects from the abstract class can be arguments 
        // (in other words, apple and steak instances)
        husky.consume(apple);
        mrWachs.consume(steak);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
        
        
            
            
        
        
        
        
        
        System.out.println("\nCompleted Advanced classes!\n");
    }

}

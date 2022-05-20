
/** Required package class namespace */
package testing;

/** Required imports */
import javax.swing.JOptionPane;
import testing.unit3.Apple;
import testing.unit3.Athlete;
import testing.unit3.Book;
import testing.unit3.Box;
import testing.unit3.DiskJockey;
import testing.unit3.Husky;
import testing.unit3.Leopard;
import testing.unit3.Meeting;
import testing.unit3.MrWachs;
import testing.unit3.Person;
import testing.unit3.Plumber;
import testing.unit3.Steak;
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
        
        Person personClone = person.clone();
        
        System.out.println("Person " + person.toString());
        System.out.println("Clone  " + personClone.toString());
        
        // Protected methods cannot be called outside the class by classes
        // not related - like this one
        // person.secret();
        
        // Instantiate the other classes (make instances/objects) of those 
        // classes...
        
        Plumber    plumber    = new Plumber();
        DiskJockey diskJockey = new DiskJockey();
        Husky      husky      = new Husky();
        MrWachs    mrWachs    = new MrWachs();
        Leopard    leopard    = new Leopard();
        Athlete    athlete    = new Athlete();
        
        // And output those objects:
        // NOTE: when you send an object to the method System.out.println() as 
        // an argument, it expects a string, with objects it will automatically
        // call your toString() method 
        
        System.out.println(plumber);
        System.out.println(diskJockey);
        System.out.println(husky);
        System.out.println(mrWachs);
        System.out.println(leopard);
        System.out.println(athlete);        
        
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
        
        // With NetBeans, you can use CTRL+SPACEBAR autocomplete with the 
        // arguments of methods to see what arguements qualify
        meeting.attend(person);
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);
        meeting.attend(hippo);
        meeting.attend(student);
        meeting.attend(slappy);
        meeting.attend(teacher);
        meeting.attend(personClone);
        meeting.attend(plumber);
        meeting.attend(diskJockey);
        meeting.attend(husky);
        meeting.attend(mrWachs);
        meeting.attend(leopard);
        meeting.attend(athlete);
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        
        // Now we hold the meeting...
        meeting.hold();
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        husky.endTheWorld();
        leopard.endTheWorld();
        diskJockey.endTheWorld();
        plumber.endTheWorld();
        athlete.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        Husky.endTheWorld();
        Leopard.endTheWorld();
        DiskJockey.endTheWorld();
        Plumber.endTheWorld();
        Athlete.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
                
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class
        Apple apple = new Apple();
        Steak steak = new Steak();
        
        apple.smell(5);
        steak.smell(5);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
        husky.consume(apple);
        mrWachs.consume(steak);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules"). 
        
        Athlete jock = new Athlete("Shaq", 50);
        jock.sign();
        jock.setOpponent("Troy");
        if (jock.didYouGetItSigned()) {
            jock.score("Shaq");
            jock.score("Troy",6);
            jock.endOfPeriod(1);
            jock.score("Shaq",7);
            jock.score("Troy");
        }
        jock.endOfQuarter(2);
        
        if (jock.didIWin()) {
            jock.consume(steak);
        }
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Now call a generic method on the variety of different data types
        output("Hello World");
        output(jock);
        output(new Book());
        output(new Boolean(true));
        output(new JOptionPane());
        
        // When using a class with a generic inside of it, and that
        // class is being instantiated (creating an object), then 
        // you define what type the generic is by using the angle 
        // brackets "< >" with the data type (which must be a 
        // 'class' type not a primitive) inside the brackets beside 
        // the class name on the left hand side of the equals sign. 
        // This is repeated on the right hand side of the equals 
        // sign as well (but you can leave these angle brackets 
        // empty - which is called the "diamond") before the round 
        // brackets of the constructor method.
        
        Box<MrWachs> box = new Box<>(mrWachs);
        box.peek();
        MrWachs substitute = box.open();
        output(substitute);
                
        System.out.println("\nAdvanced classes test complete!\n");
    }
    
    /**
     * Outputs a generic item with information about the data type.
     * Generic methods use 'generic' references rather than specific
     * references. You do not define the data type (the parameter) 
     * when the method is created. Instead of defining the data
     * type, a set of angle brackets "< >" is used with a single
     * letter (usually capital "T") inside which acts as a 
     * 'placeholder' for the data type which will be defined in
     * the argument when the method is later called
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class ";
        text += item.getClass().getSimpleName();
        text += " as a string is " + item.toString();
        System.out.println(text);
    }
    
}
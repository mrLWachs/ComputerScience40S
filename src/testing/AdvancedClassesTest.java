
/** Required package class namespace */
package testing;

/** Required imports */
import javax.swing.JOptionPane;
import testing.advancedclasses.Apple;
import testing.advancedclasses.Athlete;
import testing.advancedclasses.Baker;
import testing.advancedclasses.Box;
import testing.advancedclasses.Doctor;
import testing.advancedclasses.Food;
import testing.advancedclasses.HighSchool;
import testing.advancedclasses.House;
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
        System.out.println("\nAdvanced Classes starting...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
          
        // Call one of the methods in this object (an instance of the class)
        person.talk();
        
        // Try to change (modify) some of our properties:        
        person.name   = "Bruce Spruce"; // "public" properties can be accessed
        person.gender = "demi-male";        
        // person.age     = 16;  // Cannot do this, property is locked (private)
        // person.isAlive = false; // Cannot do (access) this! (encapsulated)
                
        // Try to call (invoke) some of our methods:        
        person.birthday();
        person.die();
        person.talk();
        
        // Instantiate (create) and object of type student 
        Student student = new Student("Flash Thompson",17);
        student.birthday();             // Inherited method from parent class
        student.study();                // This method is only in student
        student.cram();                 // This method modifies the private
        student.slackOff();             // encapsulated property (average)
        student.talk();                 // The over-ride method
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Professor");
        teacher.add(student);           // Associate object through method
        teacher.teach();                // Effect associated objects
        teacher.talk();                 // Inherited method invoked
                
        // The Object class (parent class of all classes)
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes        
        Object object1 = new Object();      // 1st instance of the object class
        Object object2 = new Object();      // 2nd instance of the object class
        Object object3 = object2;
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: toString(), clone(), and equals() methods
        
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
        String string = "puppy";
        System.out.println("String = " + string.toString());
        // The string class over-rides the toString() method here
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now since these two methods are inherited by ALL class objects, we
        // can use this methods with Person class objects:
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three         
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person2.toString());
        System.out.println("P3 = " + person3.toString());
        
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
        if (person.equals(clonePerson)) System.out.println("clone is =");
        
        // Now we will do the same thing to the student class and over-ride the
        // toString(), equals(), and clone() methods we inherited from the 
        // object class:        
        Student student1 = new Student("Name1",10);
        Student student2 = new Student("Name2",20);
        Student student3 = new Student("Name3",30);
        
        // Use the methods to alter the encapsulated property (average)
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
        
        // Mutate the static variable of one instance
        student1.total = 3;
        
        // Output all three again - showing that it changed (mutated) all
        // three instances since the variable is static (shared)
        System.out.println("S1 total = " + student1.total);
        System.out.println("S2 total = " + student2.total);
        System.out.println("S3 total = " + student3.total);
        
        // Now our child class (HighSchool) of student (parent)
        HighSchool highSchool = new HighSchool();        
        System.out.println(highSchool);
        System.out.println(highSchool.total);
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        highSchool.endTheWorld();
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        
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
        
        // Instantiate some other classes:        
        Doctor  doctor  = new Doctor();
        Baker   baker   = new Baker();
        MrWachs mrWachs = new MrWachs();
        Piper   piper   = new Piper();
        Husky   husky   = new Husky();
        Athlete athlete = new Athlete();
        
        // And output those objects:
        System.out.println(doctor);
        System.out.println(baker);
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
        meeting.attend(student);
        meeting.attend(student1);
        meeting.attend(student2);
        meeting.attend(student3);
        meeting.attend(teacher);
        meeting.attend(mrWachs);
        meeting.attend(baker);
        meeting.attend(clonePerson);
        meeting.attend(doctor);
        meeting.attend(athlete);
        meeting.attend(husky);
        meeting.attend(piper);
        meeting.attend(null);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
        
        // Abstract classes can NOT ever be instantiated, for example:
        // Food food = new Food();
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class        
        Apple apple = new Apple();        
        apple.smell(5);
        
        Steak steak = new Steak();
        steak.smell(3);
        
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
        Athlete jock = new Athlete("Kyle",24);
        // Set our opponent        
        jock.setOpponent("Pipers");
        // Have our athlete compete in four rounds of athletics
        for (int round = 0; round < 4; round++) {
            System.out.println("Round " + round + "...");
            // Check to see f they can play
            if (jock.haveYouGotItSigned()) {
                // They can play
                jock.score("Kyle");
                jock.score("Kyle");
                jock.score("Kyle");
                jock.score("Pipers");
                // Now play among us
                jock.findBody("Kyle");
                jock.askQuestion();                
                // See the results...
                jock.endOfPeriod(round);
                jock.callMeeting("Pipers");
            }
            else {
                jock.sign();        // Sign so they can play
            }
        }
        // Check if we won
        if (jock.didIWin()) jock.consume(steak);
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let us start by creating simple ('primitive') data types
        boolean b = true;
        int     i = 0;
        double  d = 3.14;
        char    c = 'a';
        
        // Now use the primatives with a more complex data type (class)
        // called a 'wrapper' class from the primatives and use the 
        // constructor methods of those wrapper classes passing the 
        // primatives through the constructor methods        
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Also String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("text");
        
        // Now call a generic method on the variety of 'generic' items
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(jock);
        
        // Test the generic method on another object
        JOptionPane joptionpane = new JOptionPane();
        output(joptionpane);
        
        // This line uses 'annonymous object'
        output(new Object());
        
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
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(jock);
        
        // Peek in all the boxes..        
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // Open all the boxes...
        Boolean   newBoolean   = box1.open();
        Integer   newInteger   = box2.open();
        Double    newDouble    = box3.open();
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Athlete   newAthlete   = box6.open();
        
        // Output all the newly returned data type objects...
        output(newBoolean);
        output(newInteger);
        output(newDouble);
        output(newCharacter);
        output(newString);
        output(newAthlete);
        
        // A generic class with multiple generic types, a generic method, the
        // enhanced for loop, restricted generics 
        House<Teacher,Meeting> house = new House<>();
        
        // Associate the objects that match with the generics
        house.homeOwner = mrWachs;
        house.contents  = meeting;
        
        // Create as array of Food objects
        Food[] fridge = { apple, steak };
        
        // Test our generic method
        house.party(fridge);
        
        System.out.println("\nAdvanced Classes completed!\n");
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







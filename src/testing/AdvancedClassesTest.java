/** Required package class namespace */
package testing;

/** Required API imports */
import javax.swing.JOptionPane;
import testing.classes.Apple;
import testing.classes.Doctor;
import testing.classes.Athlete;
import testing.classes.Box;
import testing.classes.CoffeCrisp;
import testing.classes.Food;
import testing.classes.House;
import testing.classes.Husky;
import testing.classes.Influencer;
import testing.classes.Meeting;
import testing.classes.MrWachs;
import testing.classes.PermissionForm;
import testing.classes.Piper;
import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;


/*
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author Mr. Wachs
 * @since October 2, 2024
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
        System.out.println("\nAdvanced Classes test starting...\n");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        // Change (or "modify" or"mutate") some properties (or "data")
        person.name = "per sony";
        person.age = 17;
        
        // If I try to change ("mutate") a property ("variable") of the
        // Person class that is modified to be "private" (or encapsulated) 
        // I do NOT have access to that - for example:
        
        //person.gender = "non-binary";
        
        // Try to call (invoke) some of our other methods:
        person.talk();
        person.die();
        person.talk();
        
        //person.birthday();
        
        // Will not execute as the birthday() method is private (encapsulated)
                
        // Try our overloaded, second constructor option as build a second
        // Person object...
        Person hugh = new Person("Hugh Jass",103,"female");
        hugh.talk();
        
        // Instantiate (means create an "instance of") a student object
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        student.talk();
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.die();
        student.talk();
        
        // Instantiate (means "create and instance of") a second Student 
        // object (instance)
        Student stewie = new Student("Stewie Griffin",1,"male",148);
        stewie.talk();
        stewie.study();
        stewie.talk();
        stewie.slackoff();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        stewie.die();      // Inherited method from Person (parent/super) class
        stewie.talk();
        // stewie.secret(); // you cannot call encapsulated methods!
       
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.teach();                // Effect the associated objects
        // To see if the associated objects (Student object) were effected
        // we "output" those students
        student.talk();
        stewie.talk();
        teacher.die();
        teacher.talk();
        
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
        
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // The method (toString) is inherited by ALL sub classes (children)
        // of the Object class - remember the Object class is the parent or
        // super class of ALL classes - so they all inherit toString, including
        // classes we write...
        
        System.out.println("Person  as a string = " + person.toString());
        System.out.println("Student as a string = " + student.toString());
        System.out.println("Teacher as a string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...
        
        String string = new String("squirrel");
        System.out.println("String  as a string = " + string.toString());
        
        // Another example of "built-in" Java class (actually imported)
        // level object that inherits all the methods (including toString)
        // from the Object class...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as a string = " + joptionpane.toString());
        
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
        if (person.equals(hugh)) System.out.println("person==hugh");
        
        // Now test "equals" with Student objects, and we will be over-riding 
        // the equals method in the student class....        
        Student student1 = new Student("1", 0, "1", 1);
        Student student2 = new Student("1", 0, "1", 1);
        Student student3 = new Student("2", 0, "1", 1);
        if (student1.equals(student2)) System.out.println("S1==S2");
        if (student2.equals(student3)) System.out.println("S2==S3");
        if (student1.equals(student3)) System.out.println("S1==S3");
        
        // We have over-ridden the toString() and equals() methods in the
        // Person, Student, and Teacher classes so that we can check how that 
        // method is called over the object version of those methods. It is 
        // useful to alter a NetBeanstemplate so those methods are always 
        // over-ridden in every new class created (see the comment in 
        // "ComputerScience40S.java" to do this). Now we also over-ride the 
        // clone method...
        
        Person p1 = new Person("p1", 1, "female");
        Person p2 = p1.clone();
        System.out.println("P1 = " + p1.toString());
        System.out.println("P2 = " + p2.toString());
        p1.talk();
        p2.talk();
        p1.name = "Smith";
        p1.talk();
        p2.talk();
        
        Student student4 = student1.clone();
        student1.talk();
        student4.talk();
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        System.out.println("student1 total students = " + student1.total);
        System.out.println("student2 total students = " + student2.total);
        System.out.println("student3 total students = " + student3.total);
        System.out.println("student4 total students = " + student4.total);
        System.out.println("student total students = " + student.total);
        System.out.println("stewie total students = " + stewie.total);        
        System.out.println("Student total = " + Student.total);
        
        // Mutate (change) that static variable directly (in one instance)
        Student.total = 10;
        
        // Output the static variable again - showing that it changed (mutated) 
        // ALL the instances (all the student obejcts) since that varaible is
        // modified to be static  
        System.out.println("Stewie total = " + stewie.total);
        
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
        
        // The "protected" modifier means this property of the Person class
        // cannot be accessed from this class because this class is not 
        // related to this class through inheritance (it is only related
        // through association)
        // person.alive = false;
        
        // Calling an accessor (or getter) method on this object of the Person
        // class (which is a private, encapsulated property)
        System.out.println("Gender = " + person.getGender());
        
        // Calling a mutator (or setter) method on this object which is a
        // protected property
        person.setAlive(false);
        System.out.println("Person alive = " + person.getAlive());
        
        // Instatiate (make an "instance" aka "object of that class)...
        Doctor     doctor     = new Doctor();
        Influencer influencer = new Influencer();
        MrWachs    mrWachs    = new MrWachs("Mr. Wachs");
        Husky      husky      = new Husky();
        Piper      piper      = new Piper();
        Athlete    athlete    = new Athlete();
        // Intentially leaving out HighSchool
        
        // Output these new objects, the "toString()" method is automatically 
        // called by System.out.println() so we could just pass the object itself
        System.out.println(doctor.toString());
        System.out.println(influencer.toString());
        System.out.println(mrWachs.toString());
        System.out.println(husky.toString());
        System.out.println(piper.toString());
        System.out.println(athlete.toString());
        
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
        
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        meeting.attend(person);
        meeting.attend(hugh);        
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);
        meeting.attend(p1);
        meeting.attend(p2);        
        meeting.attend(student);
        meeting.attend(stewie);
        meeting.attend(student1);
        meeting.attend(student2);
        meeting.attend(student3);
        meeting.attend(student4);
        meeting.attend(teacher);
        meeting.attend(doctor);
        meeting.attend(influencer);
        meeting.attend(mrWachs);
        meeting.attend(piper);
        meeting.attend(husky);
        meeting.attend(athlete);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food();
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class 
        
        Apple apple = new Apple();
        CoffeCrisp bar = new CoffeCrisp();
        
        // Now test the smell method...
        apple.smell(1);
        bar.smell(1);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. Since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
        
        mrWachs.consume(bar);
        husky.consume(apple);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules").
        
        Athlete owen = new Athlete("Owen Zalondek", 17);
        owen.setOpponent("Jimmies");
        for (int round = 1; round <= 4; round++) {
            System.out.println("Round " + round);            
            if (owen.haveYouGotItSigned() == PermissionForm.NOT_SIGNED) {
                System.out.println("Can't play today!");
                owen.sign();
            }
            else {
                owen.score("Owen Zalondek");
                owen.score("Owen Zalondek");
                owen.score("Owen Zalondek");
                owen.score("Jimmies");
                owen.endOfPeriod(round);
            }            
        }
        owen.champion = owen.WE_WON;
        owen.consume(bar);
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let's start by creating simple (primitive) data types
        boolean b = true;
        char    c = 'a';
        int     i = 0;
        double  d = 3.14;
        
        // Now use the primitives with a more complex data type (class)
        // called a "wrapper" class from primitives and use the
        // constructor methods of those wrapper classes passing the primitives 
        // through the constructor methods
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Also String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("test");
        
        // Now call a generic method on our variety of objects
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(athlete);
        
        // Test the generic method on another "complex" object (that we don't
        // create)...
        JOptionPane jop = new JOptionPane();
        output(jop);
        
        // This line uses "annonymous" object..
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
        
        // Although, it could be written like:
        // Box box1 = new Box(bool);
        // It is normally written as:
        
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(athlete);
        
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
        House<MrWachs,Meeting> house = new House<>();
        
        // Associate the objects that match with the generics
        house.homeOwner = mrWachs;
        house.contents  = meeting;
        
        // Create an array of Food objects
        Food[] fridge = { apple, bar };
        
        // Test our generic method
        house.party(fridge);
        
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
        String text = "Class name: ";
        text += item.getClass().getSimpleName();
        text += ", hash code: " + item.hashCode();
        text += ", to String: " + item.toString();
        System.out.println(text);
    }
    
    
}

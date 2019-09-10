
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.Banana;
import testing.advancedclasses.Box;
import testing.advancedclasses.Chicken;
import testing.advancedclasses.Food;
import testing.advancedclasses.Hogwarts;
import testing.advancedclasses.House;
import testing.advancedclasses.Hufflepuff;
import testing.advancedclasses.Husky;
import testing.advancedclasses.Magic;
import testing.advancedclasses.Person;
import testing.advancedclasses.Slytherin;
import testing.advancedclasses.SoccerPlayer;
import testing.advancedclasses.Student;
import testing.advancedclasses.Sushi;
import testing.advancedclasses.Teacher;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since 09-Mar-2019  
 */
public class AdvancedClassesTest 
{

    /** 
     * Default constructor for the class 
     */
    public AdvancedClassesTest() {
        System.out.println("\nStarting advanced classes testing...\n");
        
        // using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        // class using inheritance
        Student student = new Student(99);              // new student object
        student.talk();                                 // inherited method
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        Object object1 = new Object();
        Object object2 = object1;                       // parent of all classes
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        if (object1.equals(object2)) {                  // the equals method
            System.out.println("object1 == object2"); 
        }
        
        // testing equals, clone, toString methods overloaded from Object:        
        Person sam = new Person();                      // new person object
        sam.age    = 25;                                // changing some 
        sam.setMale(true);                              // object properties
        sam.setName("Samuel Samson");                   // mutator method used
        if (person.equals(sam)) {                       // equals overloaded
            System.out.println("person == sam");
        }
        else {
            System.out.println("person != sam");
        }
        System.out.println(sam.toString());             // toString overloaded
        Person samClone = sam.clone();                  // clone method
        System.out.println(samClone.toString());        // display clone             
        if (sam.equals(samClone)) {                     // equals again
            System.out.println("sam == samClone");
        }
        
        Teacher cardinal = new Teacher("Mr. Cardinal", 
                50, true, "Media Productions", "B10");  // teacher object
        cardinal.add(student);                          // add method
        cardinal.add(new Student(13));                  // annonynomous object
        Student cersi = new Student(40);                // another student
        cersi.setName("Cersi Lannister");               // mutate property
        cardinal.add(cersi);                            // add to array        
        System.out.println(cardinal.toString());        // output teacher
        
        // testing method using instanceof operator
        check(person);                                  // call to method
        check(student);                                 // which uses the 
        check(object1);                                 // instanceof operator
        check(samClone);                                // to check objects to
        check(cardinal);                                // see if they are 
        String text = "Hello World";                    // instances of that 
        check(text);                                    // class
        
        // create student with second constructor method
        Student newStudent = new Student("Sally Silly", 16, false, 999);
        newStudent.endOfTheWorld();                     // call static method 
        person.endOfTheWorld();                         // from objects
        cardinal.endOfTheWorld();
        Person.endOfTheWorld();                         // or call from the
        Student.endOfTheWorld();                        // class reference
        Teacher.endOfTheWorld();                        // for static methods
        
        // testing complicated class driven class structure with static
        // methods and static properties
        Hufflepuff luna     = new Hufflepuff("Luna Lovegood",false); 
        Slytherin  draco    = new Slytherin("Draco Malfoy",true);        
        Hogwarts   hogwarts = new Hogwarts();
        hogwarts.enterStation9ThreeQuarters(luna);      // methods called
        hogwarts.enterStation9ThreeQuarters(draco);
        
        System.out.println("total magic = " + Magic.count); // static property
        hogwarts.triWizardTournament();                 // call static method
        
        // testing abstract classes and abstract methods
        Banana  banana  = new Banana();                 // create children
        Chicken chicken = new Chicken();                // of the food abstract
        Sushi   sushi   = new Sushi();                  // class        
        draco.eat(banana);                              // use polymorphic
        draco.eat(chicken);                             // method on food
        draco.eat(sushi);                               // parameter
        
        // testing interfaces
        SoccerPlayer ronaldo = new SoccerPlayer("Juventus");   // soccer player        
        ronaldo.setOpponent("PSG");                     // overloaded methods
        ronaldo.goal("Juventus");                       // from the various
        ronaldo.goal("Juventus");                       // interfaces the 
        ronaldo.goal("PSG");                            // class implements
        ronaldo.endOfHalf(true);
        ronaldo.endOfHalf(false);        
        luna.setOpponent("Griffendore");        
        if (luna.didIWin()) System.out.println("Won!");
        else                System.out.println("Lost!");
        
        // testing classes with inheritance and multiple implements
        Husky havoc = new Husky("Havoc Ness", 17, true, 3665);        
        havoc.setOpponent("John Taylor");
        havoc.goal("John Taylor");
        havoc.sign();
        
        // creating primative data structures
        boolean b = true;
        int     i = 10;
        double  d = 3.14;
        char    c = 'W';
        String  s = "dufflebag";    // Strings not actually a primative
        
        // creating class ("wrapper class") objects from the primatives   
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        String    string    = new String(s);
        
        // calling the generic method on the variety of objects
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string);
        output(havoc);
        
        // using a generic class, when a generic class is instantiated (an 
        // object of the class is created), then you define what type the 
        // generic is
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string);
        Box<Husky>     box6 = new Box<>(havoc);                
        // peek in the boxes
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();        
        // open the boxes
        Boolean   newBool      = box1.open();
        Integer   newInt       = box2.open();
        Double    newDouble    = box3.open();
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Husky     newHusky     = box6.open();
        // output
        System.out.println(newBool.toString());
        System.out.println(newInt.toString());
        System.out.println(newDouble.toString());
        System.out.println(newCharacter.toString());
        System.out.println(newString.toString());
        System.out.println(newHusky.toString());
        
        // create a house object and test it
        House<Slytherin,Husky> house = new House<>();        
        house.homeOwner = draco;
        house.contents  = havoc;        
        Food[] fridge = {
            banana,
            sushi,
            chicken
        };        
        house.party(fridge);
                
        System.out.println("\nCompleted advanced classes test!\n");
    }
    
    /**
     * Checks the passed object and outputs if it is a person, student, 
     * teacher, or string object instance. This method uses the instanceof
     * operator to do the logic
     * 
     * @param object the object type to check
     */
    private void check(Object object) {        
        System.out.print("Checking: " + object.toString());        
        // there is a way to check if an object is a object of a certain class 
        if      (object instanceof Student) System.out.print(" is a Student!");
        else if (object instanceof Teacher) System.out.print(" is a Teacher!");
        else if (object instanceof Person)  System.out.print(" is a Person!");        
        else if (object instanceof String)  System.out.print(" is a String!");
        else                                System.out.print(" is a ?");
        System.out.println("\n");        
    }

    /**
     * Outputs a generic item with information about the data type
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class ";
        text += item.getClass().getSimpleName();
        text += " as a string is ";
        text += item.toString();
        System.out.println(text);
    }
    
}

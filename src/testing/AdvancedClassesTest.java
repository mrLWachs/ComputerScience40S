
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.BonelessPizza;
import testing.advancedclasses.Box;
import testing.advancedclasses.ComputerScienceTeacher;
import testing.advancedclasses.Food;
import testing.advancedclasses.House;
import testing.advancedclasses.Husky;
import testing.advancedclasses.HuskyAthlete;
import testing.advancedclasses.KraftDinner;
import testing.advancedclasses.Meeting;
import testing.advancedclasses.Person;
import testing.advancedclasses.Potato;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;
import testing.advancedclasses.WellDoneSteak;
import testing.advancedclasses.animal.Dog;
import testing.advancedclasses.animal.Farm;
import testing.advancedclasses.animal.Flames;
import testing.advancedclasses.animal.Pets;
import testing.advancedclasses.animal.Wild;
import testing.advancedclasses.disney.Animals;
import testing.advancedclasses.disney.Creatures;
import testing.advancedclasses.disney.Fairy;
import testing.advancedclasses.disney.Genie;
import testing.advancedclasses.disney.Hercules;
import testing.advancedclasses.disney.Jimmies;
import testing.advancedclasses.disney.King;
import testing.advancedclasses.disney.Magic;
import testing.advancedclasses.disney.Prince;
import testing.advancedclasses.disney.Princess;
import testing.advancedclasses.disney.Rapunzel;
import testing.advancedclasses.disney.Royalty;


/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:43:07 a.m.
 */
public class AdvancedClassesTest 
{
    
    /** 
     * Default constructor for the class 
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes unit starting...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        // class using inheritance
        Student student = new Student(99);              // new student object
        student.talk();                                 // inherited method
        
        // The Object class (parent class of all classes)
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        Object object1 = new Object();
        Object object2 = object1;                       // parent of all classes
        
        // The toString(), clone(), and equals() methods
        
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
                
        // Use of the equals, toString, and clone methods that are inherited 
        // (but over-ridden) from the Object class with student objects:        
        Student brayden = new Student("Brayden Ruby",19,false,11);
        Student owen    = new Student("Owen Notplace",6,true,12);
        Student brady   = brayden.clone();              // clone method
        brady.setName("Brady Nemetchek");               // modifier method
        
        System.out.println(brayden.toString());         // toString overloaded
        System.out.println(owen.toString());
        System.out.println(brady.toString());
        
        // equals overloaded
        if (brayden.equals(owen))  System.out.println("Brayden == Owen");
        if (brayden.equals(brady)) System.out.println("Brayden == Brady");
        if (owen.equals(brady))    System.out.println("Owen == Brady");
        
        // The static keyword (for properties and methods)
        
        Student s = new Student(60);    // Instantiate another student object
        System.out.println(Student.totalStudents);  // access static property
                               
        Person.endTheWorld();           // invoking the static method from the      
        Student.endTheWorld();          // class not the object      
        Teacher.endTheWorld();
        
        // create various custom objects...
        Rapunzel               rapunzel   = new Rapunzel();
        Hercules               hercules   = new Hercules();
        Genie                  genie      = new Genie();
        Fairy                  tinkerbell = new Fairy();
        Animals                flounder   = new Animals();
        ComputerScienceTeacher rogowy     = new ComputerScienceTeacher();
        Husky                  havoc      = new Husky("Havoc Husky", 13, true, 6556);
        Jimmies                jim        = new Jimmies("Jim Donkey", 17, false, 0);
                
        // and output them (using toString called automatically)
        System.out.println(rapunzel);
        System.out.println(hercules);
        System.out.println(genie);
        System.out.println(tinkerbell);
        System.out.println(flounder);
        System.out.println(rogowy);
        System.out.println(havoc);
        System.out.println(jim);
        
        // create some custom objects.....        
        Dog  coco                 = new Dog();
        Farm pig                  = new Farm();
        Wild pheasant             = new Wild();        
        Husky  joe                = new Husky("Joe Mama",16,true,100);
        Flames bradi              = new Flames("Bradi Nohands",17,false,21);        
        ComputerScienceTeacher jr = new ComputerScienceTeacher();
        
        // and output them (using toString called automatically)
        System.out.println(coco);
        System.out.println(pig);
        System.out.println(pheasant);
        System.out.println(joe);
        System.out.println(bradi);
        System.out.println(jr);
        
        // call a method with new code...        
        whatIs(bradi);
        whatIs(coco);
        whatIs(jr);
        whatIs(pheasant);
        whatIs(person);
        
        // use some polymorphism....        
        Meeting meeting = new Meeting();        // create meeting object
        meeting.attend(person);                 // add various child objects
        meeting.attend(bradi);                  // using polymorphic method
        meeting.attend(brady);                  // arguments
        meeting.attend(brayden);
        meeting.attend(jr);
        meeting.attend(joe);
        meeting.attend(student);
        meeting.attend(owen);
        meeting.attend(rapunzel);
        meeting.attend(havoc);
        meeting.attend(jim);
        meeting.attend(hercules);
        meeting.attend(rogowy);        
        meeting.hold();                         // hold the mmeting
        
        // create objects from classes that inherited from an abstract class:        
        Potato        potato = new Potato();
        BonelessPizza boneyM = new BonelessPizza();
        KraftDinner   kd     = new KraftDinner();
        WellDoneSteak meat   = new WellDoneSteak();
        
        // call the polymorphic method of person objects        
        hercules.haveDinner(potato);
        rapunzel.haveDinner(boneyM);
        brayden.haveDinner(meat);
        jr.haveDinner(kd);
        
        // a class that uses interfaces to test the interfaces        
        HuskyAthlete athlete = new HuskyAthlete("Havoc", 17, true, 2665);        
        for (int round = 0; round < 4; round++) {            
            if (athlete.haveYouGotItSigned()) {                
                athlete.setOpponent("Bears");                
                athlete.score(6, "Havoc");
                athlete.score(3, "Bears");                
                athlete.backFlipKick(true);                
                athlete.endOfQuarter(round);
                athlete.endOfSets(round);                
            }
            else {
                athlete.sign();
            }            
        }       
        if (athlete.didIWin()) athlete.haveDinner(kd);
        
        // use our generic method, starting with primative data types:        
        boolean b = true;
        int     i = 0;
        double  d = 3.14;
        char    c = 'Z';
        
        // now use the primatives with a more complex data type (class) 
        // called a "wrapper" class from the primatives         
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        // and also string...
        String    string    = new String("boomer");
        
        // calling the generic method on the variety of objects
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string);
        output(athlete);
        
        // using a generic class, when a generic class is instantiated (an 
        // object of the class is created), then you define what type the 
        // generic is       
        Box<Boolean>      box1 = new Box<>(bool);
        Box<Integer>      box2 = new Box<>(integer);
        Box<Double>       box3 = new Box<>(doub);
        Box<Character>    box4 = new Box<>(character);
        Box<String>       box5 = new Box<>(string);
        Box<HuskyAthlete> box6 = new Box<>(athlete);
        
        // peek in the boxes
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // open all the boxes
        Boolean   newBool   = box1.open();
        Integer   newInt    = box2.open();
        Double    newDoub   = box3.open();
        Character newChar   = box4.open();
        String    newString = box5.open();
        Person    newPerson = box6.open();
        
        // output the new data type variables
        System.out.println(newBool.toString());
        System.out.println(newInt.toString());
        System.out.println(newDoub.toString());
        System.out.println(newChar.toString());
        System.out.println(newString.toString());
        System.out.println(newPerson.toString());
        
        // generic class with multiple generic types   
        House<Teacher,Royalty> house = new House<>();
        
        house.homeOwner = rogowy;
        house.contents = rapunzel;
        
        House<Hercules,Genie> olympus = new House<>();
        
        olympus.homeOwner = hercules;
        olympus.contents = genie;
        
        // test our generic method        
        Food[] fridge = {
          boneyM,potato  
        };        
        house.party(fridge);
        
        BonelessPizza[] pizzas = new BonelessPizza[100];
        for (int pizza = 0; pizza < pizzas.length; pizza++) {
            pizzas[pizza] = new BonelessPizza();
        }
        olympus.party(pizzas);
        
        System.out.println("\nAdvanced classes unit complete!\n");
    }    

    /**
     * Checks the passed object and outputs what class type the object is. 
     * This method uses the instanceof operator to do the logic
     * 
     * @param object the object type to check
     */
    private void whatIs(Object object) {
        String name = "This is a ";
        if (object instanceof Magic)                  name += "Magic -> ";
        if (object instanceof Hercules)               name += "Hercules -> ";
        if (object instanceof Rapunzel)               name += "Rapunzel -> ";
        if (object instanceof Prince)                 name += "Prince -> ";
        if (object instanceof Princess)               name += "Student -> ";
        if (object instanceof King)                   name += "King -> ";
        if (object instanceof ComputerScienceTeacher) name += "ComputerScienceTeacher -> ";
        if (object instanceof Jimmies)                name += "Jimmies -> ";
        if (object instanceof Flames)                 name += "Flames -> ";
        if (object instanceof Husky)                  name += "Husky -> ";        
        if (object instanceof Royalty)                name += "Royalty -> ";
        if (object instanceof Teacher)                name += "Teacher -> ";
        if (object instanceof Student)                name += "Student -> ";
        if (object instanceof Person)                 name += "Person -> ";        
        if (object instanceof Genie)                  name += "Genie -> ";
        if (object instanceof Fairy)                  name += "Fairy -> ";
        if (object instanceof testing.advancedclasses.disney.Animals) 
                                                      name += "Animals -> ";        
        if (object instanceof Creatures)              name += "Creatures -> ";        
        if (object instanceof Dog)                    name += "Dog -> ";        
        if (object instanceof Pets)                   name += "Pets -> ";
        if (object instanceof Wild)                   name += "Wild -> ";
        if (object instanceof Farm)                   name += "Farm -> ";        
        if (object instanceof testing.advancedclasses.animal.Animals) 
                                                      name += "Animals -> ";
        if (object instanceof Object)                 name += "Object";
        System.out.println(name);
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
        text += " as a string is " + item.toString();
        System.out.println(text);
    } 
    
}

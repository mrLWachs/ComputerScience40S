
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.BonelessPizza;
import testing.advancedclasses.ComputerScienceTeacher;
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
        
        // a class that uses interfaces
        HuskyAthlete athlete = new HuskyAthlete("Huskies", 16, true, 2665);
        for (int round = 0; round < 4; round++) {
            if (athlete.haveYouGotItSigned()) {
                athlete.setOpponent("Pipers");
                athlete.backFlipKick(true);
                athlete.score(6, "Huskies");
                athlete.score(3, "Pipers");
                athlete.punch("Huskies");
                athlete.block("Huskies");                
                athlete.endOfQuarter(round);
                athlete.endOfSets(round); 
            }
            else {
                athlete.sign();
            }
        }
        if (athlete.didIWin()) athlete.haveDinner(kd);
        
        
        
        
        

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

}


/** required package class namespace */
package testing;

/** required imports */
import javax.swing.JOptionPane;
import testing.advancedclasses.ComputerScienceTeacher;
import testing.advancedclasses.Husky;
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;
import testing.advancedclasses.animal.Dog;
import testing.advancedclasses.animal.Farm;
import testing.advancedclasses.animal.Flames;
import testing.advancedclasses.animal.Wild;
import testing.advancedclasses.disney.Animals;
import testing.advancedclasses.disney.Fairy;
import testing.advancedclasses.disney.Genie;
import testing.advancedclasses.disney.Hercules;
import testing.advancedclasses.disney.Rapunzel;


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
        Rapunzel rapunzel             = new Rapunzel();
        Hercules hercules             = new Hercules();
        Genie    genie                = new Genie();
        Fairy    tinkerbell           = new Fairy();
        Animals  flounder             = new Animals();
        ComputerScienceTeacher rogowy = new ComputerScienceTeacher();
        
        // and output them (using toString called automatically)
        System.out.println(rapunzel);
        System.out.println(hercules);
        System.out.println(genie);
        System.out.println(tinkerbell);
        System.out.println(flounder);
        System.out.println(rogowy);
        
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
        
        
        
        
        
        System.out.println("\nAdvanced classes unit complete!\n");
    }    

}


/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.Banana;
import testing.advancedclasses.Box;
import testing.advancedclasses.CSTeacher;
import testing.advancedclasses.Doctor;
import testing.advancedclasses.Donut;
import testing.advancedclasses.Food;
import testing.advancedclasses.HighSchoolStudent;
import testing.advancedclasses.House;
import testing.advancedclasses.Husky;
import testing.advancedclasses.HuskyAthlete;
import testing.advancedclasses.Meeting;
import testing.advancedclasses.MrWachs;
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:00:03 p.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes test started...\n");
        
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
        
        Object object1 = new Object();              // parent of all classes
        Object object2 = new Object();
        Object object3 = object1;                   // same memory address
        
        // The toString(), clone(), and equals() methods
                
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        System.out.println(object3.toString());
                        
        if (object1.equals(object2)) System.out.println("1 == 2");
        if (object1.equals(object3)) System.out.println("1 == 3");
                
        // test toString, clone, and equals on Person
        
        Person archie  = new Person("Archie Andrews",17,true);
        Person betty   = new Person("Betty Cooper",16,false);
        Person jughead = archie.clone();
        
        System.out.println(archie.toString());
        System.out.println(betty.toString());
        System.out.println(jughead.toString());
        
        if (archie.equals(betty))   System.out.println("archie==betty");
        if (archie.equals(jughead)) System.out.println("archie==jughead");
        
        // test toString, equals, clone on Student
        
        Student emma  = new Student("Emma Nelson",17,false,100);
        Student jimmy = new Student("Jimmy Brooks",18,true,101);
        Student terri = emma.clone();
        
        System.out.println(emma.toString());
        System.out.println(jimmy.toString());
        System.out.println(terri.toString());
        
        if (emma.equals(jimmy)) System.out.println("emma==jimmy");
        if (emma.equals(terri)) System.out.println("emma==terri");
        
        // create a Teacher object which associates with student
        
        Teacher teacher = new Teacher("Mr. Perino");
        
        teacher.students[0] = emma;
        teacher.students[1] = jimmy;
        teacher.students[2] = terri;
        teacher.students[3] = student;
        
        System.out.println(teacher.toString());
                        
        // call method that uses instanceof operator        
        whatIs(object1);
        whatIs(person);
        whatIs(student);
        whatIs(teacher);        
        String thing = "Hello World";        
        whatIs(thing);
        
        // show the static class variable (property)        
        System.out.println(jimmy.totalStudents);
        
        // create some high school and huskies        
        HighSchoolStudent jeff = new HighSchoolStudent(105);
        Husky havoc = new Husky(2665);
        
        // create more objects
        Doctor    doctor   = new Doctor();
        CSTeacher compTech = new CSTeacher("Mr. Code");
        MrWachs   mrWachs  = new MrWachs("Mr. Wachs");
                
        // use the method again        
        whatIs(jeff);
        whatIs(havoc);
        whatIs(doctor);
        whatIs(compTech);
        whatIs(mrWachs);
        
        // use some polymorphism....  
        Meeting meeting = new Meeting();        // create meeting object
        meeting.attend(person);                 // add various child objects
        meeting.attend(student);                // using polymorphic method
        meeting.attend(doctor);                 // arguments
        meeting.attend(teacher);
        meeting.attend(archie);
        meeting.attend(betty);
        meeting.attend(compTech);
        meeting.attend(emma);
        meeting.attend(havoc);
        meeting.attend(jeff);
        meeting.attend(jimmy);
        meeting.attend(jughead);
        meeting.attend(terri);
        meeting.attend(mrWachs);        
        meeting.hold();                         // hold the mmeting
        
        // create objects from classes that inherited from an abstract class:
        Banana banana = new Banana();
        Donut  donut  = new Donut();
        
        // call the polymorphic method of person objects 
        mrWachs.haveDinner(donut);
        mrWachs.haveDinner(banana);
        
        // a class that uses interfaces to test the interfaces  
        HuskyAthlete athlete = new HuskyAthlete("Havoc", 17, true, 2665);
        athlete.talk();
        for (int round = 0; round < 4; round++) {            
            if (athlete.haveYouGotItSigned()) {
                athlete.setOpponent("Pipers");
                athlete.score(6, "Havoc");
                athlete.score(3, "Pipers");
                athlete.goal("Havoc");
                athlete.goal("Havoc");
                athlete.goal("Pipers");
                athlete.endOfPeriod(1);
                athlete.endOfQuarter(2);
            }
            else {
                athlete.sign();
            }            
        }
        if (athlete.didIWin()) athlete.haveDinner(donut);
                
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
        House<MrWachs,Husky> sturgeonHeights = new House<>();
        
        // assign to class generic properties
        sturgeonHeights.homeOwner = mrWachs;
        sturgeonHeights.contents = athlete;
        
        // array of Food objects
        Food[] fridge = {
            banana,donut            
        };
        
        // test our generic method 
        sturgeonHeights.party(fridge);
                                
        System.out.println("\nAdvanced classes test complete!\n");
    }
     
    /**
     * Checks the passed object and outputs what class type the object is. 
     * This method uses the instanceof operator to do the logic
     * 
     * @param object the object type to check
     */
    private void whatIs(Object object) {
        String name = "This is a ";
        if (object instanceof Object)            name += "Object -> ";
        if (object instanceof Person)            name += "Person -> ";
        if (object instanceof Student)           name += "Student -> ";
        if (object instanceof Teacher)           name += "Teacher -> ";
        if (object instanceof HighSchoolStudent) name += "High School -> ";
        if (object instanceof Husky)             name += "Husky -> ";
        if (object instanceof Doctor)            name += "Doctor -> ";
        if (object instanceof CSTeacher)         name += "CS Teacher -> ";
        if (object instanceof MrWachs)           name += "MrWachs -> ";        
        if (object instanceof String)            name += "String -> ";
        name += "Object";
        System.out.println(name);        
    }

    /**
     * Outputs a generic item with information about the data type
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text  = "Class ";
        text += item.getClass().getSimpleName();
        text += " as a string is " + item.toString();        
        System.out.println(text);
    }
        
}

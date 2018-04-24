
/** required package class namespace */
package testing.advancedclasses;

/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public class AdvancedClassesTest
{

    /** 
     * Default constructor for the class 
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced Classes unit test started...\n");
        Person dave = new Person();                     // create person object
        dave.talk();                                    // call talk
        Person sally = new Person("Sally Silly", 40);   // create another object
        sally.talk();
        Student bobby = new Student("Robert Wango", 21, 781, false);
        bobby.talk();                                   // create student object
        Object object1 = new Object();                  // the object class
        Object object2 = object1;                       // parent of all classes
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        if (object1.equals(object2)) {                  // the equals method
            System.out.println("==");
        }
        if (dave.equals(sally)) {                       // equals overloaded
            System.out.println("dave = sally");
        }
        Student a = new Student("Andrew", 51, 268, true);   // more students
        Student b = new Student("Andrew", 51, 268, true);
        if (a.equals(b)) {                              // equals overloaded
            System.out.println("equal students");
        }
        else {
            System.out.println("not equal");
        }
        System.out.println(sally.toString());           // toString overloaded
        System.out.println(a.toString());
        Person lance = new Person("Lance Lancy", 55);   // new person instance
        Person sarah = lance.clone();                   // clone method
        System.out.println(lance.toString());           // display clone
        System.out.println(sarah.toString());
        Student josh = new Student("Joshua Dun", 23, 286, true);
        Student alex = josh.clone();
        System.out.println(josh);
        System.out.println(alex);
        Teacher mrMacWilliams = new Teacher(
                "Mr. Mike MacWilliams", 52, true);      // new teacher object
        mrMacWilliams.add(alex);                    // add student to teacher
        mrMacWilliams.add(josh);                    // create associations
        System.out.println(mrMacWilliams);          // output teacher
        Teacher mrClone = mrMacWilliams.clone();
        System.out.println(mrClone);                // overloaded clone
        if (mrClone.equals(mrMacWilliams)) {        // overloaded equals
            System.out.println("== teachers");
        }
        Doctor whom = new Doctor("Hume Him", 53);   // doctor object
        System.out.println(whom);                   // output doctor
        whoIs(dave);                                // method to show use
        whoIs(alex);                                // of instanceof
        whoIs(whom);                                // operator
        whoIs(mrMacWilliams);
        int total = alex.totalStudents;             // static variable
        System.out.println("total students = " + total);
        dave.endTheWorld();                         // static method
        alex.endTheWorld();
        mrMacWilliams.endTheWorld();
        whom.endTheWorld();
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        Doctor.endTheWorld();
        HighSchoolStudent harry = new HighSchoolStudent(
                "Harry Potter", 17, 934, true);     // new high school student
        ComputerScienceTeacher chema = new 
            ComputerScienceTeacher("Chema", 36, true);       // new CS teacher
        Husky havoc = new Husky("Havoc", 2665, 11, false);   // new Husky object
        MrWachs mrWachs = new MrWachs("Mr Wachs", 48, true); // new Wachs object
        System.out.println(harry);                           // output all
        System.out.println(chema);
        System.out.println(havoc);
        System.out.println(mrWachs);
        Meeting meeting = new Meeting();                    // new meeting 
        meeting.attend(dave);                               // associate objects
        meeting.attend(sally);
        meeting.attend(bobby);
        meeting.attend(a);
        meeting.attend(b);
        meeting.attend(lance);
        meeting.attend(sarah);
        meeting.attend(josh);
        meeting.attend(alex);
        meeting.attend(mrMacWilliams);
        meeting.attend(mrClone);
        meeting.attend(mrWachs);
        meeting.attend(whom);
        meeting.attend(harry);
        meeting.attend(chema);
        meeting.attend(havoc);
        meeting.hold();                         // hold the meeting
        Spaghetti spag = new Spaghetti();       // abstract class parent
        spag.spoil();
        Apple golden = new Apple();             // child of food class object
        golden.spoil();
        mrMacWilliams.eat(golden);              // pass food object to person
        mrMacWilliams.eat(spag);
        HockeyPlayer jet = new HockeyPlayer();  // sports interface used
        jet.setName("Winnipeg Jets");           // mutator of private property
        jet.setOpponent("Minnesota Wild");
        jet.homeTeamScores();                   // call implemented methods
        jet.visitingTeamScores();
        jet.homeTeamScores();
        jet.homeTeamScores();
        jet.endOfPeriod(1);
        HuskyAthlete jen = new HuskyAthlete("Jennifer", 17, 101, false);
        jen.move();
        jen.endOfGame();
        String       x = new String("99");
        Integer      y = new Integer(x);
        Double       z = new Double(x);
        Boolean      w = new Boolean("true");
        Person       v = new Person(x,y);
        HuskyAthlete u = new HuskyAthlete(x, y, y, w);
        output(x);                              // use of generic method
        output(y);
        output(z);
        output(w);
        output(v);
        output(u);
        Box<String>       box1 = new Box<String>(); // generic class
        Box<Integer>      box2 = new Box<>();
        Box<Double>       box3 = new Box<>();
        Box<Boolean>      box4 = new Box<>();
        Box<Person>       box5 = new Box<>();
        Box<HuskyAthlete> box6 = new Box<>();
        box1.putIn(x);
        box2.putIn(y);
        box3.putIn(z);
        box4.putIn(w);
        box5.putIn(v);
        box6.putIn(u);
        System.out.println(box1.open());
        System.out.println(box2.open());
        System.out.println(box3.open());
        System.out.println(box4.open());
        System.out.println(box5.open());
        System.out.println(box6.open());
        House<Person, String>   house = new House<>();  // generic class 2
        House<Student, Integer> frat  = new House<>();
        house.owner    = v;
        house.contents = x;
        frat.owner     = bobby;
        frat.contents  = 99;
        Food[] fridge = {spag, golden};
        frat.party(fridge);
        System.out.println("\nAdvanced Classes unit test complete!\n");
    }
        
    /**
     * Outputs a generic item with information about the data type
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    public static <T> void output(T item) {
        String text = "Class ";
        text += item.getClass().getSimpleName();
        text += " as a string is " + item.toString();
        System.out.println(text);
    }

    /**
     * Outputs the type of object that is passed to the method
     * 
     * @param object the object type to check
     */
    private void whoIs(Object object) {
        if (object instanceof Person)  System.out.println("This is a Person");
        if (object instanceof Student) System.out.println("This is a Student");
        if (object instanceof Teacher) System.out.println("This is a Teacher");
        if (object instanceof Doctor)  System.out.println("This is a Doctor");
    }

}

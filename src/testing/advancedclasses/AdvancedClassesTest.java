
/** required package class namespace */
package testing.advancedclasses;

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
        sam.isMale = true;                              // object properties
        sam.setName("Samuel Samson");                   // mutator method used
        sam.isMale = true;                              // change property
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
        
        // testing complicated class driven class structure with static
        // methods and static properties
        Hufflepuff luna     = new Hufflepuff();         // instances created
        Slytherin  draco    = new Slytherin();        
        Hogwarts   hogwarts = new Hogwarts();
        hogwarts.enterStation9ThreeQuarters(luna);      // methods called
        hogwarts.enterStation9ThreeQuarters(draco);
        
        int total = person.total;                       // the static property        
        System.out.println("total people = " + total);  // displayed                
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
    
}

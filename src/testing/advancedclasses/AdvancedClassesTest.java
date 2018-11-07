/** required package class namespace */
package testing.advancedclasses;


/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit 
 *
 * @author Mr. Wachs 
 * @since 4-Oct-2018 
 */
public class AdvancedClassesTest 
{
    
    /** 
     * Default constructor for the class 
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced Classes testing started...\n");
        
        // instantiating (creating an instances of) Person objects
        Person person1 = new Person();                  // create person object        
        Person person2 = new Person();                  // create another object        
        person1.age = 50;                               // modify property        
        person1.talk();                                 // call talk
        person2.talk();                                 // call talk        
        
        // creating student objects
        Student student1 = new Student(100);            // create student object
        Student student2 = new Student(101);            // create another object        
        student1.talk();                                // call talk     
        student2.talk();                                // call talk   
        
        // Using the built-in Object class and it's methods
        Object object1 = new Object();                  // instantiate objects
        Object object2 = new Object();
        Object object3 = object2;
        System.out.println(object1.toString());         // use ToString
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        if (object1.equals(object2)) System.out.println("1 == 2");
        else                         System.out.println("1 != 2");  
        if (object2.equals(object3)) System.out.println("2 == 3");
        else                         System.out.println("2 != 3");
        
        // testing toString, equals, clone:        
        Person person3 = new Person("Peter Parker",23,true);
        Person person4 = new Person("Jimmy Neutron",12,true);        
        System.out.println(person3.toString());
        System.out.println(person4.toString());        
        Person person5 = person3.clone();        
        System.out.println(person5.toString());        
        if (person3.equals(person4)) System.out.println("3 == 4");
        else                         System.out.println("3 != 4");
        if (person3.equals(person5)) System.out.println("3 == 5");
        else                         System.out.println("3 != 5");
        
        // creating and testing more student methods
        Student student3 = new Student("Jeff Moore", 21, true, 21);
        Student student4 = new Student("Jenko Jones", 22, true, 22);        
        System.out.println(student3.toString());
        System.out.println(student4.toString());        
        Student student5 = student3.clone();        
        System.out.println(student5.toString());        
        if (student3.equals(student5))  System.out.println("3 == 5");
        else                            System.out.println("3 != 5");
                
        // create and test teacher class
        Teacher teacher1 = new Teacher("Mr. Stein",45,true);
        teacher1.add(student1);
        teacher1.add(student2);
        teacher1.add(student3);
        teacher1.add(student4);        
        System.out.println(teacher1.toString());
        // another teacher instance, cloned
        Teacher teacher2 = teacher1.clone();
        System.out.println(teacher2);
        // another new teacher instance
        Teacher teacher3 = new Teacher("Mr. T", 66, true);
        System.out.println(teacher3);
        // test equals between teachers        
        if (teacher1.equals(teacher2)) System.out.println("1 == 2");
        else                           System.out.println("1 != 2");
        if (teacher1.equals(teacher3)) System.out.println("1 == 3");
        else                           System.out.println("1 != 3");
        
        // checking the status of various objects
        checkStatus(person1);
        checkStatus(object1);
        checkStatus(student1);
        checkStatus(teacher1);
        String text = "Hi";
        checkStatus(text);
        
        // use our static keyword        
        System.out.println("Total students is " + Student.totalStudents);
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        
        // creating more class objects:        
        Husky evan = new Husky("Evan Dore", 19, true, 8675309);
        evan.talk();
        Gargoyle gargoyle = new Gargoyle();
        System.out.println(gargoyle.toString());
        Werewolf werewolf = new Werewolf("Taylor Lautner", 23, true);
        werewolf.talk();
        Flash kidFlash = new Flash("Wally West", 19, true);
        kidFlash.talk();        
        MrWachs mrWachs = new MrWachs("Mr. Wachs", 49, true);
        mrWachs.talk();
                
        // create a meeting object to show polymorphism
        Meeting meeting = new Meeting();
        meeting.attend(kidFlash);
        meeting.attend(werewolf);
        meeting.attend(mrWachs);
        meeting.attend(evan);
        meeting.hold();
        
        // create abstract food child class objects
        CheeseCake cake = new CheeseCake();
        Poutine poutine = new Poutine();
        
        // use these objects in the associated person class
        mrWachs.consume(cake);
        mrWachs.consume(poutine);
        mrWachs.consume(new Carrot()); // anonymous object
        
        // test our interfaces
        Athlete moussa = new Athlete("Moussa Diakhite",17,true,10);
        moussa.setHome("Huskies");
        moussa.setVisiting("SJR");
        moussa.homeGoal();
        moussa.endHalf();
        if (moussa.hasBeenSigned() == PermissionForm.NOT_SIGNED) {
            System.out.println("Get it signed!! " + moussa.getName());
        }
        moussa.sign();        
        moussa.consume(new Poutine());
        moussa.talk();
        moussa.opponentPlaysCard();
        if (moussa.didUserWin()) {
            System.out.println("Won war");
        }
        
        // using generic method:        
        output(moussa);
        output(mrWachs);
        output(werewolf);
        output(cake);
        output(new Integer("100"));
        
        // using generic class:
        Box<Athlete> box1 = new Box<>(moussa);
        Box<MrWachs> box2 = new Box<>(mrWachs);
        Box<String>  box3 = new Box<>(new String("Hi"));        
        box1.peek();
        box2.peek();
        box3.peek();
        
        // using advanced generics:
        Character letter = new Character('#');
        Food[] fridge = { cake, poutine };
        Object[] contents = {werewolf,fridge,moussa,evan,letter,box3};
        House<MrWachs,Object> house = new House<>(mrWachs, contents);
        house.visit();
        
        System.out.println("\nAdvanced Classes testing complete!\n");            
    }
    
    /**
     * Checks and displays the status of this object
     * 
     * @param object the object to check
     */
    private void checkStatus(Object object) {
        if (object instanceof Teacher) {
            System.out.println("We have a Teacher");
        }
        else if (object instanceof Student) {
            System.out.println("We have a Student");
        }
        else if (object instanceof Person) {
            System.out.println("We have a Person");
        }
        else {
            System.out.println("I don't know what this is?");
        }
    }

    /**
     * Outputs a generic item with information about the data type
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class " + item.getClass().getSimpleName() +
                " as a string is " + item.toString();
        System.out.println(text);
    }
    
}
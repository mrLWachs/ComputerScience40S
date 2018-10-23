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
        System.out.println("Advanced Classes testing started...");
        
        // instantiating (creating an instances of) Person objects
        Person person = new Person();                   // create person object        
        Person bart = new Person();                     // create another object        
        person.age = 50;                                // modify property        
        person.talk();                                  // call talk
        bart.talk();                                    // call talk        
        
        Student sharkBoy = new Student(100);            // create student object
        Student lavaGirl = new Student(101);            // create another object        
        sharkBoy.talk();                                // call talk     
        lavaGirl.talk();                                // call talk   
        
        // Using the built-in Object class and it's methods
        Object object1 = new Object();                  // instantiate objects
        Object object2 = new Object();
        Object object3 = object2;
        System.out.println(object1.toString());         // use ToString
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        if (object1.equals(object2)) System.out.println("1 == 2");
        else System.out.println("1 != 2");              // compare
        if (object2.equals(object3)) System.out.println("2 == 3");
        else System.out.println("2 != 3");
        
        // testing toString, equals, clone:        
        Person peter = new Person("Peter Parker",23,true);
        Person jimmy = new Person("Jimmy Neutron",12,true);        
        System.out.println(peter.toString());
        System.out.println(jimmy.toString());        
        Person ben = peter.clone();        
        System.out.println(ben.toString());        
        if (peter.equals(jimmy))    System.out.println("peter = jimmy");
        else if (peter.equals(ben)) System.out.println("peter = ben");
        else                        System.out.println("!=");
        
        Student jeff = new Student("Jeff Moore", 21, true, 21);
        Student jenko = new Student("Jenko Jones", 22, true, 22);        
        System.out.println(jeff.toString());
        System.out.println(jenko.toString());        
        Student bob = jeff.clone();        
        System.out.println(bob.toString());        
        if (jeff.equals(bob))    System.out.println("jeff == bob");
        if (!jeff.equals(jenko)) System.out.println("jeff != jenko");
                
        Teacher teacher = new Teacher("Mr. Stein", true);
        teacher.add(jenko);
        teacher.add(jeff);
        teacher.add(sharkBoy);
        teacher.add(lavaGirl);
        
        System.out.println(teacher.toString());
        
        System.out.println("Advanced Classes testing complete!");            
    }
    

}
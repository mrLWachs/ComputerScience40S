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
        
        
        
        
        System.out.println("Advanced Classes testing complete!");            
    }
    

}
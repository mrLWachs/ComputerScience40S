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
        
        
        System.out.println("Advanced Classes testing complete!");        
    }
    

}
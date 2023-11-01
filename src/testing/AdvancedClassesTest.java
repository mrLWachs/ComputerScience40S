
/** Required package class namespace */
package testing;

import testing.classes.Person;
import testing.classes.Student;
import testing.classes.Teacher;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit.
 *
 * @author Mr. Wachs
 * @since Oct 12, 2023, 11:42:49 a.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("Start Advanced Classes testing...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Christopher Yesland";
        person.gender = "male";
        
        // The code below would generate errors because of encapsulation......    
        // person.age = 30;
        
        // Recall our method... (to see any changes)
        person.talk();
                
        Person ironMan = new Person("Tony Stark",58,"Iron man");
        // Try to call (invoke) some of our other methods:
        ironMan.birthday();
        ironMan.talk();
        ironMan.die();
        ironMan.talk();
        
        // Instantiate (means create an "instance of") a student object  
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") that property
        // we cannot chang eage or gender those ARE encapsulated (private)
        student.name = "Stu Denty";
        student.birthday();
        student.talk();
        
        // Instantiate (means "create") a second Student object (instance)
        Student stewie = new Student("Stewie Griffin", 2, "cat");
        stewie.talk();
        // Call specific methods from the Student class
        stewie.study();
        stewie.talk();
        stewie.slackOff();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        
        // Instantiate a Teacher object and associate it with a Student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Advanced Classes test!");
    }
     
}

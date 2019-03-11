
package testing.advancedclasses;


public class AdvancedClassesTest 
{
    
    public AdvancedClassesTest() {
        System.out.println("\nStarting advanced classes testing...\n");
        
        // using the class to create an object with the default constructor:
        Person person = new Person();
        //class object = call constructor method (default)
        person.talk();
        // calls the method in the class object
        
        Student student = new Student(99);
        student.talk();
        
        
        System.out.println("\nCompleted advanced classes test!\n");
    }
    
}

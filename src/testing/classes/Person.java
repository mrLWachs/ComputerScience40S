
/** Required package class namespace */
package testing.classes;

 
/**
 * Person.java - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 *
 * @author Mr. Wachs
 * @since Oct 12, 2023, 11:43:40 a.m.
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
       
    String name;
    
    String gender;
            
    int age;
            
    boolean alive;
       
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {
        alive  = true;
        age    = 0;
        name   = "unidentified";
        gender = "unidentified";
    }
    
    public void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooo!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
}

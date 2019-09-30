
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:55:17 a.m.
 */
public class Person 
{
    
    // Properties (descriptors, things about it, adjectives)
    
    /** The name of this person object */
    private String name;
    public int age;                             // encapsulated property
    
    // Methods (actions, things it can do, verbs)
    
    /**
     * Default constructor for the class (default constructors have no
     * parameters)
     */
    public Person() {
        name   = "Jane Doe";
        age    = 0;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(name + " is " + age);
    }
    
}

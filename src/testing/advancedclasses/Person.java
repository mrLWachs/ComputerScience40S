
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs 
 * @since 09-Mar-2019 
 * @instructor Mr. Wachs
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    /** The name of this person object */
    private String name;
    public int age;                             // encapsulated property
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor for the class (default constructors have no
     * parameters)
     */
    public Person() {
        name = "jane doe";
        age = 0;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(name + " is " + age);
    } 
}

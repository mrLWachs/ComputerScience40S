
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:02:58 p.m.
 */
public class Person 
{

    // PROPERTIES (below)...................................................
    
    private String name;    // encapsulated property
    public int age;
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor, set class properties
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

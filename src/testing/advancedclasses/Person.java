
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
    
    /** Protected property representing the person's gender */
    protected boolean isMale;
    
    
    // METHODS (below)......................................................
    
    /**
     * Default constructor, set class properties
     */
    public Person() {
        name   = "jane doe";
        age    = 0;
        isMale = false;
    }
    
    /**
     * Class constructor sets class properties to parameter values
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param isMale the gender for this person
     */
    public Person(String name, int age, boolean isMale) {
        this.name   = name;
        this.age    = age;
        this.isMale = isMale;
    }
    
    /**
     * Outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(name + " is " + age);
    }
    
}

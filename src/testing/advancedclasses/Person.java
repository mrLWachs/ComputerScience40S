  
/** Required package class namespace */
package testing.advancedclasses;

/** 
 * Person.java - represents a person. This is a class with properties (things
 * about the class, adjective, descriptors) and methods (things it can do, 
 * verbs, actions). Classes can be created (instantiated) into objects
 * (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since 13-Oct-2021 
*/
public class Person 
{

    // Properties: (things about it, adjectives, descriptors).............
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public  String  name;
    public  String  gender;
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */
    private int     age;
    private boolean isAlive;
    
    
    // Methods: (things it can do, verbs, actions)........................
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors.
     */
    public Person() {
        isAlive = true;
        age     = 0;
        gender  = "female";
        name    = "Jane Doe";
    }
    
    /**
     * Constructor method (overloaded) changes object properties
     * 
     * @param name the name for this person 
     */
    public Person(String name) {
        isAlive   = true;
        age       = 0;
        gender    = "female";
        this.name = name;
    }
    
    /**
     * Constructor method changes object properties
     * 
     * @param name the name for this person 
     * @param age the age for this person 
     * @param gender the identified gender for this person 
     */
    public Person(String name, int age, String gender) {
        isAlive     = true;
        this.age    = age;
        this.gender = gender;
        this.name   = name;
    }
    
    /**
     * When a person dies
     */
    public void die() {
        isAlive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        if (isAlive) {
            System.out.println(name + " is " +
                               age + " identifies as " +
                               gender);
        }
        else {
            System.out.println("Boooo!!!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
}

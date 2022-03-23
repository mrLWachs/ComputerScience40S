
/** Required package class namespace */
package testing.unit3;

 
/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs
 * @since 14-Mar-2022, 3:13:18 PM
 */
public class Person 
{
    
    // PROPERTIES (below)...................................................
    // (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */
    private int age;            // Encapsulated properties (meaning they can 
    private boolean alive;      // only be 'accessed' inside the class)
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public String name;         
    public String gender;    
    
    
    // METHODS (below)......................................................
    // (things it can do, verbs, actions, return, parameter(s))
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors. Constructor methods are 
     * special methods that have (1) the same name as the class, (2) that name
     * starts with a capital letter, (3) it has NO return type (not even the 
     * word "void"). These methods are called when the class is used to build 
     * (construct, instantiate) an object. Constructor methods should always
     * be public
     */
    public Person() {
        name   = "Jane Do'h";
        age    = 0;
        alive  = true;
        gender = "female";
    }
    
    /**
     * Second, overloaded (methods with the same name, different parameters) 
     * constructor method, sets class properties using the keyword "this" which
     * refers to the the class itself so I don't have to make different names 
     * for the parameters. Constructor methods with NO parameters are called 
     * "default" constructors
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param gender the gender for this person 
     */
    public Person(String name, int age, String gender) {
        alive = true;
        
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (whcih will be created at a later time)
        this.name   = name;
        this.age    = age;
        this.gender = gender;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (isAlive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies as " + 
                    gender);
        }
        else {
            System.out.println("Booooooo!");
        }
    }
    
    /**
     * Gives the person a birthday, changes the encapsulated property (age) by
     * increasing the person's age by one
     */
    public void birthday() {
        age++;
    }
    
}
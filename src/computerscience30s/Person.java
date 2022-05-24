/** Required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs
 * @since 8-May-2022, 3:03:30 PM
 */
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors).............
    
    // Reminder...
    // Properties are essentially "variables" or more specifically "global
    // variables" for this class - they can be simple variables, or even 
    // arrays (or even other classes)
    
    String name;
    int age;
    boolean alive;
    String gender;
    
    
    // Methods: (things it can do, verbs, actions)........................ 
    
    // Reminder...
    // Methods need a name, (possibly) input(s), and (possibly) an output
    // The formal structure of writing a method is: output name(inputs) { }
    // But, if it has no output (use the word "void") if it has no input(s) or
    // parameters, leave the round brackets empty "()"
    
    
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
    Person() {
        name   = "person";
        age    = 0;
        alive  = true;
        gender = "undefined";
    }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public
     * 
     * @param newName the new name for this person
     */
    Person(String newName) {
        name   = newName;   // Assigning the argument to the property (global)
        age    = 0;
        alive  = true;
        gender = "undefined";
    }
        
    /**
     * Third, overloaded (methods with the same name, different parameters) 
     * constructor method, sets class properties using the keyword "this" which
     * refers to the the class itself so I don't have to make different names 
     * for the parameters. 
     * 
     * @param name the name for this person
     * @param age the age for this person
     * @param gender the gender for this person 
     */
    Person(String name, int age, String gender) {
        this.alive  = true;     // The line could still be alive = true;
        
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (whcih will be created at a later time)
        this.name   = name;   
        this.age    = age;        
        this.gender = gender;
    }
    
    /**
     * The person dies 
     */
    void die() {
        alive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooooooo!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    void birthday() {
        age++;
    }    

}
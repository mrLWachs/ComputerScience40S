
/** Required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since May 3, 2024
 */
public class Person {

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    /**
     * This method "brings the person to life" meaning it is used when the 
     * class is used to create a Person object. The method sets all the class
     * properties (global variables) to their starting values ("defaults").
     */
    void born() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
   
    
    /**
     * The person dies (changing/modifying) the property (alive) through 
     * this method
     */
    void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifies as " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
    /**
     * Gives the person a birthday
     */
    void birthday() {
        age++;
    }
        
}


/** Required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since May 2023
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    /**
     * Constructor method is a method that has:
     * (1) the same name as the class,
     * (2) the name starts with a capital letter
     * (3) it has NO return type (not even the word "void")
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object.
     */
    Person() {
        alive  = true;
        age    = 0;
        name   = "unidentified";
        gender = "unidentified";
    }
    
    
//    /**
//     * "Creates" a person - we deleted (by commenting out) this method as 
//     * The constructor method does what this method does!
//     */
//    void born() {
//        alive = true;
//        age = 0;
//        name = "unidentified";
//        gender = "unidentified";
//    }
    
    /**
     * The person dies 
     */
    void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Booo!");
        }
    }
    
    /**
     * Gives the person a birthday
     */
    void birthday() {
        age++;
    }
        
}
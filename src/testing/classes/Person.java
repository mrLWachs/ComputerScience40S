
/** Required package class namespace */
package testing.classes;


/** 
 * Person.java - represents a person. This is a class with properties (things
 * about the class, adjective, descriptors) and methods (things it can do, 
 * verbs, actions). Classes can be created (instantiated) into objects
 * (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since October, 2022
*/
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String  name;
    int     age;
    String  gender;            
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object.
     */
    public Person() {
        alive  = true;
        age    = 0;
        gender = "unidentified";
        name   = "unidentified";
    }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public
     * 
     * @param name the new name for this person
     */
    public Person(String name) {
        alive     = true;
        age       = 0;
        gender    = "unidentified";
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (whcih will be created at a later time)
        this.name = name;
    }
    
    
    void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else {
            System.out.println("Booooo!");
        }
    }
    
    void birthday() {
        age++;
    }
    
}

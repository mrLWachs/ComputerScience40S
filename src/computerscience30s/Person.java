/** Required package class namespace */
package computerscience30s;
 

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since December 2024
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
        
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
   
    /**
     * Constructor method is a special method that has:
     *    (1) the same name as the class
     *    (2) the name starts with a capital letter
     *    (3) it has NO return type (not even the word "void")
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object. We previously had a "born()" method that did 
     * this, that we changed it into this constructor method. This method 
     * "brings the person to life" meaning it is used when the class is used to  
     * create a Person object. The method sets all the class properties (global 
     * variables) to their starting values ("defaults").
     */
    Person() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    // This method was originally written and then deleted (commented out)
    // because the new constructor method performs the same purpose....
    
    // void born() {
    //     alive = true;
    //     age = 0;
    //     name = "undefined";
    //     gender = "undefined";
    // }
    
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
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else  {
            System.out.println("Boooooooo!");
        }
    }
    
    /**
     * Gives the person a birthday
     */
    void birthday() {
        age++;
    }
        
}
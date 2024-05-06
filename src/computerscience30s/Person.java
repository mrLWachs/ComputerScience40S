
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
     * Constructor method is a special method that has:
     * (1) the same name as the class
     * (2) the name starts with a capital letter
     * (3) it has NO return type (not even the word "void")
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object. We previously had a "born()" method that did 
     * this, that we renamed into this constructor method. This method "brings
     * the person to life" meaning it is used when the class is used to create 
     * a Person object. The method sets all the class properties (global 
     * variables) to their starting values ("defaults").
     */
    Person() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public
     * 
     * @param newName the new name for this person
     */
    Person(String newName) {
        alive  = true;
        age    = 0;
        name   = newName;
        gender = "undefined";
    }
        
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
     
    /**
     * Gives the person a birthday, changes the encapsulated property (age).
     * This is a overloaded method meaning multiple methods with the same 
     * name but different parameters.
     * 
     * @param times home many birthdays to give the person
     */
    void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
    
}

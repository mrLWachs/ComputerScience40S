
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since December 2021
 */
public class Person {

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    
    int age;
    
    boolean isAlive;
    
    String gender;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
   
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object.
     */
    Person() {
        isAlive = true;
        age = 0;
        name = "John Doe";
        gender = "female";
    }
    
    void die() {
        isAlive = false;
    }
    
    void talk() {
        if (isAlive) {
            System.out.println(name + " is "
                    + age + " identifies as "
                    + gender);
        }
        else {
            System.out.println("Boooo!");
        }
    }
    
    void birthday() {
        age++;
    }
    
}
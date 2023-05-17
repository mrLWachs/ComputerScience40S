
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
    
    void born() {
        alive  = true;
        age    = 0;
        name   = "unidentified";
        gender = "unidentified";        
    }
    
    void die() {
        alive = false;
    }
    
    void talk() {
        if (alive) {
            System.out.println(name + " is " + 
                    age + " identifies as " + gender);
        }
        else {
            System.out.println("Booooo!");
        }
    }
    
    void birthday() {
        age++;
    }
        
}
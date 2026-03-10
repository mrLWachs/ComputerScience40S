/** Required package class namespace */
package testing.classes;


/*
 * Person - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 * 
 * @author Mr. Wachs
 * @since Mar 9, 2026
*/
public class Person
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    /**
     * Sets the class properties to "default" values simulating when a person 
     * is born
     */
    void born() {
        name   = "undefined";
        age    = 0;
        gender = "undefined";
        alive  = true;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (alive) through this method
     */
    void die() {
        alive = false;
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    void birthday() {
        age++;
    }  
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooooooo!");
        }
    }
        
}
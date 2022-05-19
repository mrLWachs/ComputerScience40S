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
    
    // Properties:
    
    String name;
    int age;
    boolean alive;
    String gender;
    
    
    // Methods:
    
    void born() {
        name   = "person";
        age    = 0;
        alive  = true;
        gender = "undefined";
    }
    
    void die() {
        alive = false;
    }
    
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooooooo!");
        }
    }
    
    void birthday() {
        age++;
    }    

}
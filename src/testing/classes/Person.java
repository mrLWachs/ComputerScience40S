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
 * @since Oct 13, 2026
*/
public class Person
{
    
    // Properties: things about it, adjectives, descriptors, variables, arrays..
    // =========================================================================

    
    String name;
    String gender;
    int age;
    boolean alive;

    // Methods: things it can do, verbs, actions, return, parameter(s)..........
    // =========================================================================
    
    void born() {
        name   = "unidentified";
        age    = 0;
        alive  = true;
        gender = "unidentified";        
    }
    
    void die() {
        alive = false;
    }
    
    void birthday() {
        age++;
    }
    
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
}

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
 * @since Oct 6, 2025
*/
public class Person
{
    // Properties: things about it, adjectives, descriptors, variables, arrays..

    // We can add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global variable) is encapsulated
    // or not. Meaning: is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public String name;
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */ 
    private int age;
    
    /**
     * The keyword/modifier "private" means that this property (or method) can
     * only be accessed (read or changed) by the class itself (inside the class)
     * by other methods inside the class. Class outside of this one that are
     * "communicating" or "using" this class can NOT access this.
     */
    private boolean alive;
    
    // Methods: things it can do, verbs, actions, return, parameter(s)..........
    
    void born() {
        name  = "unidentifed";
        age   = 0;
        alive = true;
    }
    
    void die() {
        alive = false;
    }
    
    void birthday() {
        age++;
    }
    
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age);
        }
        else {
            System.out.println("Booooooo!");
        }
    }

}

/** Required package class namespace */
package testing.classes;


/*
 * Person - description
 * 
 * @author Mr. Wachs
 * @since Mar 17, 2025
*/
public class Person
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
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
    
    public String gender;
    private boolean alive;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    
    public Person() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
    }
    
    
    private void born() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (alive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
}
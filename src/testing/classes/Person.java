
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
     * Properties that use the "modifier" keyword "private" will "encapsulate"
     * this property.this means that this property (or method) can only be 
     * accessed (read or changed) by the class itself (inside the class like
     * a "private room") by other methods inside the class. Class outside of
     * this one that are "communicating" or "using" this class can NOT access
     * this. This is the concept of encapsulation
     */ 
    private int age;
    
    /**
     * Another encapsulated property (field, variable/global variable)
     */
    private boolean alive;
    
    // Methods: things it can do, verbs, actions, return, parameter(s)..........
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {
        born();     // Here we call (invoke) our private, utility, helper method
    }
    
    
    /**
     * A "private" method (also sometimes called a "utility" or "helper" method)
     * can only be called by other methods inside this class - not by any other
     * classes
     */
    private void born() {
        name  = "unidentifed";
        age   = 0;
        alive = true;
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
            System.out.println(name + " is " + age);
        }
        else {
            System.out.println("Booooooo!");
        }
    }

}

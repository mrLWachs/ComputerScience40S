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
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {
        name   = "unidentifed";
        age    = 0;
        gender = "unidentifed";
        alive  = true;
    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties by assigning the passed
     * parameter value into the object's (class) property (global variable) of
     * the same name using the keyword "this"
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {
        alive = true;           // Could have also written "this.alive = true;"
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.name   = name;
        this.age    = age;
        this.gender = gender;  
    }
    
    /**
     * A "private" method (also sometimes called a "utility" or "helper" method)
     * can only be called by other methods inside this class - not by any other
     * classes
     */
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
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Over-ride Person from: " + super.toString();
    }
    
    public boolean equals(Object object) {
        return true;
    }
    
}

/** Required package class namespace */
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
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
    
    public String name;
    
    private int age;        // Encapsulated this property
    
    private boolean isAlive; // Can be changed through methods
    
    public String gender;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
   
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object.
     */
    public Person() {
        isAlive = true;
        age = 0;
        name = "John Doe";
        gender = "female";
    }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public
     * 
     * @param newName the new name for this person
     */
    public Person(String newName) {
        isAlive = true;
        age     = 0;
        name    = newName;
        gender  = "female";
    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties. Constructor methods with
     * NO parameters are called default constructors
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {
        isAlive = true;
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (whcih will be created at a later time)
        this.name   = name;
        this.age    = age;
        this.gender = gender;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (isAlive) through this method
     */
    public void die() {
        isAlive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (isAlive) {
            System.out.println(name + " is "
                    + age + " identifies as "
                    + gender);
        }
        else {
            System.out.println("Boooo!");
        }
    }
    
    /**
     * Overload method, ut a private method means it can be called (invoked)
     * inside the class by other methods of the class. Private methods are
     * rare and sometimes called "helper" or "utility" methods as they just 
     * help other methods.
     */
    private void birthday() {
        age++;
    }
    
    /**
     * Gives the person a birthday, changes the encapsulated property (age).
     * This is a overloaded method meaning multiple methods with the same 
     * name but different parameters.
     * 
     * @param times home many birthdays to give the person
     */
    public void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }
    
}
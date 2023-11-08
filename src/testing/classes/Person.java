
/** Required package class namespace */
package testing.classes;

 
/**
 * Person.java - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 *
 * @author Mr. Wachs
 * @since Oct 12, 2023, 11:43:40 a.m.
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
    
    public String gender;
         
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */
    private int age;
            
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean alive;
       
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))........
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object. Constructor methods 
     * with NO parameters are called default constructors
     */
    public Person() {
        alive  = true;
        age    = 0;
        name   = "unidentified";
        gender = "unidentified";
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
        alive  = true;          // Could have also written "this.alive = true;"
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.age    = age;
        this.name   = name;
        this.gender = gender;
    }
    
    /**
     * The person dies (changing/modifying) the protected property (alive) 
     * through this method
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
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Booooo!");
        }
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        // This method over-rides the toString method inherited from the object 
        // class. As well, all children of this class will inherit this method
        // unless they also over-ride the method themselves
        return "Person";
    }
        
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Shallow clone method could be something like:
        // return true;
        
        // DEEP equals method could be a "deeper" comparison like this:
        
        // First need to "cast" the object parameter into a "Person" object
        Person that = (Person)object;
        
        // Compare the things (properties) we want to compare
        if (this.alive != that.alive)         return false;
        if (this.age   != that.age)           return false;
        if (!this.name.equals(that.name))     return false;
        if (!this.gender.equals(that.gender)) return false;
        
        // We made it through all the above "if" checks, so they are equal
        return true;
    }
    
    
    
}

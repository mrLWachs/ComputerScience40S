
/** Required package class namespace */
package testing.classes;


/** 
 * Person.java - represents a person. This is a class with properties (things
 * about the class, adjective, descriptors) and methods (things it can do, 
 * verbs, actions). Classes can be created (instantiated) into objects
 * (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since October, 2022
*/
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
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
        
    private String gender;            
    
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean alive;          // Encapsulated property
    
    // This property ("alive") cannot be modified outside the class (it is
    // encapsulated or "private"), except possibly through a method (like 
    // the constructor method or the die method)
    
    
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
        gender = "unidentified";
        name   = "unidentified";
    }
    
    /**
     * Constructor method, sets the class properties. Constructor methods 
     * should be public. This is an overloaded constructor method. Overloaded 
     * methods are methods with the same name, but different parameters.
     * 
     * @param name the new name for this person
     */
    public Person(String name) {
        alive     = true;
        age       = 0;
        gender    = "unidentified";
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.name = name;
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
        alive = true;
        // All of the parameters are assigned to the properties of the same name
        this.name   = name;
        this.age    = age;
        this.gender = gender;
    }
    
    /**
     * The person dies (changing/modifying) the private, encapsulated 
     * property (isAlive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    public void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else {
            System.out.println("Booooo!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person: " + name + " is " + age + " identifes as " + gender;
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Shallow comparison (might look like this...)
        // return true;
        // We want a "deeper" comparison...
        
        // First need to "cast" the object parameter into a "Person" object
        Person that = (Person)object;
        // Compare the things (properties) we want to compare
        if (this.alive != that.alive)         return false;
        if (this.age   != that.age)           return false;
        if (!this.name.equals(that.name))     return false;
        if (!this.gender.equals(that.gender)) return false;        
        // We made it through all the above if checks
        return true;
    }
         
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        // Shallow clone would be code like:
        // return this;
        
        // Deep clone could look like:
        // First create new memory for the clone
        Person that = new Person();
        // Now duplicate (clone) the properties
        that.name   = this.name;
        that.age    = this.age;
        that.gender = this.gender;
        that.alive  = this.alive;        
        // Finally return the copied (cloned) new object
        return that;
    }
    
    /**
     * Accessor method (or "getters") that gives you (or 'reads') the age of 
     * this person (which is a private property of this class which cannot 
     * be read outside the class)
     * 
     * @return the person's current age value to "see" (access)
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Accessor method (or "getters") that 'gives' you (or 'reads') the gender 
     * of this person (which is a private property of this class which cannot 
     * be read outside the class)
     * 
     * @return the person's current gender to "see" (access)
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Mutator method (or "setters") that 'changes' the encapsulated property
     * of this person (which is a private property of this class which cannot 
     * be changed outside the class)
     * 
     * @param gender the new gender to set (mutate) the property into
     */
    public void setGender(String gender) {
        // A programmer could potentially write error checking code here..
        this.gender = gender;
    }
    
    /**
     * A "static" method means the method is "shared" by all objects of the 
     * class - it can also be called from the class itself, you can use the 
     * class name then a dot to call static methods
     */
    public static void endTheWorld() {
        System.out.println("Boom!!!!");
    }
    
    /**
     * Consumes the passed food object (it will be a child of the Food class 
     * object) by outputting it to the screen
     * 
     * @param food the abstract food object to consume
     */
    public void consume(Food food) {
        System.out.println(name + " is eating " + food.eat());
    }
        
    public void setAge(int age) {
        this.age = age;
    }
    
}

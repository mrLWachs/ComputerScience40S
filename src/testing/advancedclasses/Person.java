  
/** Required package class namespace */
package testing.advancedclasses;


/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs
 * @since April 2021
 */
public class Person 
{
    
    // <editor-fold desc="PROPERTIES.........................................">
    // The "things about the class", descriptors, adjectives, variables, storage
    // </editor-fold>
    
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
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean isAlive;
            

    // <editor-fold desc="METHODS............................................"> 
    // The "things classes can do", actions, verbs, including "constructors"
    // </editor-fold>
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors.
     */
    public Person() {
        name    = "Jane D'Oh";
        age     = 0;
        isAlive = true;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(this.toString());
    }
    
    /**
     * A mutator method to "change" (or mutate) the private property of this 
     * class which cannot be changed outside the class
     * 
     * @param age the new age to mutate (set) the property to
     */
    public void setAge(int age) {
        // A programmer could potentially write error checking code here..
        this.age = age;
    }
    
    /**
     * A accessor method to "access" (or read) the private property of this 
     * class which cannot be read outside the class
     * 
     * @return the object's current age value to "see" (access)
     */
    public int getAge() {
        return this.age;        // The encapsulated ("private") property
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Person: " + name + " is " + age + " is " + isAlive;
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Shallow comparison might be code like: return true;
        // We want to over-ride to make a deeper comparison
        Person that = (Person)object;
        // We cast the object into a Person object
        if (!this.name.equals(that.name))   return false;
        if (this.getAge() != that.getAge()) return false;
        if (this.isAlive != that.isAlive)   return false;
        return true;
    }
    
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {
        // Shallow clone would be: return this;
        Person that = new Person();
        // Duplicate all the properties
        that.name    = this.name;
        that.isAlive = this.isAlive;
        that.setAge(this.getAge());
        return that;
    }
    
    /**
     * Ends the world
     */
    public static void endTheWorld() {
        // "static" methods means the method is "shared" by all objects
        // of the class - it can also be called from the class itself,
        // you can use the class name then a dot to call static methods
        System.out.println("Boom!!!");
    }
    
    /**
     * Consumes the passed food by outputting to the screen
     * 
     * @param food the abstract food object to consume 
     */
    public void consume(Food food) {
        System.out.println(name + " eating " + food.eat());
    }
        
}

  
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
    
    // Properties...
    // The "things about the class", descriptors, adjectives, variables, storage
    
    public String name;
    private int age;                        // encapsulated property uses    
    // "modifier" words to "encapsulate" a property in a class (means it can 
    // only be accessed inside the class) like a "private room"
    

    // Methods...
    // The "things classes can do", actions, verbs, including "constructors"
    
    /**
     * Default constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it
     */
    public Person() {
        name = "Jane D'Oh";
        age  = 0;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        System.out.println(name + " is " + age);
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
        return age;
    }
        
}

  
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
    // "things about the class", descriptors, adjectives, variables, storage
    String name;
    int age;
    

    // Methods...
    // "things the class can do", actions, verbs, include "construcotr methods"
    
    /**
     * Default constructor, sets class properties
     */
    public Person() {
        name = "Jane D'Oh";
        age = 0;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     */
    public void talk() {
        System.out.println(name + " is " + age);
    }

}

  
/** Required package class namespace */
package testing.advancedclasses;

/**
 * Person.java - represents a person, remember that classes are composed of
 * properties (things about it, descriptors, adjectives) and methods (things
 * it can do, actions, verbs) and we instantiate (create an instance of) the
 * class to create an object
 *
 * @author Mr. Wachs
 * @since Sep. 30, 2019, 11:43:07 a.m.
 */
public class Person 
{

    // Properties...
    // (are "things about the class", descriptors, adjectives, variables)
    
    String name;
    int age;
    
    // Methods...
    // (are "things class ca do", action, verb, include "construtor methods")
    
    /**
     * Default constructor, sets class properties
     */
    public Person() {
        name = "Jane D'oh";
        age = 0;
    }
    
    void talk() {
        System.out.println(name + " is " + age);
    }
    
}

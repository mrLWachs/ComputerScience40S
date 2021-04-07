
package testing.advancedclasses;


public class Person 
{

    // Properties...
    // (are "things about the class", descriptors, adjectives, variables)
    
    String name;
    int age;
    
    // Methods...
    // (are "things class ca do", action, verb, include "construtor methods")
    
    public Person() {
        name = "Jane D'oh";
        age = 0;
    }
    
    void talk() {
        System.out.println(name + " is " + age);
    }
    
}

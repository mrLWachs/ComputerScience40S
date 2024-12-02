/** Required package class namespace */
package computerscience30s;
 

public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    // We add a keyword to the front of the properties (modifier word) to
    // determine if the property (variable, global varaible) is encapsulated
    // or not. Meaning is the variable accessable (can be read and changed)
    // inside the class and/or outside the class (words "private" and "public")
        
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
   
    void born() {
        alive = true;
        age = 0;
        name = "undefined";
        gender = "undefined";
    }
    
    void die() {
        alive = false;
    }
    
    
    void talk() {
        
    }
    
    void birthday() {
        age++;
    }
        
}
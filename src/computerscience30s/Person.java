
package computerscience30s;

public class Person {

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    void born() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    void die() {
        alive = false;
    }
    
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifies as " + gender);
        }
        else {
            System.out.println("Boooooo!");
        }
    }
    
    void birthday() {
        age++;
    }
        
}
